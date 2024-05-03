
package ru.flibasta.server.books;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import jakarta.xml.ws.Service;
import jakarta.xml.ws.WebEndpoint;
import jakarta.xml.ws.WebServiceClient;
import jakarta.xml.ws.WebServiceException;
import jakarta.xml.ws.WebServiceFeature;


/**
 * This class was generated by the XML-WS Tools.
 * XML-WS Tools 4.0.1
 * Generated source version: 3.0
 * 
 */
@WebServiceClient(name = "WebServiceBook", targetNamespace = "http://service.booksserver.flibasta.ru/", wsdlLocation = "http://localhost:8082/services/books?wsdl")
public class WebServiceBook
    extends Service
{

    private static final URL WEBSERVICEBOOK_WSDL_LOCATION;
    private static final WebServiceException WEBSERVICEBOOK_EXCEPTION;
    private static final QName WEBSERVICEBOOK_QNAME = new QName("http://service.booksserver.flibasta.ru/", "WebServiceBook");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8082/services/books?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        WEBSERVICEBOOK_WSDL_LOCATION = url;
        WEBSERVICEBOOK_EXCEPTION = e;
    }

    public WebServiceBook() {
        super(__getWsdlLocation(), WEBSERVICEBOOK_QNAME);
    }

    public WebServiceBook(WebServiceFeature... features) {
        super(__getWsdlLocation(), WEBSERVICEBOOK_QNAME, features);
    }

    public WebServiceBook(URL wsdlLocation) {
        super(wsdlLocation, WEBSERVICEBOOK_QNAME);
    }

    public WebServiceBook(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, WEBSERVICEBOOK_QNAME, features);
    }

    public WebServiceBook(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public WebServiceBook(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns BookService
     */
    @WebEndpoint(name = "BookPort")
    public BooksService getBookPort() {
        return super.getPort(new QName("http://service.booksserver.flibasta.ru/", "BookPort"), BooksService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link jakarta.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns BookService
     */
    @WebEndpoint(name = "BookPort")
    public BooksService getBookPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://service.booksserver.flibasta.ru/", "BookPort"), BooksService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (WEBSERVICEBOOK_EXCEPTION != null) {
            throw WEBSERVICEBOOK_EXCEPTION;
        }
        return WEBSERVICEBOOK_WSDL_LOCATION;
    }

}