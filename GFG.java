/*package whatever //do not write package name here */



interface Intref {
     void addNumWith5(int num);
     void multiplyNumWith5(int num);
}

abstract class Adapter implements Intref {
    public void addNumWith5(int num) {} ;
    public void multiplyNumWith5(int num) {} ;
}

public class GFG extends Adapter {
    @Override public void addNumWith5(int num)
    {
        // adding 5 with num
        int result = num + 5;
        System.out.println("After adding 5 with num, the required number is : " + result);
    }
    public static void main(String[] args)
    {
        GFG obj = new GFG();
        obj.addNumWith5(10);
    }
}


