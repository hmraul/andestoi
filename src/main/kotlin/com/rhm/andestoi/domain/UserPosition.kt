package com.rhm.andestoi.domain

data class UserPosition(
    val userId: String,
    val deviceId: String,
    val position: Position
) {

}

data class Position(
    val latitude: Double,
    val longitude: Double
)
