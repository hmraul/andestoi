package com.rhm.andestoi.application.positions

import com.rhm.andestoi.domain.PositionRepository
import com.rhm.andestoi.infrastructure.controller.PositionRequest
import com.rhm.andestoi.infrastructure.controller.PositionResponse
import com.rhm.andestoi.infrastructure.controller.PositionResponse.Companion.toResponse

class SavePosition(private val positionRepository: PositionRepository) {
    fun execute(positionRequest: PositionRequest) : PositionResponse {
        val position = positionRequest.toUserPosition()
        val result = positionRepository.save(position)

        return result.toResponse()
    }
}

