package com.rhm.andestoi.infrastructure.controller

import com.rhm.andestoi.domain.UserPosition

data class PositionResponse(
    val eventDate: String,
    val position: Position
) {
    companion object {
        fun UserPosition.toResponse(): PositionResponse {
            return PositionResponse(
                this.eventDate.toString(),
            Position(this.position.latitude, this.position.longitude))
        }
    }
}

data class Position(
    val latitude: Double,
    val longitude: Double
)