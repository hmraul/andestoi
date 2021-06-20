package com.rhm.andestoi.infrastructure.controller

data class PositionResponse(
    val eventDate: String,
    val position: Position
)

data class Position(
    val latitude: Double,
    val longitude: Double
)