package com.example.tpo2.ViewModel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.example.tpo2.Model.Libro;

import java.util.ArrayList;
import java.util.List;

public class MainViewModel extends AndroidViewModel {
    private MutableLiveData<String> mutableMensaje;
    private MutableLiveData<Libro> mutableLibro;
    private final List<Libro> repositorio = new ArrayList<>();
    public MainViewModel(@NonNull Application application) {
        super(application);
        cargarRepositorio();
    }
    private void cargarRepositorio() {
        repositorio.clear();
        repositorio.add(new Libro("El señor de los anillos", "J. R. R. Tolkien", 1954, 1216, "Una épica de fantasía clásica."));
        repositorio.add(new Libro("Cien años de soledad", "Gabriel García Márquez", 1967, 496, "Realismo mágico en Macondo."));
        repositorio.add(new Libro("Rayuela", "Julio Cortázar", 1963, 736, "Novela experimental argentina."));
        repositorio.add(new Libro("Ficciones", "Jorge Luis Borges", 1944, 224, "Colección de cuentos filosóficos."));
        repositorio.add(new Libro("1984", "George Orwell", 1949, 328, "Distopía sobre vigilancia y poder."));
    }
    public LiveData<String> getMutableMensaje(){
        if (mutableMensaje == null){
            mutableMensaje = new MutableLiveData<>();
        }
        return mutableMensaje;
    }
    public LiveData<Libro> getMutableLibro(){
        if(mutableLibro == null){
            mutableLibro = new MutableLiveData<>();
            }
        return mutableLibro;
    }
    public void buscar(String titulo) {
        if (titulo == null || titulo.trim().isEmpty()) {
            if (mutableMensaje != null) mutableMensaje.setValue("Ingresá un título.");
            if (mutableLibro != null) mutableLibro.setValue(null);
            return;
        }
        String q = titulo.trim().toLowerCase();

        for (Libro l : repositorio) {
            if (l.getTitle() != null && l.getTitle().toLowerCase().contains(q)) {
                if (mutableLibro != null) mutableLibro.setValue(l);
                if (mutableMensaje != null) mutableMensaje.setValue(null);
                return;
            }
        }
        if (mutableMensaje != null) mutableMensaje.setValue("No se encontró: " + titulo);
        if (mutableLibro != null) mutableLibro.setValue(null);
    }
}
