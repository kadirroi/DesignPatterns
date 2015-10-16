package home;

import client.ClientA;
import client.ClientB;

public class Home {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClientA a = new ClientA();
		a.doSomeClientAJob();
		
		ClientB b =  new ClientB();
		b.doSomeClientBJob();
		
	}

}
