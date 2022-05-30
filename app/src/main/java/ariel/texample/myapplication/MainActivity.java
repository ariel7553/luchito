package ariel.texample.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button calcular;
    private EditText n1;
    private EditText    n2;
    private TextView Resultado, resultadoScroll;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        calcular = findViewById(R.id.buttonCalcular);
        n1 = findViewById(R.id.editTextNumber1);
        n2 = findViewById(R.id.editTextNumber2);
        resultadoScroll = findViewById(R.id.textViewResultadoScroll);

    }
    String cadena1, cadena2,aux,aux2,aux3,r;
    long result;

    public void onClicSumar(View view ){
        aux="";
        aux2="";
        aux3="-";
        cadena1 = n1.getText().toString();
        cadena2=n2.getText().toString();
        for (int i=0;i<cadena1.length();i++){
            aux+= cadena1.charAt(i);

        }
        for (int j=0;j<cadena2.length();j++){
            aux2+=  cadena2.charAt(j);
        }
        if (cadena1.length() > cadena2.length() ||cadena1.length() == cadena2.length()){
            for (int k=0;k<=cadena1.length();k++){
                aux3+=  "-";
            }
        }else {
            for (int l=0;l<=cadena2.length();l++){
                aux3+=  "-";
            }
        }
        result = Long.valueOf(aux) + Long.valueOf(aux2);
        r =String.valueOf(result);
        resultadoScroll.setText(aux+"\n\r"+"+\n\r"+aux2+"\n\r"+aux3+"\n\r"+r);
    }


    public void onClicRestar(View view ){
        aux="";
        aux2="";
        aux3="-";
        cadena1 = n1.getText().toString();
        cadena2=n2.getText().toString();
        for (int i=0;i<cadena1.length();i++){
            aux+= cadena1.charAt(i);
        }
        for (int j=0;j<cadena2.length();j++){
            aux2+=  cadena2.charAt(j);

        }
        if (cadena1.length() > cadena2.length() ||cadena1.length() == cadena2.length()){
            for (int k=0;k<=cadena1.length();k++){
                aux3+=  "-";
            }}else {
            for (int l=0;l<=cadena2.length();l++){
                aux3+=  "-";
            }
        }
        result = Long.valueOf(aux) - Long.valueOf(aux2);
        r =String.valueOf(result);
        resultadoScroll.setText(aux+"\n\r"+"-\n\r"+aux2+"\n\r"+aux3+"\n\r"+r);
    }

    public void Finalizar(View view){
        finish();
    }



}