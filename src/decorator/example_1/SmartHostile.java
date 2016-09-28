package decorator.example_1;

public class SmartHostile implements Hostile{
	private Hostile hostile;
	
	public SmartHostile(Hostile hostile){
		this.hostile = hostile;
	}
	@Override
	public void attacke() {
		// TODO Auto-generated method stub
		System.out.println("sda");
		hostile.attacke();
	}

	@Override
	public int getAttackPower() {
		// TODO Auto-generated method stub
		System.out.println("dfaf");
		return hostile.getAttackPower();
	}

	@Override
	public void fleeBattle() {
		// TODO Auto-generated method stub
		
	}

}
