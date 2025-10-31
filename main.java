import java.io.*;
import java.util.Scanner;


class noh{

        //Atributo que armazena o próximo noh e que armazena o dado.
		public noh proximo;
		public char letra;

        //Construtor que cria a classe noh já com o valor
		public noh(char l){
			
			letra = l;
			
			}
		
		}
	
	class pilha{


        //Atributo referente ao tamanho da pilha e um apontador para o topo
		private int tamanho;
		private noh topo;

        //Função que verifica se a pilha está vazia
		private boolean isEmpty(){
			
			return (tamanho == 0);
			
			};

        //Construtor que garante que o topo da pilha não armazene valores e que o tamanho seja 0.
		public pilha(){
			
			topo = null;
			tamanho = 0;
			
			}

        //Função que insere valores na pilha.
		public void push(char character){

            //Cria o noh e coloca ele no topo,fazendo os apontamentos necessários
			noh novo = new noh(character);
			novo.proximo = topo;
			topo = novo;

            //Acresce o tamanho da pilha
            tamanho++;
			
			}
		
		public char pop(){

            //Verifica se a pilha esta vazia,se não,faz as operações,se sim retorna o valor 0.
			if(!isEmpty()){

                //retira o noh que está no topo.
                noh aux;
                aux = topo;
                topo = topo.proximo;

                //Decresce o tamanho da pilha
                tamanho--;

                //Retorna o valor contido no noh deletado.
                return aux.letra;

            }else{

                return 0;
            }

			}
		};

public class main{
	

	public static void main(String[] args) throws IOException{

        //Variaveis de interação do usuário
        char temp = ' ';
        char tempIR;

        //Instanciamento da classe scanner.
        Scanner scan = new Scanner(System.in);

        //Criação da pilha.
        pilha obj = new pilha();


        //Interface de interação.
        do{

            System.out.println("User Manual: \n" + "i: push.\n" + "r: pop.\n" + "q: quit.");
            temp = scan.next().charAt(0);

                switch(temp){

                    case 'i':

                        tempIR = scan.next().charAt(0);

                        obj.push(tempIR);
                        break;

                    case 'r':

                        tempIR = obj.pop();

                        System.out.println(tempIR != 0 ? "[" + tempIR + "]" : "IS EMPTY");
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
