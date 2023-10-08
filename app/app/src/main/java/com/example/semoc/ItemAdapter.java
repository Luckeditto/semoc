package com.example.semoc;

import androidx.recyclerview.widget.RecyclerView;


import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import java.util.List;


public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ItemViewHolder> {
    private Context context;
    private List<Evento> lista;

    public ItemAdapter(Context context, List itens){
        this.context = context;
        this.lista = itens;
    }

    @NonNull
    @Override
    public ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view =  LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_view_item,parent,false);
        ItemViewHolder itemViewHolder = new ItemViewHolder(view);
        return itemViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ItemViewHolder holder, int position) {
        Evento evento = lista.get(position);
        holder.setTextView1(evento.getTitulo());
        holder.setTextView2(evento.getDescricao());
        holder.setEvento(evento);


    }

    @Override
    public int getItemCount() {
        return this.lista.size();
    }


    class ItemViewHolder extends RecyclerView.ViewHolder implements  View.OnClickListener{
        private TextView textView1;
        private TextView textView2;
        private Evento evento;



        public ItemViewHolder(@NonNull View itemView){
            super(itemView);
            textView1 = itemView.findViewById(R.id.textView1);
            textView2 = itemView.findViewById(R.id.textView2);
            itemView.setOnClickListener(this);

        }


        public void setTextView1(String titulo){
            this.textView1.setText(titulo);
        }
        public void setTextView2(String descricao){
            this.textView2.setText(descricao);
        }





        public void setEvento(Evento evento) {
            this.evento = evento;
        }







        @Override
        public void onClick(View view) {
            Log.d("Minha App", "OnClick");
            Intent intent = new Intent(context,PopUpActivity.class);
            intent.putExtra("CHAVE", this.evento);
            context.startActivity(intent);
        }
    }
}
