package inputOutputStream;

import com.vinay.exceptions.FooRuntimeException;

public class MyFileUtils {
	public int subtract10FromLargerNumber(int number) throws FooRuntimeException {
		if (number < 10) {
			throw new FooRuntimeException("The number was smaller than 10");
		}

		return number - 10;
	}
}
