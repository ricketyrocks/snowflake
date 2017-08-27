import java.net.InetAddress;
import java.net.UnknownHostException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Library {
	private static Logger log = LoggerFactory.getLogger(Library.class);
	public static void main(String[] args) {

		String myName = "unknown";
		try {
			myName = InetAddress.getLocalHost().getHostName();
		} catch (UnknownHostException ex) {
			System.out.println("Hostname can not be resolved");
		}
		String msg = "hello, world. My name is " + myName;
		System.out.println(msg);
		log.info(msg);
	}

	public boolean someLibraryMethod() {
		return true;
	}
}
