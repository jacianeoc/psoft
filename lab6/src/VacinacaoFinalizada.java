public class VacinacaoFinalizada extends StatePessoa {
    public VacinacaoFinalizada(Pessoa pessoa) {
        super(pessoa);
    }

    @Override
    public String situacaoEtapa() {
        return "vacianação de " + pessoa.getNome()+ " finalizada";
    }
}
