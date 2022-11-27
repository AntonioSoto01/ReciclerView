package com.example.reciclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdaptadorTitulares extends
        RecyclerView.Adapter<AdaptadorTitulares.TitularesViewHolder> implements View.OnClickListener {
    private ArrayList<Titular> datos;
private View.OnClickListener listener;
    public AdaptadorTitulares(ArrayList<Titular> datos) {
        this.datos = datos;
    }

    public static class TitularesViewHolder extends RecyclerView.ViewHolder {
        private TextView txtTitulo;
        private TextView txtSubTitulo;

        public TitularesViewHolder(View itemView) {
            super(itemView);
            txtTitulo = (TextView) itemView.findViewById(R.id.Titulo);
            txtSubTitulo = (TextView) itemView.findViewById(R.id.SubTitulo);
        }
public void bindTitular(Titular t){
            txtTitulo.setText(t.getTitulo());
    txtSubTitulo.setText(t.getSubtitulo());

        }
    }
    @Override
    public TitularesViewHolder onCreateViewHolder(ViewGroup viewgroup, int viewType)
    {
    View itemview= LayoutInflater.from(viewgroup.getContext()).inflate(R.layout.listitem_titular,viewgroup,false);
    itemview.setOnClickListener(this);
    TitularesViewHolder tvh=new TitularesViewHolder(itemview);
    return tvh;

    }
    @Override
    public void onBindViewHolder(@NonNull TitularesViewHolder holder,int posicion)
    {
        Titular titular=datos.get(posicion);
        holder.bindTitular(titular);

    }
@Override
public int getItemCount(){
        return datos.size();
}
@Override
    public void onClick(View view){
        if (listener!=null)
            listener.onClick(view);
}
public void setOnClickListener(View.OnClickListener listener){
        this.listener=listener;
}

}


