package com.example.semoc.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.semoc.Evento;
import com.example.semoc.ItemAdapter;
import com.example.semoc.R;
import com.example.semoc.databinding.FragmentHomeBinding;

import java.util.ArrayList;

public class HomeFragment extends Fragment {

    private FragmentHomeBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        HomeViewModel homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);


        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();


        ArrayList<Evento> Eventos = new ArrayList<>();


        Evento evento  = new Evento("palestra", "Mario Jorge - 20/12");
        Evento evento2  = new Evento("dinamica", "Mario Jorge - 20/12");
        Evento evento3  = new Evento("comemoração", "Mario Jorge - 20/12");
        Evento evento4  = new Evento("treinamento", "Mario Jorge - 20/12");
        Evento evento5  = new Evento("workshop", "Mario Jorge - 20/12");

        Eventos.add(evento);
        Eventos.add(evento2);
        Eventos.add(evento3);
        Eventos.add(evento4);
        Eventos.add(evento5);


        RecyclerView listaEventos = root.findViewById(R.id.recycle_list);
        ItemAdapter adapter = new ItemAdapter(requireContext(),Eventos);
        listaEventos.setAdapter(adapter);
        listaEventos.setLayoutManager(new LinearLayoutManager(requireContext(), RecyclerView.VERTICAL,false));


        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}