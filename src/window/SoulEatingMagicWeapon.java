package window;

public class SoulEatingMagicWeapon extends MagicWeapon{

	public SoulEatingMagicWeapon(SoulEatingMagicWeaponImpl imp) {
		super(imp);
		// TODO Auto-generated constructor stub
	}
	
	public SoulEatingMagicWeaponImpl getImp(){
		return (SoulEatingMagicWeaponImpl)imp;
	}
	
	@Override
	public void wield() {
		// TODO Auto-generated method stub
		getImp().wieldImp();
	}

	@Override
	public void swing() {
		// TODO Auto-generated method stub
		getImp().swingImp();
	}

	@Override
	public void unwield() {
		// TODO Auto-generated method stub
		getImp().unwieldImp();
	}
	
	public void eatSoul(){
		getImp().eatSoul();
	}
}
