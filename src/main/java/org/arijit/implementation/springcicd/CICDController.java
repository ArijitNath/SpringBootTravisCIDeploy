package org.arijit.implementation.springcicd;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CICDController {
	
	@GetMapping("/")
	public String getArijit() {
		return "Arijit";
	}
}
