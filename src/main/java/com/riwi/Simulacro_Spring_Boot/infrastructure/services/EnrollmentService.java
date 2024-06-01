package com.riwi.Simulacro_Spring_Boot.infrastructure.services;

import org.springframework.data.domain.Page;

import com.riwi.Simulacro_Spring_Boot.api.dto.request.EnrollmentRequest;
import com.riwi.Simulacro_Spring_Boot.api.dto.response.basicResponse.EnrollmentRSBasic;
import com.riwi.Simulacro_Spring_Boot.infrastructure.abastract_services.IEnrollMentService;

public class EnrollmentService implements IEnrollMentService{

    @Override
    public void delete(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

    @Override
    public EnrollmentRSBasic create(EnrollmentRequest request) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'create'");
    }

    @Override
    public EnrollmentRSBasic update(Long id, EnrollmentRequest request) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public Page<EnrollmentRSBasic> getAll(int page, int size) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAll'");
    }
    
}
