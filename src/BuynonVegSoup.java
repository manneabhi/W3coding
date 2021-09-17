
public class BuynonVegSoup implements Order{

	private NonVegSoup nonvegSoup;

	public BuynonVegSoup(NonVegSoup nonvegSoup)
	{
		this.nonvegSoup = nonvegSoup;
	}
	
	@Override
	public void executeOrder() {
		// TODO Auto-generated method stub
		nonvegSoup.buySoup();
	}
	
	
}