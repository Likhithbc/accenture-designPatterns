package com.design.patterns.structural.bridge;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class QuestionFormat extends QuestionManager {

  public QuestionFormat(String catalog) {
    super(catalog);
  }

  public void displayAll() {

    log.info("\n--------------------------------------------------------------------");
    super.displayAll();
    log.info("-----------------------------------------------------------------------");
  }
}
