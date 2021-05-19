package sg.edu.rp.c346.id20022678.demodatapassingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class FourthActivity extends AppCompatActivity {

    TextView tvAnswer3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);

        tvAnswer3 = findViewById(R.id.textView3);
        Intent intentReveived = getIntent();
        double value = intentReveived.getDoubleExtra("value", 0);
        tvAnswer3.setText("Double value received is: " + value);
    }
}