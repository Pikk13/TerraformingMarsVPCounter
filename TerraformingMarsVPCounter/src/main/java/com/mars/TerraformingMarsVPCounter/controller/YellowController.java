package com.mars.TerraformingMarsVPCounter.controller;

import com.mars.TerraformingMarsVPCounter.service.YellowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class YellowController {

    @Autowired
    private YellowService yellowService;

    @PostMapping("/addPoints/{cardName}")
    public void addPoints(@PathVariable String cardName) {
        yellowService.victoryPointsFromCards(cardName);
    }
}
