
public class recurssion_first_calling {
	void fun1(int x)
	{
		if(x>0)
		{
		System.out.println(x);
		fun1(x-1);
		
	}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		recurssion_first_calling r = new recurssion_first_calling();
		int n=3;
		r.fun1(n);
		
		
		

	}

}
//output should be 3 2 1
