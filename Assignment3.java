/* Accept two Integer as command line argument
 * and print the sum of two number
*/
class Assignment3
{
	public static void main(String args[])
	{
		int num1=Integer.parseInt(args[0]);
		int num2=Integer.parseInt(args[1]);
		int sum=num1+num2;
		System.out.print("Sum of  "+num1+"  and  "+num2+"  is  "+sum);
	}
}