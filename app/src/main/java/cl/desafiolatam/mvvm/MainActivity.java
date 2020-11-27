package cl.desafiolatam.mvvm;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.view.View;

import cl.desafiolatam.mvvm.databinding.ActivityMainBinding;
import cl.desafiolatam.mvvm.model.Generator;
import cl.desafiolatam.mvvm.viewmodel.MyViewModel;

public class MainActivity extends AppCompatActivity {

    private MyViewModel myViewModel;
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        myViewModel  = new ViewModelProvider(this).get(MyViewModel .class);

        binding.btnGenerator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myViewModel.passwordGenerate();
            }
        });

        myViewModel.mldPassword.observe(this, new Observer<String>() {
            @Override
            public void onChanged(String s) {
                binding.tvResultado.setText(s);
            }
        });

    }
}