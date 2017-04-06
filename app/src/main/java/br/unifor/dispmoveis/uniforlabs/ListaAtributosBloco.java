package br.unifor.dispmoveis.uniforlabs;

/**
 * Created by Leony on 04/04/2017.
 */

public class ListaAtributosBloco {
    private String txt_letraBloco;
    private String txt_numSala;
    private int img_statusSala;
    private String txt_emAulaProxAula;
    private int img_emAulaProxAula;

    public ListaAtributosBloco(String txt_letraBloco, String txt_numSala, int img_statusSala, String txt_emAulaProxAula, int img_emAulaProxAula) {
        this.txt_letraBloco = txt_letraBloco;
        this.txt_numSala = txt_numSala;
        this.img_statusSala = img_statusSala;
        this.txt_emAulaProxAula = txt_emAulaProxAula;
        this.img_emAulaProxAula = img_emAulaProxAula;
    }

    public String getTxt_letraBloco() {
        return txt_letraBloco;
    }

    public void setTxt_letraBloco(String txt_letraBloco) {
        this.txt_letraBloco = txt_letraBloco;
    }

    public String getTxt_numSala() {
        return txt_numSala;
    }

    public void setTxt_numSala(String txt_numSala) {
        this.txt_numSala = txt_numSala;
    }

    public int getImg_statusSala() {
        return img_statusSala;
    }

    public void setImg_statusSala(int img_statusSala) {
        this.img_statusSala = img_statusSala;
    }

    public String getTxt_emAulaProxAula() {
        return txt_emAulaProxAula;
    }

    public void setTxt_emAulaProxAula(String txt_emAulaProxAula) {
        this.txt_emAulaProxAula = txt_emAulaProxAula;
    }

    public int getImg_emAulaProxAula() {
        return img_emAulaProxAula;
    }

    public void setImg_emAulaProxAula(int img_emAulaProxAula) {
        this.img_emAulaProxAula = img_emAulaProxAula;
    }
}
