package com.royalsoftsolutions.classandobjectsconstructor;

public class student {

    int student_roll_number;
     String student_name;
     int student_Std_class;
     int mobile_Number;

    public student () {

    }

    public student (String student_name,
                    int student_roll_number,
                    int student_Std_class,int Mobile_number) {
        this.student_name = student_name;
        this.student_roll_number = student_roll_number;
        this.student_Std_class = student_Std_class;
        this.mobile_Number=Mobile_number;



    }

   /* void bark (int number_of_times){
        int  xx; //local variable
    }

    void barkss (int number_of_times){
        int  xx; //local variable
    }
*/


}
