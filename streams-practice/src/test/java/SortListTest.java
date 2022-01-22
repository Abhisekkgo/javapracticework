import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.abhisek.streams.SortList;

public class SortListTest {

	public static void main(String[] args) {
		
	

	}
	
	@Test
	public void evennumbers_test(){
		//Given
		SortList sortlist = new SortList();
		List<Integer> expected = Arrays.asList(2,4,6,8);
		List<Integer> actual = sortlist.evennumbers();
		assertEquals(expected.size(), actual.size());
	}
	
	@Test
	public void oddnumbers_test(){
		//Given
		SortList sortlist = new SortList();
		List<Integer> expected = Arrays.asList(1,3,5,7);
		List<Integer> actual = sortlist.oddnumbers();
		assertArrayEquals(expected.toArray(), actual.toArray());
	}

}
