class CLASumOfDigits{
public static void main(String[] args){
	int a=Integer.parseInt(args[0]);
	int sum=0,r;
	while(a!=0){
	 r=a%10;
	 sum+=r;
	 a=a/10;
	}
	  System.out.println("sum of digits in number:"+sum);
}
}