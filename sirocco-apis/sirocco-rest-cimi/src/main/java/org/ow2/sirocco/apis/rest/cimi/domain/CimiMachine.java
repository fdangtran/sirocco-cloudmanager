/**
 *
 * SIROCCO
 * Copyright (C) 2011 France Telecom
 * Contact: sirocco@ow2.org
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA 02111-1307
 * USA
 *
 * $Id$
 *
 */
package org.ow2.sirocco.apis.rest.cimi.domain;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;

/**
 * Class Machine. <p> </p>
 */
@XmlRootElement(name = "machine")
@JsonSerialize(include = Inclusion.NON_NULL)
public class CimiMachine extends CimiCommon implements Serializable {

    /** Serial number */
    private static final long serialVersionUID = 1L;

    // ---------------------------------------- Fields
    /**
     * Field href <p> </p>
     */
    private String href;

    /**
     * Field "state". <p> </p>
     */
    private String state;

    /**
     * Field "cpu". <p> </p>
     */
    private CimiCpu cpu;

    /**
     * Field "memory". <p> </p>
     */
    private CimiMemory memory;

    /**
     * Field "capacity". <p> </p>
     */
    private CimiCapacity capacity;

    /**
     * Field "volumes". <p> </p>
     */
    private CimiVolumeMachine[] volumes;

    /**
     * Field "networkInterfaces". <p> </p>
     */
    private CimiNetworkInterface[] networkInterfaces;

    // ---------------------------------------- Constructors

    /**
     * Default constructor.
     */
    public CimiMachine() {
        super();
    }

    // ---------------------------------------- ???com-accesseurs???

    /**
     * Return the value of field "state".
     * @return The value
     */
    public String getState() {
        return this.state;
    }

    /**
     * Set the value of field "state".
     * @param state The value
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * Return the value of field "cpu".
     * @return The value
     */
    public CimiCpu getCpu() {
        return this.cpu;
    }

    /**
     * Set the value of field "cpu".
     * @param cpu The value
     */
    public void setCpu(CimiCpu cpu) {
        this.cpu = cpu;
    }

    /**
     * Return the value of field "memory".
     * @return The value
     */
    public CimiMemory getMemory() {
        return this.memory;
    }

    /**
     * Set the value of field "memory".
     * @param memory The value
     */
    public void setMemory(CimiMemory memory) {
        this.memory = memory;
    }

    /**
     * Return the value of field "capacity".
     * @return The value
     */
    public CimiCapacity getCapacity() {
        return this.capacity;
    }

    /**
     * Set the value of field "capacity".
     * @param disks The value
     */
    public void setCapacity(CimiCapacity capacity) {
        this.capacity = capacity;
    }

    /**
     * Return the value of field "volumes".
     * @return The value
     */
    public CimiVolumeMachine[] getVolumes() {
        return this.volumes;
    }

    /**
     * Set the value of field "volumes".
     * @param volumes The value
     */
    public void setVolumes(CimiVolumeMachine[] volumes) {
        this.volumes = volumes;
    }

    /**
     * Return the value of field "networkInterfaces".
     * @return The value
     */
    public CimiNetworkInterface[] getNetworkInterfaces() {
        return this.networkInterfaces;
    }

    /**
     * Set the value of field "networkInterfaces".
     * @param networkInterfaces The value
     */
    public void setNetworkInterfaces(CimiNetworkInterface[] networkInterfaces) {
        this.networkInterfaces = networkInterfaces;
    }

    /**
     * @return the href
     */
    @XmlAttribute
    public String getHref() {
        return href;
    }

    /**
     * @param href the href to set
     */
    public void setHref(String href) {
        this.href = href;
    }
}