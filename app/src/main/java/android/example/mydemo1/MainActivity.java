package android.example.mydemo1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText edtNumA, edtNumB;
    Button btnResult;
    TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addControl();
        addEvent();
    }
    void addControl()
    {
        edtNumA = (EditText) findViewById(R.id.edtNumA);
        edtNumB = (EditText) findViewById(R.id.edtNumB);
        btnResult = (Button) findViewById(R.id.btnCalulate);
        tvResult = (TextView) findViewById((R.id.tvResult));
    }
    void addEvent()
    {
        btnResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = Integer.parseInt(edtNumA.getText().toString());
                int b = Integer.parseInt(edtNumB.getText().toString());
                int c = a+b;
                tvResult.setText(String.valueOf(c));
            }
        });
    }
}