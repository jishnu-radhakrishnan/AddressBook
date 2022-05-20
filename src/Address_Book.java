import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Address_Book {
    public ArrayList<Contact> address_details= new ArrayList<Contact>();
      Contact con= new Contact();
     static Address_Book addressBook = new Address_Book();

     //To add contact

  public void AddContactdetails(){
        Scanner details= new Scanner(System.in);
        System.out.println("Enter your Name:");
        String name=details.next();
        con.setName(name);
        System.out.println("Enter your Address:");
        String address=details.next();
        con.setAddress(address);
        System.out.println("Enter your City:");
        String city=details.next();
        con.setCity(city);
        System.out.println("Enter your State:");
        String state=details.next();
        con.setState(state);
        System.out.println("Enter your ZipCode:");
        int zip=details.nextInt();
        con.setZip(zip);
        System.out.println("Enter your MobileNumber:");
        long number=details.nextLong();
        con.setMobileNumber(number);
        System.out.println("Enter your MailId:");
        String mail=details.next();
        con.setMailId(mail);
        address_details.add(con);

    }
    //To delete contact
  public void DeleteContactdetails(){
        System.out.println("Enter the name to be deleted");
        Scanner dtl_name= new Scanner(System.in);
        String name= dtl_name.next();
        for (Contact con:address_details){
              if (con.getName().equals(name)){
                    address_details.remove(con);
              }
        }
        System.out.println("Address details are removed");
  }
  //To edit contact
   public void EditContactdetails() {
       System.out.println("Enter the name to be edited");
       Scanner dtl_name = new Scanner(System.in);
       String name = dtl_name.next();
       for (Contact con : address_details) {
           if (con.getName().equals(name)) {
               AddContactdetails();
               System.out.println("Address details are edited");
           }else{
               System.out.println("Name not found");
           }
       }
  }
  //To search contact
   public Contact Searchcontact() {
       System.out.println("Enter name to get contact:");
       Scanner searchname = new Scanner(System.in);
       String name = searchname.next();
       for (Contact con : address_details)
           if (con.getName().equals(name))
               return con;
           else
               break;
       return null;
   }
   //To choose an option to perform specific functions
   public String OptionSelection() {
       System.out.println("\n\nSelect an appropriate option-->\n 1:Add Contact \n 2:Edit Contact \n 3:Delete Contact \n 4:View Contact \n 5:Exit");
       System.out.println();
       Scanner opt = new Scanner(System.in);
       int option = opt.nextInt();
       if (option == 1) {
           addressBook.AddContactdetails();
           return "Continue";
       } else if (option == 2) {
           addressBook.EditContactdetails();
           return "Continue";
       } else if (option == 3) {
           addressBook.DeleteContactdetails();
           return "Continue";
       } else if (option == 4) {
           System.out.println(addressBook.Searchcontact().getName());
           return "Continue";
       } else
           return "exit";
  }


      public static void main(String[] args) {
           System.out.println("\t\t*****Welcome to address book*****");
           while(addressBook.OptionSelection()!="exit"){
          continue;
          }
              System.out.println("Thank you");
      }

}
