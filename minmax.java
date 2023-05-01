import java.util.*;
public class minmax{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter length of array\t");
            int n = sc.nextInt();
            int a[] = new int[n];
            for(int i = 0; i <n;i++){
                System.out.print("\rEnter the "+(i+1)+" element\t");
                a[i] = sc.nextInt();
            }
            int max = a[0],min = a[0];
            for(int  i =0; i < n;i++){
                
                if(max < a[i]){
                    max = a[i];
                }
                
                else if(min > a[i]){
                    min = a[i];
                }
            }    
            System.out.println("\nMax = "+max+" Min = "+min);
        }
        }       
    }
