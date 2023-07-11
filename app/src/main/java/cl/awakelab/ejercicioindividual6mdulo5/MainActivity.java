package cl.awakelab.ejercicioindividual6mdulo5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import cl.awakelab.ejercicioindividual6mdulo5.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }

}
