package com.design.patterns.behavioral.strategy;

import lombok.extern.slf4j.Slf4j;

import java.io.IOException;

@Slf4j
public class StrategyPatternDemo {

  public static void main(String[] args) throws NumberFormatException, IOException {

    var firstValue = 20;
    var secondValue = 10;
    log.info("values selected from console are {} and {}", firstValue, secondValue);
    var context = new Context(new Addition());
    log.info("Addition = " + context.executeStrategy(firstValue, secondValue));

    context = new Context(new Subtraction());
    log.info("Subtraction = " + context.executeStrategy(firstValue, secondValue));

    context = new Context(new Multiplication());
    log.info("Multiplication = " + context.executeStrategy(firstValue, secondValue));
  }
}
