package com.mohamedsobhy.movies_mvvm.view.main;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.mohamedsobhy.movies_mvvm.R;
import com.mohamedsobhy.movies_mvvm.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    MovieViewModel movieViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = DataBindingUtil.setContentView(this , R.layout.activity_main);

        movieViewModel = new ViewModelProvider(this).get(MovieViewModel.class);
        binding.setViewModel(movieViewModel);
        binding.setLifecycleOwner(this);

    }


}