package br.coffea.exec;

public class VerifiedMemoryUsed {
	private static final long MEGABYTE = 1024L * 1024L;

	public static long bytesToMegabytes(long bytes) {
		return bytes / MEGABYTE;
	}

	public static void main(String[] args) {
		Runtime runtime = Runtime.getRuntime();
		
		// Run the garbage collector
		runtime.gc();
		System.gc();

		// Calculate the used memory
		long memory = runtime.totalMemory() - runtime.freeMemory();
		System.out.println("Used memory is bytes: " + memory);
		System.out.println("Used memory is megabytes: " + bytesToMegabytes(memory));
		System.out.println("Memory used="
				+ (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) / (1024 * 1024) + "M");
	}
}
