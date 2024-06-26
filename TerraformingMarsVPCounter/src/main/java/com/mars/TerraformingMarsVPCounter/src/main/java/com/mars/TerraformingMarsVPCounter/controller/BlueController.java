package com.mars.TerraformingMarsVPCounter.controller;

import com.mars.TerraformingMarsVPCounter.service.BlueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/apiB")
public class BlueController {

    @Autowired
    private BlueService blueService;

    @PostMapping("/addPoints/{cardName}")
    public void addPoints(@PathVariable String cardName) {
        blueService.victoryPointsFromCards(cardName);
    }
}
