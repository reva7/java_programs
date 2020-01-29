class CLAArrayMaxi{
public static void main(String[] args){
	int[][] n=new int[3][3];
	int max=0,c=0;
                   for(int i=0;i<3;i++){
                       for(int j=0;j<3;j++){
	       n[i][j]=Integer.parseInt(args[c]);
		c++;
	       if(n[i][j]>max)
		max=n[i][j];
	       }
	}
	  System.out.println("Maximum number in 3x3 array:"+max);
}
}