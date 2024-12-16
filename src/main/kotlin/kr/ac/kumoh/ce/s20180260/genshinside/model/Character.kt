package kr.ac.kumoh.ce.s20180260.genshinside.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document(collection = "characters")
data class Character(
    @Id
    val id: String?,
    val name: String,
    val weapon: String,
    val element: String,
    val region: String,
    val rarity: Int,
    val constellation: String,
    val description: String,
    val birthday: String,
    val releaseDate: String,
    val va: String,
    val faceImgUrl: String,
    val bodyImgUrl: String,
)