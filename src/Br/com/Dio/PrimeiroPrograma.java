package Br.com.Dio;

import Br.com.Dio.model.Gato;

public class PrimeiroPrograma {
    public static void main(String[] args) {
        Gato gato = new gato();
        System.out.println(gato);

        Livro livro = new livro (nome "o Problema dos 3 corpos", Npag "300");
        System.out.println(Livro);

       /*int a = 5;
        int b = 5;
        System.out.println("Hello World " + (a+b));*/
    }
}
class Livro {
    private String nome;
    private Integer Npag;

    public Livro() {    }

    public Livro(String nome, Integer npag) {
        this.nome = nome;
        Npag = npag;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNpag() {
        return Npag;
    }

    public void setNpag(Integer npag) {
        Npag = npag;
    }
}
