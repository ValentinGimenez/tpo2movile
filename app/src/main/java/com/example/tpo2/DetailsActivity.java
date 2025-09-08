package com.example.tpo2;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.lifecycle.ViewModelProvider;
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
            setTitle(libro.getTitle());
            binding.tvTitle.setText(libro.getTitle());
            binding.tvAuthor.setText(libro.getAuthor());
            binding.tvYear.setText(String.valueOf(libro.getYear()));
            binding.tvPages.setText(String.valueOf(libro.getPages())); // sin texto fijo
            binding.tvDescription.setText(libro.getDescription());
        });
        viewModel.cargarDatos(getIntent());

    }
}