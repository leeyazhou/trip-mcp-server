/**
 * 
 */
package com.github.leeyazhou.trip.mcp.server.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author leeyazhou
 */
@RestController
@RequestMapping("/trip/")
public class TripController {

  @GetMapping("greeting")
  public String index() {
    return "Greetings from Spring Boot!";
  }
}
