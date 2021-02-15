package com.company;

import static java.lang.System.*;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello world!");
        String[] languages = {"C", "C++", "C#", "Python", "Go", "Rust", "JavaScript", "PHP", "Swift", "Java"};

        int n = (int) (Math.random() * 1_000_000);
        System.out.println(n);

        int result = (n * 3 + Integer.parseInt("10101",2) + Integer.parseInt("FF", 16)) * 6;
        System.out.println(result);  // afisam rezultatul pentru a vedea daca da corect.

        /** avand in vedere faptul ca trebuie calculata suma cifrelor pana cand ramane doar o cifra, avem nevoie de doua conditii:
         *      sum >= 10 deoarece, in momentul in care rezultatul meu va fi 0 ( result = result / 10) si suma avand doua cifre, programul trebuie sa continue
         *      result > 0 deoarece, la momentul initial suma va fi 0, programul meu nu va rula si functia while.
         */

        int sum = 0;
        while ( sum >= 10 || result > 0)
        {
            if( result == 0 )
            {
                result = sum;
                sum = 0;
            }
            sum = sum + result % 10;
            result = result / 10;
        }
        result = sum;

        System.out.println(result); // afiam rezultatul pentru a vedea daca e valoarea corecta

        System.out.println("Willy-nilly, this semester I will learn " + languages[result]);

    }
}
