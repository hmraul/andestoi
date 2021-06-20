package com.rhm.andestoi.integrationtest

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit.jupiter.SpringExtension
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.get

@AutoConfigureMockMvc
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ExtendWith(SpringExtension::class)
class PositionManagerIntegrationTests {

    @Autowired
    private lateinit var mockMvc: MockMvc

    @Test
    fun `get OK on health endpoint`() {
        mockMvc.get("/health")
            .andExpect {
                status { isOk() }
            }

    }
}