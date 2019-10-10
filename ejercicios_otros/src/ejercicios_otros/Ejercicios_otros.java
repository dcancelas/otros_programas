package ejercicios_otros;

import java.util.Scanner;

import javax.swing.JOptionPane;

import jdk.nashorn.internal.scripts.JO;

public class Ejercicios_otros {

    public static void main(String[] args) {
        /* System.out.println();
        //Declara 2 variables numéricas, he indica cual es mayor de los dos.
        Scanner numero=new Scanner(System.in);
            System.out.println("Introduce un número:");
                int n1=numero.nextInt();
            System.out.println("Introduce otro número:");
                int n2=numero.nextInt();
            numero.close();
        if (n1>n2) System.out.println(n1+" es mayor que "+n2);
        if (n2<n2) System.out.println(n2+" es mayor que "+n1);
        if (n1==n2) System.out.println(n1+" es igual a "+n2); */

        System.out.println();
        //Declara un String que contenga tu nombre, después muestra un mensaje de bienvenida por consola.
        /* Scanner login=new Scanner(System.in);
            System.out.println("Introduce tu nombre:");
                String name=login.nextLine();
            login.close();
        System.out.println("Bienvenido "+name); */

        String name=JOptionPane.showInputDialog(null,"Introduce tu nombre","PIProgram",JOptionPane.QUESTION_MESSAGE);
            if (name==null) {
            System.out.println("User pressed CANCEL, or window has been closed");
            System.exit(0);
            }
        JOptionPane.showMessageDialog(null,"Bienvenido "+name,"PIProgram",JOptionPane.PLAIN_MESSAGE);
        int imput=JOptionPane.showConfirmDialog(null,"¿Deseas continuar?","PIProgram",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE);
            if (imput==0) JOptionPane.showMessageDialog(null,"PIPO","PIProgram",JOptionPane.PLAIN_MESSAGE);
            if (imput==1) JOptionPane.showMessageDialog(null,":(","PIProgram",JOptionPane.WARNING_MESSAGE);
    }
    
}
