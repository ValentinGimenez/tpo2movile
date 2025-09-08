package com.example.tpo2.ViewModel;

import android.app.Application;
import android.content.Intent;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.example.tpo2.Model.Libro;

public class LibroViewModel extends AndroidViewModel {

    private MutableLiveData<Libro> mutableLibro;

    public LibroViewModel(@NonNull Application application) {
        super(application);
    }
    public LiveData<Libro> getMutableLibro(){
        if(mutableLibro == null){
            mutableLibro = new MutableLiveData<>();
        }
        return mutableLibro;
    }
    public void cargarDatos(Intent intent){
        Libro l =(Libro) intent.getSerializableExtra("libro");

        if(l != null){
            mutableLibro.setValue(l);
        }

    }
}
