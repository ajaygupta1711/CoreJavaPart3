package CollectionExercise;

import java.util.ArrayList;

public class collectionDemo {

	public static void main(String[] args) {
		
		int a[] = {4,5,5,5,4,6,6,9,4};
		
		// Repeating the Number of times [4 -3, 5 -3, 6 -2, 9 -1] and Print unique no from the list
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		for (int i=0; i<a.length; i++)
		{
			int k=0;
			if (!al.contains(a[i]))
			{
				al.add(a[i]);
				k++;
				
				for (int j=i+1; j<a.length; j++)
				{
					if(a[i]==a[j])
					{
						k++;
					}
				}
				
			//	System.out.println("Number " + a[i]);
			//	System.out.println("- is repeating " + k + " times");
				
				if(k==1)
					System.out.println(a[i] + " is the unique number");
			}
			
		}
		
	}

}
