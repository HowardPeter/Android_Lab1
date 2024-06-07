package android.example.mydemo1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ActivityLab1Bai5 extends AppCompatActivity {
    EditText edtSoA, edtSoB;
    Button btnGiaiPT1;
    TextView tvKqPT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab1_bai5);
    }
    void addControl()
    {
        edtSoA = (EditText) findViewById(R.id.edtSoA);
        edtSoB = (EditText) findViewById(R.id.edtSoB);
        btnGiaiPT1 = (Button) findViewById(R.id.btnGiaiPT1);
        tvKqPT = (TextView) findViewById(R.id.tvKqPT);
    }
    void addEvent()
    {
        btnGiaiPT1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = Integer.parseInt(edtSoA.getText().toString());
                int b = Integer.parseInt(edtSoB.getText().toString());
                int c = -b/a;
                String kq = "x = " + c;
                tvKqPT.setText(kq);
            }
        });
    }
}