package com.example.servingwebcontent;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

import java.util.Random;

@Controller
public class GameController {
    
    private int winnerNumber;
    private int actualPrice = 100000;

    @GetMapping("/guess")
    public String getGame(Model model){
        Random random = new Random();
        winnerNumber = random.nextInt(10) + 1;
        model.addAttribute("actualValue", "Premio: " + actualPrice);
        return "guessGame";
    }

    @PostMapping("/guess")
    public String play(int number, Model model){
        if(number == winnerNumber){
            model.addAttribute("winnerAlert", "Ganaste! El premio es de: " + actualPrice);
        }
        else{
            actualPrice -= 10000;   
        }
        model.addAttribute("actualValue", "Premio: " + actualPrice);
        return "guessGame";
    }
    
    @PostMapping("/reset")
    public String reset(){
        actualPrice = 100000;
        return "redirect:/guess";
    }
}
