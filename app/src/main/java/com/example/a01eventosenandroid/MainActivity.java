package com.example.a01eventosenandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText caja1;
    private EditText caja2;
    private EditText resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.caja1 = (EditText) findViewById(R.id.caja1);
        this.caja2 = (EditText) findViewById(R.id.caja2);
        this.resultado = (EditText) findViewById(R.id.resultado);
    }


    public void sumarNumeros(View view)
    {
        int num1 = Integer.parseInt(this.caja1.getText().toString());
        int num2 = Integer.parseInt(this.caja2.getText().toString());
        int suma = num1 + num2;
        this.resultado.setText(Integer.toString(suma));

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
