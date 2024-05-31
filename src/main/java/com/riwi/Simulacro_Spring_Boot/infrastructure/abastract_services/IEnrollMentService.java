package com.riwi.Simulacro_Spring_Boot.infrastructure.abastract_services;

import com.riwi.Simulacro_Spring_Boot.api.dto.request.EnrollmentRequest;
import com.riwi.Simulacro_Spring_Boot.api.dto.response.basicResponse.EnrollmentResponse;

public interface IEnrollMentService extends CrudGeneral<EnrollmentRequest,EnrollmentResponse,Long>{

}