public class main {
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,10,15,69,420};
        System.out.println(sumUp(arr));
    }
    static int sumUp(int[]array){
        int sum = 0;
        for (int num: array){
            sum += num;
        }
        return sum;
    }
}
