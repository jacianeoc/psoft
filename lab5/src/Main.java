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

        opcao = sc.nextInt();

        switch (opcao){
            case 1:
                System.out.print("digite o tipo de transporte desejado: ");
                transporte = sc.next();
                System.out.println("\n" + controllerTransporte.calculaRota(transporte));
                break;

            case 2:
                System.out.println("lista de transportes disponiveis: ");
                System.out.println(controllerTransporte.transportesDisponiveis());
                break;
        }


    }
}
