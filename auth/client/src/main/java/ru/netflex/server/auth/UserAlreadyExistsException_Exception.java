
package ru.flibasta.server.auth;

import jakarta.xml.ws.WebFault;


/**
 * This class was generated by the XML-WS Tools.
 * XML-WS Tools 4.0.1
 * Generated source version: 3.0
 * 
 */
@WebFault(name = "UserAlreadyExistsException", targetNamespace = "http://web.service.authserver.flibasta.ru/")
public class UserAlreadyExistsException_Exception
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private UserAlreadyExistsException faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public UserAlreadyExistsException_Exception(String message, UserAlreadyExistsException faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param cause
     * @param faultInfo
     * @param message
     */
    public UserAlreadyExistsException_Exception(String message, UserAlreadyExistsException faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: ru.flibasta.server.auth.UserAlreadyExistsException
     */
    public UserAlreadyExistsException getFaultInfo() {
        return faultInfo;
    }

}
