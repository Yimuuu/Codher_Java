package muyi;

public class HellowWorld {
	public static void main(String []args) {

/*
		char ch1 = 'A';
		int i = 10;
		float x1 = 2.3f;
		int a1 =2 ,a2 = 2;
		int b = ( ++a1 )*2;//用a1+1计算，3*2
		int c = ( a2++ )*2;//用a2计算，2*2
		int h = (int)x1;//类型转换
		float m; m = (float)i;
		int z = i+2;//类型转换是暂时的
		double t= 10+10.22;
		boolean b1 = true;
		boolean b2 = false;
		int b3 = ( b == 1 ) ? 30:20;//条件运算符
		
		
		System.out.println(ch1);
		System.out.println(i);
		System.out.println(x1);
		System.out.println("b="+b+",c="+c);
		System.out.println(h+","+m+","+i);
		System.out.println(t);
		System.out.println(a1 > a2);//关系表达式
		System.out.println(b1 || b2);//逻辑表达式
		System.out.println(b3);
		
		

		int x = 50;
		if ( x < 20)
		{
			System.out.println("if 语句");
		}
		else if ( x == 50)
		{
			System.out.println("值是"+x);
		}
		else
		{
			System.out.println("else语句");
		}//if else用法*，嵌套 if(){if()}
		
		char grade = 'C';
		switch (grade) 
		{
			case 'A' :
				System.out.println("A~");
			break;//没有它会持续执行；
			case 'B' :
				System.out.println("B~");
			break;
			case 'C' :
				System.out.println("C~");
			break;
			default : 
				System.out.println("unknown");
		}
		System.out.println(grade);//switch用法
		

		while ( x < 20 )
		{
			System.out.print("x是"+ x );
			x++;
			System.out.print("\n");		
		}
		System.out.print("x是"+x+"\n");//while用法
		
		do {
			System.out.print("do:x是"+ x );
			x++;
			System.out.print("\n");	
		}
		while (x < 20);//do while用法
		
		for (x = 10; x < 20; x = x + 1)
		{
			System.out.print("x是"+ x );
			System.out.print("\n");	
		}//for用法
*/	
		
		
		person p1 = new person("Mike");//或者person p1 = new person
		p1.move();
		p1.eat();
		//p1.name = "Mike";
		//System.out.println(p1.name);
	}
	
}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      

class person {//person类标识
	String name;//类属性
	int age;
	public person(String name) {//这个构造起只有一个参数 字符串类型的name
		this.name = name;
		System.out.println( "名字" + name );
	}
	
	public void move()//类方法
	{
		System.out.println("跑了一公里");
	}
	public void eat()
	{
		System.out.println("吃了米饭");
	}
}
		
		
		
	
		
		
		
	
	
	
