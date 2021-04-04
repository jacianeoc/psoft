import java.util.Scanner;

public class Main {
    static ControllerTransporte controllerTransporte = new ControllerTransporte();
    static Scanner sc = new Scanner(System.in);
    static int opcao;
    static String transporte;

    public static void main(String[] args) {
        System.out.println("*********************");
        System.out.println("digite 1 para calcular rota");
        System.out.println("digite 2 para saber das rotas disponiveis");
        System.out.println("digite 3 para sair da aplicação");
        System.out.println("*********************");

        while (opcao!= 3){
            System.out.print("digite uma opção: ");
            opcao = sc.nextInt();
            switch (opcao){
                case 1:
                    System.out.print("digite o tipo de transporte desejado: ");
                    transporte = sc.next();
                    System.out.println("\n"+ controllerTransporte.calculaRota(transporte) + "\n" );
                    break;

                case 2:
                    System.out.println("lista de transportes disponiveis: ");
                    System.out.println(controllerTransporte.transportesDisponiveis());
                    break;

                case 3:
                    System.out.println("saindo da aplicação");
                    break;

                default:
                    System.out.println("opcao invalida");
            }
        }



    }
}
