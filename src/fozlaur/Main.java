package fozlaur;

public class Main {
    public static void main(String[] args) {
        //Object Common methods
        System.out.println("COMMON OBJECT METHODS");
        Test t1 = new Test(1,2);
        Test t2 = new Test(1,2);
        System.out.println("equals() and hashCode()");
        System.out.println("Test t1 hashcode: "+t1.hashCode());
        System.out.println("Test t2 hashcode: "+t2.hashCode());
        System.out.println("Test t1 and t2 equality: "+t1.equals(t2));
        System.out.println();

        System.out.println("getClass()");
        System.out.println("Class of t1: "+t1.getClass());
        System.out.println("Class of t2: "+t2.getClass());
        System.out.println();

        System.out.println("toString()");
        System.out.println("Class of t1: "+t1.toString());
        System.out.println("Class of t2: "+t2.toString());
        System.out.println();

        System.out.println("clone() - Shallow Copy");
        Test2 t3 = new Test2();
        t3.a = 100;
        t3.b = 100;
        t3.c.x = 200;
        t3.c.y = 200;
        Test2 t4 = null;

        try
        {
            //Creating a clone of t2 and assigning it to t3
            t4 = (Test2) t3.clone();
            System.out.println("Contents of t3 before edits: ");
            System.out.println(t3.a + " "+t3.b + " "+t3.c.x + " "+t3.c.y);
            System.out.println("Contents of t4 before edits: ");
            System.out.println(t4.a + " "+t4.b + " "+t4.c.x + " "+t4.c.y);
            t4.a = 1000;
            t4.c.x = 2000;
            System.out.println("Contents of t3 after edits: ");
            System.out.println(t3.a + " "+t3.b + " "+t3.c.x + " "+t3.c.y);
            System.out.println("Contents of t4 after edits: ");
            System.out.println(t4.a + " "+t4.b + " "+t4.c.x + " "+t4.c.y);
        }
        catch (CloneNotSupportedException e)
        {
            e.printStackTrace();
        }
        System.out.println();

        System.out.println("clone() - Deep Copy");
        Test3 t5 = new Test3();
        t5.a = 100;
        t5.b = 100;
        t5.c.x = 200;
        t5.c.y = 200;
        Test3 t6 = null;

        try
        {
            //Creating a clone of t2 and assigning it to t3
            t6 = (Test3) t5.clone();
            System.out.println("Contents of t5 before edits: ");
            System.out.println(t5.a + " "+t5.b + " "+t5.c.x + " "+t5.c.y);
            System.out.println("Contents of t6 before edits: ");
            System.out.println(t6.a + " "+t6.b + " "+t6.c.x + " "+t6.c.y);
            t6.a = 1000;
            t6.c.x = 2000;
            System.out.println("Contents of t5 after edits: ");
            System.out.println(t5.a + " "+t5.b + " "+t5.c.x + " "+t5.c.y);
            System.out.println("Contents of t6 after edits: ");
            System.out.println(t6.a + " "+t6.b + " "+t6.c.x + " "+t6.c.y);
        }
        catch (CloneNotSupportedException e)
        {
            e.printStackTrace();
        }
        System.out.println();

        //String Common methods
        System.out.println("COMMON STRING METHODS");
        String s1 = "Hello";
        String s2 = "there";

        //compareTo
        System.out.println("String s1: "+s1);
        System.out.println("String s2: "+s2);
        System.out.println("compareTo()");
        System.out.println("s1 compared to s2: "+s1.compareTo(s2));
        System.out.println("s1 compared to Hello: "+s1.compareTo("Hello") + "\n");

        //concat
        System.out.println("concat()");
        String s3 = "";
        s3 = s1.concat(" ").concat(s2);
        System.out.println("s1 and s2 concatenated as String s3: "+s3+"\n");

        //equals
        System.out.println("equals()");
        String s4 = "General";
        String s5 = "Kenobi";
        System.out.println("String s4: "+s4);
        System.out.println("String s5: "+s5);
        System.out.println("If s4 and s5 are equal: "+s4.equals(s5));
        System.out.println("If s4 and \"General\" are equal: "+s4.equals("General") + "\n");

        //equalsIgnoreCase()
        System.out.println("equalsIgnoreCase()");
        System.out.println("If s4 and s5 are equal (case ignored): "+s4.equalsIgnoreCase(s5));
        System.out.println("If s4 and \"general\" are equal (case ignored): "+s4.equalsIgnoreCase("general") + "\n");

        //join
        System.out.println("join()");
        String s6 = String.join(" ",s1,s2,s4,s5);
        System.out.println("Join s1,s2,s4,s5 as String s6: "+s6+"\n");

        //split
        System.out.println("split()");
        String sArr1[] = s6.split(" ");
        System.out.println("s6 split with delimiter \" \" as sArr1");
        for (int i=0; i<sArr1.length; i++){
            System.out.println("Element #"+(i+1)+" of split array sArr1: "+sArr1[i]);
        }
        System.out.println("");
        String sArr2[] = s6.split(" ",3);
        System.out.println("s6 split with delimiter \" \" and limit of 3 as sArr2");
        for (int i=0; i<sArr2.length; i++){
            System.out.println("Element #"+(i+1)+" of split array sArr1: "+sArr2[i]);
        }
        System.out.println("");

        //trim
        String s7 = "     "+s6+"     ";
        System.out.println("trim()");
        System.out.println("s6 with leading and trailing whitespace as String s7: \""+s7+"\"");
        s7 = s7.trim();
        System.out.println("s7 trimmed of leading and trailing whitespace: \""+s7+"\"");
        System.out.println();

        //hashCode
        System.out.println("hashCode()");
        System.out.println("s5 hashcode: "+s5.hashCode()+"\ns6 hashcode: "+s6.hashCode()+"\ns7 hashcode: "+s7.hashCode());
        System.out.println();

        //isEmpty
        String s8 = "";
        String s9 = "full";
        System.out.println("String s8: \""+s8+"\"");
        System.out.println("String s9: "+s9);
        System.out.println("isEmpty()");
        System.out.println("s8 is empty: "+s8.isEmpty());
        System.out.println("s9 is empty: "+s9.isEmpty());
    }
}
