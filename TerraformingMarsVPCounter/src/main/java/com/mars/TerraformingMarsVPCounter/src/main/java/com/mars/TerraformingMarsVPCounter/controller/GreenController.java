package com.mars.TerraformingMarsVPCounter.controller;

import com.mars.TerraformingMarsVPCounter.service.GreenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/apiG")
public class GreenController {

    @Autowired
    private GreenService greenService;

    @PostMapping("/addPoints/{cardName}")
    public void addPoints(@PathVariable String cardName) {
        greenService.victoryPointsFromCards(cardName);
    }
}
