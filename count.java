import java.util.*;

public class count {
    public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    int arr[]={10,20,10,40,20,20,10};   
    int target=scan.nextInt();
    int count=0;
    for(int i:arr) {
      if(i==target) {
        count++;
      }
    }
    System.out.println(count);
    }
}