public class HabilitadoSegundaDose extends StatePessoa {
    public HabilitadoSegundaDose(Pessoa pessoa) {
        super(pessoa);
    }

    @Override
    public String situacaoEtapa() {
        pessoa.mudaStatePessoa(new VacinacaoFinalizada(pessoa));
        return "Segunda dose (•◡•)";
    }

    @Override
    public String toString() {
        return "habilitado a tomar a segunda dose";
    }
}
