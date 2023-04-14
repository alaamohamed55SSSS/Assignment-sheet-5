
package bank;
public class Bank {
public static void main(String[] args) {
   Account q=new Account(456,7800,.4);
   q.getId(22011964);
   q.getBalance(68520);
   q.getMonthlyInteresrate(0.5);
   q.dataCreated();
   System.out.println("The toltal after depoist is = "+ q.deposite(10000));
    System.out.println("The total after withdraw is = "+ q.withDraw(20000)); 
   
    }
    
}
