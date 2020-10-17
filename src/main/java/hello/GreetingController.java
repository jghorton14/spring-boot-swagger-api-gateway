package hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

  @RequestMapping(value = "/greeting", method = RequestMethod.GET, produces = "text/plain")
  public String greeting(@RequestParam(value = "value", defaultValue = "World") String name) {
    return name;
  }
}