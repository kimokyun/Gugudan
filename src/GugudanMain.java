import java.util.Scanner;

public class GugudanMain {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=2;i<10;i++) {
			//int[]result=Gugudan.caculate(i);
			//Gugudan.print(result);
			//int n=scanner.nextInt();
			//Gugudan.caculate(n);
		
			Scanner scanner=new Scanner(System.in);
			String inputValue=scanner.nextLine();
			String[] splitedValue=inputValue.split(",");
			int first=Integer.parseInt(splitedValue[0]);
			int second=Integer.parseInt(splitedValue[1]);
			Gugudan.caculate(first, second);
			
			
			
		}		
	}		

}
