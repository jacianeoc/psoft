public class HabilitadoPrimeiraDose extends StatePessoa {
    public HabilitadoPrimeiraDose(Pessoa pessoa) {
        super(pessoa);
    }

    @Override
    public String situacaoEtapa() {
        pessoa.mudaStatePessoa(new PrimeiraDose(pessoa));
        return "primeira dose :)";
    }
}
