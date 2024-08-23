package io.github.e2point718.pidx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class App {

  @RestController
  class AppController {
    @GetMapping("/")
    String index() {
      return "Welcome!";
    }
  }

  public static void main(String[] args) {
    SpringApplication.run(App.class, args);
  }

}
