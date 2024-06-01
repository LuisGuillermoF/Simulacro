package com.riwi.Simulacro_Spring_Boot.infrastructure.services;

import org.springframework.data.domain.Page;

import com.riwi.Simulacro_Spring_Boot.api.dto.request.SubmissionRequest;
import com.riwi.Simulacro_Spring_Boot.api.dto.response.basicResponse.SubmissionRSBasic;
import com.riwi.Simulacro_Spring_Boot.infrastructure.abastract_services.ISubMissionService;

public class SubMissionService implements ISubMissionService{

    @Override
    public void delete(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

    @Override
    public SubmissionRSBasic create(SubmissionRequest request) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'create'");
    }

    @Override
    public SubmissionRSBasic update(Long id, SubmissionRequest request) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public Page<SubmissionRSBasic> getAll(int page, int size) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAll'");
    }
    
}
