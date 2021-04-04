import java.util.HashMap;
import java.util.Map;

/**
 * classe controlladora e responsavel por conter a estratégia dos meios de transporte
 */
public class ControllerTransporte {
    private Map<String,Transpote> transpotesDisponiveis = new HashMap<>();

    public ControllerTransporte(){
        this.transpotesDisponiveis.put("pedestre", new Pedestre());
        this.transpotesDisponiveis.put("carro", new Carro());
        this.transpotesDisponiveis.put("metro", new Metro());
        this.transpotesDisponiveis.put("onibus", new Onibus());
    }

    /**
     * metodo responsavel por calcular rota do transporte selecionado
     * @param transporteSelecionado
     * @return uma string do calculo da rota
     */
    public String calculaRota(String transporteSelecionado){
       return this.transpotesDisponiveis.get(transporteSelecionado).calculaRota();
    }

    /**
     * metodo apenas com o intuito de retornar os transportes disponiveis na aplicação para facilitar a escolha do tipo
     * de calculo pelo usuario
     * @return lista de todos os transportes disponiveis na aplicacao
     */
    public String transportesDisponiveis(){
        String listaDeTransportes = "" ;
        for (String key : transpotesDisponiveis.keySet() ) {
            listaDeTransportes += key + "\n";
        }
        return listaDeTransportes;
    }
}
