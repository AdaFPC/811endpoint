package com.adafpc.letscode.endpoint.controller;

import com.adafpc.letscode.endpoint.dto.GameRequest;
import com.adafpc.letscode.endpoint.dto.GameResponse;
import com.adafpc.letscode.endpoint.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/game")
public class GameController {

    @Autowired
    GameService gameService;

    @PostMapping
    public GameResponse cadastraGame(@RequestBody GameRequest gameRequest){

        return gameService.cadastraGame(gameRequest);
    }

}
