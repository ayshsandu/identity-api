/*
 * Copyright (c) 2019, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.wso2.carbon.identity.rest.api.endpoint.challenge.exeption;

import org.wso2.carbon.identity.rest.api.endpoint.challenge.dto.ErrorDTO;
import org.wso2.carbon.identity.rest.api.endpoint.common.Constants;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;

public class ForbiddenException extends WebApplicationException {

    private String message;

    public ForbiddenException(ErrorDTO errorDTO) {

        super(Response.status(Response.Status.FORBIDDEN)
                .entity(errorDTO)
                .header(Constants.HEADER_CONTENT_TYPE, Constants.DEFAULT_RESPONSE_CONTENT_TYPE)
                .build());
        message = errorDTO.getDescription();
    }

    public ForbiddenException() {

        super(Response.Status.FORBIDDEN);
    }

    @Override
    public String getMessage() {

        return message;
    }
}
