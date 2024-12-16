package kr.ac.kumoh.ce.s20180260.genshinside.controller

import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@CrossOrigin(origins = ["http://localhost:3000", "http://genshinside.netlify.app"])
class MessageController {
    @GetMapping
    fun getRoot() = mapOf("status" to "success-root")
    @GetMapping("/api/message")
    fun getMessage() = mapOf("status" to "success-api/message")
}