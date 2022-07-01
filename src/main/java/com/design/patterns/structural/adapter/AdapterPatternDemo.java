package com.design.patterns.structural.adapter;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class AdapterPatternDemo {
  public static void main(String args[]) {
    var targetInterface = new BankCustomer();
    targetInterface.giveBankDetails();
    log.info(targetInterface.getCreditCard());
  }
}
