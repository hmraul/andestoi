package com.rhm.andestoi.infrastructure.repository

import com.rhm.andestoi.domain.PositionRepository
import com.rhm.andestoi.domain.UserPosition

class InMemory: PositionRepository {
    override fun save(position: UserPosition) {
        TODO("Not yet implemented")
    }
}