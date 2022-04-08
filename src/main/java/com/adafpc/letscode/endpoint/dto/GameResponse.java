package com.adafpc.letscode.endpoint.dto;

import com.adafpc.letscode.endpoint.model.Game;
import lombok.Data;

@Data
public class GameResponse {
    private Integer id;
    private String title;
    private String platforms;

    public GameResponse(Game game) {
        this.id = game.getId();
        this.title = game.getTitle();
        this.platforms = game.getPlatforms();
    }
}
