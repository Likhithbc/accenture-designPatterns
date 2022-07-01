package com.design.patterns.behavioral.template;

public abstract class Game {

  abstract void initialize(); // initialize the game

  abstract void start(); // start game

  abstract void end(); // end game

  // template method
  public final void play() {
    initialize();
    start();
    end();
  }
}
