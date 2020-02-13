package id.ac.polinema.androidlifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SimpleActivity extends AppCompatActivity {

    private EditText nameInput;
    private TextView output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple);

        nameInput   = findViewById(R.id.input_name);
        output = findViewById(R.id.text_output);
    }

    public void handleSubmit(View view) {
        String inputUser = nameInput.getText().toString();
        output.setText(inputUser);
    }
}
