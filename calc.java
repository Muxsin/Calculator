import java.util.*;

class calc {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("--->|Wellcome in your Calculator|<--- \nEntrer your first number: ");
		int a=sc.nextInt();
		System.out.print("Enter your second number: ");
		int b=sc.nextInt();
		System.out.println("Choose: + or - or * or /");
		char c=sc.next().charAt(0);
		if(c=='+'){
			System.out.println("============================ \n"+a+" + "+b+" = "+(a+b)+"\n============================");
		}
		else if(c=='-'){
			System.out.println("============================ \n"+a+" - "+b+" = "+(a-b)+"\n============================");
		}
		else if(c=='*'){
			System.out.println("============================ \n"+a+" * "+b+" = "+(a*b)+"\n============================");
		}
		else if(c=='/'){
			System.out.println("============================ \n"+a+" / "+b+" = "+(a/b)+"\n============================");
		}
		else{
			System.out.println("============================   \nError\n============================");
		}

		return;
	}
}

