//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.05.25 at 02:54:08 PM CEST 
//

package org.ow2.sirocco.cloudmanager.service.ovf.datamodel;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

import org.w3c.dom.Element;

/**
 * Specification of the operating system installed in the guest
 * <p>
 * Java class for OperatingSystemSection_Type complex type.
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="OperatingSystemSection_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.dmtf.org/ovf/envelope/1}Section_Type">
 *       &lt;sequence>
 *         &lt;element name="Description" type="{http://schemas.dmtf.org/ovf/envelope/1}Msg_Type" minOccurs="0"/>
 *         &lt;any processContents='lax' namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
 *       &lt;attribute name="version" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;anyAttribute processContents='lax'/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OperatingSystemSection_Type", propOrder = {"description", "any"})
public class OperatingSystemSectionType extends SectionType {

    @XmlElement(name = "Description")
    protected MsgType description;

    @XmlAnyElement(lax = true)
    protected List<Object> any;

    @XmlAttribute(namespace = "http://schemas.dmtf.org/ovf/envelope/1", required = true)
    @XmlSchemaType(name = "unsignedShort")
    protected int id;

    @XmlAttribute(namespace = "http://schemas.dmtf.org/ovf/envelope/1")
    protected String version;

    /**
     * Gets the value of the description property.
     * 
     * @return possible object is {@link MsgType }
     */
    public MsgType getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value allowed object is {@link MsgType }
     */
    public void setDescription(MsgType value) {
        this.description = value;
    }

    /**
     * Gets the value of the any property.
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the any property.
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getAny().add(newItem);
     * </pre>
     * <p>
     * Objects of the following type(s) are allowed in the list {@link Object }
     * {@link Element }
     */
    public List<Object> getAny() {
        if (any == null) {
            any = new ArrayList<Object>();
        }
        return this.any;
    }

    /**
     * Gets the value of the id property.
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return possible object is {@link String }
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setVersion(String value) {
        this.version = value;
    }

}
