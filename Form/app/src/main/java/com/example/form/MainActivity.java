package com.example.form;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText editName, editStudentID, editDOB, editAddress, editPhone, editEmail, editGender;
    CheckBox checkBoxSport, checkBoxTravel, checkBoxMusic, termAgree;
    Button buttonContinue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editName = findViewById(R.id.editName);
        editStudentID = findViewById(R.id.editStudentID);
        editDOB = findViewById(R.id.editDOB);
        editAddress = findViewById(R.id.editAddress);
        editPhone = findViewById(R.id.editPhone);
        editEmail = findViewById(R.id.editEmailAddress);
        editGender = findViewById(R.id.editGender);

        checkBoxTravel = findViewById(R.id.checkBoxTravel);
        checkBoxMusic = findViewById(R.id.checkBoxMusic);
        checkBoxSport = findViewById(R.id.checkBoxSport);

        termAgree = findViewById(R.id.termAgree);
        buttonContinue = findViewById(R.id.buttonContinue);

        termAgree.setOnCheckedChangeListener(((compoundButton, b) -> {
            String name = editName.getText().toString();
            String studentID = editStudentID.getText().toString();
            String dob = editDOB.getText().toString();
            String gender = editGender.getText().toString();
            String phone = editPhone.getText().toString();

            if (termAgree.isChecked() && name.length() != 0 || studentID.length() != 0
                    || dob.length() != 0|| phone.length() != 0
                    || gender.length() != 0) {
                    buttonContinue.setClickable(true);
                    buttonContinue.setBackgroundColor(Color.BLUE);
                } else {
                    buttonContinue.setClickable(false);
                    buttonContinue.setBackgroundColor(Color.GRAY);
                }
        }));

        buttonContinue.setOnClickListener(v -> {
            String name = editName.getText().toString();
            String studentID = editStudentID.getText().toString();
            String dob = editDOB.getText().toString();
            String gender = editGender.getText().toString();
            String phone = editPhone.getText().toString();


            if (name.length() == 0 || studentID.length() == 0
                    || dob.length() == 0 || phone.length() == 0
                    || gender.length() == 0) {
                Toast.makeText(this, "Please fill out all required fields", Toast.LENGTH_SHORT).show();
            }
        });

    }
}