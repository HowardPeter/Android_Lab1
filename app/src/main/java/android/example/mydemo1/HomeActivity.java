package android.example.mydemo1;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {
    Button btnDemo, btnBai1, btnBai2, btnBai3, btnBai4, btnBai5, btnBai6, btnBai7, btnBai8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        addControl();
        addEvent();
    }
    void addControl()
    {
        btnDemo = (Button) findViewById(R.id.btnDemo);
        btnBai1 = (Button) findViewById(R.id.btnBai1);
        btnBai2 = (Button) findViewById(R.id.btnBai2);
        btnBai3 = (Button) findViewById(R.id.btnBai3);
        btnBai4 = (Button) findViewById(R.id.btnBai4);
        btnBai5 = (Button) findViewById(R.id.btnBai5);
        btnBai6 = (Button) findViewById(R.id.btnBai6);
        btnBai7 = (Button) findViewById(R.id.btnBai7);
        btnBai8 = (Button) findViewById(R.id.btnBai8);
    }

    private void setButtonClickListener(Button button, final Class<? extends Activity> targetActivity)
    {
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this, targetActivity);
                startActivity(intent);
            }
        });
    }

    void addEvent()
    {
        setButtonClickListener(btnDemo,MainActivity.class);
        setButtonClickListener(btnBai1, ActivityLab1Bai1.class);
        setButtonClickListener(btnBai2, ActivityLab1Bai2.class);
        setButtonClickListener(btnBai3, ActivityLab1Bai3.class);
        setButtonClickListener(btnBai4, ActivityLab1Bai4.class);
        setButtonClickListener(btnBai5, ActivityLab1Bai5.class);
        setButtonClickListener(btnBai6, ActivityLab1Bai6.class);
        setButtonClickListener(btnBai7, ActivityLab1Bai7.class);
        setButtonClickListener(btnBai8, ActivityLab1Bai8.class);
    }
}