public class Usuario {
    private String email;
    private String senha;
    private Integer cpf;
    private String nome;

    public boolean login(String email, String senha){
        return this.email.equals(email) && this.senha.equals(senha);
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Integer getCpf() {
        return cpf;
    }

    public void setCpf(Integer cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    Usuario(String email, String senha, Integer cpf, String nome) {
        this.email = email;
        this.senha = senha;
        this.cpf = cpf;
        this.nome = nome;
    }
    
     Usuario(){
         
     }
   
}
    