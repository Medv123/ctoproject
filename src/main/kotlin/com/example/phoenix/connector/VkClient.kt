package com.example.phoenix.connector

import com.example.phoenix.confiruration.AppsProperties
import com.vk.api.sdk.client.TransportClient
import com.vk.api.sdk.client.VkApiClient
import com.vk.api.sdk.client.actors.UserActor
import com.vk.api.sdk.httpclient.HttpTransportClient
import org.springframework.stereotype.Component

@Component
class VkClient(properties: AppsProperties) {
    final var vk: VkApiClient
    final var actor: UserActor

    init {
        val transportClient: TransportClient = HttpTransportClient.getInstance()
        vk = VkApiClient(transportClient)
        actor = UserActor(properties.vkServiceId, properties.vkToken)
    }
}