package idadedecachorro.lssdeveloper.com.idadedecachorro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText infoDeEntrada;
    private Button btnIdade;
    private TextView resultadoIdade;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        infoDeEntrada = (EditText) findViewById(R.id.txtEntrada);
        btnIdade = (Button) findViewById(R.id.btnIdadeId);
        resultadoIdade = (TextView) findViewById(R.id.resultado);

        btnIdade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int suaIdadeHumana = 1;
                //recuperar o que foi digitado
                String textoDigitado = infoDeEntrada.getText().toString();
                String msg = "";
                if(textoDigitado.isEmpty()){
                    //String vazia mensagem de erro
                    msg = "Informe um número para calcular";
                    resultadoIdade.setText(msg);
                }else{
                    int numDigitado = Integer.parseInt(textoDigitado);
                    suaIdadeHumana = numDigitado * 7;
                    msg = "A idade do cachorro comparada a idade humana é: ";
                    resultadoIdade.setText(msg + suaIdadeHumana);
                }


            }
        });

    }
}
