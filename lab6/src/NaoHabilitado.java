/**
 * classe state responsável por pessoa que não está habilitada a tomar a vacina
 * pessoas que tiverem a comobidade, idade ou profissão listada em governo terá prioridade e passará a ser habilitado a tomar vacina
 */
public class NaoHabilitado extends StatePessoa {


    public NaoHabilitado( Pessoa pessoa) {
        super(pessoa);
    }

    @Override
    public String situacaoEtapa() {
        if(!pessoa.getPrioridade())return "não habilitado a tomar a vacina";

        pessoa.mudaStatePessoa(new HabilitadoPrimeiraDose(pessoa));
        return "habilitado a tomar a vacina";
    }

    @Override
    public String toString() {
        if(!pessoa.getPrioridade()) return "não habilitado a tomar a vacina";

        return "habilitado a tomar a vacina";
    }

}
