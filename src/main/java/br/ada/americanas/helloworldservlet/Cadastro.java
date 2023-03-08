package br.ada.americanas.helloworldservlet;

public class Cadastro {
    private String nome;
    private String cpf;

    public Cadastro(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Cadastro{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                '}';
    }
}
