
public class recurssion_second_calling {
	void fun(int x)
	{
		if(x>0)
		{
		
		fun(x-1);
		System.out.println(x);
		
		}
	//	System.out.println(x); output will be 0 1
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		recurssion_second_calling r= new recurssion_second_calling();
		int x=5;
		r.fun(x);

	}

}
//out will be 1 2 3 4 5
