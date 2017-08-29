package snowflake;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Snowflake {
	private static Logger log = LoggerFactory.getLogger(Snowflake.class);

	public static void main(String[] args) throws InterruptedException {

		String numReplicasStr = System.getenv("TOTAL_REPLICAS");
		// ResourceBundle bundle = ResourceBundle.getBundle("snowflake");
		// String numReplicasStr =
		// bundle.getString("snowflake.number.of.replicas");
		int numReplicas = Integer.parseInt(numReplicasStr);
		int myNumber = 0;
		String myName = "unknown";
		try {
			myName = InetAddress.getLocalHost().getHostName();
			myNumber = 1 + Integer.parseInt(myName.substring(myName.lastIndexOf('-') + 1));
		} catch (UnknownHostException ex) {
			System.out.println("Hostname can not be resolved");
		}
		String msgFmt = "hello, world. My name is %s, and I am %d of %d";
		String msg = String.format(msgFmt, myName, myNumber, numReplicas);

		while (true) {
			System.out.println(msg);
			log.info(msg);
			Thread.sleep(5000);
		}
	}

	public boolean someLibraryMethod() {
		return true;
	}
}
