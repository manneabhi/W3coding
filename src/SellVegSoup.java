
public class SellVegSoup implements Order{

	private VegSoup vegSoup;

	public SellVegSoup(VegSoup vegSoup)
	{
		this.vegSoup = vegSoup;
	}
	
	@Override
	public void executeOrder() {
		// TODO Auto-generated method stub
		vegSoup.sellSoup();
	}
	
	
}
