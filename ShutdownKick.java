import java.io.*;
import java.net.*;

public class ShutdownKick {
	public static void main(String[] args) throws Exception {
		if (args.length > 0) {
			URL url = new URL("http://127.0.0.1:9000/stop/");
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			connection.setDoOutput(true);
			connection.setRequestMethod("POST");
			String parameterString = new String("id=" + args[0]);
			PrintWriter printWriter = new PrintWriter(connection.getOutputStream());
			printWriter.print(parameterString);
			printWriter.close();
			connection.getInputStream();
			connection.disconnect();
		}
	}
}
