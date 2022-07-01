package com.design.patterns.behavioral.strategy;

import lombok.extern.slf4j.Slf4j;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

@Slf4j
public class StrategyPatternDemo {

  public static void main(String[] args) throws NumberFormatException, IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    log.info("Enter the first value: ");
    float value1 = Float.parseFloat(br.readLine());
    log.info("Enter the second value: ");
    float value2 = Float.parseFloat(br.readLine());
    Context context = new Context(new Addition());
    log.info("Addition = " + context.executeStrategy(value1, value2));

    context = new Context(new Subtraction());
    log.info("Subtraction = " + context.executeStrategy(value1, value2));

    context = new Context(new Multiplication());
    log.info("Multiplication = " + context.executeStrategy(value1, value2));
  }
}
