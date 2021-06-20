package com.rhm.andestoi.application.positions

import com.rhm.andestoi.domain.PositionRepository
import com.rhm.andestoi.infrastructure.controller.PositionRequest
import com.rhm.andestoi.infrastructure.controller.PositionResponse

class Save(private val positionRepository: PositionRepository) {
    fun execute(positionRequest: PositionRequest) : PositionResponse {
        val position = positionRequest.toUserPosition()
        positionRepository.save(position)

        throw NotImplementedError()
    }
}

