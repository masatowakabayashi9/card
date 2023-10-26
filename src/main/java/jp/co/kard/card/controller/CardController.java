package jp.co.kard.card.controller;

import jp.co.kard.card.domain.Card;
import jp.co.kard.card.service.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class CardController {
    @Autowired
    private CardService service;

    @RequestMapping("/card")
    public String index() {
        return "index";
    }

    @RequestMapping("/card/list")
    public String selectList(Model model) {
        List<Card> list = service.selectList();
        model.addAttribute("cardList", list);
        return "list";
    }
}
