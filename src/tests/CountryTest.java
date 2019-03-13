package tests;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;//Used for Before Annotation
import main.Country; // Get the files from Country Class

public class CountryTest
{
	Country country[]; //Country class is declared

	//Used setUp because values is same form every Test Case
	@Before
	public void setUp()
	{
		country=new Country[4];//array declaration
		country[0]=new Country("INDIA",2347856,23487616);
		country[1]=new Country("UK",125783,2345634);
		country[2]=new Country("USA",123512,7812354);
		country[3]=new Country("Australia",100000,434876);
	}
	
	@Test
	public void toFindLargestAreaOfCountry()
	{
		Country actualResult=new Country().toFindCountryLargestArea(country);
		Country expectedResult=new Country("INDIA",2347856,23487616);
		assertEquals(expectedResult.getCountryName(),actualResult.getCountryName());
		assertEquals(expectedResult.getCountryArea(),actualResult.getCountryArea());
		assertEquals(expectedResult.getCountryPopulation(),actualResult.getCountryPopulation());
	}
	@Test
	public void toFindLargestPopulationOfCountry()
	{
		Country actualResult=new Country().toFindCountryLargestPopulation(country);
		Country expectedResult=new Country("INDIA",2347856,23487616);
		assertEquals(expectedResult.getCountryName(),actualResult.getCountryName());
		assertEquals(expectedResult.getCountryArea(),actualResult.getCountryArea());
		assertEquals(expectedResult.getCountryPopulation(),actualResult.getCountryPopulation());
	}
	@Test
	public void toFindLargestPopulationDensityOfCountry()
	{
		Country actualResult=new Country().toFindCountryLargestPopulation(country);
		Country expectedResult=new Country("INDIA",2347856,23487616);
		assertEquals(expectedResult.getCountryName(),actualResult.getCountryName());
		assertEquals(expectedResult.getCountryArea(),actualResult.getCountryArea());
		assertEquals(expectedResult.getCountryPopulation(),actualResult.getCountryPopulation());
	}
}