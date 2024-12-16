package kr.ac.kumoh.ce.s20180260.genshinside.service

import kr.ac.kumoh.ce.s20180260.genshinside.model.Character
import kr.ac.kumoh.ce.s20180260.genshinside.repository.CharacterRepository
import org.springframework.stereotype.Service

@Service
class CharacterService (
    private val repository: CharacterRepository
){
    fun getAllCharacters(): List<Character> = repository.findAll()
    fun getCharacterById(id: String): Character? = repository.findById(id).orElse(null)
    fun addCharacter(song: Character): Character = repository.save(song)
    fun updateSong(id: String, character: Character): Character? {
        val characterTarget = repository.findById(id)

        return if (characterTarget.isPresent) {
            val oldCharacter = characterTarget.get()
            val updatedCharacter = oldCharacter.copy(
                name = character.name,
                weapon = character.weapon,
                element = character.element,
                region = character.region,
                rarity = character.rarity,
                constellation = character.constellation,
                description = character.description,
                birthday = character.birthday,
                releaseDate = character.releaseDate,
                va = character.va,
                faceImgUrl = character.faceImgUrl,
                bodyImgUrl = character.bodyImgUrl,
            )
            repository.save(updatedCharacter)
        } else {
            null
        }
    }

    fun deleteSong(id: String): Boolean {
        return if (repository.existsById(id)) {
            repository.deleteById(id)
            true
        } else {
            false
        }
    }

}