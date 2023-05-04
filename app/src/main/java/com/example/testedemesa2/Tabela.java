package com.example.testedemesa2;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Tabela extends AppCompatActivity {

    TextView va1;TextView va2;TextView va3;TextView va4;TextView va5;
    EditText digA1;EditText digA2;EditText digA3;EditText digA4;EditText digA5;
    EditText digB1;EditText digB2;EditText digB3;EditText digB4;EditText digB5;
    EditText digC1;EditText digC2;EditText digC3;EditText digC4;EditText digC5;

    Button botConfirmar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tabela);

        //Toast t1 = Toast.makeText(getBaseContext(), "Você Acertou",Toast.LENGTH_LONG);
        //Toast t2 = Toast.makeText(getBaseContext(), "tente novamente outro número",Toast.LENGTH_LONG);
        va1 = findViewById(R.id.linha1);  // instancio
        va2 = findViewById(R.id.linha2);
        va3 = findViewById(R.id.linha3);
        va4 = findViewById(R.id.linha4);
        va5 = findViewById(R.id.linha5);
        digA1 = findViewById(R.id.cxA1);digA2 = findViewById(R.id.cxA2);digA3 = findViewById(R.id.cxA3);
        digA4 = findViewById(R.id.cxA4);digA5 = findViewById(R.id.cxA5);
        digB1 = findViewById(R.id.cxB1);digB2 = findViewById(R.id.cxB2);digB3 = findViewById(R.id.cxB3);
        digB4 = findViewById(R.id.cxB4);digB5 = findViewById(R.id.cxB5);
        digC1 = findViewById(R.id.cxC1);digC2 = findViewById(R.id.cxC2);digC3 = findViewById(R.id.cxC3);
        digC4 = findViewById(R.id.cxC4);digC5 = findViewById(R.id.cxC5);

        botConfirmar = findViewById(R.id.botConfirmar);

        botConfirmar.setOnClickListener(new View.OnClickListener() {
            @SuppressLint({"ResourceType", "SetTextI18n"})
            @Override
            public void onClick(View view) {

                String b9 = "3";
                String x1 = digA1.getText().toString();  //transforma em inteiro
                String b1 = "3";
                String x2 = digB2.getText().toString();  //transforma em inteiro
                String b2 = "27";
                String x3 = digC3.getText().toString();  //transforma em inteiro
                String b3 = "10";
                String x4 = digA4.getText().toString();  //transforma em inteiro
                String b4 = "1";
                String x5 = digC5.getText().toString();  //transforma em inteiro
                String b5 = "17";


                ArrayList<Colunas> linha = new ArrayList<Colunas>();

                String dig1 = "3";
                String dig2 = "5";
                String dig3 = "9";
                String dig4 = "12";
                String dig5 = "15";
                Colunas linha0 =  new Colunas("3","-","-");
                Colunas linha1 =  new Colunas("3","27","-");
                Colunas linha2 =  new Colunas("3","27","10");
                Colunas linha3 =  new Colunas("1","27","10");
                Colunas linha4 =  new Colunas("1","27","17");

                linha.add(linha0);
                linha.add(linha1);
                linha.add(linha2);
                linha.add(linha3);
                linha.add(linha4);

               // for (int i = 0; i<=linha.size();i++) {
                    //String bb = linha.get(i).getC();


                if(!x2.equalsIgnoreCase( linha.get(1).getB())) {
                    digB2.setText("");  //apaga
                    //Toast.makeText(getBaseContext(), "Tente novamente 1", Toast.LENGTH_LONG).show();
                    //break;

                } else {
                    digC3.requestFocus();
                    digA2.setText("3");
                    digC2.setText("-");
                    va3.setText(">> C =  B/A+1");
                    //System.out.println("linha 1 não -> " );
                    //Toast.makeText(getBaseContext(), "Você Acertou 1", Toast.LENGTH_LONG).show();

                }

                if(!x3.equalsIgnoreCase( linha.get(2).getC())) {
                    digC3.setText("");  //apaga
                    //Toast.makeText(getBaseContext(), "Tente novamente 1", Toast.LENGTH_LONG).show();
                    //break;

                } else {
                    digA4.requestFocus();
                    digA3.setText("3");
                    digB3.setText("27");
                    va4.setText(">> A =  A - 2");
                    //System.out.println("linha 1 não -> " );
                    //Toast.makeText(getBaseContext(), "Você Acertou 1", Toast.LENGTH_LONG).show();

                }

                if(!x4.equalsIgnoreCase( linha.get(3).getA())) {
                    digA4.setText("");  //apaga
                    //Toast.makeText(getBaseContext(), "Tente novamente 1", Toast.LENGTH_LONG).show();
                    //break;

                } else {
                    digC5.requestFocus();
                    digB4.setText("27");
                    digC4.setText("10");
                    //System.out.println("linha 1 não -> " );
                    //Toast.makeText(getBaseContext(), "Você Acertou 1", Toast.LENGTH_LONG).show();
                    va5.setText(">> C =  B - C");
                }

                if(!x5.equalsIgnoreCase( linha.get(4).getC())) {
                    digC5.setText("");  //apaga
                    //Toast.makeText(getBaseContext(), "Tente novamente 1", Toast.LENGTH_LONG).show();
                    //break;

                } else {
                    //System.out.println("linha 1 não -> " );
                    //Toast.makeText(getBaseContext(), "Você Acertou 1", Toast.LENGTH_LONG).show();
                    digA5.setText("1");
                    digB5.setText("27");
                    va2.setText(">> B =  3 ** 3");
                }


               // }

                //Colunas linha0 =  new Colunas("1","2","3");
                // linhas.add(linha0);
                // Scanner leitor = new Scanner(System.in);
                //linhas.add(linhas.get(0).getC());
                //String bb = (linha.get(0).getC());
                //digA1.requestFocus(); // cursor
                //       caixa A1
                //x1 = leitor.nextLine();
                //if(linha.get(0).getC().contains(x1)){
                //if(b9.equals(b1)) {
               // if(x1.equals(linhas)) {
                    //t1.show();
                  //  Toast.makeText(getBaseContext(), "Tente novamente 1",Toast.LENGTH_LONG).show();
                    // digA1.setText("");  //apaga
                    //digB1.setText(linha.get(0).getC());
                    //digC1.setText("");
                    //x1 = leitor.nextLine();

              //  }else{
                   // Toast.makeText(getBaseContext(), "Você Acertou 1",Toast.LENGTH_LONG).show();
                    // digB2.requestFocus();
                    // digB1.setText("-");
                    // digC1.setText("-");
                 //   va2.setText(">> B =  3 ** 3");
               // }

            }
        });

    }
    private void IniciarComponentes() {

        botConfirmar = findViewById(R.id.botConfirmar);
    }

}