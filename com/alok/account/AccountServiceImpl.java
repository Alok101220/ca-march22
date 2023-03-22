package com.alok.account;


import java.time.LocalDate;
import java.util.Hashtable;
import java.util.Random;
import java.util.Scanner;

public class AccountServiceImpl implements AccountService{


    // creating new account
    @Override
    public void createAccount(Hashtable<Integer,Account> map){
        Scanner sc = new Scanner(System.in);
        Scanner newsc= new Scanner(System.in);
        // create new account
        Account account= new Account();
      
        System.out.println("Enter account id: ");
        int id=sc.nextInt();
        account.setId(id);
        
        // Enter account holder information
        map.put(id, account);

        customerInput(map, id);
        
       Account currAccount= map.get(id); 
        
        long generatedLong = Math.abs(new Random().nextLong());
        currAccount.setAccNumber(generatedLong);
        currAccount.setAccType("saving"); 
        currAccount.setAccBalance((long)10000000);
        currAccount.setStatus(true);

    //    Inserting details into hashTable
       map.put(id, currAccount);
       
       
    extra(map);
    }


    // remove existing account
    @Override
        public void removeAccount(Hashtable<Integer,Account> map){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter your account id: ");
        int id = scanner.nextInt();

        if(!map.containsKey(id)){
            System.out.println("sorry customer with id "+id+" is not available.");
            System.out.println("try again :(");
        }
        else{
            map.remove(id);
        }
        extra(map);
        scanner.close();
        
    }


    // update details
    @Override
    public void updateAccountDetails(Hashtable<Integer,Account> map,int id){
            customerInput(map, id);
            System.out.println("Account with id: "+id+" has been updated...");
            extra(map);
        }


        // printing details of customer
    @Override
    public  void printDetails(Hashtable<Integer, Account> map){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your account id: ");
        int id = sc.nextInt();

        if (!map.containsKey(id)) {
            System.out.println("sorry customer with id " + id + " is not available.");
            System.out.println("try again later :(");
        } else {
            Account account= map.get(id);

            // print all the details
            CustomerInfo customerInfo= account.getCustomerInfo();
           
           System.out.println(); 
            System.out.println("Account holder name: "+customerInfo.getAccHolderName());
            System.out.println("Account holder dob: "+ customerInfo.getDob());
            System.out.println("Account number: "+ account.getAccNumber());
            System.out.println("Address :"+ customerInfo.getAddress());
            System.out.println("Balance: "+account.getAccBalance());
            System.out.println("Account type: "+account.getAccType());
            if(account.getStatus()==false){
                System.out.println("Account is InActive");
            }else{
                System.out.println("Account is Active");
            }

            
        }
        Scanner newsc= new Scanner(System.in);
        System.out.println("want to update account details? Please Enter U: ");
        String str = newsc.nextLine();
        if (str.equals("U")) {
            updateAccountDetails(map, id);
        }
        else{
            extra(map);
        }

    }

    private void extra(Hashtable<Integer, Account> map) {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("want to create another account? Please enter Y to continue :");
        System.out.println("Want to remove account? Please enter D to continue :");
        System.out.println("Want to print account details? Please enter P to continue :");

        System.out.println("want to exit? Enter any key excluding above one: ");
        String str = sc.nextLine();
        if (str.equals("Y")) {
            createAccount(map);
        }

        else if (str.equals("D")) {
            removeAccount(map);
        } else if (str.equals("P")) {
            printDetails(map);
        } else {
            return;
        }
    }

    private void customerInput(Hashtable<Integer,Account> map, int id){
        Scanner newsc= new Scanner(System.in);
        CustomerInfo customer = new CustomerInfo();

        System.out.println("Enter account holder name:");
        String accHolderName = newsc.nextLine();
        customer.setAccHolderName(accHolderName);

        System.out.println("Enter account holder phone");
        String accHolderPhone = newsc.nextLine();
        customer.setAccHolderPhone(accHolderPhone);

        System.out.println("Enter account holder dob:");
        System.out.println("Dob should be in yyyy-mm-dd");
        String dob = newsc.nextLine();
        LocalDate date1 = LocalDate.parse(dob);
        customer.setDob(date1);

        System.out.println("Enter account holder email:");
        String email = newsc.nextLine();
        customer.setEmail(email);

        // Enter account holder address

        Address address = new Address();
        System.out.println("Enter street:");
        String street = newsc.nextLine();
        address.setStreet(street);

        System.out.println("Enter city");
        String city = newsc.nextLine();
        address.setCity(city);

        System.out.println("Enter state:");
        String state = newsc.nextLine();
        address.setState(state);

        System.out.println("Enter pincode:");
        long pincode = newsc.nextLong();
        address.setPincode(pincode);

        customer.setAddress(address);

        Account account= map.get(id);

        account.setCustomerInfo(customer);
        map.put(id,account);

    }

    public static void main(String[] args) {
       
        
        Hashtable<Integer,Account> map= new Hashtable<>();
        System.out.println("Please create your account:");
        AccountService dao= new AccountServiceImpl();
        dao.createAccount(map); 
        
    }
}




// illustration of uses of hashtable in bank account