public class arraytest
{
	public static void main(String[] args)
	{
	int currentAttack = 0;
	int MAX = 999;
	int [] storage = new int [MAX];
	
	System.out.println("Array Length is: "+storage.length);
	storage[storage.length]= currentAttack;
	System.out.println("Array Length is: "+storage.length);
	storage[storage.length]= currentAttack;
	
	}
}