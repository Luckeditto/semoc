package com.example.semoc;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class PalestranteAdapter extends RecyclerView.Adapter<PalestranteAdapter.ItemViewHolder>{

    private Context context;
    private List<Palestrante> lista;

    public PalestranteAdapter(Context context, List palestrantes){
        this.context = context;
        this.lista = palestrantes;

    }


    @NonNull
    @Override
        public ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_view_palestrante,parent,false);
        ItemViewHolder itemViewHolder = new ItemViewHolder(view);
        return itemViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ItemViewHolder holder, int position) {
      Palestrante palestrante = lista.get(position);
      holder.setTextView2(palestrante.getNome());
      holder.setPalestrante(palestrante);
    }



    @Override
    public int getItemCount() {
        return this.lista.size();
    }
    class ItemViewHolder extends RecyclerView.ViewHolder implements  View.OnClickListener{

        private TextView textView2;
        private Palestrante palestrante;



        public ItemViewHolder(@NonNull View itemView){
            super(itemView);

            textView2 = itemView.findViewById(R.id.nome_palestrante);
            itemView.setOnClickListener(this);

        }



        public void setTextView2(String nome){
            this.textView2.setText(nome);
        }





        public void setPalestrante(Palestrante palestrante) {
            this.palestrante = palestrante;
        }







        @Override
        public void onClick(View view) {
            Log.d("Minha App", "OnClick");
            Intent intent = new Intent(context,PalestranteActivity.class);
            intent.putExtra("CHAVE", this.palestrante);
            context.startActivity(intent);
        }
    }
}
