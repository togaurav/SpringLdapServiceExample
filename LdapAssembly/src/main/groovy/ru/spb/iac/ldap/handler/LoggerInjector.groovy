package ru.spb.iac.ldap.handler

import org.apache.log4j.Logger;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.util.ReflectionUtils;

import java.lang.reflect.Field;

import static org.springframework.util.ReflectionUtils.FieldCallback
import org.springframework.stereotype.Component;

/**
 * User: normal
 * Date: 13.10.11
 */
@Component("logger")
public class LoggerInjector implements BeanPostProcessor {
    private static Logger logger = Logger.getLogger(LoggerInjector.class);

    private static class LoggerCallback implements FieldCallback {
        private Object bean;

        private LoggerCallback(Object bean) {
            this.bean = bean;
        }

        public void doWith(Field field) throws IllegalArgumentException,
                IllegalAccessException {
            // make the field accessible if defined private
            ReflectionUtils.makeAccessible(field);
            if (field.getAnnotation(Log.class) != null) {
                Logger log = Logger.getLogger(bean.getClass());
                field.set(bean, log);
                logger.trace("Logger success injected into: " + field.getName());
            }
        }
    }

    public Object postProcessAfterInitialization(Object bean, String beanName)
    throws BeansException {
        return bean;
    }

    public Object postProcessBeforeInitialization(final Object bean,
                                                  final String beanName) throws BeansException {
        logger.trace("Try to inject logger into: " + beanName);
        ReflectionUtils.doWithFields(bean.getClass(), new LoggerCallback(bean));
        return bean;
    }
}