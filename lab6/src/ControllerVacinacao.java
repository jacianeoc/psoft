import java.util.HashMap;
import java.util.Map;

public class ControllerVacinacao {

    private Map<String, Pessoa> pessoasAguardoVacianacao;

    public ControllerVacinacao(){
        this.pessoasAguardoVacianacao = new HashMap<>();
    }

    public void  cadastrarPessoa(String nome, String CPF, String endereco, String numeroCartaoSUS, String email,
                           String teleforne, String profissao, String comobidades, int idade){

        Pessoa pessoa = new Pessoa(nome, CPF, endereco, numeroCartaoSUS, email, teleforne, profissao, comobidades, idade);
        if(pessoasAguardoVacianacao.containsKey(CPF)){
            throw  new IllegalArgumentException("cpf já cadastrado");
        }
        pessoasAguardoVacianacao.put(CPF, pessoa);

    }
    public void setState(String CPF){

    }
}
