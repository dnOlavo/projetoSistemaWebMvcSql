package br.edu.iftm.tspi.projetocrud.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import br.edu.iftm.tspi.projetocrud.domain.Player;

@Component
public class PlayerDao {
    
    @Autowired
    JdbcTemplate dbPlayers;

    public List<Player>getPlayers() {
        String sql = "select nome,nick,jogo,contato from tb_player";

        return dbPlayers.query(sql, (res, rowNum)-> {
            return new Player(
                res.getString("nome"),
                res.getString("nick"),
                res.getString("jogo"),
                res.getString("contato")
            );
        });
    }
}
