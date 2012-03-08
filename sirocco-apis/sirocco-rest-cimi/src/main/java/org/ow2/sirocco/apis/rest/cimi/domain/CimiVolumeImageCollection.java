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

import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;

/**
 * Class VolumeImageCollection. <p> </p>
 */
@XmlRootElement(name = "volumeImageCollection")
@JsonSerialize(include = Inclusion.NON_NULL)
public class CimiVolumeImageCollection extends CimiCommon implements Serializable {

    /** Serial number */
    private static final long serialVersionUID = 1L;

    // ---------------------------------------- Fields

    /**
     * Field "volumeImages". <p> </p>
     */
    private CimiVolumeImage[] volumeImages;

    // ---------------------------------------- Constructors

    /**
     * Default constructor.
     */
    public CimiVolumeImageCollection() {
        super();
    }

    // ---------------------------------------- ???com-accesseurs???

    /**
     * Return the value of field "volumeImages".
     * @return The value
     */
    public CimiVolumeImage[] getVolumeImages() {
        return this.volumeImages;
    }

    /**
     * Set the value of field "volumeImages".
     * @param volumeImages The value
     */
    public void setVolumeImages(CimiVolumeImage[] volumeImages) {
        this.volumeImages = volumeImages;
    }

}
