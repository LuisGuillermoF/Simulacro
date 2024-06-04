package com.riwi.Simulacro_Spring_Boot.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.riwi.Simulacro_Spring_Boot.api.dto.request.EnrollmentRequest;
import com.riwi.Simulacro_Spring_Boot.api.dto.response.basicResponse.EnrollmentRSBasic;
import com.riwi.Simulacro_Spring_Boot.infrastructure.abastract_services.IEnrollMentService;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/enrollment")
@AllArgsConstructor
@Tag(name = "/enrollment")
public class EnrollmentController {
    @Autowired
    private final IEnrollMentService objEnrollMentService;

    @GetMapping
    public ResponseEntity<Page<EnrollmentRSBasic>> getAll(
        @RequestParam(defaultValue = "1") int page,
        @RequestParam(defaultValue = "10") int size){
            return ResponseEntity.ok(this.objEnrollMentService.getAll(page -1, size));
    }

    @PostMapping
    public ResponseEntity<EnrollmentRSBasic> insert(
        @Validated @RequestBody EnrollmentRequest request){
            return ResponseEntity.ok(this.objEnrollMentService.create(request));
        }
}
