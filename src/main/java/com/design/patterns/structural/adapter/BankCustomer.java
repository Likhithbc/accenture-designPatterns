package com.design.patterns.structural.adapter;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class BankCustomer extends BankDetails implements CreditCard {
  public void giveBankDetails() {
    try {
      var customerName = "Customer Name";
      var accNo = 111111111;
      var bankName = "Bank Name";

      setAccHolderName(customerName);
      setAccNumber(accNo);
      setBankName(bankName);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  @Override
  public String getCreditCard() {

    return ("The Account number "
        + getAccNumber()
        + " of "
        + getAccHolderName()
        + " in "
        + getBankName()
        + " bank is valid and authenticated for issuing the credit card. ");
  }
}
