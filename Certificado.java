import java.util.Date;


public class Certificado {

    private String codigo;
    private Date dataEmissao;
    private Date cargaHoraria;

    
    public Certificado(String codigo, Date dataEmissao, Date cargaHoraria) {
        this.codigo = codigo;
        this.dataEmissao = dataEmissao;
        this.cargaHoraria = cargaHoraria;
    }


    public String getCodigo() {
        return codigo;
    }


    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }


    public Date getDataEmissao() {
        return dataEmissao;
    }


    public void setDataEmissao(Date dataEmissao) {
        this.dataEmissao = dataEmissao;
    }


    public Date getCargaHoraria() {
        return cargaHoraria;
    }


    public void setCargaHoraria(Date cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

     public void gerar(String emailDestino) {
     this.dataEmissao = new Date();
     enviarPorEmail(emailDestino);
     }

     public boolean validar() {
        return codigo != null && !codigo.isEmpty();
    }

      public void enviarPorEmail(String emailDestino) {
        if (validar()) {
        System.out.println("Certificado enviado para: " + emailDestino);
      }
    }


      @Override
      public String toString() {
        return "Certificado [codigo=" + codigo + ", dataEmissao=" + dataEmissao + ", cargaHoraria=" + cargaHoraria
                + "]";
      }

    

    
}
