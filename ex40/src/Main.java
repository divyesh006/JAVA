public class Main {
    static int sum(int ...arr){
        int sum = 0;
        for (int elements:arr){
            sum = sum+elements;
        }
        return sum/ arr.length;
    }
    public static void main(String[] args) {
        System.out.println(sum(2,3,5));
    }
}