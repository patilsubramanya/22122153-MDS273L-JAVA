import java.util.*;
public class lab04{
     static Scanner scan = new Scanner(System.in);
    static int account_number = 0;
    static String acccount_holder_name;
    static int account_balance=0;
    public static void main(String[] args){
        int[] f=new int[5]; 
        int[] fw=new int[5];
        int ch=0;
        do{
            System.out.println("1.INITIALISE CUSTOMER\n2.DEPOSIT\n3.WITHDRAW\n4.TRANSACTIONS\n5.SUMMARY\n6.EXIT");
            System.out.println("Enter your choice: ");
            ch = Integer.parseInt(scan.nextLine());
            switch(ch){
                case 1:
                    initialize_cusotmer();
                    break;
                case 2:
                    f=deposit();
                    break;
                case 3:
                    fw=withdraw();
                    break;
                case 4:
                    transaction(f,fw);
                    break;
                case 5:
                    summary();
                    break;
                case 6:
                    System.out.println("Exiting.....");
                    break;
                default:
                    System.out.println("Please enter valid option: ");
                    break;
            }
        }
        while(ch<6);

    }
    static int[] deposit(){
        //Scanner scan = new Scanner(System.in);
        int flag=1;
        int dmoney=0; int count=0;
        System.out.println("Enter the amount to be deposited. ");
        dmoney = Integer.parseInt(scan.nextLine());
        System.out.println("The entered amount is: \n"+dmoney);
        account_balance = account_balance+dmoney;
        count++;
        int[] d={count,account_balance, dmoney,flag};
        return d;
    }
    static void initialize_cusotmer(){
        System.out.println("Enter the name of the customer: ");
        acccount_holder_name=scan.nextLine();
        System.out.println("Enter the account number: ");
        account_number=Integer.parseInt(scan.nextLine());
        System.out.println("Enter the account balance: ");
        account_balance=Integer.parseInt(scan.nextLine());
        System.out.println("Customer Created.");
        System.out.println("Customer details are: "+acccount_holder_name+"\n"+account_number+"\n"+account_balance);
    }
    static int[] withdraw(){
        int wmoney=0; 
        int c=0;
        int flagg=0;
        System.out.println("Enter the amount to be withdrawn: ");
        wmoney= Integer.parseInt(scan.nextLine());
        if(wmoney>account_balance){
            System.out.println("Amount entered is more than account balance. Can't withdraw.");
        }
        else{
            System.out.println("Amount withdrawn.");
            account_balance=account_balance-wmoney;
        }
        c++;
        //flagg=0;
        int[] w = {c,account_balance,wmoney,flagg};
        return w;
    }
    static void transaction(int a[],int ab[]){
        //System.out.println("The transaction details are:");
        int c=a[0]+ab[0];
        if(c==0){
            System.out.println("No transactions yet.");
        }
        //System.out.println("Total number of transaction are: "+c);
        else{
            System.out.println("Transactions are: ");
            for(int i=c;i<=c;i++){
                if(a[3]==1){
                    System.out.println("DEPOSIT = "+a[2]+"\n"+"Balance = "+a[1]);
                    //continue;
                }
                if(ab[3]==0){
                    System.out.println("WITHDRAW = "+ab[2]+"\n"+"balance = "+ab[1]);
                    //continue;
                }
            }
        }

    }
    static void summary(){
        System.out.println("Account Holder Name: "+acccount_holder_name);
        System.out.println("Account Number: "+account_number);
        System.out.println("Final Account balance: "+account_balance);
    }

}