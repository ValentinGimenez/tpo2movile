package com.example.tpo2;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.lifecycle.ViewModelProvider;

import com.example.tpo2.ViewModel.MainViewModel;
import com.example.tpo2.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    private MainViewModel viewModel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        viewModel = new ViewModelProvider(this).get(MainViewModel.class);
        EdgeToEdge.enable(this);
        setContentView(binding.getRoot());
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        //Observadores
        viewModel.getMutableMensaje().observe(this,mensaje ->{
            if(mensaje != null){
                binding.txMensaje.setText(mensaje);
            }
        });
        viewModel.getMutableLibro().observe(this, libro->{
            if(libro != null){
                Intent intent = new Intent(this, DetailsActivity.class);
                intent.putExtra("libro",libro);
                startActivity(intent);
            }
        });
        //Listener
        binding.btnBuscar.setOnClickListener(v ->{
            viewModel.buscar(binding.etTitulo.getText().toString());
        });
    }
}