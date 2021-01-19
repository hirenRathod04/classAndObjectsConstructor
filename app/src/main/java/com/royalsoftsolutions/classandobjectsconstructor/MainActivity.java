package com.royalsoftsolutions.classandobjectsconstructor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main );


        student std4 = new student ();//default constructor
        std4.student_roll_number = 4;
        std4.student_name = "hiren";
        std4.student_Std_class = 6;
        std4.getClass ();

        student std5 = new student (982480000);//paramiterized
        // constructor
        std5.student_roll_number = 1;
        std5.student_name = "hiren";
        std5.student_Std_class = 6;
        String string_std5 = std5.student_name.getClass ().toString ().trim ();

        Toast.makeText ( MainActivity.this,
                "std 5     " +string_std5, Toast.LENGTH_LONG ).show ();


        dog A  = new dog (55);
        A.bark (10);//paramitarized constructor
        A.run ();//Default Constructor

        dog B =  new dog (45);
        /*Toast.makeText ( MainActivity.this,"hello",
                Toast.LENGTH_SHORT ).show ();*/


    }
}