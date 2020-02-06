package 네트워크;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class iptest {

	public static void main(String[] args) throws UnknownHostException {
		String dns = "localhost";
		InetAddress add = InetAddress.getByName(dns);
		System.out.println(add);
		System.out.println(add.getHostAddress());//add중에서도 getHostAddressaks 추출
	
	}

}
