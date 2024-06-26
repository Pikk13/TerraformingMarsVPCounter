package com.mars.TerraformingMarsVPCounter.controller;

import com.mars.TerraformingMarsVPCounter.service.RedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/apiR")
public class RedController {

    @Autowired
    private RedService redService;

    @PostMapping("/addPoints/{cardName}")
    public void addPoints(@PathVariable String cardName) {
        redService.victoryPointsFromCards(cardName);
    }
}
