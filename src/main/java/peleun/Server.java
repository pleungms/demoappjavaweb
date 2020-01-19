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

@SpringBootApplication
@RestController
public class Server {

  @RequestMapping("/")
  public String home() {
    return "Hello World [Docker Container]";
  }

  public static void main(String[] args) {
    SpringApplication.run(Server.class, args);
  }

}