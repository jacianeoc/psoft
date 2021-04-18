import java.util.HashSet;
import java.util.Set;

public class Governo {
    private int idadeMinimaParaVacinacao;
    private Set<String> profissoesHabilitadasParaVacinacao  = new HashSet<>();
    private Set<String> comobidadesHabilitadasParaVacinacao = new HashSet<>();

    /**por default:
     * idade minina para uma pessoa vacinar será 18 anos
     * profissionais habilitados para  tomar vacina serão: medico, professor, enfermeiro e gari
     * pessoas com cormobidades habilitados para tomar vacina serão: hipertenso, diabetico, cardiopata
     */
    public Governo(){
        this.idadeMinimaParaVacinacao =18;
        this.profissoesHabilitadasParaVacinacao.add("medico");
        this.profissoesHabilitadasParaVacinacao.add("professor");
        this.profissoesHabilitadasParaVacinacao.add("enfermeiro");
        this.profissoesHabilitadasParaVacinacao.add("gari");

        this.comobidadesHabilitadasParaVacinacao.add("hipertenso");
        this.comobidadesHabilitadasParaVacinacao.add("diabetico");
        this.comobidadesHabilitadasParaVacinacao.add("cardiopata");
    }

    public int getIdadeMinimaParaVacinacao() {
        return idadeMinimaParaVacinacao;
    }

    public Set<String> getProfissoesHabilitadasParaVacinacao() {
        return profissoesHabilitadasParaVacinacao;
    }

    public Set<String> getComobidadesHabilitadasParaVacinacao() {
        return comobidadesHabilitadasParaVacinacao;
    }

    public void setIdadeMinimaParaVacinacao(int idadeMinimaParaVacinacao) {
        this.idadeMinimaParaVacinacao = idadeMinimaParaVacinacao;
    }

    public void addProfissaoHabilitadaParaVacinacao(String profissao) {
        this.profissoesHabilitadasParaVacinacao.add(profissao);
    }

    public void addComobidadeHabilitadaParaVacinacao(String comobidade) {
        this.comobidadesHabilitadasParaVacinacao.add(comobidade);
    }
}
