package com.rhm.andestoi.infrastructure.controller


data class PositionRequest(
    val userId: String,
    val deviceId: String,
    val latitude: Double,
    val longitude: Double
)