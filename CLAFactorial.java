class CLAFactorial{
public static void main(String[] args){
	int a=Integer.parseInt(args[0]);
	int fac=1;
	while(a!=1){
	 fac=fac*a;
	 a=a-1;
	}
	 System.out.println("Factorial:"+fac);
}
}