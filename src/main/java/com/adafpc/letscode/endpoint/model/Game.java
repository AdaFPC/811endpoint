package com.adafpc.letscode.endpoint.model;

import lombok.Builder;
import lombok.Data;
import lombok.With;


@Data
@Builder
@With
public class Game {
  private Integer id;
  private String title;
  private String platforms;

}
