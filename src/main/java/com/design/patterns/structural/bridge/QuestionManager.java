package com.design.patterns.structural.bridge;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class QuestionManager {

  protected Question q;

  public String catalog;

  public QuestionManager(String catalog) {
    this.catalog = catalog;
  }

  public void next() {
    q.nextQuestion();
  }

  public void previous() {
    q.previousQuestion();
  }

  public void newOne(String quest) {
    q.newQuestion(quest);
  }

  public void delete(String quest) {
    q.deleteQuestion(quest);
  }

  public void display() {
    q.displayQuestion();
  }

  public void displayAll() {
    log.info("Question Paper: " + catalog);
    q.displayAllQuestions();
  }
}
