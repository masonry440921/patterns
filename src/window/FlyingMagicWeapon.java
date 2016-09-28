package window;

public class FlyingMagicWeapon extends MagicWeapon{

	public FlyingMagicWeapon(FlyingMagicWeaponImpl imp) {
		super(imp);
		// TODO Auto-generated constructor stub
	}
	
	public FlyingMagicWeaponImpl getImp(){
		return (FlyingMagicWeaponImpl)imp;
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
	
	public void flying(){
		getImp().flyingImpl();
	}
}
