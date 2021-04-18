import java.util.HashMap;
import java.util.Map;

public class ControllerVacinacao {

    private Map<String, Pessoa> pessoasAguardoVacianacao;

    public ControllerVacinacao(){
        this.pessoasAguardoVacianacao = new HashMap<>();
    }

    public String  cadastrarPessoa(String nome, String CPF, String endereco, String numeroCartaoSUS, String email,
                           String teleforne, String profissao, String comobidades, int idade){

        Pessoa pessoa = new Pessoa(nome, CPF, endereco, numeroCartaoSUS, email, teleforne, profissao, comobidades, idade);
        if(pessoasAguardoVacianacao.containsKey(CPF)){
            throw  new IllegalArgumentException("cpf já cadastrado");
        }
        pessoasAguardoVacianacao.put(CPF, pessoa);
        return "pessoa cadastrada";

    }

    public String MudaSituacaoEtapa(String CPF){
        if(!pessoasAguardoVacianacao.containsKey(CPF)){
            throw  new IllegalArgumentException("cpf não cadastrado");
        }

        return pessoasAguardoVacianacao.get(CPF).getstatePessoa().situacaoEtapa();
    }
    public String habilitaSegundaDose(String CPF, String data1, String data2){
        if(!pessoasAguardoVacianacao.containsKey(CPF)){
            throw  new IllegalArgumentException("cpf não cadastrado");
        }

        return pessoasAguardoVacianacao.get(CPF).habilitaSegundaDose(data1, data2);
    }

    public String encotraPessoa(String CPF){
        if(!pessoasAguardoVacianacao.containsKey(CPF)){
            throw  new IllegalArgumentException("cpf não cadastrado");
        }
        return pessoasAguardoVacianacao.get(CPF).toString();
    }
    public void atualizaEndereço(String CPF, String novoEndereco){
        if(!pessoasAguardoVacianacao.containsKey(CPF)){
            throw  new IllegalArgumentException("cpf não cadastrado");
        }
        pessoasAguardoVacianacao.get(CPF).setEndereco(novoEndereco);

    }

    public void atualizaNumeroCartaoSUS(String CPF, String novoNumeroCartao){
        if(!pessoasAguardoVacianacao.containsKey(CPF)){
            throw  new IllegalArgumentException("cpf não cadastrado");
        }
        pessoasAguardoVacianacao.get(CPF).setNumeroCartaoSUS(novoNumeroCartao);

    }

    public void atualizaProfissao(String CPF, String novaProfissao){
        if(!pessoasAguardoVacianacao.containsKey(CPF)){
            throw  new IllegalArgumentException("cpf não cadastrado");
        }
        pessoasAguardoVacianacao.get(CPF).setProfissao(novaProfissao);

    }
    public void atualizaEmail(String CPF, String novoEmail){
        if(!pessoasAguardoVacianacao.containsKey(CPF)){
            throw  new IllegalArgumentException("cpf não cadastrado");
        }
        pessoasAguardoVacianacao.get(CPF).setEmail(novoEmail);

    }
    public void atualizaTelefone(String CPF, String novoTelefone){
        if(!pessoasAguardoVacianacao.containsKey(CPF)){
            throw  new IllegalArgumentException("cpf não cadastrado");
        }
        pessoasAguardoVacianacao.get(CPF).setTelefone(novoTelefone);

    }
    public void atualizaComobidades(String CPF, String novaComobidades){
        if(!pessoasAguardoVacianacao.containsKey(CPF)){
            throw  new IllegalArgumentException("cpf não cadastrado");
        }
        pessoasAguardoVacianacao.get(CPF).setComobidades(novaComobidades);

    }
    public void atualizaIdade(String CPF, int novaIdade){
        if(!pessoasAguardoVacianacao.containsKey(CPF)){
            throw  new IllegalArgumentException("cpf não cadastrado");
        }
        pessoasAguardoVacianacao.get(CPF).setIdade(novaIdade);

    }
}
