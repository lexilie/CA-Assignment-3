package processor.pipeline;

public class EX_MA_LatchType {

	boolean enableMA;
	int aluResult;
	Instruction instruction;

	//class constructors
	public EX_MA_LatchType() {enableMA = false;}
	public EX_MA_LatchType(boolean enableMA) {enableMA = enableMA;}
	public EX_MA_LatchType(boolean enableMA, int aluResult) {
		enableMA = enableMA;
		this.aluResult = aluResult;
	}
	public EX_MA_LatchType(boolean enableMA, int aluResult, Instruction instruction) {
		enableMA = enableMA;
		this.aluResult = aluResult;
		this.instruction = instruction;
	}

	public boolean isenableMA() {
		return enableMA;
	}

	public void setenableMA(boolean enableMA) {
		enableMA = enableMA;
	}

	public Instruction getInstruction() {return instruction;}

	public void setInstruction(Instruction inst) {instruction = inst;}

	public int getaluResult() {return aluResult;}

	public void setaluResult(int result) {aluResult = result;}
}
