public class HexaObserver{
	private int state;

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

	public void printString() {
		System.out.println( "Hex String: " + Integer.toHexString( getState() ).toUpperCase() ); 
	}
}