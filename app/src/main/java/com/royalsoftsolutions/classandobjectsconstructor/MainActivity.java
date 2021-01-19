package com.royalsoftsolutions.classandobjectsconstructor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
TextView textView;
EditText editText;
Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main );
        editText = findViewById ( R.id.edittext1 );
        button= findViewById ( R.id.btn ) ;


        student std4 = new student ();//default constructor
        std4.student_roll_number = 4;
        std4.student_name = "hiren";
        std4.student_Std_class = 6;
        std4.getClass ();
        button.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick(View v) {
                work();
            }
        } );


        //paramiterized
        // constructor




        dog A  = new dog (55);
        A.bark (10);//paramitarized constructor
        A.run ();//Default Constructor

        dog B =  new dog (45);
        /*Toast.makeText ( MainActivity.this,"hello",
                Toast.LENGTH_SHORT ).show ();*/


    }
    private void work(){
        String editTextstring = editText.getText ().toString ().trim () ;
        student std5 = new student (editTextstring,10,5,9825444);
        String mobile =String.valueOf(std5.mobile_Number) ;
        String name =String.valueOf(std5.student_name) ;
        String roll =String.valueOf(std5.student_roll_number) ;
        String Class =String.valueOf(std5.student_Std_class) ;
        Toast.makeText ( MainActivity.this,
                "Name : "  + name  , Toast.LENGTH_LONG ).show ();
        Toast.makeText ( MainActivity.this,
                "Roll Number : "  +  roll  ,
                Toast.LENGTH_LONG ).show ();
        Toast.makeText ( MainActivity.this,
                "Class : "  + Class, Toast.LENGTH_LONG ).show ();
        Toast.makeText ( MainActivity.this,
                "Mobile Number : "  +  mobile ,
                Toast.LENGTH_LONG ).show ();

    }
}