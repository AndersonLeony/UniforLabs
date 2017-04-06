package br.unifor.dispmoveis.uniforlabs;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView lista = (ListView) findViewById(R.id.lvLabs);
        ArrayList<ListaBlocos> labs = adicionarLabs();
        ArrayAdapter adapter = new ListaBlocosAdapter(this, labs);
        lista.setAdapter(adapter);

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent it = new Intent(getBaseContext(), BlocoActivity.class);

                //passando o valor do bloco clicado por parametro através da intent
                if (position==0){
                    it.putExtra("bloco", 0);
                }else if (position==1){
                    it.putExtra("bloco", 1);
                }else if (position==2){
                    it.putExtra("bloco", 2);
                }else if (position==3){
                    it.putExtra("bloco", 3);
                }else if (position==4){
                    it.putExtra("bloco", 4);
                }else if (position==5){
                    it.putExtra("bloco", 5);
                }

                if(position == 0 || position == 3){
                    startActivity(it);
                }


            }
        });

    }

    private ArrayList<ListaBlocos> adicionarLabs() {
        ArrayList<ListaBlocos> escolas = new ArrayList<ListaBlocos>();
        ListaBlocos e = new ListaBlocos("D", R.drawable.disponivel);
        escolas.add(e);
        e = new ListaBlocos("J", R.drawable.ocupado);
        escolas.add(e);
        e = new ListaBlocos("K", R.drawable.ocupado);
        escolas.add(e);
        e = new ListaBlocos("M", R.drawable.disponivel);
        escolas.add(e);
        e = new ListaBlocos("T", R.drawable.ocupado);
        escolas.add(e);
        e = new ListaBlocos("Z", R.drawable.disponivel);
        escolas.add(e);
        return escolas;
    }
}
