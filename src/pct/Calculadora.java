/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pct;

import java.util.Scanner;

/**
 *
 * @author Gu
 */
public class Calculadora {
    public static void main(String[] args) {
      //Declaração de varieveis 
        int n1, n2, Total;
        
        //opção do usuário
        int op;
        
        //criação e instancia de um objeto de entrada
        Scanner entrada = new Scanner(System. in);
        
        
        do{
            // apresentação do programa 
            System.out.println("\n\t\t\t -- calculadora simples --\n");

            //Menu
            System.out.println("[1] Adição");
            System.out.println("[2] Subtração");
            System.out.println("[3] Multiplicação");
            System.out.println("[4] Divisão");
            System.out.println("[5] Sair");
            //montar o resto do menu

            //opção do usuário
            System.out.println("Opção: ");
            op = entrada.nextInt();


            if(op ==1){

                //Soma simples
                 System.out.println("\n\t\t\t -- Adição --\n");
                 //Entrada
                System.out.print("informe N1: ");
                n1 = entrada.nextInt(); 
                System.out.print("informe N2: ");
                n2 = entrada.nextInt();


                //Processamento
                Total = n1 + n2;

                //saida
                System.out.printf("%d + %d =%d\n",n1 ,n2 , Total );

            }else if(op == 2){

                 System.out.println("\n\t\t\t -- Subtração --\n");

                 System.out.print("informe N1: ");
                n1 = entrada.nextInt(); 
                System.out.print("informe N2: ");
                n2 = entrada.nextInt();

                Total = n1 - n2;

                System.out.printf("%d - %d =%d\n",n1 ,n2 , Total );
             }else if(op == 3){

                 System.out.println("\n\t\t\t -- Multiplicação --\n");

                 System.out.print("informe N1: ");
                n1 = entrada.nextInt(); 
                System.out.print("informe N2: ");
                n2 = entrada.nextInt();

                Total = n1 * n2;

                System.out.printf("%d * %d =%d\n",n1 ,n2 , Total );   
            }else if(op == 4){

                 System.out.println("\n\t\t\t -- Divisão --\n");

                 System.out.print("informe N1: ");
                n1 = entrada.nextInt(); 
                System.out.print("informe N2: ");
                n2 = entrada.nextInt();

                Total = n1 / n2;

                System.out.printf("%d / %d =%d\n",n1 ,n2 , Total );    
            }else if(op == 5){
                 System.out.println("Falou, forte abraço!");
            }else{
                System.out.println("Opção"+ op + "Incorreta!");
            }
        }while(op != 3);   
                
    }
}
