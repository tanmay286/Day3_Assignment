package main;

public class Country
{
	private String countryName;
	private long countryArea;
	private long countryPopulation;
	
	public Country()
	{
	}
	public Country(String countryName ,long countryArea,long countryPopulation)
	{
		this.countryName=countryName;
		this.countryArea=countryArea;
		this.countryPopulation=countryPopulation;
	}
	
	public void setCountryName(String countryName)
	{
		this.countryName=countryName;
	}
	public String getCountryName()
	{
		return countryName;
	}
	
	public void setCountryArea(long countryArea)
	{
		this.countryArea=countryArea;	
	}
	public long getCountryArea()
	{
		return countryArea;
	}
	
	public void setCountryPopulation(long countryPopulation)
	{
		this.countryPopulation=countryPopulation;
	}
	public long getCountryPopulation()
	{
		return countryPopulation;
	}
	
	public Country toFindCountryLargestArea(Country country[])
	{
		int index=0;
		long maxArea=country[0].countryArea;
		for(int i=1;i<country.length;i++)	
		{
			if(maxArea < country[i].countryArea)
			{
				maxArea=country[i].countryArea;
				index++;
			}	
		}
		return country[index];
	}
	public Country toFindCountryLargestPopulation(Country country[])
	{
		int index=0;
		long maxPopulation=country[0].countryPopulation;
		for(int i=1;i<country.length;i++)	
		{
			if(maxPopulation < country[i].countryPopulation)
			{
				maxPopulation=country[i].countryPopulation;
				index++;
			}	
		}
		return country[index];
	}
	public Country toFindCountryLargestPopulationDensity(Country country[])
	{
		int index=0;
		double maxDensity=country[0].countryPopulation/country[0].countryArea;
		for(int i=1;i<country.length;i++)	
		{
			double density=country[i].countryPopulation/country[i].countryArea;
			if(maxDensity < density)
			{
				maxDensity=density;
				index = i;
			}	
		}
		return country[index];
	}
}