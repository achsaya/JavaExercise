package com.demo;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Calculator {
        public static void main(String[] args) {
            List n = new ArrayList();
            List o = new ArrayList();

            char operator;
            Double a = 0.0, b=0.0, result=0.0;
            //n.add(a);

            // create an object of Scanner class
            Scanner input = new Scanner(System.in);

            for(int i =0;i>=0;i++) {

                // ask users to enter operator
                System.out.println("Choose an operator: +, -, *, / or e(To end the calculation)");
                operator = input.next().charAt(0);
                if (operator == 'e') {
                    System.out.println("Final Result: " + result);
                    System.exit(0);
                } else {

                    o.add(operator);

                    // ask users to enter numbers
                    System.out.println("Enter number: ");
                    b = input.nextDouble();
                    n.add(b);


                    switch (operator) {

                        // performs addition between numbers
                        case '+':
                            result = result + b;
                            break;

                        // performs subtraction between numbers
                        case '-':
                            result = result - b;
                            break;

                        // performs multiplication between numbers
                        case '*':
                            result = result * b;
                            break;

                        // performs division between numbers
                        case '/':
                            result = result / b;
                            break;

                        // performs division between numbers
                        default:
                            System.out.println("Invalid operator!");
                            break;
                    }
                    System.out.print(a + " ");
                    for (int j = 0; j < n.size(); j++) {
                        System.out.print(o.get(j) + " " + n.get(j));
                    }
                    System.out.println(" =" + result);
                }
            }

        }
    }
