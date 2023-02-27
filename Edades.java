/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios1semana;
import java.util.Scanner;
/**
 *
 * @author PAULINA HENAO GARCIA
 */
public class Edades {
        public static void main(String[] args){
            System.out.print("Ingrese la edad de Juan:");
            int Juan,Alberto,Madre,Ana;
            Scanner entrada=new Scanner(System.in);
            Juan=entrada.nextInt();
            Alberto=(Juan*2)/3;
            Ana=(Juan*4)/3;
            Madre=(Juan)+(Ana)+(Alberto);
            System.out.println("La edad de la madre es:" +(Madre));
            System.out.println("La edad de Juan es:" +(Juan));
            System.out.println("La edad de Alberto es:" +(Alberto));
            System.out.println("La edad de Ana es:" +(Ana));
    }
}

