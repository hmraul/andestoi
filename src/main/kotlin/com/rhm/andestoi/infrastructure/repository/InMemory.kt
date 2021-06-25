package com.rhm.andestoi.infrastructure.repository

import com.rhm.andestoi.domain.PositionRepository
import com.rhm.andestoi.domain.UserPosition

class InMemory(private val dateProvider: DateProvider) : PositionRepository {

    private val repo = mutableListOf<UserPosition>()

    override fun save(position: UserPosition): UserPosition {
        position.setDate(dateProvider.now())
        repo.add(position)
        return position
    }
}