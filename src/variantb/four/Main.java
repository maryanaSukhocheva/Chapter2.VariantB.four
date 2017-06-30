/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package variantb.four;

import java.util.Scanner;

/**
 *
 * @author SLAVA
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Введите число от 1 до 12");
        Scanner scan = new Scanner(System.in);
        int number;
        try {  
            number=scan.nextInt();
            switch (number) {
                case 1:
                    System.out.println(String.valueOf(number)+" месяц - "+"январь");
                break;
                case 2:
                    System.out.println(String.valueOf(number)+" месяц - "+"февраль");
                break;
                case 3:
                    System.out.println(String.valueOf(number)+" месяц - "+"март");
                break;
                case 4:
                    System.out.println(String.valueOf(number)+" месяц - "+"апрель");
                break;
                case 5:
                    System.out.println(String.valueOf(number)+" месяц - "+"май");
                break;
                case 6:
                    System.out.println(String.valueOf(number)+" месяц - "+"июнь");
                break;
                case 7:
                    System.out.println(String.valueOf(number)+" месяц - "+"июль");
                break;
                case 8:
                    System.out.println(String.valueOf(number)+" месяц - "+"август");
                break;
                case 9:
                    System.out.println(String.valueOf(number)+" месяц - "+"сентябрь");
                break;
                case 10:
                    System.out.println(String.valueOf(number)+" месяц - "+"октябрь");
                break;
                case 11:
                    System.out.println(String.valueOf(number)+" месяц - "+"ноябрь");
                break;
                case 12:
                    System.out.println(String.valueOf(number)+" месяц - "+"декабрь");
                break;
                default:
                System.out.println("Введено некорректное значение!");
            }
        } catch(NumberFormatException e) {
            System.out.println("Число введено некорректно!!!");
            
        }
    }
}
