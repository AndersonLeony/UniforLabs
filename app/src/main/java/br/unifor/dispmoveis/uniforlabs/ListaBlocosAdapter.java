package br.unifor.dispmoveis.uniforlabs;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Leony on 01/04/2017.
 */

public class ListaBlocosAdapter extends ArrayAdapter <ListaBlocos> {

    private final Context context;
    private final ArrayList<ListaBlocos> elementos;

    public ListaBlocosAdapter(Context context, ArrayList<ListaBlocos> elementos) {
        super(context, R.layout.linha, elementos);
        this.context = context;
        this.elementos = elementos;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(R.layout.linha, parent, false);

        TextView nomeBloco = (TextView) rowView.findViewById(R.id.nomeBloco);
        ImageView img_statusBloco = (ImageView) rowView.findViewById(R.id.img_statusBloco);

        nomeBloco.setText(elementos.get(position).getNome());
        img_statusBloco.setImageResource(elementos.get(position).getImagem());

        return rowView;
    }

}
