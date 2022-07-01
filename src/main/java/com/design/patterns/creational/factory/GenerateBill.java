package com.design.patterns.creational.factory;

import lombok.extern.slf4j.Slf4j;

import java.io.IOException;

import static com.design.patterns.creational.factory.PlanType.COMMERCIAL_PLAN;
import static com.design.patterns.creational.factory.PlanType.DOMESTIC_PLAN;
import static com.design.patterns.creational.factory.PlanType.INSTITUTIONAL_PLAN;

@Slf4j
public class GenerateBill {
  public static final String SEPARATOR = "***************************************";
  public static GetPlanFactory planFactory = new GetPlanFactory();

  public static void main(String[] args) throws IOException {

    log.info(SEPARATOR);
    planExecution(DOMESTIC_PLAN, 20);
    log.info(SEPARATOR);
    planExecution(COMMERCIAL_PLAN, 20);
    log.info(SEPARATOR);
    planExecution(INSTITUTIONAL_PLAN, 20);
    log.info(SEPARATOR);
  }

  public static void planExecution(PlanType planName, int units) {

    var p = planFactory.getPlan(planName);
    // call getRate() method and calculateBill() method of DomesticPlan.

    log.info("Bill amount for " + planName + " of  " + units + " units is: ");
    p.getRate();
    p.calculateBill(units);
  }
}
