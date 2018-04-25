class TestEx1 {
    public static void test(String s)
    {
        System.out.println("In String");
        //System.out.println(s);
    }
    public static void test(Object o) {
        System.out.println("In Object");
        //System.out.println(o);
    }

    public static void main(String args[]) {
        test(null);//null is a reference type
    }
}
//output 
//In String