
public class Gugudan {
	
	public static void caculate(int first,int second) {
		int result = 0;
		for(int i=2;i<=first;i++) {
			for(int j=1;j<=second;j++) {
				result=i*j;
				System.out.println(i+"*"+j+"="+result);
			}
		}
		
	}
	public static void print(int[] result) {
		for(int i=0;i<result.length;i++) {
			System.out.println(result[i]);
		}
	}


		

	}
	


