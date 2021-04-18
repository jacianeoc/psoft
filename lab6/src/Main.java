import java.util.Scanner;

public class Main {
    static ControllerVacinacao controllerVacinacao = new ControllerVacinacao();
    static Scanner sc = new Scanner(System.in);
    static int opcao;
    //static String transporte;

    public static void main(String[] args) {
        System.out.println("*********************");
        System.out.println("digite 1 para cadastrar usuario na lista de espera da vacinação");
        System.out.println("digite 2 para encontrar algum dado de um usuario especifico");
        System.out.println("digite 3 para mudar a situação da vacinação");
        System.out.println("digite 4 para alteração de dados do cadastro.");
        System.out.println("digite 5 para sair da aplicação.");
        System.out.println("*********************");

        while (opcao!= 5){
            System.out.print("digite uma opção: ");
            opcao = sc.nextInt();
            switch (opcao){
                case 1:

                    System.out.print("digite o nome do usuario: ");
                    String nome = sc.next();

                    System.out.print("digite o CPF do usuario: ");
                    String CPF = sc.next();

                    System.out.print("digite o endereço do usuario: ");
                    String endereco = sc.next();

                    System.out.print("digite o número do cartão do SUS do usuario: ");
                    String cartaoSUS= sc.next();

                    System.out.print("digite o email do usuario: ");
                    String email = sc.next();

                    System.out.print("digite o telefone do usuario: ");
                    String telefone = sc.next();

                    System.out.print("digite a profissao do usuario: ");
                    String profissao = sc.next();

                    System.out.print("digite a comobidade do usuario: ");
                    String comobidade = sc.next();

                    System.out.print("digite a idade do usuario: ");
                    int idade = sc.nextInt();

                    System.out.println(controllerVacinacao.cadastrarPessoa(nome, CPF, endereco, cartaoSUS, email, telefone
                                                        , profissao, comobidade, idade));
                    break;

                case 2:
                    System.out.print("digite o CPF do usuario: ");
                    CPF = sc.next();
                    System.out.println(controllerVacinacao.encotraPessoa(CPF));

                    break;

                case 3:
                    System.out.print("digite o CPF do usuario: ");
                    CPF = sc.next();

                    System.out.print("digite 1: para se quiser que a pessoa se torne habilitada a tomar a 2 dose ");
                    System.out.print("digite 2: para as outras mudanças de etapas");
                    int etapa = sc.nextInt();

                    switch (etapa){
                        case 1:
                            System.out.print("digite o dia de vacinação da primeira dose no formato dd/mm/yyyy");
                            String data1 = sc.next();
                            System.out.print("digite o dia de vacinação esperado da segunda dose no formato dd/mm/yyyy");
                            String data2 = sc.next();
                            System.out.println(controllerVacinacao.habilitaSegundaDose(CPF, data1, data2));
                            break;

                        case 2:
                            System.out.println(controllerVacinacao.MudaSituacaoEtapa(CPF));
                            break;


                        default:
                            System.out.println("opcao invalida");
                    }

                    break;

                case 4:
                    System.out.print("digite o CPF do usuario: ");
                    CPF = sc.next();

                    System.out.println("*********************");
                    System.out.println("digite 1 para alterar o endereço da pessoa ");
                    System.out.println("digite 2 para alterar o numero do cartao do sus");
                    System.out.println("digite 3 para alterar o email ");
                    System.out.println("digite 4 para alterar o telefone .");
                    System.out.println("digite 5 para alter a profissao.");
                    System.out.println("digite 6 para alterar a comobidades .");
                    System.out.println("digite 7 para alter a idade.");
                    System.out.println("digite 8 para sair da alteraçao do usuario.");
                    System.out.println("*********************");

                    System.out.print("digite uma opção: ");
                    int opcaoAteracao = sc.nextInt();
                    switch (opcaoAteracao){
                        case 1:
                            System.out.print("digite o novo endereço: ");
                            endereco = sc.next();
                            controllerVacinacao.atualizaEndereço(CPF, endereco);
                            break;

                        case 2:
                            System.out.print("digite um novo numero do cartao do sus: ");
                            cartaoSUS = sc.next();
                            controllerVacinacao.atualizaNumeroCartaoSUS(CPF, cartaoSUS);
                            break;
                        case 3:
                            System.out.print("digite um novo email: ");
                            email = sc.next();
                            controllerVacinacao.atualizaEmail(CPF, email);
                            break;

                        case 4:
                            System.out.print("digite um novo telefone: ");
                            telefone = sc.next();
                            controllerVacinacao.atualizaTelefone(CPF, telefone);
                            break;

                        case 5:
                            System.out.print("digite uma nova profissao: ");
                            profissao = sc.next();
                            controllerVacinacao.atualizaProfissao(CPF, profissao);
                            break;

                        case 6:
                            System.out.print("digite uma nova comobidade: ");
                            comobidade = sc.next();
                            controllerVacinacao.atualizaNumeroCartaoSUS(CPF, comobidade);
                            break;

                        case 7:
                            System.out.print("digite uma nova idade: ");
                            idade = sc.nextInt();
                            controllerVacinacao.atualizaIdade(CPF, idade);
                            break;
                        case 8:
                            System.out.println("saindo da edição dos dados do pessoa");
                            break;

                        default:
                            System.out.println("opcao invalida");

                    }

                    break;

                case 5:
                    System.out.println("saindo da aplicação");
                    break;

                default:
                    System.out.println("opcao invalida");
            }
        }



    }
}