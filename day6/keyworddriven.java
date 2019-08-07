package automatedtesting;

public class keyworddriven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		allfunction obj =new allfunction();
		
		
		for(int i=0;i<6;i++)
		{
			obj.readexcel("D:\\Training\\augfive.xlsx",i);
			
			switch(obj.kw)
			{
			case "launchbrowser":
			{
				obj.launch("http://demowebshop.tricentis.com/login");
				obj.writeexcel("D:\\Training\\augfive.xlsx", "launched", i);
				break;
			}
			case "entertext":
			{
				obj.entertext(obj.xp, obj.td);
				obj.writeexcel("D:\\Training\\augfive.xlsx", "entered", i);
				
				break;
			}
			case "click":
			{
				
				obj.click(obj.xp);
				obj.writeexcel("D:\\Training\\augfive.xlsx", "clicked", i);
				
				break;
			}
			case "verify":
			{
				obj.verify(obj.xp,obj.td);
				obj.writeexcel("D:\\Training\\augfive.xlsx", "verified", i);
				
				break;
			}
			
			}
		}

	}

}
