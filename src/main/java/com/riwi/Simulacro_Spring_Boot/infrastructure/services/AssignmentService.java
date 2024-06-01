package com.riwi.Simulacro_Spring_Boot.infrastructure.services;

import org.springframework.data.domain.Page;

import com.riwi.Simulacro_Spring_Boot.api.dto.request.AssignmentRequest;
import com.riwi.Simulacro_Spring_Boot.api.dto.response.basicResponse.AssignmentRSBasic;
import com.riwi.Simulacro_Spring_Boot.infrastructure.abastract_services.IAssignmentService;

public class AssignmentService implements IAssignmentService{

    @Override
    public void delete(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

    @Override
    public AssignmentRSBasic create(AssignmentRequest request) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'create'");
    }

    @Override
    public AssignmentRSBasic update(Long id, AssignmentRequest request) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public Page<AssignmentRSBasic> getAll(int page, int size) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAll'");
    }
    
}
