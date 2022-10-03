

sealed class A permits B{
    void print(){
        System.out.println("A");
    }
}
final class  B extends  A{
    @Override
    void print(){
        System.out.println("B");
    }


};
public class Question12{

    public static void main(String[] args) {

        B obj = new B();
        obj.print();

    }
}
