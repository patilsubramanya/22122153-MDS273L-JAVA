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
        String[] nname = new String[l];
        String[] kname = new String[l];
        do {
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
                            System.out.println("Name added to the list."+l);
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
                            //System.out.println("Name is present in the list.");
                            break;
                        }
                        else{
                            flag=0;
                            //System.out.println("Name is not present in the list.");
                            //break;
                        }
                    }
                    if(flag==1){
                        System.out.println("Name is present in the list.");
                    }
                    else{
                        System.out.println("Name is not present in the list.");
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
                            rname = "0";
                            //System.out.println("Name removed.");
                            names[j] = names[j+v];
                            l--;
                            count=1;
                            break;
                        }
                        count=0;
                    }
                    if(count==1){
                        System.out.println("Name removed.");
                    }
                    else{
                        System.out.println("Name not present in the list.");
                    }
                    break;
                case 4:
                    //String[] nname = new String[l];
                    System.out.println("Showing all names: ");
                    for(int z=0;z<l;z++){
                        System.out.println(names[z]);
                    }
                    break;
                default:
                    System.out.println("Please enter between 1-4");
                    break;
            }
        } while (ch<5);
    }
    
}
