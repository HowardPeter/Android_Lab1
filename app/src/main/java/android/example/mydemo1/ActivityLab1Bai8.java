package android.example.mydemo1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ActivityLab1Bai8 extends AppCompatActivity {
    EditText edtC, edtF;
    Button btnToC, btnToF, btnClear;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab1_bai8);
        addControl();
        addEvent();
    }
    void addControl()
    {
        edtC = (EditText) findViewById(R.id.edtCelcius);
        edtF = (EditText) findViewById(R.id.edtFahrenheit);
        btnToC = (Button) findViewById(R.id.btnToC);
        btnToF = (Button) findViewById(R.id.btnToF);
        btnClear = (Button) findViewById(R.id.btnClear);
    }

    double cToF(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    double fToC(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
    void addEvent()
    {
        btnToC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!edtC.toString().isEmpty())
                {
                    double fahrenheit = Integer.parseInt(edtF.getText().toString());
                    edtC.setText(String.valueOf(fToC(fahrenheit)));
                }else
                {
                    Toast.makeText(getApplicationContext(), "Empty fahrenheit value!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnToF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!edtF.toString().isEmpty())
                {
                    double celcius = Integer.parseInt(edtC.getText().toString());
                    edtF.setText(String.valueOf(cToF(celcius)));
                }else
                {
                    Toast.makeText(getApplicationContext(), "Empty celsius value!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtC.setText("");
                edtF.setText("");
            }
        });
    }
}