package com.rattanaporn.screpe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private TextView fruitt;
    private TextView summe;
    int sumbat = 0;

    ArrayList<String> selection = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fruitt = (TextView)findViewById(R.id.fruitt);
        fruitt.setEnabled(false);

        summe = (TextView)findViewById(R.id.summ);
        summe.setEnabled(false);


    }


    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.radio_batter:
                if (checked) {
                    sumbat = 20;
                }
                break;
            case R.id.radio_whip:
                if (checked){
                    sumbat = 35;
                }
                break;

        }
    }


    public void onCheckboxClicked(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();
        // Check which checkbox was clicked
        switch(view.getId()) {
            case R.id.checkbox_f1:
                if (checked)
                    selection.add("Strawberry");
                else
                    selection.remove("Strawberry");
                break;
            case R.id.checkbox_f2:
                if (checked)
                    selection.add("Bluebeery");
                else
                    selection.remove("Bluebeery");
                break;
            case R.id.checkbox_f3:
                if (checked)
                    selection.add("Kiwi");
                else
                    selection.remove("Kiwi");
                break;
            case R.id.checkbox_f4:
                if (checked)
                    selection.add("Orange");
                else
                    selection.remove("Orange");
                break;
            case R.id.checkbox_f5:
                if (checked)
                    selection.add("Banana");
                else
                    selection.remove("Banana");
                break;


            case R.id.checkbox_s1:
                if (checked)
                    selection.add("Nutella");
                else
                    selection.remove("Nutella");
                break;
            case R.id.checkbox_s2:
                if (checked)
                    selection.add("Chocolate");
                else
                    selection.remove("Chocolate");
                break;
            case R.id.checkbox_s3:
                if (checked)
                    selection.add("Caramel");
                else
                    selection.remove("Caramel");
                break;
            case R.id.checkbox_s4:
                if (checked)
                    selection.add("Honey");
                else
                    selection.remove("Honey");
                break;
            case R.id.checkbox_s5:
                if (checked)
                    selection.add("Red bean");
                else
                    selection.remove("Red bean");
                break;


            case R.id.checkbox_t1:
                if (checked)
                    selection.add("Almonds");
                else
                    selection.remove("Almonds");
                break;
            case R.id.checkbox_t2:
                if (checked)
                    selection.add("Marshmallow");
                else
                    selection.remove("Marshmallow");
                break;
            case R.id.checkbox_t3:
                if (checked)
                    selection.add("Ceseal");
                else
                    selection.remove("Ceseal");
                break;
            case R.id.checkbox_t4:
                if (checked)
                    selection.add("Oreo");
                else
                    selection.remove("Oreo");
                break;
            case R.id.checkbox_t5:
                if (checked)
                    selection.add("Walnuts");
                else
                    selection.remove("Walnuts");
                break;


            case R.id.checkbox_i1:
                if (checked)
                    selection.add("Vanilla");
                else
                    selection.remove("Vanilla");
                break;
            case R.id.checkbox_i2:
                if (checked)
                    selection.add("Choco");
                else
                    selection.remove("Choco");
                break;
            case R.id.checkbox_i3:
                if (checked)
                    selection.add("Cookie and Cream");
                else
                    selection.remove("Cookie and Cream");
                break;
            case R.id.checkbox_i4:
                if (checked)
                    selection.add("Strawberry");
                else
                    selection.remove("Strawberry");
                break;
            case R.id.checkbox_i5:
                if (checked)
                    selection.add("Matcha");
                else
                    selection.remove("Matcha");
                break;

        }

    }

    public void finalClicked(View view){
        String final_fruitt = "";
        int sumf = 0;
        int summ = 0;

        for (String Selections: selection){
            final_fruitt = final_fruitt + Selections +", ";
            sumf = sumf + 15;
        }
            summ = sumf + sumbat;
        String names = fruitt.getText().toString();
        fruitt.setText("\n Your crepe >> "+ " " + final_fruitt );
        fruitt.setEnabled(true);

        summe.setText(summ + "฿" );
        summe.setEnabled(true);

    }



}








