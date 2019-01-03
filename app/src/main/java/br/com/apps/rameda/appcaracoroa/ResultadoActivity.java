package br.com.apps.rameda.appcaracoroa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class ResultadoActivity extends AppCompatActivity {
    private Button btt_voltar;
    private ImageView iv_moeda;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);
        iv_moeda = findViewById(R.id.iv_moeda);
        btt_voltar = findViewById(R.id.btt_voltar);
        Bundle recebeNumero =getIntent().getExtras();
        int numero = recebeNumero.getInt("numero");
        if (numero==0){
            iv_moeda.setImageResource(R.drawable.moeda_cara);
        }else{
            iv_moeda.setImageResource(R.drawable.moeda_coroa);
        }
        btt_voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
}
