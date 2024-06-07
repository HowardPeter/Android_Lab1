package android.example.mydemo1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class ActivityLab1Bai4 extends AppCompatActivity {
    EditText edtNum1, edtNum2;
    Button btnUoc;
    TextView tvUocChung;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab1_bai4);

        addControl();
        addEvent();
    }
    void addControl()
    {
        edtNum1 = (EditText) findViewById(R.id.edtNum1);
        edtNum2 = (EditText) findViewById(R.id.edtNum2);
        btnUoc = (Button) findViewById(R.id.btnUocChung);
        tvUocChung = (TextView) findViewById(R.id.tvUocChung);
    }
    void addEvent()
    {
        btnUoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = Integer.parseInt(edtNum1.getText().toString());
                int b = Integer.parseInt(edtNum2.getText().toString());
                ArrayList<Integer> results = new ArrayList<>();
                int min = (a < b) ? a : b;
                for (int i = 1; i <= min; i++) {
                    if(min % i == 0){
                        results.add(i);
                    }
                }
                tvUocChung.setText(String.valueOf(results));
            }
        });
    }
}