package manitsche.projeto.aulacheckbox;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private CheckBox checkBoxVerde, checkBoxAzul, checkBoxVermelho;
    private TextView textoResultado;
    private RadioButton radioButtonMasculino, radioButtonFeminino, radioButtonNaoInformar;
    private RadioGroup radioGroupSexo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        checkBoxVerde = findViewById(R.id.checkBoxVerde);
        checkBoxAzul = findViewById(R.id.checkBoxAzul);
        checkBoxVermelho = findViewById(R.id.checkBoxVermelho);
        textoResultado = findViewById(R.id.textoResultado);
        radioButtonMasculino = findViewById(R.id.radioButtonMasculino);
        radioButtonFeminino = findViewById(R.id.radioButtonFeminino);
        radioButtonNaoInformar = findViewById(R.id.radioButtonNaoInformar);
        radioGroupSexo = findViewById(R.id.radioGroupSexo);

        radiobuttonListener();
    }

    public void enviar(View view) {
        checkbox();
        // radiobutton();
    }

    @SuppressLint("SetTextI18n")
    public void radiobutton() {
        if (radioButtonMasculino.isChecked()) {
            textoResultado.setText("Masculino");
        }
        if (radioButtonFeminino.isChecked()) {
            textoResultado.setText("Feminino");
        }
        if (radioButtonNaoInformar.isChecked()) {
            textoResultado.setText("Sexo não informado");
        }
    }

    public void radiobuttonListener() {
        radioGroupSexo.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.radioButtonMasculino) {
                    textoResultado.setText("Masculino");
                }
                if (checkedId == R.id.radioButtonFeminino) {
                    textoResultado.setText("Feminino");
                }
                if (checkedId == R.id.radioButtonNaoInformar) {
                    textoResultado.setText("Sexo Não informado");
                }
            }
        });
    }

    @SuppressLint("SetTextI18n")
    public void checkbox() {
        String texto = "";

        if (checkBoxVerde.isChecked()) {
            texto = "Verde selecionado";
        }
        if (checkBoxAzul.isChecked()) {
            texto = "Azul selecionado";
        }
        if (checkBoxVermelho.isChecked()) {
            texto = "Vermelho selecionado";
        }

        textoResultado.setText(texto);
    }
}