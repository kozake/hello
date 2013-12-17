public class ShutdownKick {
	public static void main(String[] args) throws Exception {
		if (args.length > 0) {
			new java.net.URL(args[0]).openConnection().getInputStream();
		}
	}
}
