
class MyPrac1 
{
	//Object obj = new Hero();
	public void act()
	{
		System.out.println("Act");
	};
}
	class Hero extends MyPrac1
	{
		public void fight()
		{
			System.out.println("Fight");
		};
		
	}
	
	 class Comedian extends MyPrac1
	{
		
		public void perform()
		{
			System.out.println("Comedy");
	    };
	  }
/*
	int a =1;
	int b = 2;
	MyPrac func(MyPrac obj)
	{
		MyPrac m1= new MyPrac();
		m1 = obj;
		m1.a = obj.a++ + ++obj.b;
		obj.b = obj.b;
		return m1;
	}*/
	  public class MyPrac{
	public static void main(String[] args) {
		
		
		//MyPrac1 m1 = new Comedian();
		Hero m2 = new Hero();
		Object obj = new Object();
		System.out.println(m2);
	
		System.out.println(obj.toString());
	
		// TODO Auto-generated method stub
		/*
		MyPrac obj1 = new MyPrac();
		MyPrac obj2 = obj1.func(obj1);
	
		System.out.println(obj1.a +"  " + obj1.b  );
		
		System.out.println(obj2.a +"  " + obj2.b  );*/
	}
}