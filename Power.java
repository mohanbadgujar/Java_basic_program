class Power
{
	public static void main(String ar[])
	{
		int power=Integer.parseInt(ar[0]);
		int result=1;
	
		if(power>=0 && power<31){
			for(int i=0;i<=power;i++){
				System.out.println("2^"+i+"="+result);
				result = result*2;
			}
		}
		else
		System.out.println("Give Number between 1 and 30");

	}
}

