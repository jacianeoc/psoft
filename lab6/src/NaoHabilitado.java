/**
 * classe state responsável por pessoa que não está habilitada a tomar a vacina
 */
public class NaoHabilitado extends StatePessoa {


    @Override
    public String vacinacao() {
        return null;
    }
}
