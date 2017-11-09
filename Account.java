
/**
 * Write a description of class Account here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Account
{
  private double balance;
  private String name;
  private long acctNum;
  private int Fee = 10;
  private double Newbalance; 
  private double withdraw;
  //----------------------------------------------
  //Constructor -- initializes balance, owner, and account number
  //----------------------------------------------
  public Account(double initBal, String owner, long number)
  {
      this.balance = initBal;
      this.name = owner;
      this.acctNum = number;
  }
  //----------------------------------------------
  // Checks to see if balance is sufficient for withdrawal.
  // If so, decrements balance by amount; if not, prints message.
  //----------------------------------------------
  public void withdraw(double amount)
  {
      if (withdraw >= balance){
          System.out.println("You lack the funds for this transaction");
        }
          else{
          System.out.println(Newbalance);
        }
      }
      
    //----------------------------------------------
  // Adds deposit amount to balance.
  //----------------------------------------------
  public void deposit(double amount)
  {
      Newbalance = balance + withdraw;
      System.out.println(Newbalance);
  }
  //----------------------------------------------
  // Returns balance.
  //----------------------------------------------
public double getBalance(){
    return balance;
  }
  //----------------------------------------------
  // Returns a string containing the name, account number, and balance.
  //----------------------------------------------
 public String toString(){
     String text = ""; 
     text += "The owner is " + this.name;
     text += "The account number is:" + this.acctNum;
     text += "The Balance of this account is:" + this.balance;
     return text;
    }

  //----------------------------------------------
  // Deducts $10 service fee
  //----------------------------------------------
  public void chargeFee()
  {
      
  }
  //----------------------------------------------
  // Changes the name on the account
  //----------------------------------------------
  public void changeName(String newName)
  {
      
  }
}

