public class minvalue_inarray {
    public static void main(String[] args) {
        int[] a = { 11, 3, 5, 9, 2, 81, 1, };
        int min = a[0];
        for (int i = 1; i < a.length; i++) {
            if (min > a[i]) {
                min = a[i];
            }
        }
        System.out.println(min);
    }
}
