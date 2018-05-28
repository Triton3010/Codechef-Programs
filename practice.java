import java.util.Scanner;
class Bank
{
int dep,bal,with;
void deposit()
{
System.out.println("Enter the amount to deposit");
Scanner obj=new Scanner(System.in);
dep=obj.nextInt();
}
void withdraw()
{
System.out.println("Enter the amount to withdraw");
Scanner obj1=new Scanner(System.in);
with=obj1.nextInt();
}}
public class Bank1
{
public static void main(String args[])
{
Bank b1=new Bank();
Bank.deposit();
}}
