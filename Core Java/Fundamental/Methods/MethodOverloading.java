package Methods;

public class MethodOverloading {
    public static void main(String[] args) {
       add(10, 30);
    }

    //add - 1
    public static int add(int a, float b)
    {
        int s = a+b;
        return s;
    }

    //add - 2
    public static int add(int x, int y)
    {
        int s = x-y;
       return s;
        //return (x+y);
    }
}
