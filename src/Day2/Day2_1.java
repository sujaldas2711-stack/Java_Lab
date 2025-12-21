package Day2;
public class Day2_1 {
    public static void main(String[] args){
        if (args.length != 10){
            System.out.println("Please enter exactly 10 numbers");
        }
        int even = 0;
        int odd = 0;
        for (int i = 0; i< args.length; i++){
            int num = Integer.parseInt(args[i]);
            if ( num % 2 == 0){
                even++;
            }
            else{
                odd++;
            }
        }
        System.out.println("No. of even numbers: "+ even);
        System.out.println("No. of odd numbers: "+ odd);
    }
}