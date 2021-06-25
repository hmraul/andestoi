package com.rhm.andestoi.infrastructure.configuration

import com.rhm.andestoi.domain.PositionRepository
import com.rhm.andestoi.infrastructure.repository.InMemory
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class AppConfiguration {

    @Bean
    fun repository() : PositionRepository = InMemory()
}