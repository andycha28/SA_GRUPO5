
package com.gt.soapws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para paisdeto complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="paisdeto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="namep" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codpais" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="departamento" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "paisdeto", propOrder = {
    "namep",
    "codpais",
    "departamento"
})
public class Paisdeto {

    protected String namep;
    protected String codpais;
    @XmlElement(nillable = true)
    protected List<String> departamento;

    /**
     * Obtiene el valor de la propiedad namep.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNamep() {
        return namep;
    }

    /**
     * Define el valor de la propiedad namep.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNamep(String value) {
        this.namep = value;
    }

    /**
     * Obtiene el valor de la propiedad codpais.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodpais() {
        return codpais;
    }

    /**
     * Define el valor de la propiedad codpais.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodpais(String value) {
        this.codpais = value;
    }

    /**
     * Gets the value of the departamento property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the departamento property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDepartamento().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDepartamento() {
        if (departamento == null) {
            departamento = new ArrayList<String>();
        }
        return this.departamento;
    }

}
