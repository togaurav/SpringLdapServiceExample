package ru.spb.iac.ldap.handler

import javax.xml.namespace.QName
import javax.xml.soap.SOAPMessage
import javax.xml.ws.handler.MessageContext
import javax.xml.ws.handler.soap.SOAPHandler
import javax.xml.ws.handler.soap.SOAPMessageContext
import org.apache.log4j.Logger
import org.springframework.stereotype.Component

/**
 * Service handler for logging SOAP messages.
 * User: normal
 * Date: 13.10.11
 */
@Component("logHandler")
public class LogHandler implements SOAPHandler<SOAPMessageContext> {
    private static final String ADDRESS = "javax.xml.ws.service.endpoint.address";

    @Log
    private Logger logger;

    public Set<QName> getHeaders() {
        return Collections.emptySet();
    }

    public boolean handleMessage(SOAPMessageContext messageContext) {
        if (!logger.isDebugEnabled()) {
            return true;
        }

        try {
            Boolean outboundProperty = (Boolean) messageContext.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY);
            String endpoint = (String) messageContext.get(ADDRESS);

            ByteArrayOutputStream stream = new ByteArrayOutputStream();
            SOAPMessage soapMsg = messageContext.getMessage();
            soapMsg.writeTo(stream);

            logger.debug("\r\n------------------------------------------------------------------\r\n" +
                    "Message outbound: " + outboundProperty + " \r\n" +
                    "Endpoint: " + endpoint + "\r\n" +
                    stream.toString("UTF-8") + "\r\n" +
                    "------------------------------------------------------------------");
        } catch (Exception e) {
            logger.error("Can't log soap message", e);
        }

        return true;
    }

    public boolean handleFault(SOAPMessageContext context) {
        return handleMessage(context);
    }

    public void close(MessageContext context) {
    }
}

