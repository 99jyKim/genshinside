package kr.ac.kumoh.ce.s20180260.genshinside.controller

import kr.ac.kumoh.ce.s20180260.genshinside.model.Character
import kr.ac.kumoh.ce.s20180260.genshinside.service.CharacterService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/chars")
@CrossOrigin(origins = ["http://localhost:3000", "http://genshinside.netlify.app"])
class CharacterController(
    private val service: CharacterService
){
    @GetMapping
    fun getAllSongs(): List<Character> = service.getAllCharacters()

    @GetMapping("/{id}")
    fun getSongById(@PathVariable id: String): Character? = service.getCharacterById(id)
    @PostMapping
    fun addSong(@RequestBody song: Character): Character = service.addCharacter(song)

    @PutMapping("/{id}")
    fun updateSong(@PathVariable id: String, @RequestBody songDetails: Character): Character? =  service.updateSong(id, songDetails)

    @DeleteMapping("/{id}")
    fun deleteSong(@PathVariable id: String): Map<String, String> {
        return if (service.deleteSong(id))
            mapOf("status" to "deleted")
        else
            mapOf("status" to "not found")
    }
}