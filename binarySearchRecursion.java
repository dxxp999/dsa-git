import java.util.Scanner;
public class binarySearchRecursion {
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr= new int[]{2,45,56,90,99};
        for (int i = 0; i < 5; i++) {
            System.out.print(arr[i]+" ");
        }
//        int target = 90;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the target :");
        int target=in.nextInt();
        System.out.println("the element was found in : "+ search(arr,target,0,arr.length-1));
    }
    static int search(int[] arr, int t, int s, int e){
        if(s>e)
            return -1;
        int m=s+(e-s)/2;
        if (arr[m]==t){
            return m+1;
        }
        if(t<arr[m]){
            return search(arr,t,s,m-1);

        }
        else{
            return search(arr,t,m+1,e);
        }

    }

}
