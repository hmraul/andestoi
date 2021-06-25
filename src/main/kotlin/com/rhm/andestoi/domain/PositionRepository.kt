package com.rhm.andestoi.domain

interface PositionRepository {
    fun save(position: UserPosition): UserPosition
}