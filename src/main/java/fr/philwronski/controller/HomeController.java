package fr.philwronski.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by p.wronski on 12/04/2017.
 */
@RestController
public class HomeController {

  @RequestMapping(value = "/", method = RequestMethod.GET)
  public String welcome() {
    return "welcome";
  }

}
