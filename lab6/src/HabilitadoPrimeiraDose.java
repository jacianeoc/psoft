public class HabilitadoPrimeiraDose extends StatePessoa {
    public HabilitadoPrimeiraDose(Pessoa pessoa) {
        super(pessoa);
    }

    @Override
    public String situacaoEtapa() {
        pessoa.mudaStatePessoa(new PrimeiraDose(pessoa));
        return "primeira dose :)";
    }

    @Override
    public String toString() {
        return "habilitado a tomar a primeira dose";
    }
}
