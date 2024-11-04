package Package1;

public class LocalVariable {
    int x;
    float y;
    char c;
    String name;
    boolean value;

    public void method1()
    {
        System.out.println("Print Instance 1 values which are initialised locally with default values from public variables");
        int x1=x;
        float y1=y;
        char c1=c;
        String name1=name;
        boolean value1 = value;
        System.out.println(x1);
        System.out.println(y1);
        System.out.println(c1);
        System.out.println(name1);
        System.out.println(value1);
        System.out.println();
    }

    public void method2()
    {
        System.out.println("Print Instance 2 values which are initialised with values into local variables");
        int x2=100;
        float y2=123.45f;
        char c2='c';
        String name2="Da QA Guy";
        boolean value2 = true;
        System.out.println(x2);
        System.out.println(y2);
        System.out.println(c2);
        System.out.println(name2);
        System.out.println(value2);
    }
    public static void main(String[] args) {
        System.out.println();
        LocalVariable lv1 = new LocalVariable();
        lv1.method1(); /* Prints default values of the variables */
        lv1.method2(); /* Prints locally initialised values of the variables */

    }
}
