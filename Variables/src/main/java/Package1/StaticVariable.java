package Package1;

public class StaticVariable {
    static int x;
    static float y;
    static char c;
    static String name;
    static boolean value;


    public static void main(String[] args)
    {
        StaticVariable sv1 = new StaticVariable(); /* Prints default values of the variables */
        System.out.println();
        System.out.println("Print Instance 1 values which are not initialised and has default values");
        System.out.println(sv1.x);
        System.out.println(sv1.y);
        System.out.println(sv1.c);
        System.out.println(sv1.name);
        System.out.println(sv1.value);
        System.out.println();

        System.out.println("Initiate Values to Instance 1 variables");
        sv1.x = 100;
        sv1.y = 123.45f;
        sv1.c = 'a';
        sv1.name = "Da QA Guy";
        sv1.value = true;

        System.out.println(sv1.x);
        System.out.println(sv1.y);
        System.out.println(sv1.c);
        System.out.println(sv1.name);
        System.out.println(sv1.value);
        System.out.println();

        System.out.println("Print Instance 2 values which are not initialised but has new values as the variable is static");
        StaticVariable sv2 = new StaticVariable(); /* Even though iv2 instance is not initialised, it gets the values are as static */
        System.out.println(sv2.x);
        System.out.println(sv2.y);
        System.out.println(sv2.c);
        System.out.println(sv2.name);
        System.out.println(sv2.value);

        StaticVariable.x = 200;
        StaticVariable.y = 567.89f;
        StaticVariable.c = 'b';
        StaticVariable.name = "Surya";
        StaticVariable.value = false;
        System.out.println();

        System.out.println("Print Instance values directly using the class name instead of having an instance");
        System.out.println(StaticVariable.x);
        System.out.println(StaticVariable.y);
        System.out.println(StaticVariable.c);
        System.out.println(StaticVariable.name);
        System.out.println(StaticVariable.value);

    }
}
