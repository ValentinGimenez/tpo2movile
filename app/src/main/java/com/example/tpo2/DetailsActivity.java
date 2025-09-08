package com.example.tpo2;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.lifecycle.ViewModelProvider;

import com.example.tpo2.Model.Libro;
import com.example.tpo2.ViewModel.LibroViewModel;
import com.example.tpo2.databinding.ActivityDetailsBinding;

public class DetailsActivity extends AppCompatActivity {
    private ActivityDetailsBinding binding;
    private LibroViewModel viewModel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= ActivityDetailsBinding.inflate(getLayoutInflater());
        viewModel= new ViewModelProvider(this).get(LibroViewModel.class);
        EdgeToEdge.enable(this);
        setContentView(binding.getRoot());
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        //Observadores
        viewModel.getMutableLibro().observe(this,libro -> {
            binding.ivCover.setImageResource(getCoverFor(libro));
            setTitle(libro.getTitle());
            binding.tvTitle.setText(libro.getTitle());
            binding.tvAuthor.setText(libro.getAuthor());
            binding.tvYear.setText(String.valueOf(libro.getYear()));
            binding.tvPages.setText(String.valueOf(libro.getPages())); // sin texto fijo
            binding.tvDescription.setText(libro.getDescription());
        });
        viewModel.cargarDatos(getIntent());

    }
    private int getCoverFor(Libro l) {
        String t = l.getTitle().toLowerCase();
        if (t.contains("comunidad del anillo")) return R.drawable.lotr1;
        if (t.contains("dos torres")) return R.drawable.lotr2;
        if (t.contains("retorno del rey")) return R.drawable.lotr3;
        if (t.contains("hobbit")) return R.drawable.hobbit;
        if (t.contains("piedra filosofal")) return R.drawable.hp1;
        if (t.contains("cámara secreta")) return R.drawable.hp2;
        if (t.contains("prisionero de azkaban")) return R.drawable.hp3;
        if (t.contains("cáliz de fuego")) return R.drawable.hp4;
        if (t.contains("orden del fénix")) return R.drawable.hp5;
        if (t.contains("misterio del príncipe")) return R.drawable.hp6;
        if (t.contains("reliquias de la muerte")) return R.drawable.hp7;
        if (t.contains("juego de tronos")) return R.drawable.got1;
        if (t.contains("choque de reyes")) return R.drawable.got2;
        if (t.contains("tormenta de espadas")) return R.drawable.got3;
        if (t.contains("festín de cuervos")) return R.drawable.got4;
        if (t.contains("danza de dragones")) return R.drawable.got5;
        if (t.equals("it")) return R.drawable.it;
        if (t.contains("resplandor")) return R.drawable.resplandor;
        if (t.contains("carrie")) return R.drawable.carrie;
        if (t.contains("misery")) return R.drawable.misery;
        if (t.contains("cementerio de animales")) return R.drawable.cementerio;
        if (t.contains("pistolero")) return R.drawable.pistolero;
        return R.drawable.cover_default;
    }

}