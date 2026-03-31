package searching;

public class CompareStringBufferWithStringBuilderForStringConcatenation {
	public static void main(String[] args) {
		String str = "hi";
		StringBuffer stringBuffer = new StringBuffer();
		long startBuffer = System.nanoTime();
		for(int i=0;i<1000000;i++) {
			stringBuffer.append(str);
		}
		long endBuffer = System.nanoTime();
		long bufferTime = endBuffer - startBuffer;
		System.out.println("StringBuffer time: "+bufferTime+"ns");
		
		//System.nanoTime(stringBuffer);
		StringBuilder stringBuilder = new StringBuilder();
		long startBuilder = System.nanoTime();
		for(int j=0;j<1000000;j++) {
			stringBuilder.append(str);
		}
		long endBuilder = System.nanoTime();
		long builderTime = endBuilder - startBuilder;
		System.out.println("StringBuilder time: "+builderTime+"ns");
		
	}
}
