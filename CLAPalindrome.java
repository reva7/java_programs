class CLAPalindrome{
public static void main(String[] args){
	String a=args[0];
	int c=0;
	for(int i=0;i<a.length();i++){
	  if(a.charAt(i)!=a.charAt(a.length()-1-i)){
	    c=1;
	    break;
	    }
	}
	if(c==0)
	  System.out.println(a +" is a palindrome");
	else 
	  System.out.println(a +" is not a pallindrome");
}
}