package com.design.patterns.behavioral.template;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class TemplatePatternDemo {

  public static void main(String[] args) {

    Game game = new Chess();
    game.play();
    log.info("*******************");
    game = new Soccer();
    game.play();
  }
}
