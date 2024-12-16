package kr.ac.kumoh.ce.s20180260.genshinside.repository

import kr.ac.kumoh.ce.s20180260.genshinside.model.Character
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface CharacterRepository: MongoRepository<Character, String> {
}