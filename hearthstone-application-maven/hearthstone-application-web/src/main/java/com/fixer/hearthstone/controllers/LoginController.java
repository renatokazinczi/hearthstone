package com.fixer.hearthstone.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.fixer.hearthstone.Services.TransactionService;

@Controller
public class LoginController {
    @Autowired
    TransactionService ts;

    private static final Logger logger = LoggerFactory.getLogger(LoginController.class);

    @GetMapping("/")
    public String load(Model model) {
        return "login";
    }

    /*@RequestMapping(value = "/processForm", method = RequestMethod.POST)
    public String savePlayer(@ModelAttribute(value="player") Player player) {
        logger.info(player.toString());
        player.setEmail(playerLogged.getEmail());
        player.setPassword(playerLogged.getPassword());
        ts.savePlayer(player);

        return "redirect:home";
    }*/

    /*@RequestMapping(value = "/bet/{id}", method = RequestMethod.GET)
    public String getBets(@PathVariable("id") String id, Model model) {
        SportEvent se = ts.findSportEventById(id);
        bets = SportEventConverter.createBetsString(se);
        model.addAttribute("bets", bets);
        return "bet";
    }*/

    /*@RequestMapping(value = "/processWager/{id}", method = RequestMethod.POST)
    public String saveWager(@PathVariable("id") String id, @ModelAttribute(value="wagerResult") Wager wagerResult) {
        OutcomeOdd ocOdd = ts.findOutcomeOddById(id);
        //Player player = ts.listPlayers().get(0);
        logger.info("OutcomeOdd: " + ocOdd.getOutcome().getDescription());
        wagerResult.setPlayer(playerLogged);
        //wagerResult.setOutcomeOdd(ocOdd);
        ts.saveWager(wagerResult);
        ts.listWagers();

        return "redirect:/home";
    }*/
}
