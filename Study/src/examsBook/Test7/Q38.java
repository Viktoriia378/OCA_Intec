package examsBook.Test7;

public class Q38 {
        int i1;
        static int i2;
        public void method1(){
            int i;
            //this.i2 = i; we have to add value for local variable
            i = this.i1; //As i1 is an instance variable, it is accessible through 'this'.
            i = this.i2; //Although 'this' is not needed to access i2, it is not an error to do so.
            //this.i we can not use it bcs i is local variable
            this.i1 = i2;
            this.i2 = i1;
}}
