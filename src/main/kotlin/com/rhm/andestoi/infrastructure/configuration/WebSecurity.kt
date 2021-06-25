package com.rhm.andestoi.infrastructure.configuration

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.Configuration

import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter
import org.springframework.security.config.web.servlet.invoke

@EnableWebSecurity
@SpringBootApplication
class SpringSecurityApplication

@Configuration
class WebSecurityConfiguration : WebSecurityConfigurerAdapter() {
    override fun configure(http: HttpSecurity?) {
        http {
            csrf { disable() }
            authorizeRequests {
                authorize("/**", permitAll)
            }
            httpBasic {}
        }
    }
}