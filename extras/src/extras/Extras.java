package extras;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Extras {

    public static void main(String[] args) {
        /*
        //2-CALCULAR ÁREA CÍRCULO UTILIZANDO A LIBRERÍA MATH
        Scanner radioSc=new Scanner(System.in);
            System.out.println("\nIntroduce o radio:");
            float radio=radioSc.nextFloat();
            radioSc.close();
        float area=(float)(Math.PI*Math.pow(radio, 2));
        System.out.println("A área do círculo é: "+area); */
        /*
        //3-LEER Nº 3 CIFRAS MOSTRANDO SOLO LAS TRES CIFRAS
        Scanner numSc=new Scanner(System.in);
            System.out.println("\nIntroduce un número de tres cifras:");
            int num=numSc.nextInt();
            numSc.close();
        if (num>999) System.out.println("\nERROR\nEl número introducido tiene más de tres cifras");
        else {
            if (num<100) System.out.println("\nERROR\nEl número introducido tiene menos de tres cifras");
            else System.out.println("\nEl número introducido es: "+num);
        } */

        //3-UTILIZANDO JOPTIONPLANE
        String numSt=JOptionPane.showInputDialog(null,"Introduce un número de tres cifras: ");
            int num=Integer.parseInt(numSt);
        if (num>999) JOptionPane.showMessageDialog
        (null,"El número introducido tiene más de tres cifras",
        "ERROR",JOptionPane.ERROR_MESSAGE);
        else {
            if (num<100) JOptionPane.showMessageDialog
            (null,"El número introducido tiene menos de tres cifras",
            "ERROR",JOptionPane.ERROR_MESSAGE);
            else JOptionPane.showMessageDialog(null,"El número introducido es: "+num);
        }
    }
    
}
