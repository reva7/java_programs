class Stock{
	String stockname;
	String stocksymbol;
	double prevprice,curprice;
	Stock(String name,String symbol,double prev,double curr){
	 stockname=name;
	 stocksymbol =symbol;
	 prevprice = prev;
	 curprice = curr;
	}
	 void getChangePercentage(){
	  System.out.println("Percentage change in closing price:"+(curprice-prevprice)/prevprice*100);
	}
	public static void main(String[] args){
	  Stock s= new Stock("lg","LG",46.45,75.81);
	  s.getChangePercentage();
	}
}