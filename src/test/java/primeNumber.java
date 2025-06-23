public class primeNumber {
    public static void main(String[] args) {
        int num=67;
        boolean isprime= true;
        if (num>=1){
            for (int i=2;i<=num/2; i++ ){
                if (num%i==0){
                   isprime= false;
                    break;
                }
            }
            if (isprime){
                System.out.println(num + " is a prime number");
            } else {
                System.out.println(num + " is not a prime number");
            }
        }
    }
}
