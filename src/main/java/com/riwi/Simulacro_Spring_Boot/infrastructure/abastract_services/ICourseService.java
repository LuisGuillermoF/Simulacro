package com.riwi.Simulacro_Spring_Boot.infrastructure.abastract_services;

import com.riwi.Simulacro_Spring_Boot.api.dto.request.CourseRequest;
import com.riwi.Simulacro_Spring_Boot.api.dto.response.basicResponse.CourseRSBasic;

public interface ICourseService extends CrudGeneral<CourseRequest,CourseRSBasic,Long>{
    public CourseRSBasic getById(Long id);
}
