import java.util.Scanner;

class reverseString{

    public static String reverse(String palabra){
	if(palabra.length()==1){
	    return palabra;
	}else{
	    return reverse(palabra.substring(1))+palabra.charAt(0);
	}

    }
    
    public static void main(String[]args){

	Scanner sc = new Scanner(System.in);

	String s = sc.next();

	System.out.println(reverse(s));
    }

}
