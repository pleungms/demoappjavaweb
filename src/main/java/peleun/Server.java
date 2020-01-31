package peleun;

/**************************************************************************
 * File: Server.java
 *
 * Description:
 *  Simple Java Web Application using SpringBoot which will
 *  be placed into a Docker Container
 * 
 * Author: Peter Leung
 *
 *************************************************************************/

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.concurrent.atomic.AtomicLong;

@SpringBootApplication
@RestController
public class Server {

	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();

	@RequestMapping("/")
	public String home() {
		return "Hello World [Docker Container] - on Azure using Github bc";
	}

	@GetMapping("/greeting")
	public ServerResponse greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		return new ServerResponse(counter.incrementAndGet(), String.format(template, name));
	}

	public static void main(String[] args) {
		SpringApplication.run(Server.class, args);
	}

}
