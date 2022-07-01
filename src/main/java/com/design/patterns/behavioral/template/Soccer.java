package com.design.patterns.behavioral.template;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Soccer extends Game {

  @Override
  void initialize() {
    log.info("Soccer Game Initialized! Start playing.");
  }

  @Override
  void start() {
    log.info("Game Started. Welcome to in the Soccer game!");
  }

  @Override
  void end() {
    log.info("Game Finished!");
  }
}
