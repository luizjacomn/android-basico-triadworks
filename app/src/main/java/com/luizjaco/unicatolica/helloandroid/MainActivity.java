package com.luizjaco.unicatolica.helloandroid;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static android.widget.Toast.LENGTH_SHORT;

public class MainActivity extends AppCompatActivity {
    private EditText editText;
    private Button button;
    private Button buttonLimpar;
    private TextView textView;

//    private EditText etExer10;
//    private Button buttonExer10;
//    private TextView tvExer10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = (EditText) findViewById(R.id.et);
        button = (Button) findViewById(R.id.botao);
        buttonLimpar = (Button) findViewById(R.id.botaoLimpar);
        textView = (TextView) findViewById(R.id.tv);

//        etExer10 = (EditText) findViewById(R.id.et_exercicio10);
//        buttonExer10 = (Button) findViewById(R.id.button_copiar);
//        tvExer10 = (TextView) findViewById(R.id.tv_exercicio10);
    }

    @Override
    protected void onResume() {
        super.onResume();

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(editText.getText().toString());
            }
        });

        buttonLimpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText("");
                textView.setText("");
            }
        });

//        buttonExer10.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                String texto = etExer10.getText().toString();
//                tvExer10.setText(texto);
//                AlertDialog.Builder alerta = new AlertDialog.Builder(MainActivity.this);
//                alerta.setTitle("Texto copiado!");
//                alerta.setMessage(texto);
//
//                AlertDialog dialog = alerta.create();
//                dialog.show();
//            }
//        });
    }
}
