import java.util.HashMap;
import java.util.Map;

public class ControllerTransporte {
    private Map<String,Transpote> transpotesDisponiveis = new HashMap<>();

    public ControllerTransporte(){
        this.transpotesDisponiveis.put("pedestre", new Pedestre());
        this.transpotesDisponiveis.put("carro", new Carro());
        this.transpotesDisponiveis.put("metro", new Metro());
        this.transpotesDisponiveis.put("onibus", new Onibus());
    }

    public String calculaRota(String transporteSelecionado){
       return this.transpotesDisponiveis.get(transporteSelecionado).calculaRota();
    }

    public String transportesDisponiveis(){
        String listaDeTransportes = "" ;
        for (String key : transpotesDisponiveis.keySet() ) {
            listaDeTransportes += key + "\n";
        }
        return listaDeTransportes;
    }
}
