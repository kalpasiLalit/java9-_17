interface Calculation{
   //we can use private method in interface to restrict it to override from it's child classes
    // and also for defining the common functionalities between methods of inteface.
    private static float div(float  a, float b){
        return a/b;
    }

    static void calc(float a,float b){
        System.out.println(div(a,b));

    }

}

public class Question1 {
    public static void main(String[] args) {
        Calculation.calc(12.0f,3.0f);
    }

}