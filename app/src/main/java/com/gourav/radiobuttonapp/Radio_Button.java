package com.gourav.radiobuttonapp;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Radio_Button extends AppCompatActivity {

    RadioGroup radioGroup;
    @BindView(R.id.button3)
    Button button3;
    @BindView(R.id.radiono)
    EditText radiono;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio);
        ButterKnife.bind(this);

        radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
        radioGroup.clearCheck();

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for (int row = 0; row < 1; row++) {
                    //RadioGroup radioGroup=(RadioGroup)findViewById(R.id.radiogroup);
                    RadioGroup ll = new RadioGroup(Radio_Button.this);
                    ll.setOrientation(LinearLayout.VERTICAL);

                    for (int i = 1; i <=Integer.parseInt(radiono.getText().toString()); i++) {
                        RadioButton rdbtn = new RadioButton(Radio_Button.this);
                        rdbtn.setId((row * 2) + i);
                        rdbtn.setText("Radio " + rdbtn.getId());
                    //    radioGroup.addView(rdbtn);
                        ll.addView(rdbtn);
                    }
                    ((ViewGroup) findViewById(R.id.radiogroup)).addView(ll);
                }

            }
        });
        int b=radioGroup.getCheckedRadioButtonId();


        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @SuppressLint("ResourceType")
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton rb = (RadioButton) group.findViewById(checkedId);
                rb.setText("gaurav");
                if (null != rb && checkedId > -1) {
                    Toast.makeText(Radio_Button.this, rb.getText(), Toast.LENGTH_SHORT).show();
                }

            }
        });
    }

    public void onSubmit(View v) {
        RadioButton rb = (RadioButton) radioGroup.findViewById(radioGroup.getCheckedRadioButtonId());
        Toast.makeText(Radio_Button.this, rb.getText(), Toast.LENGTH_SHORT).show();
    }

    public void onClear(View v) {
        /* Clears all selected radio buttons to default */
        radioGroup.clearCheck();
    }

    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.radio_pirates:
                if (checked)
                    // Pirates are the best
                    break;
            case R.id.radio_ninjas:
                if (checked)
                    // Ninjas rule
                    break;
        }
    }
}
