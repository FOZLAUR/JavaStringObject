package fozlaur;

public class Test3 implements Cloneable {
    public int a;
    public int b;
    public Test c = new Test();

    public Object clone() throws CloneNotSupportedException
    {
        // Assign the shallow copy to new reference variable t
        Test3 t = (Test3)super.clone();

        t.c = new Test();

        // Create a new object for the field c
        // and assign it to shallow copy obtained,
        // to make it a deep copy
        return t;
    }
}
