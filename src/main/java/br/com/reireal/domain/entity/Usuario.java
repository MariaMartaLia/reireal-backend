package br.com.reireal.domain.entity;

import java.util.UUID;

import br.com.reireal.domain.enums.FuncaoUsuario;

public class Usuario {
    private UUID id;
    private String nome;
    private String login;
    private String senha;
    private boolean ativo;
    private FuncaoUsuario funcao;


    public Usuario(String nome,String login,String senha,FuncaoUsuario funcao) {
        this.id = UUID.randomUUID();
        validarNome(nome);
        this.nome = nome;
        validarLogin(login);
        this.login = login;
        validarSenha(senha);
        this.senha = senha;
        ativar( );
        validarFuncao(funcao);
        this.funcao = funcao;
    }
    
    public UUID getId() {
        return id;
    }
    public String getNome() {
        return nome;
    }
    public String getLogin() {
        return login;
    }
    public boolean isAtivo() {
        return ativo;
    }   
    public FuncaoUsuario getFuncao() {
        return funcao;
    }
    public void alterarNome(String nome) {
        validarNome(nome);
        this.nome = nome;
    }
    public void alterarLogin(String login){
        validarLogin(login);
        this.login = login;
    }
    public void alterarSenha(String senha) {
        validarSenha(senha);
        this.senha = senha;
    }
    public void alterarFuncao(FuncaoUsuario funcao) {
        validarFuncao(funcao);
        this.funcao = funcao;
    }
    private void validarNome(String nome) {
        if (nome == null || nome.isBlank() || nome.length() > 100) {
            throw new IllegalArgumentException("Nome inválido. O nome não pode ser nulo, vazio ou ter mais de 100 caracteres.");
        }
    }
    private void validarLogin(String login) {
        if (login == null || login.isBlank() || login.length() > 100 || login.length() < 5) {
            throw new IllegalArgumentException("Login inválido. O login não pode ser nulo, vazio ou ter mais de 100 caracteres.");
        }
    }
    private void validarSenha(String senha) {
        if (senha == null || senha.isBlank() || senha.length() < 5 || senha.length() > 50) {
            throw new IllegalArgumentException("Senha inválida. A senha não pode ser nula, vazia ou ter mais de 50 caracteres.");
        }
    }
    public void ativar() {
        if (this.ativo) {
            throw new IllegalStateException("Usuário já está ativo.");
        }
        this.ativo = true;
    
    }
    public void desativar() {
        if (!this.ativo) {
            throw new IllegalStateException("Usuário já está inativo.");
        }
        this.ativo = false;
    }
        private void validarFuncao(FuncaoUsuario funcao) {
        if (funcao == null) {
            throw new IllegalArgumentException("Função inválida. A função não pode ser nula.");
        }
    }
}
