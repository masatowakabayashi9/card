package jp.co.kard.card.service;

import jp.co.kard.card.domain.Card;
import static org.assertj.core.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class CardServiceTest {
    @Autowired
    private CardService service;

    @Test
    void selectList() {
        List<Card> list = service.selectList();
        assertThat(list.size()).isEqualTo(9);

        Card card1 = list.get(0);
        assertThat(card1.getId()).isEqualTo(1);
        assertThat(card1.getCompany()).isEqualTo("有限会社渡辺工業");
        assertThat(card1.getSection()).isEqualTo("");
        assertThat(card1.getTitle()).isEqualTo("社長");
        assertThat(card1.getName()).isEqualTo("渡辺 誠");
        assertThat(card1.getAddress()).isEqualTo("大阪府枚方市北中振2-3-9");
        assertThat(card1.getTelNumber()).isEqualTo("06-3156-5192");
        assertThat(card1.getMailAddress()).isEqualTo("hirota_819@example.com");
    }
}