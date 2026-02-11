import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        ListaAniversario lista = new ListaAniversario();
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("Escolha uma opção: ");
            System.out.println("1 - Inserir nome na lista;");
            System.out.println("2 - Consultar nome na lista;");
            System.out.println("3 - Listar convidados;");
            System.out.println("4 - Sair.");

            int op = sc.nextInt();

            switch(op){
                case 1:
                    System.out.println("Digite o nome do convidado: ");
                    String nome = sc.next();
                    lista.inserir(nome);
                    System.out.println(nome + " agora está na lista!");
                    break;
                case 2:
                    System.out.println("Digite o nome do convidado: ");
                    String nome2 = sc.next();
                    lista.buscar(nome2);
                    break;
                case 3:
                    System.out.println("Lista de convidados: ");
                    lista.listar();
                    break;
                case 4:
                    System.out.println("Até a próxima!");
                    System.exit(0);
                    break;
            }

        }

    }

}
