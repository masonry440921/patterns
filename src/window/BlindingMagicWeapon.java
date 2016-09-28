package window;

public class BlindingMagicWeapon extends MagicWeapon{

	public BlindingMagicWeapon(BlindingMagicWeaponImpl imp) {
		super(imp);
		// TODO Auto-generated constructor stub
	}
	
	public BlindingMagicWeaponImpl getImp(){
		return (BlindingMagicWeaponImpl) imp;
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
	
	public void blinding(){
		getImp().blindImpl();
	}
}
