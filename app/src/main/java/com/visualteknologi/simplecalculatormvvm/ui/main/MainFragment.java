package com.visualteknologi.simplecalculatormvvm.ui.main;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.visualteknologi.simplecalculatormvvm.R;
import com.visualteknologi.simplecalculatormvvm.model.Hasil;

public class MainFragment extends Fragment {

    private MainViewModel mViewModel;
    EditText etAngka1, etAngka2;
    Button btnTambah, btnKurang, btnKali, btnBagi;

    public static MainFragment newInstance() {
        return new MainFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.main_fragment, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        mViewModel = ViewModelProviders.of(this).get(MainViewModel.class);
        // TODO: Use the ViewModel

        btnTambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String stringAngka1, stringAngka2;
                stringAngka1 = etAngka1.getText().toString();
                stringAngka2 = etAngka2.getText().toString();

                if (TextUtils.isEmpty(stringAngka1)) {
                    etAngka1.setError("Angka 1 tidak boleh kosong");
                    etAngka1.requestFocus();
                } else if (TextUtils.isEmpty(stringAngka2)) {
                    etAngka2.setError("Angka 2 tidak boleh kosong");
                    etAngka2.requestFocus();
                } else {
                    mViewModel.tambah(stringAngka1, stringAngka2).observe(getActivity(), new Observer<Hasil>() {
                        @Override
                        public void onChanged(@Nullable Hasil hasil) {
                            Toast.makeText(getContext(), hasil.getHasilTambah(), Toast.LENGTH_SHORT).show();
                        }
                    });
                }
            }
        });

        btnKurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String stringAngka1, stringAngka2;
                stringAngka1 = etAngka1.getText().toString();
                stringAngka2 = etAngka2.getText().toString();

                if (TextUtils.isEmpty(stringAngka1)) {
                    etAngka1.setError("Angka 1 tidak boleh kosong");
                    etAngka1.requestFocus();
                } else if (TextUtils.isEmpty(stringAngka2)) {
                    etAngka2.setError("Angka 2 tidak boleh kosong");
                    etAngka2.requestFocus();
                } else {
                    mViewModel.kurang(stringAngka1, stringAngka2).observe(getActivity(), new Observer<Hasil>() {
                        @Override
                        public void onChanged(@Nullable Hasil hasil) {
                            Toast.makeText(getContext(), hasil.getHasilKurang(), Toast.LENGTH_SHORT).show();
                        }
                    });
                }
            }
        });

        btnKali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String stringAngka1, stringAngka2;
                stringAngka1 = etAngka1.getText().toString();
                stringAngka2 = etAngka2.getText().toString();

                if (TextUtils.isEmpty(stringAngka1)) {
                    etAngka1.setError("Angka 1 tidak boleh kosong");
                    etAngka1.requestFocus();
                } else if (TextUtils.isEmpty(stringAngka2)) {
                    etAngka2.setError("Angka 2 tidak boleh kosong");
                    etAngka2.requestFocus();
                } else {
                    mViewModel.kali(stringAngka1, stringAngka2).observe(getActivity(), new Observer<Hasil>() {
                        @Override
                        public void onChanged(@Nullable Hasil hasil) {
                            Toast.makeText(getContext(), hasil.getHasilKali(), Toast.LENGTH_SHORT).show();
                        }
                    });
                }
            }
        });

        btnBagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String stringAngka1, stringAngka2;
                stringAngka1 = etAngka1.getText().toString();
                stringAngka2 = etAngka2.getText().toString();

                if (TextUtils.isEmpty(stringAngka1)) {
                    etAngka1.setError("Angka 1 tidak boleh kosong");
                    etAngka1.requestFocus();
                } else if (TextUtils.isEmpty(stringAngka2)) {
                    etAngka2.setError("Angka 2 tidak boleh kosong");
                    etAngka2.requestFocus();
                } else {
                    mViewModel.bagi(stringAngka1, stringAngka2).observe(getActivity(), new Observer<Hasil>() {
                        @Override
                        public void onChanged(@Nullable Hasil hasil) {
                            Toast.makeText(getContext(), hasil.getHasilBagi(), Toast.LENGTH_SHORT).show();
                        }
                    });
                }
            }
        });
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        etAngka1 = view.findViewById(R.id.etAngka1);
        etAngka2 = view.findViewById(R.id.etAngka2);

        btnTambah = view.findViewById(R.id.btnTambah);
        btnKurang = view.findViewById(R.id.btnKurang);
        btnKali = view.findViewById(R.id.btnKali);
        btnBagi = view.findViewById(R.id.btnBagi);
    }
}
