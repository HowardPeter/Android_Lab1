package android.example.mydemo1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ActivityLab1Bai7 extends AppCompatActivity {
    EditText edtDecimal;
    Button btnBinary, btnHexa;
    TextView tvResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab1_bai7);
        addControl();
        addEvent();
    }
    void addControl()
    {
        edtDecimal = (EditText) findViewById(R.id.edtDecimal);
        btnBinary = (Button) findViewById(R.id.btnBinary);
        btnHexa = (Button) findViewById(R.id.btnHexa);
        tvResult = (TextView) findViewById(R.id.tvBinaryorHexa);
    }
    void addEvent()
    {
        btnBinary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num = Integer.parseInt(edtDecimal.getText().toString());
                String binaryString = Integer.toBinaryString(num);
                tvResult.setText(binaryString);
            }
        });
    }
}