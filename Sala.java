public class Sala {

    private String nome;
    private String localizacao;
    private int capacidade;
    private boolean disponivel;

    private Sala salaAgendada;
    private String palestrante;
    private boolean cancelada;

    public Sala(String nome, String localizacao, int capacidade, boolean disponivel) {
        this.nome = nome;
        this.localizacao = localizacao;
        this.capacidade = capacidade;
        this.disponivel = true;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getLocalizacao() {
        return localizacao;
    }
    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }
    public int getCapacidade() {
        return capacidade;
    }
    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }
    public boolean isDisponivel() {
        return disponivel;
    }
    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

      public boolean verificarDisponibilidade() {
        if (true){
            System.out.println("Sala Disponivel!!!!  ");
            return true;

        }else{
            System.out.println("Sala Nao disponivel");

            return false;
            
        }
        
        
        
        

    }

    public Sala(int capacidade) {
        this.capacidade = capacidade;
    }
    public boolean reservar() {
        if (disponivel) {
            disponivel = false;
            return false;
        }
        else{
            return false;
        }
    }
    public Sala getSalaAgendada() {
        return salaAgendada;
    }
    public void setSalaAgendada(Sala salaAgendada) {
        this.salaAgendada = salaAgendada;
    }
    public String getPalestrante() {
        return palestrante;
    }
    public void setPalestrante(String palestrante) {
        this.palestrante = palestrante;
    }
    public boolean isCancelada() {
        return cancelada;
    }
    public void setCancelada(boolean cancelada) {
        this.cancelada = cancelada;
    }
    
    

    
    
}
