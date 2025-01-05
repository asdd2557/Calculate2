package org.example;

import java.util.Objects;
import java.util.Scanner;

public class Calculate {
    private int num1;
    private int num2;
    private boolean whileSwitch1 = true;
    private boolean whileSwitch2 = true;
    private boolean whileSwitch3 = true;
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Calculate calculate = new Calculate();
        while (true) {

            if (calculate.whileSwitch1) {
                try {
                    System.out.print("첫 번째 숫자를 입력하세요: ");
                    calculate.num1 = calculate.scanner.nextInt();
                    calculate.whileSwitch1 = false;
                } catch (Exception e) {
                    System.out.println("잘못된 입력입니다. 숫자를 입력해 주세요.");
                    calculate.scanner.nextLine();
                    continue;
                }
            }
            if (calculate.whileSwitch2) {
                try {
                    System.out.print("두 번째 숫자를 입력하세요: ");
                    calculate.num2 = calculate.scanner.nextInt();
                    calculate.whileSwitch2 = false;
                } catch (Exception e) {
                    System.out.println("잘못된 입력입니다. 숫자를 입력해 주세요.");
                    calculate.scanner.nextLine();
                    continue;
                }
            }
            System.out.print("+,-,*,/ 를 입력하세요: ");
            String operator = calculate.scanner.next();

            switch (operator) {
                case "+":
                    System.out.println("결과: " + calculate.plus(calculate.num1, calculate.num2));
                    break;
                case "-":
                    System.out.println("결과: " + calculate.minus(calculate.num1, calculate.num2));
                    break;
                case "/":
                    System.out.println("결과: " + calculate.divide(calculate.num1, calculate.num2));
                    break;
                case "*":
                    System.out.println("결과: " + calculate.multiply(calculate.num1, calculate.num2));
                    break;
                default:
                    throw new IllegalArgumentException("지원되지 않는 연산자입니다: " + operator);
            }



            System.out.print("계속하시겠습니까? (y/n)");
            if (Objects.equals(calculate.scanner.next(), "n")) {
                break;
            }
            calculate.whileSwitch1 = true;
            calculate.whileSwitch2 = true;


        }


    }


    public int divide(int a, int b) {
        if (a == 0 || b == 0) {
            throw new ArithmeticException("0이 포함되어 있습니다.");
        }
        return a / b;
    }

    public int minus(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int plus(int a, int b) {
        return a + b;
    }


}

