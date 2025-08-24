package br.com.thiago.dslist.controllers;

import br.com.thiago.dslist.dto.GameDTO;
import br.com.thiago.dslist.dto.GameListDTO;
import br.com.thiago.dslist.dto.GameMinDTO;
import br.com.thiago.dslist.services.GameListService;
import br.com.thiago.dslist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {

    @Autowired
    private GameListService gameListService;

    @GetMapping
    public List<GameListDTO> findAll() {
        List<GameListDTO> result = gameListService.findAll();
        return result;
    }
}
