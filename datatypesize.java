import java.lang.*;
//javap java.lang.Float
class datatypesize
{
    public static void main(String arg[])
    {
        System.out.println("Minimum "+Integer.MIN_VALUE);
        System.out.println("Maximum "+Integer.MAX_VALUE);
        System.out.println("Bytes "+Integer.BYTES);

        System.out.println("Minimum "+Byte.MIN_VALUE);
        System.out.println("Maximum "+Byte.MAX_VALUE);
        System.out.println("Bytes "+Byte.BYTES);

        System.out.println("Minimum "+Short.MIN_VALUE);
        System.out.println("Maximum "+Short.MAX_VALUE);
        System.out.println("Bytes "+Short.BYTES);
    }
}