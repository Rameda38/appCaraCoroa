package br.com.apps.rameda.appcaracoroa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private Button btt_jogar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btt_jogar = (Button)findViewById(R.id.btt_jogar);
        btt_jogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent chamaResultado = new Intent(getApplication(),ResultadoActivity.class);
                int numero = new Random().nextInt(2);
                chamaResultado.putExtra("numero",numero );


                startActivity(chamaResultado);

            }
        });


    }
}
