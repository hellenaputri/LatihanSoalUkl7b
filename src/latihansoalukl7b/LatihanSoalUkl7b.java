/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihansoalukl7b;

/**
 *
 * @author maylany hellena
 */
public class LatihanSoalUkl7b {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      System.out.println("======= Latihan 7B - Operasi Perkalian Matriks ===========");
       int mA [] [] = {{6, 3, 2} , {4, 2, 3}};
       int mB [] [] = {{1,2}, {2, 3}, {3, 1}};

       int hasil [] [] = new int [mA.length] [mB[0].length];

        System.out.println("Matriks A * Matriks B : ");

         for (int m = 0; m < mA.length; m++ ){         //BARIS matriksA
            for (int n = 0; n < mB[0].length; n++){   //Kolom matriksB

                for (int k =0; k < mB.length; k++){   //kolom matriksA atau baris  matriksB 
                    hasil [m] [n] += mA [m] [k] * mB [k] [n];
                }
                    System.out.print(hasil [m] [n] + "  ");
            }
                    System.out.println(" ");
        }
    }


    
}

