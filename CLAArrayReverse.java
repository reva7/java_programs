class CLAArrayReverse{
public static void main(String[] args){
	int[][] n=new int[2][2];
	int c=0;
                   for(int i=0;i<2;i++){
                       for(int j=0;j<2;j++){
	       n[i][j]=Integer.parseInt(args[c]);
		c++;
	}
	}
	System.out.println("Given  2x2 Array:");
	  for(int i=0;i<2;i++){
	   for(int j=0;j<2;j++){
	     System.out.print(n[i][j]+"\t");
	   }
	   System.out.println();
	}
	  System.out.println("Reverse of 2x2 array:");
	  for(int i=1;i>=0;i--){
	   for(int j=1;j>=0;j--){
	     System.out.print(n[i][j]+"\t");
	   }
	   System.out.println();
	}
}
}