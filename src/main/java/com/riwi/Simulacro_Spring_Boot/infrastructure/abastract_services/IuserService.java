package com.riwi.Simulacro_Spring_Boot.infrastructure.abastract_services;

import com.riwi.Simulacro_Spring_Boot.api.dto.request.UserRequest;
import com.riwi.Simulacro_Spring_Boot.api.dto.response.basicResponse.UserResponse;

public interface IuserService extends CrudGeneral<UserRequest,UserResponse,Long>{
    
}
