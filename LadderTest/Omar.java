import java.util.Scanner;

class Omar{

    public static void main(String[]args){
	Scanner sc = new Scanner(System.in);

	int t = sc.nextInt();
	int x, y;
	
	while(t>0){

	    x=sc.nextInt();
	    y=sc.nextInt();
	    System.out.println(x+y);
	    t--;
	}
    }
}
