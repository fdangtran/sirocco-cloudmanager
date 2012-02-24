/**
 *
 * SIROCCO
 * Copyright (C) 2012 France Telecom
 * Contact: sirocco@ow2.org
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307
 * USA
 *
 *  
 *
 */


package org.ow2.sirocco.cloudmanager.core.api;

import java.util.Date;
import java.util.List;

import org.ow2.sirocco.cloudmanager.model.cimi.MachineImage;
import org.ow2.sirocco.cloudmanager.model.cimi.Job;


import org.ow2.sirocco.cloudmanager.core.exception.CloudProviderException;


public interface IMachineImageManager {

	static final String EJB_JNDI_NAME = "MachineImageManager";
	
	Job createMachineImage(MachineImage machineImage) throws CloudProviderException;

	List<MachineImage> getMachineImages() throws CloudProviderException;
	
	MachineImage getMachineImage(String imageId)throws CloudProviderException;
	
	void deleteMachineImage(String imageId)throws CloudProviderException;
}
