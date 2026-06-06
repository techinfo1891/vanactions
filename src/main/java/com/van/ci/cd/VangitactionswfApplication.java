package com.van.ci.cd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class VangitactionswfApplication {

	@GetMapping("/testing")
	public String testing() {
		System.out.print("welcome to chennai.......>>><<<<<.........");
		return "Welcome to Java techie world";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(VangitactionswfApplication.class, args);
	}

}

//
//echo "# vanactions" >> README.md
//git init
//git add README.md
//git commit -m "first commit"
//git branch -M main
//git remote add origin https://github.com/techinfo1891/vanactions.git
//git push -u origin main