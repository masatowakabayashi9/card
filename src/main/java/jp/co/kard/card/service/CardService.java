package jp.co.kard.card.service;

import jp.co.kard.card.domain.Card;
import jp.co.kard.card.repository.CardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CardService {
    @Autowired
    private CardRepository repository;

    public List<Card> selectList() {
        return repository.selectList();
    }
}
