package ru.goncharova.intentsource;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private final static String TEXT = "EXPRESSION";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button runEcho = (Button)findViewById(R.id.button);
        EditText text = (EditText)findViewById(R.id.editTextTextPersonName);

        runEcho.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Uri uri = Uri.parse("mycalculator://intent");
                Intent runEchoIntent = new Intent(Intent.ACTION_VIEW, uri);
                runEchoIntent.putExtra(TEXT, text.getText().toString());
                startActivity(runEchoIntent);
            }
        });


    }
}