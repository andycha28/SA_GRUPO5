
package com.gt.soapws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.gt.soapws package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Paisdeto_QNAME = new QName("http://soapws.gt.com/", "paisdeto");
    private final static QName _PaisdetoResponse_QNAME = new QName("http://soapws.gt.com/", "paisdetoResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.gt.soapws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PaisdetoResponse }
     * 
     */
    public PaisdetoResponse createPaisdetoResponse() {
        return new PaisdetoResponse();
    }

    /**
     * Create an instance of {@link Paisdeto }
     * 
     */
    public Paisdeto createPaisdeto() {
        return new Paisdeto();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Paisdeto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soapws.gt.com/", name = "paisdeto")
    public JAXBElement<Paisdeto> createPaisdeto(Paisdeto value) {
        return new JAXBElement<Paisdeto>(_Paisdeto_QNAME, Paisdeto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaisdetoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soapws.gt.com/", name = "paisdetoResponse")
    public JAXBElement<PaisdetoResponse> createPaisdetoResponse(PaisdetoResponse value) {
        return new JAXBElement<PaisdetoResponse>(_PaisdetoResponse_QNAME, PaisdetoResponse.class, null, value);
    }

}
