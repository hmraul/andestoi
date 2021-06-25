package com.rhm.andestoi.infrastructure.controller

import com.rhm.andestoi.domain.Position
import com.rhm.andestoi.domain.UserPosition

data class PositionRequest(
    private val userId: String,
    private val deviceId: String,
    private val latitude: Double,
    private val longitude: Double
) {
    fun toUserPosition(): UserPosition  =
        UserPosition(
            userId,
            deviceId,
            Position(latitude, longitude)
        )
}