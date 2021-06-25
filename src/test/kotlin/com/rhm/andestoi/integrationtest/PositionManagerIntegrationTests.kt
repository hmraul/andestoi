package com.rhm.andestoi.integrationtest

import com.nhaarman.mockitokotlin2.whenever
import com.rhm.andestoi.infrastructure.repository.DateProvider
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.mockito.junit.jupiter.MockitoExtension
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.mock.mockito.MockBean
import org.springframework.http.MediaType
import org.springframework.test.context.junit.jupiter.SpringExtension
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.get
import org.springframework.test.web.servlet.post
import java.time.LocalDateTime

@AutoConfigureMockMvc
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ExtendWith(SpringExtension::class, MockitoExtension::class)
class PositionManagerIntegrationTests {

    @MockBean
    lateinit var dateProvider: DateProvider

    @Autowired
    private lateinit var mockMvc: MockMvc

    @Test
    fun `get OK on health endpoint`() {
        mockMvc.get("/health")
            .andExpect {
                status { isOk() }
            }
    }

    @Test
    fun `return created position on save`() {
        whenever(dateProvider.now()).thenReturn(LocalDateTime.of(2021, 6, 20, 11, 0, 0, 0))

        val requestContent = "{\"userId\": \"my-user_id\",\"deviceId\": \"device-id\",\"latitude\": 0.001,\"longitude\": 0.002}"
        val expected = "{\"eventDate\": \"2021-06-20T11:00:000.00\",\"position\": {\"latitude\": 0.001,\"longitude\": 0.002}}"
        mockMvc.post("/positions") {
            contentType = MediaType.APPLICATION_JSON
            content = requestContent
            accept = MediaType.APPLICATION_JSON
        }
        .andExpect {
            status {isCreated() }
            content { contentType(MediaType.APPLICATION_JSON) }
            content { json(expected) }
        }
    }
}