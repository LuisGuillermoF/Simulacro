package com.riwi.Simulacro_Spring_Boot.infrastructure.abastract_services;

import com.riwi.Simulacro_Spring_Boot.api.dto.request.SubmissionRequest;
import com.riwi.Simulacro_Spring_Boot.api.dto.response.basicResponse.SubmissionResponse;

public interface ISubMissionService extends CrudGeneral<SubmissionRequest,SubmissionResponse,Long>{

}
