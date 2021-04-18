public class Pessoa {
    private String nome;
    private String CPF;
    private String endereco;
    private String numeroCartaoSUS;
    private String profissao;
    private String email;
    private String teleforne;
    private String comobidades;
    private int idade;
    private StatePessoa statePessoa;

    public Pessoa(String nome, String CPF, String endereco, String numeroCartaoSUS, String email,
                  String teleforne, String profissao, String comobidades, int idade){
        this.nome = nome;
        this.CPF = CPF;
        this.endereco = endereco;
        this.numeroCartaoSUS = numeroCartaoSUS;
        this.email = email;
        this.teleforne = teleforne;
        this.profissao = profissao;
        this.comobidades = comobidades;
        this.idade = idade;
        this.statePessoa = new NaoHabilitado();
    }

    public StatePessoa getstatePessoa(){
        return this.statePessoa;

    }
}
