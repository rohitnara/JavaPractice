import java.util.ArrayList;
import java.util.List;

public class Sol {
    public static void swap(List<Integer> l)
    {
       l.add(4);
    }

    public static void change(List<Integer> l)
    {
        l.add(3);
    }

    public static void set(List<Integer> l)
    {
        l.set(1,8);
    }

    public static void remove(List<Integer> l)
    {
        l.remove(2);
    }

    public static void main(String[] args)
    {
        List<Integer> l = new ArrayList<>();
        l.add(1);
        l.add(2);
        change(l);
        System.out.println(l);
        swap(l);
        System.out.println(l);
        set(l);
        System.out.println(l);
        remove(l);
        System.out.println(l);
    }
}
