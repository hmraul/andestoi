package com.rhm.andestoi.infrastructure.controller

import com.rhm.andestoi.application.positions.SavePosition
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class PositionManager(private val savePosition: SavePosition) {
    @GetMapping("/health")
    fun health(): ResponseEntity<Void> {
        return ResponseEntity(HttpStatus.OK)
    }

    @PostMapping("/positions")
    fun save(@RequestBody positionRequest: PositionRequest): ResponseEntity<PositionResponse> {
        val positionResponse = savePosition.execute(positionRequest)
        return ResponseEntity(positionResponse, HttpStatus.CREATED)
    }
}