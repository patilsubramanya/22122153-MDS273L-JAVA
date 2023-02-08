import java.util.*;
public class lab_02 {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in); 
        int ch;
        String rname;
        String sname;
        int l=0;
        String[] names = new String[1024];
        String tname;
        do {
            System.out.println("**********MENU**********");
            System.out.println("1.Enter a Name.\n2.Search for a Name.\n3.Remove a name.\n4.Show all names.");
            System.out.println("Enter your choice.");
            ch = Integer.parseInt(scan.nextLine());
            switch(ch){
                case 1:
                    System.out.println("Enter a name: ");
                    tname = scan.nextLine();
                    for(int c=0;c<1024;c++){
                        if(tname.equals(names[c])){
                            System.out.println("Duplicate name. Please enter different name.");
                            break;
                        }
                        else{
                            for(int i=l;i<=l;i++){
                                names[l]=tname;
                            }
                            l++;
                            System.out.println("========================");
                            System.out.println(l+" Name added to the list.");
                            System.out.println("========================");
                            for(int i=0;i<l;i++){
                                System.out.println(names[i]);
                            }
                            break;
                        }
                    }
                    break;
                case 2:
                    int flag=0;
                    System.out.println("Enter a name to be searched: ");
                    sname = scan.nextLine();
                    for(int i=0;i<l;i++){
                        if(sname.equals(names[i])){
                            flag =1;
                            break;
                        }
                        else{
                            flag=0;
                        }
                    }
                    if(flag==1){
                        System.out.println("============================");
                        System.out.println("Name is present in the list.");
                        System.out.println("============================");
                    }
                    else{
                        System.out.println("================================");
                        System.out.println("Name is not present in the list.");
                        System.out.println("================================");
                    }
                    break;
                case 3:
                    int v = 0;
                    int count=0;
                    System.out.println("Enter a name to be removed: ");
                    rname = scan.nextLine();
                    for(int j=0;j<l;j++){
                        if(rname.equals(names[j])){
                            v=1;
                            for(int g=0;g<l;g++){
                                names[g] = names[g+v];
                            }
                            l--;
                            count=1;
                            break;
                        }
                        count=0;
                    }
                    if(count==1){
                        System.out.println("=============");
                        System.out.println("Name removed.");
                        System.out.println("=============");
                    }
                    else{
                        System.out.println("=============================");
                        System.out.println("Name not present in the list.");
                        System.out.println("=============================");
                    }
                    break;
                case 4:
                    System.out.println("===================");
                    System.out.println("Showing all names: ");
                    System.out.println("===================");
                    for(int z=0;z<l;z++){
                        System.out.println(names[z]);
                    }
                    break;
                default:
                    System.out.println("============================================");
                    System.out.println("INVALID INPUT!!!!!\nPlease enter between 1-4");
                    System.out.println("============================================");
                    break;
            }
        } while (ch<5);
    }
    
}
