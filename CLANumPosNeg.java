class CLANumPosNeg{
public static void main(String[] args){
	int a=Integer.parseInt(args[0]);
	if(a>0)
	  System.out.println(a +"is a posittive number");
	else if(a<0)
	  System.out.println(a+"is a negative integer");
	 else
	  System.out.println(a +"i s neither positive nor negative");
}
}