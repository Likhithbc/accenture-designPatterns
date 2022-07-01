package com.design.patterns.creational.factory;

import lombok.extern.slf4j.Slf4j;

@Slf4j
abstract class Plan {
  protected double rate;

  abstract void getRate();

  public void calculateBill(int units) {
    log.info(String.valueOf(units * rate));
  }
}
