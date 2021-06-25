package com.rhm.andestoi.domain

import java.time.LocalDateTime

class UserPosition(
    val userId: String,
    val deviceId: String,
    val position: Position,
) {

    var eventDate: LocalDateTime? = null

    fun setDate(eventDate: LocalDateTime) {
        this.eventDate = eventDate
    }
}

class Position(
    val latitude: Double,
    val longitude: Double
)
