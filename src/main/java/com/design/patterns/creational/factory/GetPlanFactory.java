package com.design.patterns.creational.factory;

import static com.design.patterns.creational.factory.PlanType.COMMERCIAL_PLAN;
import static com.design.patterns.creational.factory.PlanType.DOMESTIC_PLAN;
import static com.design.patterns.creational.factory.PlanType.INSTITUTIONAL_PLAN;

public class GetPlanFactory {
  // use getPlan method to get object of type Plan
  public Plan getPlan(PlanType planType) {

    if (planType == null) {
      return null;
    }
    if (planType.equals(DOMESTIC_PLAN)) {
      return new DomesticPlan();
    } else if (planType.equals(COMMERCIAL_PLAN)) {
      return new CommercialPlan();
    } else if (planType.equals(INSTITUTIONAL_PLAN)) {
      return new InstitutionalPlan();
    }
    return null;
  }
}
