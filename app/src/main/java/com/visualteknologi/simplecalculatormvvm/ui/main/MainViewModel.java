package com.visualteknologi.simplecalculatormvvm.ui.main;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

import com.visualteknologi.simplecalculatormvvm.model.Hasil;

import javax.xml.transform.dom.DOMLocator;

public class MainViewModel extends ViewModel {
    // TODO: Implement the ViewModel
    public LiveData<Hasil> tambah(String angka1, String angka2){
        MutableLiveData data = new MutableLiveData();
        Double a1 = Double.parseDouble(angka1);
        Double a2 = Double.parseDouble(angka2);

        Double hasilHitung = a1 + a2;
        Hasil hasil = new Hasil();
        hasil.setHasilTambah(hasilHitung.toString());
        data.setValue(hasil);

        return data;
    }

    public LiveData<Hasil> kurang(String angka1, String angka2){
        MutableLiveData data = new MutableLiveData();
        Double a1 = Double.parseDouble(angka1);
        Double a2 = Double.parseDouble(angka2);

        Double hasilHitung = a1 - a2;
        Hasil hasil = new Hasil();
        hasil.setHasilKurang(hasilHitung.toString());
        data.setValue(hasil);

        return data;
    }

    public LiveData<Hasil> kali(String angka1, String angka2){
        MutableLiveData data = new MutableLiveData();
        Double a1 = Double.parseDouble(angka1);
        Double a2 = Double.parseDouble(angka2);

        Double hasilHitung = a1 * a2;
        Hasil hasil = new Hasil();
        hasil.setHasilKali(hasilHitung.toString());
        data.setValue(hasil);

        return data;
    }

    public LiveData<Hasil> bagi(String angka1, String angka2){
        MutableLiveData data = new MutableLiveData();
        Double a1 = Double.parseDouble(angka1);
        Double a2 = Double.parseDouble(angka2);

        Double hasilHitung = a1 / a2;
        Hasil hasil = new Hasil();
        hasil.setHasilBagi(hasilHitung.toString());
        data.setValue(hasil);

        return data;
    }
}
