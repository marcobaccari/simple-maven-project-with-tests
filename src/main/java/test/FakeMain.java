package test;

import javax.xml.bind.DataBindingException;

import com.fasterxml.jackson.databind.exc.IgnoredPropertyException;

public class FakeMain {

	public static void main(String[] args) {
		
		IgnoredPropertyException bindingException = new IgnoredPropertyException(null, "", null, null, null, null);
		System.out.println("sise" + bindingException);

	}

}
