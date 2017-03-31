package br.edu.alertdialog.alertdialog;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class principal extends AppCompatActivity {

    private AlertDialog alert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        AlertDialog.Builder builder = new AlertDialog.Builder(this);

        builder.setTitle("Exemplo de Diálogo de Alerta!!");

        builder.setMessage("Escolha uma opção!!");

        builder.setPositiveButton("Sim", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getApplicationContext(),"Clicou Sim!!",Toast.LENGTH_SHORT).show();
            }
        });

        builder.setNegativeButton("Não", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getApplicationContext(),"Clicou Não!!",Toast.LENGTH_SHORT).show();
            }
        });

        alert = builder.create();

        alert.show();

    }
}
