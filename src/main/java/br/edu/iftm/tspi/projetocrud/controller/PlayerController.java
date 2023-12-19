package br.edu.iftm.tspi.projetocrud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import br.edu.iftm.tspi.projetocrud.dao.PlayerDao;

@Controller
public class PlayerController {
    
    @Autowired
    private PlayerDao dao;

    @RequestMapping("players")
    public String getPlayers(Model model) {
        model.addAttribute("players", dao.getPlayers());
        return "playersList";
    }
}
