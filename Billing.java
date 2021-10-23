import java.util.*;
public class Billing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int id,type,year;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the User Id");
		id=sc.nextInt();
		System.out.println("Enter the user type: 1.Employee 2.affiliate 3.customer");
		type=sc.nextInt();
		if(type==3) {
			System.out.println("Enter the years");
			year=sc.nextInt();	
			}
		else {
			year=0;
			}
		UserType ty=new UserType(type,year);
		int prodNumber;
		System.out.println("Enter the number of products");
		prodNumber=sc.nextInt();
		Product[] p=new Product[prodNumber];
		for(int i=0;i<prodNumber;i++)
		{
			String pname;
			int price,discountable;
			System.out.println("Enter the product Name");
			pname=sc.next();
			System.out.println("Enter the product Price");
			price=sc.nextInt();
			//System.out.println("Enter if it is discountable or not");
			//System.out.println("1.Discountable /t 2.Notdiscountable");
			//discountable=sc.nextInt();
			Product product=new Product(pname,price);
			p[i]=product;
		}
		Calculation cal=new Calculation();
		if(type==1) {
			
			cal.calculationEmployee(p);
		}
		else if(type==2)
		{
			cal.calculationAffiliate(p);
		}
		
		else if(type==3&&year>2)
		{
			cal.calculationCustomer(p);
		}
		else
		{
			cal.calculationNormal(p);
		}
	}

}
