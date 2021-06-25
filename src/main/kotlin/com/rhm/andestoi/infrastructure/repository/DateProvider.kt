package com.rhm.andestoi.infrastructure.repository

import java.time.LocalDateTime

class DateProvider {
    fun now(): LocalDateTime = LocalDateTime.now()
}