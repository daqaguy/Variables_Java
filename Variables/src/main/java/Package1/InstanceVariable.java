package Package1;

public class InstanceVariable
{
    public int x;
    public float y;
    char c;
    String name;
    boolean value;

    public void method()
    {
        System.out.println(x);
    }

    public static void main(String[] args)
    {
        InstanceVariable iv1 = new InstanceVariable(); /* Prints default values of the variables */
        System.out.println("Print Instance 1 values which are not initialised and has default values");
        System.out.println(iv1.x);
        System.out.println(iv1.y);
        System.out.println(iv1.c);
        System.out.println(iv1.name);
        System.out.println(iv1.value);
        System.out.println();

        System.out.println("Initiate Values to Instance 1 variables");
        iv1.x = 100;
        iv1.y = 123.45f;
        iv1.c = 'a';
        iv1.name = "Da QA Guy";
        iv1.value = true;
        System.out.println(iv1.x); /* Instance variable is initialised with a new value 100 */
        System.out.println(iv1.y);
        System.out.println(iv1.c);
        System.out.println(iv1.name);
        System.out.println(iv1.value);
        System.out.println();
        System.out.println("Print Instance 2 values which are not initialised and has default values");
        InstanceVariable iv2 = new InstanceVariable(); /* As iv2 instance is not initialised, it has default values */
        System.out.println(iv2.x);
        System.out.println(iv2.y);
        System.out.println(iv2.c);
        System.out.println(iv2.name);
        System.out.println(iv2.value);
    }
}
