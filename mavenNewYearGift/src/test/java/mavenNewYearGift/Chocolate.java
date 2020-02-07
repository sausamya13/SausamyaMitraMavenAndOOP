package mavenNewYearGift;

public class Chocolate 
{
	private String ChocolateType;
	private float Weight;
	private int Units;
	public   Chocolate(String ChocolateType,float Weight,int Units)
	{
	this.ChocolateType=ChocolateType;
	this.Weight=Weight;
	this.Units=Units;
    }
	public String getType ()
	{
	return ChocolateType;
	}
	public float getWeight()
	{
	return Weight;
	}
	public int getUnits()
	{
	return Units; 
	}
	
}
