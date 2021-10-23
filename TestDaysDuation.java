package myClass;

import static  org.junit.Assert.*;
import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import java.util.*;

@RunWith (Parameterized.class)
public class TestDaysDuation {
	public int month1, day1, month2, day2, year, numDays;
	
	public TestDaysDuation(int month1, int day1, int month2, int day2, int year, int numDays) {
		this.month1 = month1;
		this.day1 = day1;
		this.month2 = month2;
		this.day2 = day2;
		this.year = year;
		this.numDays = numDays;
	}
	
	@Parameters
	public static Collection<Object[]> daysValues(){
		return Arrays.asList (new Object [] [] {{1, 1, 2, 1, 2021, 31}, //1
												{2, 2, 3, 2, 2020, 29}, //2
												{5, 6, 6, 7, 2019, 32}, //3
												{3, 4, 10, 5, 2018, 215}, //4
												{6, 3, 8, 3, 2017, 61}, //5
												{11, 1, 11, 2, 2021, 1}, //6
												{7, 25, 8, 24, 2020, 30}, //7
												{5, 2, 5, 4, 2021, 2}, //8
												{2, 1, 2, 30, 2020, 29}, //9 fault did not detected
												{2, 1, 3, 1, 2020, 30}}); // fault detected
	}
	
	@Test
	public void DaysDurationTest() {
		assertTrue ("Days Duration Test", numDays == DaysDurationCalculator.cal(month1, day1, month2, day2, year));
	
	}

}