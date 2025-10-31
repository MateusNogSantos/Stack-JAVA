package index;

class noh{

    //Atributo que armazena o próximo index.noh e que armazena o dado.
    public noh proximo;
    public char letra;

    //Construtor que cria a classe index.noh já com o valor
    public noh(char l){

        letra = l;

    }

}

class pilha{


    //Atributo referente ao tamanho da index.pilha e um apontador para o topo
    private int tamanho;
    private noh topo;

    //Função que verifica se a index.pilha está vazia
    private boolean isEmpty(){

        return (tamanho == 0);

    };

    //Construtor que garante que o topo da index.pilha não armazene valores e que o tamanho seja 0.
    public pilha(){

        topo = null;
        tamanho = 0;

    }

    //Função que insere valores na index.pilha.
    public void push(char character){

        //Cria o index.noh e coloca ele no topo,fazendo os apontamentos necessários
        noh novo = new noh(character);
        novo.proximo = topo;
        topo = novo;

        //Acresce o tamanho da index.pilha
        tamanho++;

    }

    public char pop(){

        //Verifica se a index.pilha esta vazia,se não,faz as operações,se sim retorna o valor 0.
        if(!isEmpty()){

            //retira o index.noh que está no topo.
            noh aux;
            aux = topo;
            topo = topo.proximo;

            //Decresce o tamanho da index.pilha
            tamanho--;

            //Retorna o valor contido no index.noh deletado.
            return aux.letra;

        }else{

            return 0;
        }

    }
};
