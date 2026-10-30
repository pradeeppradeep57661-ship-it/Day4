import java.util.*;
public class Main {
    public static void main(String[] args){
    int arr[]={1,3,5,7,11,13};
    boolean check=true;
    for(int i=1;i<arr.length;i++){
      if(arr[i-1]>arr[i]) {
        check=false;
        break;
      }
    System.out.println(check);
    }
    }
}