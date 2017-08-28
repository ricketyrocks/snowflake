package snowflake;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ResourceBundle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Snowflake {
	private static Logger log = LoggerFactory.getLogger(Snowflake.class);
	public static void main(String[] args) throws InterruptedException {

		ResourceBundle bundle = ResourceBundle.getBundle("snowflake");
		String numReplicasStr = bundle.getString("snowflake.number.of.replicas");
		int numReplicas = Integer.parseInt(numReplicasStr);
		String myName = "unknown";
		try {
			myName = InetAddress.getLocalHost().getHostName();
		} catch (UnknownHostException ex) {
			System.out.println("Hostname can not be resolved");
		}
		String msgFmt = "hello, world. My name is %s, and I am 1 of %d";
		String msg = String.format(msgFmt, myName, numReplicas);
		
		while(true) {
			System.out.println(msg);
			log.info(msg);
			Thread.sleep(5000);
		}
	}

	public boolean someLibraryMethod() {
		return true;
	}
}
