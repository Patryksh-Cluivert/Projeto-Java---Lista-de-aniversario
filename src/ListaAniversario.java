public class ListaAniversario {
    private No primeiro;
    private No ultimo;

    public void inserir(String nome){
        No novo = new No();
        novo.nome = nome;
        if(primeiro != null){
            ultimo.prox = novo;
            ultimo = novo;
        }else{
            primeiro = novo;
            ultimo = novo;
        }
    }

    public void listar(){
        No aux = primeiro;
        while(aux != null){
            System.out.println(aux.nome);
            aux = aux.prox;
        }
    }

    public void buscar(String nome){
        No aux = primeiro;
        while(aux != null){
            if(aux.nome.equals(nome)){
                System.out.println(nome + " já está na lista!");
                return;
            }
            aux = aux.prox;
        }
        System.out.println(nome + "não está na lista, para inserir escolha a opção 1.");
    }

}
