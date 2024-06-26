package com.mars.TerraformingMarsVPCounter.service;

import com.mars.TerraformingMarsVPCounter.model.Green;
import com.mars.TerraformingMarsVPCounter.model.cards.Cards;
import com.mars.TerraformingMarsVPCounter.repository.GreenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class GreenService {

    @Autowired
    private GreenRepository greenRepository;

    public void victoryPointsFromCards(String cardName) {

        Optional<Green> optionalGreen = greenRepository.findById("Cöccentyű");

        if (optionalGreen.isPresent()) {
            Green green = optionalGreen.get();

            int pointsFromCard = Cards.cardPoints(cardName);

            green.setCurrentPoints(green.getCurrentPoints() + pointsFromCard);

            greenRepository.save(green);
        } else {
           Green green= new Green();
            green.setName("Cöccentyű");

            int pointsFromCard = Cards.cardPoints(cardName);

            green.setCurrentPoints(pointsFromCard);
            greenRepository.save(green);
        }
    }
}
