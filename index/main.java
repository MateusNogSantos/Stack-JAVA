package index;

import java.io.*;
import java.util.Scanner;

public class main{
	

	public static void main(String[] args) throws IOException{

        //Variaveis de interação do usuário
        char temp = ' ';
        char tempIR;

        //Instanciamento da classe scanner.
        Scanner scan = new Scanner(System.in);

        //Criação da index.pilha.
        pilha obj = new pilha();


        //Interface de interação.
        do{

            System.out.println("-----------------------------------------------------");
            System.out.println("User Manual: \n" + "i: push.\n" + "r: pop.\n" + "q: quit.");
            System.out.println("-----------------------------------------------------");

            temp = scan.next().charAt(0);

                switch(temp){

                    case 'i':

                        tempIR = scan.next().charAt(0);

                        obj.push(tempIR);
                        break;

                    case 'r':

                        tempIR = obj.pop();

                        System.out.println("-----------------------------------------------------");
                        System.out.println(tempIR != 0 ? "Caractere Removido: [" + tempIR + "]" : "IS EMPTY");
                        break;

                    case 'q':
                        System.out.println("------------------END------------------");
                        break;

                    default:
                        System.out.println("Erro : Command not found.");
                        break;
                }

        }while(temp != 'q');


		}

}
