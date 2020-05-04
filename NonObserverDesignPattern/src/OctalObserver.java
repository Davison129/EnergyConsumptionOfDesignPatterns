public class OctalObserver{
	private int state;

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

	public void printString() {
		System.out.println( "Octal String: " + Integer.toOctalString( getState() ) ); 
	}
}