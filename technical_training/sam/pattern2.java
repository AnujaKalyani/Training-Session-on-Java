package sam.com;

public class pattern2 {

	public static void main(String[] args) {
		int temp=5;
		for(int i=1;i<=5;++i)
		{
			if(i==5)
			{
				System.out.println("1 2 5 4 3");
			}
			else {
			for(int j=1;j<=i;++j)
			{
				
				if(j==4) {
					
					int a=temp;
					temp=j;
					j=a;
					
				}System.out.print(j+" ");
			}
			}
			System.out.println();
			
		}

	}

}
