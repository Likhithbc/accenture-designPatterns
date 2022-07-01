package com.design.patterns.behavioral.command;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Document {

  public void open() {
    log.info("Document Opened");
  }

  public void save() {
    log.info("Document Saved");
  }
}
