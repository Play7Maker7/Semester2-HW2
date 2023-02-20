public class Q2 {
    public static int[] backUp(int[] a)
    {
        int[] backupArray = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            backupArray[i] = a[i];
        }
        return backupArray;
    }
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        int[] backedUp = backUp(array);

        System.out.println("array backup: ");
        for (int j : backedUp) {
            System.out.println(j);
        }

    }
}
