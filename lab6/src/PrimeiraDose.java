public class PrimeiraDose extends StatePessoa {
    public PrimeiraDose(Pessoa pessoa) {
        super(pessoa);
    }

    @Override
    public String situacaoEtapa() {
        pessoa.mudaStatePessoa(new HabilitadoSegundaDose(pessoa));
        return "habilitado para a segunda dose da vaciana ^_^ ";
    }
}
