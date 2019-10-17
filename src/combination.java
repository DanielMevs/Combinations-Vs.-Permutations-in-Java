public class combination {
    static int combine(int n, int k){
        if(k == 0){
            return 1;
        }
        else {
            return (n * combine(n - 1, k - 1))/ k;
        }
    }
    public static void main(String[] args){
        System.out.println(combine(6,2));
    }
}
