package com;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution {

    public void solution(int[] source, int[] dest) {
        /*
            Algoritmul calculeaza prima data suma totala a ofertelor. Cat timp aceasta nu este egala cu 0 (suma ofertelor trebuie sa fie egala cu
            suma cererilor (sumSupply = sumDemand). Cat timp una dintre aceste sume nu este 0, parcurgem matricea costurilor si avem doua cazuri:
                1. Cand supply[i] >= dest[j] -> in acest caz, afisam cererea si oferta, calculam costul total, scadem din suma totala ca ofertelor, cererea
                                                 respectiva deoarece aceasta este mai mica, iar in variabila supply nu este 0 momentan (supply > demand) si
                                                 cererea noastra va deveni 0.
                2. Cand supply[i] < dest[j] -> in acest caz, afisam cererea si oferta, calculam costul, scadem din cerere, oferta pe care o avem iar din suma
                                                totala a ofertelor scadem oferta respectiva (src[i])


        */
        int [][] matrixCost = {{2,5,6}, {3,4,6}, {1,8,8}};
        int totalSumaSupply = 0;

        for(int i = 0; i < source.length; i++) {
            totalSumaSupply += source[i];           // calculam suma totala a ofertelor
        }
        int costTotal = 0;
        while(totalSumaSupply != 0) {
            for(int i = 0; i < 3; i++)
                for(int j = 0; j < 3; j++){            // parcurgem matricea
                    if(source[i] >= dest[j] && source[i] != 0 && dest[j] != 0) {   //verificam daca oferta este mai mare decat cererea
                        System.out.println("S" + (i+1) + " -> " + "D" + (j+1) + ": " + dest[j] + " * " + matrixCost[i][j] + " = " + (dest[j] * matrixCost[i][j]));
                        costTotal = costTotal +  dest[j] * matrixCost[i][j];
                        totalSumaSupply = totalSumaSupply - dest[j];
                        source[i] = source[i] - dest[j];
                        dest[j] = 0;                                // cererea va primi valoare 0 pentru ca a fost completata
                    }
                    else if(source[i] != 0 && dest[j] != 0){
                        System.out.println("S" + (i+1) + " -> " + "D" + (j+1) + ": " + source[i] + " * " + matrixCost[i][j] + " = " + (source[j] * matrixCost[i][j]));
                        costTotal = costTotal + source[i] * matrixCost[i][j];
                        dest[j] = dest[j] - source[i];
                        totalSumaSupply = totalSumaSupply - source[i];
                        source[i] = 0;
                    }
                }
        }
        System.out.println("Costul total:" + costTotal);
    }
}
