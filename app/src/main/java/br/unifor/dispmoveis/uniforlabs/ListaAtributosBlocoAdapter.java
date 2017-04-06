package br.unifor.dispmoveis.uniforlabs;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

import pasta.fragments.em.aula.prox.aula.EmAulaProxAulaD14Fragment;
import pasta.fragments.em.aula.prox.aula.EmAulaProxAulaD18Fragment;
import pasta.fragments.em.aula.prox.aula.EmAulaProxAulaD22Fragment;
import pasta.fragments.em.aula.prox.aula.EmAulaProxAulaD26Fragment;
import pasta.fragments.em.aula.prox.aula.EmAulaProxAulaM33Fragment;
import pasta.fragments.em.aula.prox.aula.EmAulaProxAulaM35Fragment;
import pasta.fragments.em.aula.prox.aula.SalaD18Activity;
import pasta.fragments.em.aula.prox.aula.SalaM35Activity;

/**
 * Created by Leony on 04/04/2017.
 */

public class ListaAtributosBlocoAdapter extends ArrayAdapter <ListaAtributosBloco> {
    private final int blocoEscolhido;
    private final Context context;
    private final ArrayList<ListaAtributosBloco> elementos;
    private final FragmentManager fm;
    public ListaAtributosBlocoAdapter(Context context, ArrayList<ListaAtributosBloco> elementos, FragmentManager fragmentManager, int blocoEscolhido) {
        super(context, R.layout.linha_atributos_bloco, elementos);
        this.context= context;
        this.elementos= elementos;
        this.fm = fragmentManager;
        this.blocoEscolhido = blocoEscolhido;
    }


    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        /*private String txt_letraBloco;
        private String txt_numSala;
        private int img_statusSala;
        private String txt_emAulaProxAula;
        private int img_emAulaProxAula;*/
        //(LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        //inflater.inflate(R.layout.linha_atributos_bloco, parent, false);
        LayoutInflater layoutInflater = LayoutInflater.from(this.context);
        final View rowView = layoutInflater.inflate(R.layout.linha_atributos_bloco, parent, false);
        View rowView2 = layoutInflater.inflate(R.layout.activity_bloco, parent, false);

        TextView txt_letraBloco = (TextView) rowView.findViewById(R.id.txt_letraBloco);
        TextView txt_numSala = (TextView) rowView.findViewById(R.id.txt_numSala);
        ImageView img_statusSala = (ImageView) rowView.findViewById(R.id.img_statusSala);
        TextView txt_emAulaProxAula = (TextView) rowView.findViewById(R.id.txt_emAulaProxAula);
        ImageView img_emAulaProxAula = (ImageView) rowView.findViewById(R.id.img_emAulaProxAula);

        txt_letraBloco.setText(elementos.get(position).getTxt_letraBloco());
        txt_numSala.setText(elementos.get(position).getTxt_numSala());
        img_statusSala.setImageResource(elementos.get(position).getImg_statusSala());
        txt_emAulaProxAula.setText(elementos.get(position).getTxt_emAulaProxAula());
        img_emAulaProxAula.setImageResource(elementos.get(position).getImg_emAulaProxAula());

        LinearLayout ln_verSala = (LinearLayout) rowView.findViewById(R.id.ln_verSala);
        ln_verSala.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(elementos.get(position).getTxt_letraBloco().equals("D")&&
                        elementos.get(position).getTxt_numSala().equals("18")){
                    Intent it = new Intent(context, SalaD18Activity.class);
                    context.startActivity(it);
                    fm.beginTransaction().replace(R.id.frame_container, new FragmentDeixarFragmentVazio()).commit();

                }else if(elementos.get(position).getTxt_letraBloco().equals("M")&&
                        elementos.get(position).getTxt_numSala().equals("35")){
                    Intent it = new Intent(context, SalaM35Activity.class);
                    context.startActivity(it);
                    fm.beginTransaction().replace(R.id.frame_container, new FragmentDeixarFragmentVazio()).commit();
                }

                //fm.beginTransaction().replace(R.id.frame_container, new DisciplinasDadosFragment()).commit();

            }
        });

        LinearLayout ln_verDadosAula = (LinearLayout) rowView.findViewById(R.id.ln_verDadosAula);
        ln_verDadosAula.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    encaminharParaLayout(elementos,position,fm,context, blocoEscolhido);


            }
        });

        return rowView;
    }

    private void encaminharParaLayout(ArrayList<ListaAtributosBloco> elementos, int positionBloco, FragmentManager fm, Context context, int blocoEscolhido){

        switch (blocoEscolhido){
            case 0:
                switch (positionBloco){

                    case 0:
                    /*switch (elementos.get(0).getTxt_numSala()){
                        case "14":
                            fm.beginTransaction().replace(R.id.frame_container, new EmAulaProxAulaD14Fragment()).commit();
                            break;
                        case "18":
                            fm.beginTransaction().replace(R.id.frame_container, new EmAulaProxAulaD18Fragment()).commit();
                            break;
                        case "22":
                            fm.beginTransaction().replace(R.id.frame_container, new EmAulaProxAulaD22Fragment()).commit();
                            break;
                        case "26":
                            fm.beginTransaction().replace(R.id.frame_container, new EmAulaProxAulaD26Fragment()).commit();
                            break;
                    }*/
                        fm.beginTransaction().replace(R.id.frame_container, new EmAulaProxAulaD14Fragment()).commit();

                        break;
                    case 1:
                        fm.beginTransaction().replace(R.id.frame_container, new EmAulaProxAulaD18Fragment()).commit();

                        break;
                    case 2:
                        fm.beginTransaction().replace(R.id.frame_container, new EmAulaProxAulaD22Fragment()).commit();

                        break;
                    case 3:
                    /*switch (elementos.get(3).getTxt_numSala()){
                        case "33":
                            fm.beginTransaction().replace(R.id.frame_container, new EmAulaProxAulaM33Fragment()).commit();
                            break;
                        case "35":
                            fm.beginTransaction().replace(R.id.frame_container, new EmAulaProxAulaM35Fragment()).commit();
                            break;
                    }*/
                        fm.beginTransaction().replace(R.id.frame_container, new EmAulaProxAulaD26Fragment()).commit();

                        break;

                }
                break;
            case 3:
                switch (positionBloco){
                    case 0:
                        fm.beginTransaction().replace(R.id.frame_container, new EmAulaProxAulaM33Fragment()).commit();

                        break;
                    case 1:
                        fm.beginTransaction().replace(R.id.frame_container, new EmAulaProxAulaM35Fragment()).commit();
                        break;
                }
                break;
        }

    }

}
