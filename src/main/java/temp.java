import java.util.Arrays;

public class temp {
    public static void main(String[] args) {


//        String myName = "domanokz";
//        System.out.println(myName);
//        System.out.println("---------------");
//        String newName = myName.substring(0,4)+'x'+myName.substring(2);
//        System.out.println(newName);

//        String s = "abc";
//        String x = "";
//        x = x + s.charAt(2);
//        System.out.println(x);

                            //    |
        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80};
        System.out.println("WAS: " + Arrays.toString(arr));
        int ind_del = 3;
        int[] result = new int[arr.length - 1];

        System.arraycopy(arr, 4, arr, 3,arr.length - ind_del - 1);
        System.out.println("NOW: " + Arrays.toString(arr));







    }
}
