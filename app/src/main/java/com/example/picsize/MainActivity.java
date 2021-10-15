package com.example.picsize;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;

import com.example.picsize.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.onehundred.setOnClickListener(this::one);
        binding.twohundred.setOnClickListener(this::two);
        binding.threehundred.setOnClickListener(this::three);
    }
    private void one(View v){
        binding.onehundred.setEnabled(true);

        v.setEnabled(false);

        ViewGroup.LayoutParams param = (ConstraintLayout.LayoutParams) binding.picture.getLayoutParams();
        param.height= dp2pixel(100);
        binding.picture.setLayoutParams(param);
    }
    private void two(View v){
        binding.twohundred.setEnabled(true);
        v.setEnabled(false);
        ViewGroup.LayoutParams param = (ConstraintLayout.LayoutParams) binding.picture.getLayoutParams();
        param.height= dp2pixel(200);
        binding.picture.setLayoutParams(param);
    }
    private void three(View v){
        binding.threehundred.setEnabled(true);
        v.setEnabled(false);
        ViewGroup.LayoutParams param = (ConstraintLayout.LayoutParams) binding.picture.getLayoutParams();
        param.height= dp2pixel(300);
        binding.picture.setLayoutParams(param);
    }
    private int dp2pixel(float dp){
        return (int) (dp * getResources().getDisplayMetrics().density);
    }
}