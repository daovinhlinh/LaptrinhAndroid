package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

        private EditText display;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        display = findViewById(R.id.result);
        display.setShowSoftInputOnFocus(false);
    }

    private void updateText(String strToAdd) {
        String oldStr = display.getText().toString();
        int cursorPos = display.getSelectionStart();
        String leftStr  = oldStr.substring(0,cursorPos);
        String rightStr = oldStr.substring(cursorPos);
        display.setText(String.format("%s%s%s", leftStr, strToAdd,rightStr));
        display.setSelection(cursorPos + 1);
        display.setCursorVisible(false);
    }

    public void zeroBtn(View view) {
        updateText("0");
    }
    public void oneBtn(View view) {
        updateText("1");
    }
    public void twoBtn(View view) {
        updateText("2");
    }
    public void threeBtn(View view) {
        updateText("3");
    }
    public void fourBtn(View view) {
        updateText("4");
    } public void fiveBtn(View view) {
        updateText("5");
    }
    public void sixBtn(View view) {
        updateText("6");
    }
    public void sevenBtn(View view) {
        updateText("7");
    }
    public void eightBtn(View view) {
        updateText("8");
    }
    public void nineBtn(View view) {
        updateText("9");
    }
    public void plusBtn(View view) {
        updateText("+");
    }
    public void minusBtn(View view) {
        updateText("-");
    }
    public void multiplyBtn(View view) {
        updateText("x");
    }
    public void divideBtn(View view) {
        updateText("/");
    }
    public void clearBtn(View view) {
        display.setText("");
    }
    public void squareBtn(View view) {
        updateText("²");
    }
    public void squareRootBtn(View view) {
        updateText("√");
    }
    public void plusMinusBtn(View view) {
        updateText("-");
    }
    public void decimalBtn(View view) {
        updateText(".");
    }
    public void fractionBtn(View view) {
        updateText("1/");
        int cursorPos = display.getSelectionStart();
        display.setSelection(cursorPos + 1);
    }
    public void percentBtn(View view) {
        updateText("%");
    }
    public void backspaceBtn(View view) {
        int cursorPos = display.getSelectionStart();
        int textLen = display.getText().length();
        if (cursorPos != 0 && textLen != 0) {
            SpannableStringBuilder selection = (SpannableStringBuilder) display.getText();
            selection.replace(cursorPos - 1, cursorPos, "");
            display.setText(selection);
            display.setSelection(cursorPos - 1);
        }
    }
    public void equalBtn(View view) {
        updateText("±");
    }

}