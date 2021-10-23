
public class Calculation {
	
	public void calculationEmployee(Product[] productlist) {
		int sum=0,tot=0,fiv;
		int hun,dis=0;
		for(Product p:productlist) {
			sum=sum+p.getPrice();
			dis=sum*70/100;
			if(dis>=100) {
				
				hun=dis/100;
				fiv=hun*5;
				tot=dis-fiv;
				dis=tot;
			}
			
		}
		System.out.println("Total="+dis);
	}
	public void calculationAffiliate(Product[] productlist) {
		int sum=0,dis=0,hun,tot=0,fiv;
		for(Product p:productlist) {
			sum=sum+p.getPrice();
			dis=sum*90/100;
			
			if(dis>=100) {
				hun=dis/100;
				fiv=hun*5;
				tot=dis-fiv;
				dis=tot;
			}
			
		}
		System.out.println("Total="+dis);
	}
	public void calculationCustomer(Product[] productlist) {
		int sum=0,dis=0,hun,tot=0,fiv;
		for(Product p:productlist) {
			sum=sum+p.getPrice();
			dis=sum*95/100;
			if(dis>=100) {
				hun=dis/100;
				fiv=hun*5;
				tot=dis-fiv;
				dis=tot;
			}
			
		}
		System.out.println("Total="+dis);
	}
	public void calculationNormal(Product[] productlist) {
		int sum=0,hun,tot=0,fiv;
		for(Product p:productlist) {
			sum=sum+p.getPrice();
			hun=sum/100;
			fiv=hun*5;
			tot=sum-fiv;
		}
		System.out.println("Total"+tot);
	}
}