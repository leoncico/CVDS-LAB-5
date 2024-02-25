package com.example.servingwebcontent;

//import org.springframework.boot.autoconfigure.amqp.RabbitConnectionDetails.Address;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.ui.Model;


@Controller
public class UserController {
    
    @RequestMapping("/hello")
    //@ResponseBody
    private String hello() {
    return "hello";
    }

    @RequestMapping("/user/{id}")

    private ModelAndView getUser(@PathVariable Integer id, Model model) {
    String uri = "https://jsonplaceholder.typicode.com/users/" + id;
    RestTemplate restTemplate = new RestTemplate();
    
    User user = restTemplate.getForObject(uri, User.class);
    Adress adress = user.getAdress();
    Geo geo = adress.getGeo();
    Company company = user.getCompany();

    ModelAndView modelAndView = new ModelAndView("user");
    modelAndView.addObject("user", user);
    modelAndView.addObject("address", adress);
    modelAndView.addObject("geo", geo);
    modelAndView.addObject("company", company);
    
    return modelAndView;
    }

}
