package com.mars.TerraformingMarsVPCounter.service;

import com.mars.TerraformingMarsVPCounter.model.Red;
import com.mars.TerraformingMarsVPCounter.model.cards.Cards;
import com.mars.TerraformingMarsVPCounter.repository.RedRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class RedService {

    @Autowired
    private RedRepository redRepository;

    public void victoryPointsFromCards(String cardName) {

        Optional<Red> optionalRed = redRepository.findById("Geza");

        if (optionalRed.isPresent()) {
            Red red = optionalRed.get();

            int pointsFromCard = Cards.cardPoints(cardName);

            red.setCurrentPoints(red.getCurrentPoints() + pointsFromCard);

            redRepository.save(red);
        } else {
            Red red = new Red();
            red.setName("Geza");

            int pointsFromCard = Cards.cardPoints(cardName);

            red.setCurrentPoints(pointsFromCard);
            redRepository.save(red);
        }
    }
}
