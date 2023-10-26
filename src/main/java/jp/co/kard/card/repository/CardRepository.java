package jp.co.kard.card.repository;

import jp.co.kard.card.domain.Card;
import jp.co.kard.card.mapper.CardMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CardRepository {
    @Autowired
    private CardMapper mapper;

    public List<Card> selectList() {
        return mapper.selectList();
    }
}
