package com.aquiles.componentesbasicos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private EditText campoNome;
    private TextInputEditText campoEmail;
    private TextView textoResultado;

    private CheckBox checkVerde, checkBranco, checkVermelho;

    private RadioButton sexoMasculino, sexoFeminino;
    private RadioGroup opcaoSexo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        campoNome = findViewById(R.id.txtName);
        textoResultado = findViewById(R.id.txtResultado);
        campoEmail = findViewById(R.id.txtEmail);

        checkVerde = findViewById(R.id.checkVerde);
        checkVermelho = findViewById(R.id.checkVermelho);
        checkBranco = findViewById(R.id.checkBranco);

        sexoFeminino = findViewById(R.id.radioFeminino);
        sexoMasculino = findViewById(R.id.radioMasculino);

        opcaoSexo = findViewById(R.id.radioGroupSexo);
        radiobutton();
    }

    public void checkbox() {
        String texto = "";

        if (checkVermelho.isChecked()) {
            texto += "Vermelho selecionado ";
        }

        if (checkVerde.isChecked()) {
            texto += "Verde selecionado ";
        }

        if (checkBranco.isChecked()) {
            texto += "Branco selecionado ";
        }

        textoResultado.setText(texto);

    }

    public void radiobutton() {

        opcaoSexo.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.radioMasculino) {
                    textoResultado.setText("masculino: selecionado");
                } else {
                    textoResultado.setText("feminino: selecionado");
                }
            }
        });
//        if (sexoMasculino.isChecked()) {
//            textoResultado.setText("masculino: selecionado");
//        } else {
//            textoResultado.setText("feminino: selecionado");
//
//        }


    }

    public void enviar(View view) {
        //radiobutton();
        // checkbox();

//        String nome = campoNome.getText().toString();
//        String email = campoEmail.getText().toString();
//
//        textoResultado.setText("nome: " + nome + " email:" + email);

    }

    public void limpar(View view) {
        campoNome.setText("");
        campoEmail.setText("");
        textoResultado.setText("Resultado");
    }
}