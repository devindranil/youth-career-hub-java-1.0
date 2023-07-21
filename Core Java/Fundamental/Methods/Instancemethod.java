package Methods;

public class Instancemethod {
    public static void main(String[] args) {
       int a,b,sum;
       Instancemethod obj = new Instancemethod();
       a=10;
       b=20;
       System.out.println(obj.add(a,b));

    }

    public int add(int x, int y){
        return (x+y);
    }
}
