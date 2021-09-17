
public class BuyVegSoup  implements Order{

	private VegSoup vegSoup;

	public BuyVegSoup(VegSoup vegSoup)
	{
		this.vegSoup = vegSoup;
	}
	
	@Override
	public void executeOrder() {
		// TODO Auto-generated method stub
		vegSoup.buySoup();
	}
	
	
}
