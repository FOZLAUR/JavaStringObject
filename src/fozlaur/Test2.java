package fozlaur;

public class Test2 implements Cloneable {
    public int a;
    public int b;
    public Test c = new Test();

    public Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }
}
