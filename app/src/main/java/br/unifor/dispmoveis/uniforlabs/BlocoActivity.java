package br.unifor.dispmoveis.uniforlabs;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class BlocoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bloco);

        /*Método que pega o bloco que foi clicado em activity_main*/
        Intent it = getIntent();
        int blocoEscolhido = it.getIntExtra("bloco", -1);

        FragmentManager fm = getSupportFragmentManager();

        final ListView lista = (ListView) findViewById(R.id.lvBloco);
        final ArrayList<ListaAtributosBloco> labs = adicionarLabs(blocoEscolhido);
        ArrayAdapter adapter = new ListaAtributosBlocoAdapter(this, labs, fm, blocoEscolhido);
        lista.setAdapter(adapter);

    }


    private ArrayList<ListaAtributosBloco> adicionarLabs(int blocoEscolhido) {
        ArrayList<ListaAtributosBloco> listaBlocosAtributo = new ArrayList<ListaAtributosBloco>();

        if(blocoEscolhido==0){
            ListaAtributosBloco lt = new ListaAtributosBloco("D", "14", R.drawable.circulovermelhosemfundo,
                    "Em Aula", R.drawable.icone_graduacao);
            setTitle("Bloco D");
            listaBlocosAtributo.add(lt);

            ListaAtributosBloco lt2 = new ListaAtributosBloco("D", "18", R.drawable.circuloverdesemfundo,
                    "Próx. Aula", R.drawable.icone_graduacao);
            listaBlocosAtributo.add(lt2);

            ListaAtributosBloco lt3 = new ListaAtributosBloco("D", "22", R.drawable.circulovermelhosemfundo,
                    "Próx. Aula", R.drawable.icone_graduacao);
            listaBlocosAtributo.add(lt3);

            ListaAtributosBloco lt4 = new ListaAtributosBloco("D", "26", R.drawable.circulovermelhosemfundo,
                    "Em Aula", R.drawable.icone_graduacao);
            listaBlocosAtributo.add(lt4);

        }else if (blocoEscolhido==3){
            ListaAtributosBloco lt = new ListaAtributosBloco("M", "33", R.drawable.circulovermelhosemfundo,
                    "Em Aula", R.drawable.icone_graduacao);
            setTitle("Bloco M");
            listaBlocosAtributo.add(lt);

            ListaAtributosBloco lt2 = new ListaAtributosBloco("M", "35", R.drawable.circuloverdesemfundo,
                    "Próx. Aula", R.drawable.icone_graduacao);
            listaBlocosAtributo.add(lt2);
        }

        return listaBlocosAtributo;
    }
}
