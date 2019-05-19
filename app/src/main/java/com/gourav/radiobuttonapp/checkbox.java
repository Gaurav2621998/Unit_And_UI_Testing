package com.gourav.radiobuttonapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class checkbox extends AppCompatActivity {

    @BindView(R.id.check1)
    CheckBox check1;
    @BindView(R.id.check2)
    CheckBox check2;
    @BindView(R.id.check3)
    CheckBox check3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkbox);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.check1, R.id.check2, R.id.check3})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.check1:
                if(check1.isChecked())
                {
                    Toast.makeText(this, check1.getText().toString(), Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.check2:
                if(check1.isChecked())
                {
                    Toast.makeText(this, check1.getText().toString(), Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.check3:
                if(check1.isChecked())
                {
                    check1.setText("gaurav");
                    Toast.makeText(this, check1.getText().toString(), Toast.LENGTH_SHORT).show();
                }
                break;
        }
    }
}
