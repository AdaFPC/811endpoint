package com.adafpc.letscode.endpoint.service;

import com.adafpc.letscode.endpoint.dto.GameRequest;
import com.adafpc.letscode.endpoint.dto.GameResponse;
import com.adafpc.letscode.endpoint.model.Game;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;


@Service
public class GameService {

    private Map<Integer, Game>gamesMap = new HashMap<>();
    private final AtomicInteger index = new AtomicInteger(1);

    public GameResponse cadastraGame(GameRequest gameRequest){
        Game game = Game.builder()
                .platforms(gameRequest.getPlatforms())
                .title(gameRequest.getTitle())
                .id(index.getAndIncrement())
                .build();

        gamesMap.put(game.getId(), game);

        return new GameResponse(game);
    }
}
