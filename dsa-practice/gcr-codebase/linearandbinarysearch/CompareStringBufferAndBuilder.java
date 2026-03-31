package linearandbinarysearch;


public class CompareStringBufferAndBuilder {
	public static void main(String[] args) {
		
		StringBuffer strBuffer= new StringBuffer();
		StringBuilder strBuilder= new StringBuilder();
		
		//for buffer
		long startForBuffer= System.nanoTime();
		for(int i=0;i<1000000;i++) {
			strBuffer.append("hello");
		}
		long endForBuffer= System.nanoTime();
		long bufferTime= endForBuffer-startForBuffer;
		
		//for builder
		long startForBuilder= System.nanoTime();
		for(int i=0;i<1000000;i++) {
			strBuilder.append("hello");
		}
		long endForBuilder= System.nanoTime();
		long builderTime= endForBuilder-startForBuilder;
		
		System.out.println("For Buffer: "+ bufferTime);
		System.out.println("For Builder: "+ builderTime);
	}
}
