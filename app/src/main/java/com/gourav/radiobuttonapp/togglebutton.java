package com.gourav.radiobuttonapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Toast;
import android.widget.ToggleButton;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class togglebutton extends AppCompatActivity {

    @BindView(R.id.simpleToggleButton)
    ToggleButton simpleToggleButton;
    @BindView(R.id.simpleToggleButton1)
    ToggleButton simpleToggleButton1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_togglebutton);
        ButterKnife.bind(this);
        Boolean ToggleButtonState = simpleToggleButton.isChecked(); // check current state of a toggle button (true or false).

        simpleToggleButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Toast.makeText(togglebutton.this, String.valueOf(isChecked), Toast.LENGTH_SHORT).show();
            }
        });

    }

    @OnClick({R.id.simpleToggleButton, R.id.simpleToggleButton1})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.simpleToggleButton:
                if(simpleToggleButton.isChecked())
                {
                    Toast.makeText(this, simpleToggleButton.getText()+"is checked", Toast.LENGTH_SHORT).show();
                }

                break;
            case R.id.simpleToggleButton1:
                break;
        }
    }
}
