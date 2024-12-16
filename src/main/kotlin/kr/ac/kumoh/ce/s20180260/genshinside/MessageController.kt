package kr.ac.kumoh.ce.s20180260.genshinside

import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/message")
class MessageController {
    @GetMapping
    @CrossOrigin(origins = ["http://localhost:3000", "http://genshinside.netlify.app"])
    fun getMessage() = mapOf("status" to "success")
}