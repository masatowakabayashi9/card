package jp.co.kard.card.mapper;

import jp.co.kard.card.domain.Card;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CardMapper {
    List<Card> selectList();
}
