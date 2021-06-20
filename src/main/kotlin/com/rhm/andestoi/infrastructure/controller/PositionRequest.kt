package com.rhm.andestoi.infrastructure.controller

import com.rhm.andestoi.domain.Position
import com.rhm.andestoi.domain.UserPosition


data class PositionRequest(
    val userId: String,
    val deviceId: String,
    val latitude: Double,
    val longitude: Double
) {
    fun toUserPosition(): UserPosition  =
            UserPosition(
                userId,
                deviceId,
                Position(latitude, longitude)
            )
}