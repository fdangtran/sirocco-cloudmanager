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
package org.ow2.sirocco.apis.rest.cimi.manager;

import javax.validation.groups.Default;
import javax.ws.rs.core.Response;

import org.ow2.sirocco.apis.rest.cimi.request.CimiRequest;
import org.ow2.sirocco.apis.rest.cimi.request.CimiResponse;
import org.ow2.sirocco.apis.rest.cimi.validator.CimiValidatorHelper;
import org.ow2.sirocco.apis.rest.cimi.validator.GroupWrite;

/**
 * Abstract class for manage UPDATE request.
 */
public abstract class CimiManagerUpdateAbstract extends CimiManagerAbstract {

    /**
     * {@inheritDoc}
     * 
     * @see org.ow2.sirocco.apis.rest.cimi.manager.CimiManagerAbstract#validate(org.ow2.sirocco.apis.rest.cimi.request.CimiRequest,
     *      org.ow2.sirocco.apis.rest.cimi.request.CimiResponse)
     */
    @Override
    protected boolean validate(final CimiRequest request, final CimiResponse response) throws Exception {
        boolean valid = CimiValidatorHelper.getInstance().validate(request, response, request.getHeader());
        if (valid) {
            if (null == request.getCimiData()) {
                valid = false;
            } else {
                valid = CimiValidatorHelper.getInstance().validate(request, response, request.getCimiData(), Default.class,
                    GroupWrite.class);
            }
        }
        return valid;
    }

    /**
     * {@inheritDoc}
     * 
     * @see org.ow2.sirocco.apis.rest.cimi.manager.CimiManagerAbstract#convertToResponse(org.ow2.sirocco.apis.rest.cimi.request.CimiRequest,
     *      org.ow2.sirocco.apis.rest.cimi.request.CimiResponse,
     *      java.lang.Object)
     */
    @Override
    protected void convertToResponse(final CimiRequest request, final CimiResponse response, final Object dataService)
        throws Exception {
        response.setCimiData(null);
        response.setStatus(Response.Status.OK);
    }

}