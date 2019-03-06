package test;

import javax.xml.bind.DataBindingException;

public class FakeMain {

	public static void main(String[] args) {
		
		DataBindingException bindingException = new DataBindingException("eeee", new Throwable());
		System.out.println("sise" + bindingException);

	}

}
