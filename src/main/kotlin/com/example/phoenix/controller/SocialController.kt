package com.example.phoenix.controller

import com.example.phoenix.confiruration.AppsProperties
import com.example.phoenix.connector.VkClient
import org.springframework.web.bind.annotation.*
import org.springframework.web.client.RestTemplate

@RestController
class SocialController(var properties: AppsProperties, var vkClient: VkClient) {

    @RequestMapping(value = ["/publish"], method = [RequestMethod.GET])
    fun publishMessage(@RequestParam message:String) {
        vkClient.vk
                .wall()
                .post(vkClient.actor)
                .message(message)
                .ownerId(properties.vkOwnerId)
                .executeAsString()

        val responseFB = RestTemplate().postForObject(
                "https://graph.facebook.com/me/feed?message="+message+"&access_token="+properties.fbToken,
                null,
                String::class.java)
        println(responseFB.toString())
    }
}