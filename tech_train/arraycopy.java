package sak.com;

public class arraycopy {

	public static void main(String[] args) {
		int[] source= {100,200,300};
		int[] dest=new int[3];
		System.arraycopy(source,0,dest,0,source.length);
		for(int i=0;i<dest.length;i++)
		{
			System.out.println("element at endex"+i+":"+dest[i]);
		}

	}

}
