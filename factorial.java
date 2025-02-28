import java.util.*;
class factorial{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);

        System.out.println("Enter Number: ");
        int n=s.nextInt();
        int j=0;
        for(int i=1;i<n;i++){
            j=i*i-1;
        }
        System.out.println(j);

    }
}