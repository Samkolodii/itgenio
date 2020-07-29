public class It {
    public static void main(String[] args) {
        int a;
        int[] numbs = new int[]{23, 45, 56, 74, 5, 67, 65, 77};
        for (int i = 1; i < numbs.length; i++){
            if(i %2 == 0){
                a = numbs[i];
                numbs[i] = numbs[i - 1];
                numbs[i -1] = a;


            }
        }
        for (int i = 1; i < numbs.length; i++)
        System.out.println(numbs[i]);
    }
}