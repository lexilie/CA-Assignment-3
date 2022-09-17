package processor.pipeline;

public class EX_IF_LatchType {
	
	public EX_IF_LatchType()
	{
		boolean Enable; //latch enable
		int PC; //program counter

		//class constructors
		public EX_IF_LatchType() {Enable = false;}
		public EX_IF_LatchType(boolean Enable) {Enable = Enable;}
		public EX_IF_LatchType(boolean Enable, int pc) {Enable = Enable; PC = pc;}

		//set functions
		public void setEnable(boolean Enable, int newPC) {Enable = Enable; PC = newPC;}
		public void setEnable(boolean Enable) {Enable = Enable;}
		public void setPC(int newPC) {PC = newPC;}

		//get functions
		public boolean getEnable() {return Enable;}
		public int getPC() {return PC;}
	}

}
