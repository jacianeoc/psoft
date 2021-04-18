import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Pessoa {
    private String nome;
    private String CPF;
    private String endereco;
    private String numeroCartaoSUS;
    private String profissao;
    private String email;
    private String telefone;
    private String comobidades;
    private int idade;

    private StatePessoa statePessoa;


    public Pessoa(String nome, String CPF, String endereco, String numeroCartaoSUS, String email,
                  String telefone, String profissao, String comobidades, int idade){
        this.nome = nome;
        this.CPF = CPF;
        this.endereco = endereco;
        this.numeroCartaoSUS = numeroCartaoSUS;
        this.email = email;
        this.telefone = telefone;
        this.profissao = profissao;
        this.comobidades = comobidades;
        this.idade = idade;

        this.statePessoa = new NaoHabilitado( this);
    }

    public StatePessoa getstatePessoa(){
        return this.statePessoa;

    }
    public void mudaStatePessoa(StatePessoa estado){
        this.statePessoa = estado;
    }

    public boolean getPrioridade(){
        return new Governo().validaInformacoes(idade, profissao, comobidades);
    }

    public String habilitaSegundaDose(String diaEMesPrimeiraDose, String diaEMesAtual)  {

        try {
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

            Date data1 = formato.parse(diaEMesPrimeiraDose);
            Date data2 = formato.parse(diaEMesAtual);

            long dt = (data2.getTime() - data1.getTime()) + 3600000;
            long dias = (dt / 86400000L);
            if(dias < 20){
                return "ainda não passou os 20 dias";
            }
        }catch (java.text.ParseException e) {
            e.printStackTrace();
        }



        mudaStatePessoa(new PrimeiraDose(this));
        return statePessoa.situacaoEtapa();

    }

    public String getNome() {
        return nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setNumeroCartaoSUS(String numeroCartaoSUS) {
        this.numeroCartaoSUS = numeroCartaoSUS;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setComobidades(String comobidades) {
        this.comobidades = comobidades;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Pessoa " +
                nome + '\'' +
                ", CPF ='" + CPF + '\'' +
                ", endereço = '" + endereco + '\'' +
                ", numero do Cartao do SUS = '" + numeroCartaoSUS + '\'' +
                ", profissao = '" + profissao + '\'' +
                ", email = '" + email + '\'' +
                ", telefone = '" + telefone + '\'' +
                ", comobidades = '" + comobidades + '\'' +
                ", idade = " + idade +
                ", estágio da vacinação que se encontra = " + statePessoa.toString() +
                '}';
    }
}
