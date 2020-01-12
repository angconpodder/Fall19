package fileDirectory;

public class Test {
	static int x = 10;
	static int y = 20;
	
	public static void main(String[] args) {
		int j = 50;
		String[] myArray = {"james", "tom", "jane", "tim"};
		System.out.println(j);
		j=55;
		System.out.println(sum(j,x));
		print();
		for(int i=0; i<4; i++){
			System.out.println(myArray[i]);
		}
		System.out.println("xyz");
		System.out.println("asjdsb");
		System.out.println("Sfsdf");
		print();
	}
	
	public static void print(){
		System.out.println("some print");
	}
	
	public static int sum(int a, int b){
		System.out.println("now we are inside the sum method");
		print();
		return a+b;
	}

}
