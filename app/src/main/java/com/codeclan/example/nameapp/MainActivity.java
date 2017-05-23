package com.codeclan.example.nameapp;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText inputEditText;
    private Button submitButton;
    private TextView analysisContent;
    private CounterProvider counterProvider;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inputEditText = (EditText)findViewById(R.id.input_text);
        submitButton = (Button)findViewById(R.id.submit_button);
        analysisContent = (TextView)findViewById(R.id.analysis_content);

    }

    public void onSubmitButtonClicked(View button) {

        // for this to interact you need to include it in the button
        Log.d(getClass().toString(), "Shake button was clicked");
        // needs to be a to string //get text get passed


        // THIS IS THE INPUT THAT GETS PASSED INTO COUNTER PROVIDER
        String input = inputEditText.getText().toString();
        Log.d(getClass().toString(), "The input was: " + input);
        CounterProvider counterProvider = new CounterProvider(input);
        String output = counterProvider.countsWords();

        analysisContent.setText(output);


    }

}
