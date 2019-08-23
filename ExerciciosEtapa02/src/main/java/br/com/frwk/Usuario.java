package br.com.frwk;

public class Usuario {
    private String login;
    private String senha;

    public Usuario (String _login, String _senha){
        setLogin(_login);
        setSenha(_senha);
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        if (login != null){
            this.login = login;
        }
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        if (senha != null){
            this.senha = senha;
        }
    }

}
