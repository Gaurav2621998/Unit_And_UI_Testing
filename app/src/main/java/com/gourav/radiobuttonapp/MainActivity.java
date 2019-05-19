package com.gourav.radiobuttonapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.radio)
    Button radio;
    @BindView(R.id.checkbox)
    Button checkbox;
    @BindView(R.id.toggleButton)
    Button toggleButton;
    @BindView(R.id.spinner)
    Button spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

    }

    @OnClick({R.id.radio, R.id.checkbox, R.id.toggleButton, R.id.spinner})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.radio:
                startActivity(new Intent(this,Radio_Button.class));
                break;
            case R.id.checkbox:
                startActivity(new Intent(this,checkbox.class));

                break;
            case R.id.toggleButton:
                startActivity(new Intent(this,togglebutton.class));

                break;
            case R.id.spinner:
                startActivity(new Intent(this,spinner.class));
                break;
        }
    }
}
