class Box{
	int width;
	int height;
	double depth;
	Box(int w,int h,double d){
	 width=w;
	 height =h;
	 depth = d;
	}
	 void volume(){
	  System.out.println("Volume of Box:"+(width*height*depth));
	}
	public static void main(String[] args){
	  Box b = new Box(5,5,5);
	  b.volume();
	}
}