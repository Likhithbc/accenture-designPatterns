package com.design.patterns.behavioral.command;

public class CommandPatternClient {

  public static void main(String[] args) {
    var doc = new Document();

    var clickOpen = new ActionOpen(doc);
    var clickSave = new ActionSave(doc);

    var menu = new MenuOptions(clickOpen, clickSave);

    menu.clickOpen();
    menu.clickSave();
  }
}
