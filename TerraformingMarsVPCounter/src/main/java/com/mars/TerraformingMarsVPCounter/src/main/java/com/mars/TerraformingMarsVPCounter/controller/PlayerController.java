package com.mars.TerraformingMarsVPCounter.controller;

import com.mars.TerraformingMarsVPCounter.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/players")
public class PlayerController {

    @Autowired
    private PlayerService playerService;

    @GetMapping("/all")
    public List<Object> getAllPlayers() {
        return playerService.getAllPlayers();
    }
}
