package processor.pipeline;

public class EX_IF_LatchType {
	
	boolean Enable; //latch enable
	int PC; //program counter

	//class constructors
	public EX_IF_LatchType() {Enable = false;}
	public EX_IF_LatchType(boolean enable) {Enable = enable;}
	public EX_IF_LatchType(boolean enable, int pc) {Enable = enable; PC = pc;}

	//set functions
	public void setEnable(boolean enable, int newPC) {Enable = enable; PC = newPC;}
	public void setEnable(boolean enable) {Enable = enable;}
	public void setPC(int newPC) {PC = newPC;}

	//get functions
	public boolean getEnable() {return Enable;}
	public int getPC() {return PC;}

}
