
public class SellnonVegSoup implements Order{

	private NonVegSoup nonvegSoup;

	public SellnonVegSoup(NonVegSoup nonvegSoup)
	{
		this.nonvegSoup = nonvegSoup;
	}
	
	@Override
	public void executeOrder() {
		// TODO Auto-generated method stub
		nonvegSoup.sellSoup();
	}
	
	
}
