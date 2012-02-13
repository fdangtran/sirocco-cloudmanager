//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.05.25 at 02:54:08 PM CEST 
//

package org.ow2.sirocco.cloudmanager.service.ovf.datamodel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;

import org.w3c.dom.Element;

/**
 * <p>
 * Java class for CIM_VirtualSystemSettingData_Type complex type.
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="CIM_VirtualSystemSettingData_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://schemas.dmtf.org/wbem/wscim/1/cim-schema/2/CIM_VirtualSystemSettingData}AutomaticRecoveryAction" minOccurs="0"/>
 *         &lt;element ref="{http://schemas.dmtf.org/wbem/wscim/1/cim-schema/2/CIM_VirtualSystemSettingData}AutomaticShutdownAction" minOccurs="0"/>
 *         &lt;element ref="{http://schemas.dmtf.org/wbem/wscim/1/cim-schema/2/CIM_VirtualSystemSettingData}AutomaticStartupAction" minOccurs="0"/>
 *         &lt;element ref="{http://schemas.dmtf.org/wbem/wscim/1/cim-schema/2/CIM_VirtualSystemSettingData}AutomaticStartupActionDelay" minOccurs="0"/>
 *         &lt;element ref="{http://schemas.dmtf.org/wbem/wscim/1/cim-schema/2/CIM_VirtualSystemSettingData}AutomaticStartupActionSequenceNumber" minOccurs="0"/>
 *         &lt;element ref="{http://schemas.dmtf.org/wbem/wscim/1/cim-schema/2/CIM_VirtualSystemSettingData}Caption" minOccurs="0"/>
 *         &lt;element ref="{http://schemas.dmtf.org/wbem/wscim/1/cim-schema/2/CIM_VirtualSystemSettingData}ConfigurationDataRoot" minOccurs="0"/>
 *         &lt;element ref="{http://schemas.dmtf.org/wbem/wscim/1/cim-schema/2/CIM_VirtualSystemSettingData}ConfigurationFile" minOccurs="0"/>
 *         &lt;element ref="{http://schemas.dmtf.org/wbem/wscim/1/cim-schema/2/CIM_VirtualSystemSettingData}ConfigurationID" minOccurs="0"/>
 *         &lt;element ref="{http://schemas.dmtf.org/wbem/wscim/1/cim-schema/2/CIM_VirtualSystemSettingData}CreationTime" minOccurs="0"/>
 *         &lt;element ref="{http://schemas.dmtf.org/wbem/wscim/1/cim-schema/2/CIM_VirtualSystemSettingData}Description" minOccurs="0"/>
 *         &lt;element ref="{http://schemas.dmtf.org/wbem/wscim/1/cim-schema/2/CIM_VirtualSystemSettingData}ElementName"/>
 *         &lt;element ref="{http://schemas.dmtf.org/wbem/wscim/1/cim-schema/2/CIM_VirtualSystemSettingData}InstanceID"/>
 *         &lt;element ref="{http://schemas.dmtf.org/wbem/wscim/1/cim-schema/2/CIM_VirtualSystemSettingData}LogDataRoot" minOccurs="0"/>
 *         &lt;element ref="{http://schemas.dmtf.org/wbem/wscim/1/cim-schema/2/CIM_VirtualSystemSettingData}Notes" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://schemas.dmtf.org/wbem/wscim/1/cim-schema/2/CIM_VirtualSystemSettingData}RecoveryFile" minOccurs="0"/>
 *         &lt;element ref="{http://schemas.dmtf.org/wbem/wscim/1/cim-schema/2/CIM_VirtualSystemSettingData}SnapshotDataRoot" minOccurs="0"/>
 *         &lt;element ref="{http://schemas.dmtf.org/wbem/wscim/1/cim-schema/2/CIM_VirtualSystemSettingData}SuspendDataRoot" minOccurs="0"/>
 *         &lt;element ref="{http://schemas.dmtf.org/wbem/wscim/1/cim-schema/2/CIM_VirtualSystemSettingData}SwapFileDataRoot" minOccurs="0"/>
 *         &lt;element ref="{http://schemas.dmtf.org/wbem/wscim/1/cim-schema/2/CIM_VirtualSystemSettingData}VirtualSystemIdentifier" minOccurs="0"/>
 *         &lt;element ref="{http://schemas.dmtf.org/wbem/wscim/1/cim-schema/2/CIM_VirtualSystemSettingData}VirtualSystemType" minOccurs="0"/>
 *         &lt;any processContents='lax' namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;anyAttribute processContents='lax'/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CIM_VirtualSystemSettingData_Type", namespace = "http://schemas.dmtf.org/wbem/wscim/1/cim-schema/2/CIM_VirtualSystemSettingData", propOrder = {
    "automaticRecoveryAction", "automaticShutdownAction", "automaticStartupAction", "automaticStartupActionDelay",
    "automaticStartupActionSequenceNumber", "caption", "configurationDataRoot", "configurationFile", "configurationID",
    "creationTime", "description", "elementName", "instanceID", "logDataRoot", "notes", "recoveryFile", "snapshotDataRoot",
    "suspendDataRoot", "swapFileDataRoot", "virtualSystemIdentifier", "virtualSystemType", "any"})
@XmlSeeAlso({VSSDType.class})
public class CIMVirtualSystemSettingDataType {

    @XmlElement(name = "AutomaticRecoveryAction", nillable = true)
    protected AutomaticRecoveryAction automaticRecoveryAction;

    @XmlElement(name = "AutomaticShutdownAction", nillable = true)
    protected AutomaticShutdownAction automaticShutdownAction;

    @XmlElement(name = "AutomaticStartupAction", nillable = true)
    protected AutomaticStartupAction automaticStartupAction;

    @XmlElement(name = "AutomaticStartupActionDelay", nillable = true)
    protected CimDateTime automaticStartupActionDelay;

    @XmlElement(name = "AutomaticStartupActionSequenceNumber", nillable = true)
    protected CimUnsignedShort automaticStartupActionSequenceNumber;

    @XmlElementRef(name = "Caption", namespace = "http://schemas.dmtf.org/wbem/wscim/1/cim-schema/2/CIM_VirtualSystemSettingData", type = VirtualSystemCaption.class)
    protected VirtualSystemCaption caption;

    @XmlElement(name = "ConfigurationDataRoot", nillable = true)
    protected CimString configurationDataRoot;

    @XmlElement(name = "ConfigurationFile", nillable = true)
    protected CimString configurationFile;

    @XmlElement(name = "ConfigurationID", nillable = true)
    protected CimString configurationID;

    @XmlElement(name = "CreationTime", nillable = true)
    protected CimDateTime creationTime;

    @XmlElementRef(name = "Description", namespace = "http://schemas.dmtf.org/wbem/wscim/1/cim-schema/2/CIM_VirtualSystemSettingData", type = VirtualSystemDescription.class)
    protected VirtualSystemDescription description;

    @XmlElementRef(name = "ElementName", namespace = "http://schemas.dmtf.org/wbem/wscim/1/cim-schema/2/CIM_VirtualSystemSettingData", type = VirtualSystemElementName.class)
    protected VirtualSystemElementName elementName;

    @XmlElementRef(name = "InstanceID", namespace = "http://schemas.dmtf.org/wbem/wscim/1/cim-schema/2/CIM_VirtualSystemSettingData", type = VirtualSystemInstanceID.class)
    protected VirtualSystemInstanceID instanceID;

    @XmlElement(name = "LogDataRoot", nillable = true)
    protected CimString logDataRoot;

    @XmlElement(name = "Notes", nillable = true)
    protected List<CimString> notes;

    @XmlElement(name = "RecoveryFile", nillable = true)
    protected CimString recoveryFile;

    @XmlElement(name = "SnapshotDataRoot", nillable = true)
    protected CimString snapshotDataRoot;

    @XmlElement(name = "SuspendDataRoot", nillable = true)
    protected CimString suspendDataRoot;

    @XmlElement(name = "SwapFileDataRoot", nillable = true)
    protected CimString swapFileDataRoot;

    @XmlElement(name = "VirtualSystemIdentifier", nillable = true)
    protected CimString virtualSystemIdentifier;

    @XmlElement(name = "VirtualSystemType", nillable = true)
    protected CimString virtualSystemType;

    @XmlAnyElement(lax = true)
    protected List<Object> any;

    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the automaticRecoveryAction property.
     * 
     * @return possible object is {@link AutomaticRecoveryAction }
     */
    public AutomaticRecoveryAction getAutomaticRecoveryAction() {
        return automaticRecoveryAction;
    }

    /**
     * Sets the value of the automaticRecoveryAction property.
     * 
     * @param value allowed object is {@link AutomaticRecoveryAction }
     */
    public void setAutomaticRecoveryAction(AutomaticRecoveryAction value) {
        this.automaticRecoveryAction = value;
    }

    /**
     * Gets the value of the automaticShutdownAction property.
     * 
     * @return possible object is {@link AutomaticShutdownAction }
     */
    public AutomaticShutdownAction getAutomaticShutdownAction() {
        return automaticShutdownAction;
    }

    /**
     * Sets the value of the automaticShutdownAction property.
     * 
     * @param value allowed object is {@link AutomaticShutdownAction }
     */
    public void setAutomaticShutdownAction(AutomaticShutdownAction value) {
        this.automaticShutdownAction = value;
    }

    /**
     * Gets the value of the automaticStartupAction property.
     * 
     * @return possible object is {@link AutomaticStartupAction }
     */
    public AutomaticStartupAction getAutomaticStartupAction() {
        return automaticStartupAction;
    }

    /**
     * Sets the value of the automaticStartupAction property.
     * 
     * @param value allowed object is {@link AutomaticStartupAction }
     */
    public void setAutomaticStartupAction(AutomaticStartupAction value) {
        this.automaticStartupAction = value;
    }

    /**
     * Gets the value of the automaticStartupActionDelay property.
     * 
     * @return possible object is {@link CimDateTime }
     */
    public CimDateTime getAutomaticStartupActionDelay() {
        return automaticStartupActionDelay;
    }

    /**
     * Sets the value of the automaticStartupActionDelay property.
     * 
     * @param value allowed object is {@link CimDateTime }
     */
    public void setAutomaticStartupActionDelay(CimDateTime value) {
        this.automaticStartupActionDelay = value;
    }

    /**
     * Gets the value of the automaticStartupActionSequenceNumber property.
     * 
     * @return possible object is {@link CimUnsignedShort }
     */
    public CimUnsignedShort getAutomaticStartupActionSequenceNumber() {
        return automaticStartupActionSequenceNumber;
    }

    /**
     * Sets the value of the automaticStartupActionSequenceNumber property.
     * 
     * @param value allowed object is {@link CimUnsignedShort }
     */
    public void setAutomaticStartupActionSequenceNumber(CimUnsignedShort value) {
        this.automaticStartupActionSequenceNumber = value;
    }

    /**
     * Gets the value of the caption property.
     * 
     * @return possible object is {@link VirtualSystemCaption }
     */
    public VirtualSystemCaption getCaption() {
        return caption;
    }

    /**
     * Sets the value of the caption property.
     * 
     * @param value allowed object is {@link VirtualSystemCaption }
     */
    public void setCaption(VirtualSystemCaption value) {
        this.caption = value;
    }

    /**
     * Gets the value of the configurationDataRoot property.
     * 
     * @return possible object is {@link CimString }
     */
    public CimString getConfigurationDataRoot() {
        return configurationDataRoot;
    }

    /**
     * Sets the value of the configurationDataRoot property.
     * 
     * @param value allowed object is {@link CimString }
     */
    public void setConfigurationDataRoot(CimString value) {
        this.configurationDataRoot = value;
    }

    /**
     * Gets the value of the configurationFile property.
     * 
     * @return possible object is {@link CimString }
     */
    public CimString getConfigurationFile() {
        return configurationFile;
    }

    /**
     * Sets the value of the configurationFile property.
     * 
     * @param value allowed object is {@link CimString }
     */
    public void setConfigurationFile(CimString value) {
        this.configurationFile = value;
    }

    /**
     * Gets the value of the configurationID property.
     * 
     * @return possible object is {@link CimString }
     */
    public CimString getConfigurationID() {
        return configurationID;
    }

    /**
     * Sets the value of the configurationID property.
     * 
     * @param value allowed object is {@link CimString }
     */
    public void setConfigurationID(CimString value) {
        this.configurationID = value;
    }

    /**
     * Gets the value of the creationTime property.
     * 
     * @return possible object is {@link CimDateTime }
     */
    public CimDateTime getCreationTime() {
        return creationTime;
    }

    /**
     * Sets the value of the creationTime property.
     * 
     * @param value allowed object is {@link CimDateTime }
     */
    public void setCreationTime(CimDateTime value) {
        this.creationTime = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return possible object is {@link VirtualSystemDescription }
     */
    public VirtualSystemDescription getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value allowed object is {@link VirtualSystemDescription }
     */
    public void setDescription(VirtualSystemDescription value) {
        this.description = value;
    }

    /**
     * Gets the value of the elementName property.
     * 
     * @return possible object is {@link VirtualSystemElementName }
     */
    public VirtualSystemElementName getElementName() {
        return elementName;
    }

    /**
     * Sets the value of the elementName property.
     * 
     * @param value allowed object is {@link VirtualSystemElementName }
     */
    public void setElementName(VirtualSystemElementName value) {
        this.elementName = value;
    }

    /**
     * Gets the value of the instanceID property.
     * 
     * @return possible object is {@link VirtualSystemInstanceID }
     */
    public VirtualSystemInstanceID getInstanceID() {
        return instanceID;
    }

    /**
     * Sets the value of the instanceID property.
     * 
     * @param value allowed object is {@link VirtualSystemInstanceID }
     */
    public void setInstanceID(VirtualSystemInstanceID value) {
        this.instanceID = value;
    }

    /**
     * Gets the value of the logDataRoot property.
     * 
     * @return possible object is {@link CimString }
     */
    public CimString getLogDataRoot() {
        return logDataRoot;
    }

    /**
     * Sets the value of the logDataRoot property.
     * 
     * @param value allowed object is {@link CimString }
     */
    public void setLogDataRoot(CimString value) {
        this.logDataRoot = value;
    }

    /**
     * Gets the value of the notes property.
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the notes property.
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getNotes().add(newItem);
     * </pre>
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CimString }
     */
    public List<CimString> getNotes() {
        if (notes == null) {
            notes = new ArrayList<CimString>();
        }
        return this.notes;
    }

    /**
     * Gets the value of the recoveryFile property.
     * 
     * @return possible object is {@link CimString }
     */
    public CimString getRecoveryFile() {
        return recoveryFile;
    }

    /**
     * Sets the value of the recoveryFile property.
     * 
     * @param value allowed object is {@link CimString }
     */
    public void setRecoveryFile(CimString value) {
        this.recoveryFile = value;
    }

    /**
     * Gets the value of the snapshotDataRoot property.
     * 
     * @return possible object is {@link CimString }
     */
    public CimString getSnapshotDataRoot() {
        return snapshotDataRoot;
    }

    /**
     * Sets the value of the snapshotDataRoot property.
     * 
     * @param value allowed object is {@link CimString }
     */
    public void setSnapshotDataRoot(CimString value) {
        this.snapshotDataRoot = value;
    }

    /**
     * Gets the value of the suspendDataRoot property.
     * 
     * @return possible object is {@link CimString }
     */
    public CimString getSuspendDataRoot() {
        return suspendDataRoot;
    }

    /**
     * Sets the value of the suspendDataRoot property.
     * 
     * @param value allowed object is {@link CimString }
     */
    public void setSuspendDataRoot(CimString value) {
        this.suspendDataRoot = value;
    }

    /**
     * Gets the value of the swapFileDataRoot property.
     * 
     * @return possible object is {@link CimString }
     */
    public CimString getSwapFileDataRoot() {
        return swapFileDataRoot;
    }

    /**
     * Sets the value of the swapFileDataRoot property.
     * 
     * @param value allowed object is {@link CimString }
     */
    public void setSwapFileDataRoot(CimString value) {
        this.swapFileDataRoot = value;
    }

    /**
     * Gets the value of the virtualSystemIdentifier property.
     * 
     * @return possible object is {@link CimString }
     */
    public CimString getVirtualSystemIdentifier() {
        return virtualSystemIdentifier;
    }

    /**
     * Sets the value of the virtualSystemIdentifier property.
     * 
     * @param value allowed object is {@link CimString }
     */
    public void setVirtualSystemIdentifier(CimString value) {
        this.virtualSystemIdentifier = value;
    }

    /**
     * Gets the value of the virtualSystemType property.
     * 
     * @return possible object is {@link CimString }
     */
    public CimString getVirtualSystemType() {
        return virtualSystemType;
    }

    /**
     * Sets the value of the virtualSystemType property.
     * 
     * @param value allowed object is {@link CimString }
     */
    public void setVirtualSystemType(CimString value) {
        this.virtualSystemType = value;
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
     * Gets a map that contains attributes that aren't bound to any typed
     * property on this class.
     * <p>
     * the map is keyed by the name of the attribute and the value is the string
     * value of the attribute. the map returned by this method is live, and you
     * can add new attribute by updating the map directly. Because of this
     * design, there's no setter.
     * 
     * @return always non-null
     */
    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
    }

}
