package com.mars.TerraformingMarsVPCounter.service;

import com.mars.TerraformingMarsVPCounter.model.Yellow;
import com.mars.TerraformingMarsVPCounter.model.cards.Cards;
import com.mars.TerraformingMarsVPCounter.repository.YellowRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class YellowService {

    @Autowired
    private YellowRepository yellowRepository;

    public void victoryPointsFromCards(String cardName) {



        Optional<Yellow> optionalYellow = yellowRepository.findById("Pifta");

        if (optionalYellow.isPresent()) {
            Yellow yellow = optionalYellow.get();

            int pointsFromCard = Cards.cardPoints(cardName);

            yellow.setCurrentPoints(yellow.getCurrentPoints() + pointsFromCard);

            yellowRepository.save(yellow);
        } else {
            Yellow yellow = new Yellow();
            yellow.setName("Pifta");

            int pointsFromCard = Cards.cardPoints(cardName);

            yellow.setCurrentPoints(pointsFromCard);
            yellowRepository.save(yellow);
        }
    }
}
