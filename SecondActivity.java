package id.ac.id.telkomuniversity.tass.praktikactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView tampilHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        tampilHasil = findViewById(R.id.hasilPindah);

        Bundle bundle = getIntent().getExtras();
        String muncul  = bundle.getString("input");

        tampilHasil.setText(String.valueOf(muncul));
    }
}