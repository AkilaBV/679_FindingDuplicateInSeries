package _FindingDuplicateInSeries_package._FindingDuplicateInSeries;

import java.util.Arrays;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FindingDuplicateInSeries {
	int num=0;
public int findDuplicate(int[] n) {
	Arrays.sort(n);
	if(n.length==0) {
		num=-1;
		return num;
	}
	for(int i=0;i<n.length-1;i++) {
		if(n[i]==n[i+1]) {
			num=n[i];
		}
	}
	return num;
}
	
	
	
	@Test
	public void testcase1() {
		int a[]= {3,4,4,5};
	//	System.out.println(findDuplicate(a));
		Assert.assertTrue(findDuplicate(a)==4);
	}
	
	@Test
	public void testcase2() {
		int a[]= {};
		//System.out.println(findDuplicate(a));
		Assert.assertTrue(findDuplicate(a)==-1);
	}
	@Test
	public void testcase3() {
		int a[]= {1,2,3,4,5};
		//System.out.println(findDuplicate(a));
		Assert.assertTrue(findDuplicate(a)==0);
	}
}
