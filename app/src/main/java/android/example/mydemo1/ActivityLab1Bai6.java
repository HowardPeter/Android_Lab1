package android.example.mydemo1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ActivityLab1Bai6 extends AppCompatActivity {
    EditText edtDuongLich;
    TextView tvAmLich;
    Button btnChuyenNam;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab1_bai6);
        addControl();
        addEvent();
    }

    void addControl()
    {
        edtDuongLich = (EditText) findViewById(R.id.edtDuongLich);
        tvAmLich = (TextView) findViewById(R.id.tvAmLich);
        btnChuyenNam = (Button) findViewById(R.id.btnChuyenNam);
    }

    void addEvent()
    {
        btnChuyenNam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String[] CAN = {"Canh", "Tân", "Nhâm", "Quý", "Giáp", "Ất", "Bính", "Đinh", "Mậu", "Kỷ"};
                String[] CHI = {"Thân", "Dậu", "Tuất", "Hợi", "Tý", "Sửu", "Dần", "Mão", "Thìn", "Tỵ", "Ngọ", "Mùi"};
                int namDuong = Integer.parseInt(edtDuongLich.getText().toString());
                String can = CAN[namDuong % 10];
                String chi = CHI[namDuong % 12];
                String namAm = can + " " + chi;
                tvAmLich.setText(namAm);
            }
        });
    }
}