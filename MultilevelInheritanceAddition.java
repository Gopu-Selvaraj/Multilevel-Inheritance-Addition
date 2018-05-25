class AllNumbers
	{
		int no1 = 100;
		int no2 = 200;
		int ares;

		public int AdditionOperation()
		{
			ares = no1 + no2;
			return ares;
		}
	}
class Subtraction extends AllNumbers
	{
		int no3 = 50;
		int sres;

		public int SubtractionOperation()
		{
			sres = AdditionOperation() - no3;
			return sres;
		}
	}
class Multipilication extends Subtraction
	{
		int no4 = 10;
		int mres;

		public int MultipilicationOpreation()
		{
			mres = SubtractionOperation() * no4;
			return mres;
		}
	}	
class MultilevelInheritanceAddition
	{
		public static void main(String[] args)
		{
			Multipilication mo = new Multipilication();
			System.out.println("Addition result : " + mo.AdditionOperation());
			System.out.println("Subtraction result : " + mo.SubtractionOperation());
			System.out.println("Multipilication result : " + mo.MultipilicationOpreation());
		}
	}
