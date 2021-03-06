package com.rhm.andestoi.infrastructure.controller

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class PositionManager {
    @GetMapping("/health")
    fun health(): ResponseEntity<Void> {
        return ResponseEntity(HttpStatus.OK)
    }
}