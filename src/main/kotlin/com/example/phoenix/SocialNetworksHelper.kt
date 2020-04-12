package com.example.phoenix

import com.example.phoenix.confiruration.AppsProperties
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.boot.runApplication

@SpringBootApplication
@EnableConfigurationProperties(AppsProperties::class)
class SocialNetworksHelper {
}

fun main(args: Array<String>) {
	runApplication<SocialNetworksHelper>(*args)
}
