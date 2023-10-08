package com.example.semoc.ui.gallery;

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

import com.example.semoc.Palestrante;
import com.example.semoc.PalestranteAdapter;
import com.example.semoc.R;
import com.example.semoc.databinding.FragmentGalleryBinding;

import java.util.ArrayList;

public class GalleryFragment extends Fragment {

    private FragmentGalleryBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        GalleryViewModel galleryViewModel =
                new ViewModelProvider(this).get(GalleryViewModel.class);

        binding = FragmentGalleryBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        //escreva aq seu código

        ArrayList<Palestrante>listaPalestrantes = new ArrayList<>();
        Palestrante palestrante1 = new Palestrante("Mario Jorge", "Professor, Pesquisador e programdor.");
        Palestrante palestrante2 = new Palestrante("Jorge", "Professor, Pesquisador e programdor.");
        Palestrante palestrante3 = new Palestrante("Mario", "Professor, Pesquisador e programdor.");
        Palestrante palestrante4 = new Palestrante("Jonas", "Professor, Pesquisador e programdor.");
        Palestrante palestrante5 = new Palestrante("Jucy", "Professor, Pesquisador e programdor.");

        listaPalestrantes.add(palestrante1);
        listaPalestrantes.add(palestrante2);
        listaPalestrantes.add(palestrante3);
        listaPalestrantes.add(palestrante4);
        listaPalestrantes.add(palestrante5);

        RecyclerView recyclerViewPalestrantes = root.findViewById(R.id.lista_recycle_palestrantes);
        PalestranteAdapter adapter = new PalestranteAdapter(requireContext(),listaPalestrantes);
        recyclerViewPalestrantes.setAdapter(adapter);
        recyclerViewPalestrantes.setLayoutManager(new LinearLayoutManager(requireContext(), RecyclerView.VERTICAL,false));




        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}