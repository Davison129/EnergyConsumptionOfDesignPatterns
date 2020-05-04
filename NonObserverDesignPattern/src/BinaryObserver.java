public class BinaryObserver{
	private int state;

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

	public void printString() {
		System.out.println( "Binary String: " + Integer.toBinaryString( getState() ) ); 
	}
}