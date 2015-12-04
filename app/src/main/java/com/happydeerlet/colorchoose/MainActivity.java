package com.happydeerlet.colorchoose;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener {
    private RadioGroup colorChoose;
    private ColorChooseRadioButton colorChoose1;
    private ColorChooseRadioButton colorChoose2;
    private ColorChooseRadioButton colorChoose3;
    private ColorChooseRadioButton colorChoose4;
    private ColorChooseRadioButton colorChoose5;
    private ColorChooseRadioButton colorChoose6;
    private ColorChooseRadioButton colorChoose7;
    private ColorChooseRadioButton colorChoose8;

    private TextView content;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
    }

    private void init() {
        colorChoose = (RadioGroup) this.findViewById(R.id.rg_color_choose);
        colorChoose1 = (ColorChooseRadioButton) this.findViewById(R.id.ccrb_color_choose_1);
        colorChoose2 = (ColorChooseRadioButton) this.findViewById(R.id.ccrb_color_choose_2);
        colorChoose3 = (ColorChooseRadioButton) this.findViewById(R.id.ccrb_color_choose_3);
        colorChoose4 = (ColorChooseRadioButton) this.findViewById(R.id.ccrb_color_choose_4);
        colorChoose5 = (ColorChooseRadioButton) this.findViewById(R.id.ccrb_color_choose_5);
        colorChoose6 = (ColorChooseRadioButton) this.findViewById(R.id.ccrb_color_choose_6);
        colorChoose7 = (ColorChooseRadioButton) this.findViewById(R.id.ccrb_color_choose_7);
        colorChoose8 = (ColorChooseRadioButton) this.findViewById(R.id.ccrb_color_choose_8);

        content = (TextView) this.findViewById(R.id.tv_content);

        colorChoose.setOnCheckedChangeListener(this);
        colorChoose1.setChecked(true);
        content.setTextColor(colorChoose1.getColorChooseCenterColor());
    }

    @Override
    public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {
        int colorChoosed;
        switch (checkedId) {
            case R.id.ccrb_color_choose_1:
                colorChoosed = colorChoose1.getColorChooseCenterColor();
                break;
            case R.id.ccrb_color_choose_2:
                colorChoosed = colorChoose2.getColorChooseCenterColor();
                break;
            case R.id.ccrb_color_choose_3:
                colorChoosed = colorChoose3.getColorChooseCenterColor();
                break;
            case R.id.ccrb_color_choose_4:
                colorChoosed = colorChoose4.getColorChooseCenterColor();
                break;
            case R.id.ccrb_color_choose_5:
                colorChoosed = colorChoose5.getColorChooseCenterColor();
                break;
            case R.id.ccrb_color_choose_6:
                colorChoosed = colorChoose6.getColorChooseCenterColor();
                break;
            case R.id.ccrb_color_choose_7:
                colorChoosed = colorChoose7.getColorChooseCenterColor();
                break;
            case R.id.ccrb_color_choose_8:
                colorChoosed = colorChoose8.getColorChooseCenterColor();
                break;

            default:
                colorChoosed = colorChoose1.getColorChooseCenterColor();
                break;
        }
        content.setTextColor(colorChoosed);
    }

}
