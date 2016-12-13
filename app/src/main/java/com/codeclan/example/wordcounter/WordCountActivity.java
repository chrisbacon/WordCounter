package com.codeclan.example.wordcounter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class WordCountActivity extends AppCompatActivity {

    EditText inputText;
    TextView outputText;
    Button button;
    WordCounter wordCounter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word_count);

        inputText = (EditText)findViewById(R.id.input_text);
        button = (Button)findViewById(R.id.button);
        outputText = (TextView)findViewById(R.id.output_text);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = inputText.getText().toString();

                wordCounter = new WordCounter(text);

                int total = wordCounter.countWords();
                String wordCounts = wordCounter.wordCounts();
                String output = "Total words: " + total + "\nWord Counts " + wordCounts;
                outputText.setText(output);

            }
        });
    }
}
