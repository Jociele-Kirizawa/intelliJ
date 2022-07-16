package Br.com.Dio.model;

import java.util.Objects;

public class Gato {
    private String nome;
    private String cor;
    private String Idade;

    public Gato() {    }

    public Gato(String nome, String cor, String idade) {
        this.nome = nome;
        this.cor = cor;
        this.Idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getIdade() {
        return Idade;
    }

    public void setIdade(String idade) {
        Idade = idade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Gato gato = (Gato) o;
        return Objects.equals(nome, gato.nome) && Objects.equals(cor, gato.cor) && Objects.equals(Idade, gato.Idade);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, cor, Idade);
    }

    @Override
    public String toString() {
        return "Gato{" +
                "nome='" + nome + '\'' +
                ", cor='" + cor + '\'' +
                ", Idade='" + Idade + '\'' +
                '}';
    }
}
