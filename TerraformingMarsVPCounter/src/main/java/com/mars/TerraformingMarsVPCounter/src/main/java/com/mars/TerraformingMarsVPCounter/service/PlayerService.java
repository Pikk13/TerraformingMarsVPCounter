package com.mars.TerraformingMarsVPCounter.service;

import com.mars.TerraformingMarsVPCounter.repository.BlueRepository;
import com.mars.TerraformingMarsVPCounter.repository.GreenRepository;
import com.mars.TerraformingMarsVPCounter.repository.RedRepository;
import com.mars.TerraformingMarsVPCounter.repository.YellowRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PlayerService {

    @Autowired
    private YellowRepository yellowRepository;

    @Autowired
    private BlueRepository blueRepository;

    @Autowired
    private RedRepository redRepository;

    @Autowired
    private GreenRepository greenRepository;

    public List<Object> getAllPlayers() {
        List<Object> players = new ArrayList<>();
        players.addAll(yellowRepository.findAll());
        players.addAll(blueRepository.findAll());
        players.addAll(redRepository.findAll());
        players.addAll(greenRepository.findAll());
        return players;
    }
}
