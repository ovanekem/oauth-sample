package be.knoware.app2.controller;

import be.knoware.app2.model.Calc;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by ovanekem on 03/05/16.
 */
@Controller
public class App2Controller {

    @PreAuthorize("#oauth2.hasScope('min')")
    @RequestMapping(method = RequestMethod.GET, value = "/min/{a}/{b}")
    @ResponseBody
    public Calc sum(@PathVariable int a, @PathVariable int b) {
        // complex business logic ;-)
        Calc calc = new Calc(a, b);
        calc.minAandB();
        return calc;
    }
}
