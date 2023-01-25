import java.util.Scanner;
class Lab_1{
    public static void main(String[] args){
        String name;
        int rollno;
        //String gender;
        String state;
        //String s;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the name of the student: ");
        name = obj.nextLine();
        System.out.println("Enter the roll no of the student: ");
        rollno = obj.nextInt();
        obj.nextLine();
        System.out.println("Enter the gender of the student: ");
        char gender = obj.next().charAt(0);
        //gender = obj.nextLine();
        obj.nextLine();
        
        System.out.println("Enter the region of the student: ");
        state = obj.nextLine();
        System.out.println("Name: "+name+"Roll No: "+rollno+"Gender: "+gender+"State: "+state);
        state = state.toLowerCase();
        if (gender == 'm'){
            System.out.println("Male");
        }
        else{
            System.out.println("Female");
        }
        switch(state){
            case "karnataka":
                System.out.println("South");
                break;
            case "tamil nadu":
                System.out.println("South");
                break;
            case "kerala":
                System.out.println("South");
                break;
            case "andra pradesh":
                System.out.println("South");
                break;
            case "goa":
                System.out.println("South");
                break;
            case "telangana":
                System.out.println("South");
                break;
            case "maharashtra":
                System.out.println("West");
                break;
            case "chattisgarh":
                System.out.println("West");
                break;
            case "gujrat":
                System.out.println("West");
                break;
            case "delhi":
                System.out.println("North");
                break;
            case "punjab":
                System.out.println("North");
                break;
            case "haryana":
                System.out.println("North");
                break;
            case "jamma and kashmir":
                System.out.println("North");
                break;
            case "madhya pradesh":
                System.out.println("North");
                break;
            case "sikkim":
                System.out.println("East");
                break;
            case "manipur":
                System.out.println("East");
                break;
            case "west bengal":
                System.out.println("East");
                break;
            case "tripura":
                System.out.println("East");
                break;
            case "arunachal pradesh":
                System.out.println("East");
                break;
            case "assam":
                System.out.println("East");
                break;
            case "bihar":
                System.out.println("East");
                break;
            case "himachal pradesh":
                System.out.println("East");
                break;
            case "jharkhand":
                System.out.println("East");
                break;
            case "rajasthan":
                System.out.println("West");
                break;
            case "meghalaya":
                System.out.println("East");
                break;
            case "mizoram":
                System.out.println("East");
                break;
            case "nagaland":
                System.out.println("East");
                break;
            case "odisha":
                System.out.println("North");
                break;
            case "uttar pradesh":
                System.out.println("North");
                break;
            case "uttrakhand":
                System.out.println("North");
                break;
            default:
                System.out.println("Please enter a state which is in India....");
        }

    }
}