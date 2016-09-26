package minor;

public class university {
	final static String CETCODE="E30 and E241";
	school[] a=new school[8];
	static
	{
		System.out.println("KLE TECH");
	}
	
	class school{
		private String programcode;
		private String coordinator;
		private int noofstud;
		private int noofstaff;
		
		public String getProgramcode() {
			return programcode;
		}
		public String getCoordinator() {
			return coordinator;
		}
		public int getNoofstud() {
			return noofstud;
		}
		public int getNoofstaff() {
			return noofstaff;
		}
	
	public school(String programcode,String coordinator,int noofstud,int noofstaff)
	{
		super();
		this.programcode=programcode;
		this.coordinator=coordinator;
		this.noofstud=noofstud;
		this.noofstaff=noofstaff;
		
	}
	
	}
	

	void createschool()
	{
		a[0]=new school("CS01","PAVAN",110,10);
		a[1]=new school("MECH01","RAMESH",130,20);
		a[2]=new school("CIVIL","RAJU",100,15);
		a[3]=new school("ROBO","MANJU",116,13);
		a[4]=new school("ROTARY","RAAJ",112,15);
		a[5]=new school("SAKHARE","GOUDA",117,14);
		a[6]=new school("A&R","SHANKAR",116,22);
		a[7]=new school("BT","GIRISH",135,25);
	}
	
	void calculate()
	{
		int j;
		for( j=0;j<8;j++)
		{
			if(a[j].getNoofstud() > 120)
			{
				System.out.println("programcode has expected max list");
			}
		else
			{
			System.out.println("total strength of "+a[j].getProgramcode()+ " is " + a[j].getNoofstud());
			}
		}
	}
}

