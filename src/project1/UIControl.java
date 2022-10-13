package project1;

public abstract class UIControl extends Object {
	private boolean isEnabled = true;
	
	
//	public UIControl(boolean isEnabled) {
//	super();
//	System.out.println("UIControl");
//	this.isEnabled = isEnabled;
//}
	
	public abstract void render();
		
	
	
	public void enable() {
		isEnabled = true;
	}
	
	public void disable() {
		isEnabled = false;
	}
	
	public boolean isEnabled() {
		return isEnabled;
	}


}
