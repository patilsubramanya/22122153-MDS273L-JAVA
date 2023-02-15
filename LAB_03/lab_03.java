import java.util.*;
class lab_03{
    public static void main(String[] args){
        int condition=0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = Integer.parseInt(scan.nextLine());
        int[] a = new int[n];
        System.out.println("Enter the values of the array: ");
        for(int i=0; i<a.length;i++){
            a[i] = Integer.parseInt(scan.nextLine());
        }
        System.out.println("The entered array is: ");
        for(int j=0;j<a.length;j++){
            System.out.println(a[j]);
        }
        do{
            System.out.println("**********MENU**********");
            System.out.println("1.Mean\n2.Median\n3.Mode\n4.Exit");
            System.out.println("************************");
            System.out.println("Enter your choice: ");
            int ch =Integer.parseInt(scan.nextLine());
            switch(ch){
                case 1:
                    System.out.println("*********************");
                    System.out.println("The mean is: "+mean(a,n));
                    System.out.println("*********************");
                    break;
                case 2:
                    System.out.println("*********************");
                    System.out.println("The median is: "+median(a));
                    System.out.println("*********************");
                    break;
                case 3:
                    System.out.println("*********************");
                    System.out.println("The mode is: "+mode(a,n));
                    System.out.println("*********************");
                    break;
                case 4:
                    condition=5;
                    System.out.println("*********************");
                    System.out.println("EXITING...");
                    System.out.println("*********************");
                    break;
                default:
                    System.out.println("*********************");
                    System.out.println("Invalid Input!!");
                    System.out.println("*********************");
                    break;
            }
        }while(condition<5);
        
    }
    static float mean(int a[], float b){
        int s=0;
        float m=0;
        for(int k=0;k<a.length;k++){
            s=s+a[k];
        }
        m=s/b;
        return m;
    }
    static int median(int a[]){
        int g=0,b=0;
        g=a.length;
        b=g/2;
        return a[b];
    }
    static int mode(int a[],int n) {
        int mv = 0, mc = 0, i, j;
  
        for (i = 0; i < n; ++i) {
           int count = 0;
           for (j = 0; j < n; ++j) {
              if (a[j] == a[i])
              ++count;
           }
  
           if (count > mc) {
              mc = count;
              mv = a[i];
           }
        }
        return mv;
     }

}