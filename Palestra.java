import java.util.Date;

public class Palestra extends Atividade {
    private String materialApoio;
    private String slideUtil;



    public Palestra(Atividade atividade, String materialApoio,
            String slideUtil) {
        super(atividade.getTitulo(),atividade.getDescricao(), atividade.getDataHorarioInicio(),atividade.getDataHorarioFim(),
        atividade.getCapacidade(),atividade.getTipoDeAtividade(),atividade.getSala(),atividade.getPalestrantes(),
        atividade.getPalestrantes(),atividade.isCancelada());
        this.materialApoio = materialApoio;
        this.slideUtil = slideUtil;
    }

    
    public void disponibilizarMaterial(String materialApoio) {
        System.out.println(materialApoio);
     }
    public void iniciarTransmissao() {
        System.out.println("Passando Slide");
     }
    public String getMaterialApoio() {
        return materialApoio;
    }
    public void setMaterialApoio(String materialApoio) {
        this.materialApoio = materialApoio;
    }
    public String getSlideUtil() {
        return slideUtil;
    }
    public void setSlideUtil(String slideUtil) {
        this.slideUtil = slideUtil;
    }

    
}

