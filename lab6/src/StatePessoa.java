public abstract class StatePessoa {


    protected   Pessoa pessoa;



    public StatePessoa(Pessoa pessoa){

        this.pessoa = pessoa;
    }

    /**
     * metodo situacao é utilizado para informar a situacao de qual etapa que uma pessoa se encotra
     * @return
     */
    public abstract String situacaoEtapa();
}
