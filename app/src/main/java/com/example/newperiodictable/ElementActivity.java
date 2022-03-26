package com.example.newperiodictable;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
public class ElementActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_element);

        EditText description;
        description = (EditText)findViewById(R.id.editTextDescription);
        description.setFocusable(false);

        Intent getIntent = getIntent();
        String input=getIntent.getStringExtra("string_name");
        description.setText(getIntent.getStringExtra("string_name"));


            description.setText("Category: Non-metals\n" +
                    "Valency: 1\n" +
                    "Atomic Number: 1\n" +
                    "Atomic Mass: 1\n" +
                    "Electronic Configuration: 1s^1\n" +
                    "Discoverer: Henry Cavendish\n" +
                    "Hydrogen: Lightest element in the periodic table. It is the most abundant chemical substance in the universe, constituting roughly 75% of all baryonic mass.\n");


    }

    public void GoToHome(View view) {
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}