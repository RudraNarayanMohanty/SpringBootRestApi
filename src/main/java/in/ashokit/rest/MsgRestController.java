package in.ashokit.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MsgRestController {
	@PostMapping("/msg")
	public ResponseEntity<String> saveMsg() {
		// logic to save Msg
		String responseBody = "Msg saved successfully";
		return new ResponseEntity<String>(responseBody, HttpStatus.CREATED);
	}

	@GetMapping("/welcome")
	public ResponseEntity<String> getWellcomeMsg() {
		String msg = "Wellcome to Rest ApI..!";
		return new ResponseEntity<String>(msg, HttpStatus.OK);
	}

	@GetMapping("/greet")
	public String getGreetMsg() {
		return "Good Evening";

	}

}
