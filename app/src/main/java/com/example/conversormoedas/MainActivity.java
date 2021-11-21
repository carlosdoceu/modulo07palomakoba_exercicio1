package com.example.conversormoedas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
//Conversor de Reais para Dollar

    private EditText editReal;
    private Button btnConverter;
    private TextView textDollar;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editReal = findViewById(R.id.edit_Real);
        btnConverter = findViewById(R.id.btn_Converter);
        textDollar = findViewById(R.id.text_Dolar);




        btnConverter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double Real = Double.parseDouble(editReal.getText().toString());
                double Dollar = Real/5.61;
                DecimalFormat df = new DecimalFormat("0.00");
                textDollar.setText("valor em dolares: \n"+df.format(Dollar));
            }
        });




    }
}