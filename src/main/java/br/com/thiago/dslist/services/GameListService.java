package br.com.thiago.dslist.services;

import br.com.thiago.dslist.dto.GameDTO;
import br.com.thiago.dslist.dto.GameListDTO;
import br.com.thiago.dslist.dto.GameMinDTO;
import br.com.thiago.dslist.entities.Game;
import br.com.thiago.dslist.entities.GameList;
import br.com.thiago.dslist.repositories.GameListRepository;
import br.com.thiago.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;


    @Transactional(readOnly = true)
    public List<GameListDTO> findAll() {
        List<GameList> result = gameListRepository.findAll();
        return result.stream().map(x -> new GameListDTO(x)).toList();
    }
}