package com.rhm.andestoi.infrastructure.configuration

import com.rhm.andestoi.application.positions.SavePosition
import com.rhm.andestoi.domain.PositionRepository
import com.rhm.andestoi.infrastructure.repository.DateProvider
import com.rhm.andestoi.infrastructure.repository.InMemory
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class AppConfiguration {

    @Bean
    fun dateProvider(): DateProvider = DateProvider()

    @Bean
    fun repository() : PositionRepository = InMemory(dateProvider())

    @Bean
    fun savePosition() = SavePosition(repository())

}