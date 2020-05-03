package com.example.taskapp;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.taskapp.ui.gallery.GalleryViewModel;

public class FormActivity extends AppCompatActivity {

    private GalleryViewModel editTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);
    }
    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }

    public void save(View view) {
        String title = editTitle.getText().toString().trim();
        Fragment editDescription = null;
        Intent intent = new Intent();
        setResult(RESULT_OK, intent);
        finish();
    }
}
