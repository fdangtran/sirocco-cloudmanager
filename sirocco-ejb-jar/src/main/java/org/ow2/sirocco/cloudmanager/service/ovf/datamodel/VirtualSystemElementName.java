//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.05.25 at 02:54:08 PM CEST 
//

package org.ow2.sirocco.cloudmanager.service.ovf.datamodel;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

@SuppressWarnings("serial")
public class VirtualSystemElementName extends JAXBElement<CimString> {

    protected final static QName NAME = new QName(
        "http://schemas.dmtf.org/wbem/wscim/1/cim-schema/2/CIM_VirtualSystemSettingData", "ElementName");

    public VirtualSystemElementName(final CimString value) {
        super(VirtualSystemElementName.NAME, (CimString.class), null, value);
    }

    public VirtualSystemElementName() {
        super(VirtualSystemElementName.NAME, (CimString.class), null, null);
    }

}
