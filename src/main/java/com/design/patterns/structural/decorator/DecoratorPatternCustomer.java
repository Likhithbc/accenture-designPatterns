package com.design.patterns.structural.decorator;

import lombok.extern.slf4j.Slf4j;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

@Slf4j
public class DecoratorPatternCustomer {

  private static int choice;

  public static void main(String args[]) throws NumberFormatException, IOException {

    do {
      log.info("========= Food Menu ============ \n");
      log.info("            1. Vegetarian Food.   \n");
      log.info("            2. Non-Vegetarian Food.\n");
      log.info("            3. Chineese Food.         \n");
      log.info("            4. Exit                        \n");
      log.info("Enter your choice: ");

      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      choice = Integer.parseInt(br.readLine());

      switch (choice) {
        case 1:
          {
            VegFood vf = new VegFood();

            log.info(vf.prepareFood());

            log.info(String.valueOf(vf.foodPrice()));
          }
          break;

        case 2:
          {
            Food f1 = new NonVegFood((Food) new VegFood());

            log.info(f1.prepareFood());

            log.info(String.valueOf(f1.foodPrice()));
          }
          break;

        case 3:
          {
            Food f2 = new ChineeseFood((Food) new VegFood());

            log.info(f2.prepareFood());

            log.info(String.valueOf(f2.foodPrice()));
          }
          break;

        default:
          {
            log.info("Other than these no food available");
          }
          return;
      }

    } while (choice != 4);
  }
}
