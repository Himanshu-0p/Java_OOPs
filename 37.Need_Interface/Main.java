interface Computer
{
	 void code();
}

class Laptop implements Computer
{
	public void code()
	{
		System.out.println("code, compile, run");
	}
}

class Desktop implements Computer
{
	public void code()
	{
		System.out.println("code, compile, faster");
	}
}
class Developer
{
	public void devApp(Computer lap)
	{
		lap.code();
	}
}

public class Main {
    public static void main(String[] args) {
 
        Computer lap=new Laptop();
        Computer desk=new Desktop();
        
        Developer navin=new Developer();
        navin.devApp(lap);
        
    }
}