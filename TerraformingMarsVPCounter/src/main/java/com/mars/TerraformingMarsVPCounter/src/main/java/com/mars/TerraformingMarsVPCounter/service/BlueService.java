package com.mars.TerraformingMarsVPCounter.service;

import com.mars.TerraformingMarsVPCounter.model.Blue;
import com.mars.TerraformingMarsVPCounter.model.cards.Cards;
import com.mars.TerraformingMarsVPCounter.repository.BlueRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BlueService {

    @Autowired
    private BlueRepository blueRepository;


    @Transactional
    public void victoryPointsFromCards(String cardName) {

        Optional<Blue> optionalBlue = blueRepository.findById("Tunyó");

        if (optionalBlue.isPresent()) {
            Blue blue = optionalBlue.get();

            int pointsFromCard = Cards.cardPoints(cardName);

            blue.setCurrentPoints(blue.getCurrentPoints() + pointsFromCard);

           blueRepository.save(blue);
        } else {
            Blue blue = new Blue();
            blue.setName("Tunyó");

            int pointsFromCard = Cards.cardPoints(cardName);

            blue.setCurrentPoints(pointsFromCard);
            blueRepository.save(blue);
        }
    }
}
