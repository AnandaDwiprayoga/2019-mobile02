package id.ac.polinema.tebakangka;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

	//  TODO: deklarasikan variabel di sini
	private EditText etAngka;
	private Button btnTebak;
	private int randomNumber;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		// TODO: bind layout di sini
		
		etAngka = findViewById(R.id.number_input);
		btnTebak= findViewById(R.id.guess_button);
		
		initRandomNumber();
	}

	// TODO: generate angka random di sini
	private void initRandomNumber() {
	    Random random = new Random();
		//get random number
		randomNumber = random.nextInt(50) + 1;
	}

	public void handleGuess(View view) {
		if (Integer.parseInt(etAngka.getText().toString()) > randomNumber){
			Toast.makeText(this, "Tebakan anda terlalu besar!", Toast.LENGTH_SHORT).show();
		}else if (Integer.parseInt(etAngka.getText().toString()) < randomNumber){
			Toast.makeText(this, "Tebakan anda terlalu kecil!", Toast.LENGTH_SHORT).show();
		}else{
			Toast.makeText(this, "Tebakan anda benar!", Toast.LENGTH_SHORT).show();
			btnTebak.setEnabled(false);
		}
	}

	public void handleReset(View view) {
		// TODO: Reset tampilan
		initRandomNumber();
		btnTebak.setEnabled(true);
	}
}
