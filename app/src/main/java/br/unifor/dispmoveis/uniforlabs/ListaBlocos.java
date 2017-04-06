package br.unifor.dispmoveis.uniforlabs;

/**
 * Created by Leony on 01/04/2017.
 */

public class ListaBlocos {
    private String nome;
    private int imagem; // vai armazenar o identificador do recurso

    public ListaBlocos(String nome, int imagem) {
        this.nome = nome;
        this.imagem = imagem;
    }
// métodos getters e setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getImagem() {
        return imagem;
    }

    public void setImagem(int imagem) {
        this.imagem = imagem;
    }

}
