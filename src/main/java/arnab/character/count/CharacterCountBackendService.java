package arnab.character.count;

import org.springframework.stereotype.Service;

@Service
public class CharacterCountBackendService {

	public int count(String value) {
		return value.length();
	}
	
}
