package proxy.example_1;

public class WizardTowerProxy extends WizardTower{
	private static final int NUM_WIZARDS_ALLOWED = 3;
	
	private int numWizards;
	
	@Override
	public void enter(Wizard wizard) {
		// TODO Auto-generated method stub
		if(numWizards < NUM_WIZARDS_ALLOWED){
			
			super.enter(wizard);
			numWizards++;
		}else{
			System.out.println(wizard);
		}
		
	}
}
