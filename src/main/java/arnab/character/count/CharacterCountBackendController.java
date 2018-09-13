package arnab.character.count;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/stringCount")
public class CharacterCountBackendController {

	@Autowired
	private CharacterCountBackendService service;
	
	@GetMapping(value = "/getgetcount")
	public int getGetCount(@PathParam("value") String value) {
		return service.count(value);
	}
	
	@PostMapping(value = "/getpostcount")
	public int getPostCount(@RequestBody String value) {
		return service.count(value);
	}
	
}
