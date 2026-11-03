package com.zia.exception;

public class ExceptionhandlingPractice {
    public static void main(String[] args) {
        double a, b, c;
        a=4.6;
        b=2.2;
        c=a/b;

        int d[] = new int[2];
        try {
            d[0] = 4;
            d[1] = 8;
            throw new PracticeException("just  simply i am throwing exception");
        }
        catch (PracticeException e) {
            System.out.println("PracticeException got handled in catch block");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(" please increase the size of the array");
        }

        catch(ArithmeticException e){
            e.printStackTrace();
            System.out.println("do not put zero in denominator as it throws exception");
        }
        finally {
            System.out.println("this is the common code");
        }
        System.out.println(c + " is the division value of " + a + " / " + b);
    }

    }

