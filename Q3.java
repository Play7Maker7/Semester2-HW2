import java.util.Random;

public class Q3 {

    public static int removeRandomly(int[] x)
    {
        Random r = new Random();
        int index = r.nextInt(x.length-1);

        if (x.length!=0)
        {
            int removedElement = x[index];
            for (int i = index; i < x.length-1; i++) {
                x[i]=x[i+1];
            }
            x[x.length-1]=0;
            return removedElement;
        }
        return 0;
    }


    public static void main(String[] args) {
        int[] x = {1,2,3,4,5};
        System.out.println("Removing random elements:");
        for (int i = 0; i < x.length; i++) {
            System.out.println(removeRandomly(x));
        }
    }
}
