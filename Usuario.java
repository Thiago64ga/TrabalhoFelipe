
public class Usuario {

    private String nomeUsuario;
    private String email;
    private String senha;
    private int cpf;
    private int telefone;
   
   

    public Usuario(String nomeUsuario, String email, String senha, int cpf,int telefone) {
        this.nomeUsuario = nomeUsuario;
        this.email = email;
        this.senha = senha;
        this.cpf = cpf;
        this.telefone = telefone;
    }

          public String toString() {
    return "Usuário  " +
           "nome='" + nomeUsuario + '\'' +
           ", email='" + email + '\'' +
           ", senha='" + senha + '\'' +
           ", cpf=" + cpf +
           ", telefone=" + telefone +
           '}';
}

    public Usuario( ){}


     public String getnomeUsuario() {return nomeUsuario;}

    public void setnomeUsuario(String nomeUsuario) {this.nomeUsuario = nomeUsuario;}

    public String getEmail() {return email;}

    public void setEmail(String email) {this.email = email;}

    public String getSenha() {return senha;}

    public void setSenha(String senha) {this.senha = senha;}

    public int getCpf() { return cpf;}

    public void setCpf(int cpf) {this.cpf = cpf;}

    public int getTelefone() { return telefone;}

    public void setTelefone(int telefone) { this.telefone = telefone;}


        public boolean autenticar (String email,String senha){
            return this.email.equals(email)&& this.senha.equals(senha);

        }

        public void atualizarPerfil (String nomeUsuario , int telefone ){
            this.nomeUsuario = nomeUsuario;
            this.telefone = telefone;
        }

        public void recuperarSenha(String email , String senha , int telefone  ){
            if (this.email.equals(email) && this.telefone == telefone){
                this.senha = senha;

            }
        }
    }







    

