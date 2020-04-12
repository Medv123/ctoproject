package com.example.phoenix.confiruration

import org.springframework.boot.context.properties.ConfigurationProperties

@ConfigurationProperties(prefix = "props")
data class AppsProperties(
    var vkToken: String? = null,
    var vkOwnerId: Int? = null,
    var vkServiceId: Int? = null,
    var fbToken: String? = null
)