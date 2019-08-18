/*2) Дан треугольник координаты вершин А(0,0), В(4,4), С(6,1). Пользователь
вводит с клавиатуры координаты точки x и y. Написать программу которая
определит лежит ли эта точка внутри треугольника или нет. */
package com.gmail.dimaku1998;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double xA = 0;
        double yA = 0;
        double xB = 4;
        double yB = 4;
        double xC = 6;
        double yC = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter point D( x ; y ) \nx = ");
        double xD = sc.nextDouble();
        System.out.print("y = ");
        double yD = sc.nextDouble();
        // dAB = lenght AB
        double dAB = Math.sqrt(Math.pow((xA - xB), 2) + Math.pow((yA - yB), 2));
        double dAC = Math.sqrt(Math.pow((xA - xC), 2) + Math.pow((yA - yC), 2));
        double dBC = Math.sqrt(Math.pow((xB - xC), 2) + Math.pow((yB - yC), 2));

        double pABC = (dBC + dAB + dAC) / 2;
        double sABC =  Math.sqrt(pABC * (pABC - dAB) * (pABC - dAC) * (pABC - dBC));
        System.out.println(dAB + " " + dAC + " " + dBC + " " + pABC + " " + sABC);

        double dAD = Math.sqrt(Math.pow((xA - xD), 2) + Math.pow((yA - yD), 2));
        double dBD = Math.sqrt(Math.pow((xB - xD), 2) + Math.pow((yB - yD), 2));
        double dCD = Math.sqrt(Math.pow((xC - xD), 2) + Math.pow((yC - yD), 2));

        double pADC = (dAD + dCD + dAC) / 2;
        double sADC =  Math.sqrt(pADC * (pADC - dAD) * (pADC - dCD) * (pADC - dAC));
        System.out.println(sADC);

        double pADB = (dAD + dBD + dAB) / 2;
        double sADB =  Math.sqrt(pADB * (pADB - dAD) * (pADB - dBD) * (pADB - dAB));
        System.out.println(sADB);

        double pDBC = (dBC + dCD + dBD) / 2;
        double sDBC =  Math.sqrt(pDBC * (pDBC - dBC) * (pDBC - dCD) * (pDBC - dBD));
        System.out.println(sDBC);
        System.out.println("Is a point in triangle? Result : " + (sABC - (sADB + sADC + sDBC) < 0.0001 && sABC - (sADB + sADC + sDBC) > -0.0001? "Yes" : "No"));
    }
}
