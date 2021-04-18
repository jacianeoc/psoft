public abstract class StatePessoa {


    protected Governo governo;

    public StatePessoa(Governo governo){
        this.governo = governo;
    }

    public abstract String vacinacao();
}
