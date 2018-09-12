package test.template.concrete;

import test.template.AbstractChangeNumMethod;

public class SecondStageConcreteMethod extends AbstractChangeNumMethod {

	@Override
	protected boolean checkNum(int num, int divisor) {
		if (num%divisor==0) {
			return true;
		}
		while (num > 0) {
			if (divisor == num%10) {
				return true;
			}
			num/=10;
		}
		
		return false;
	}

}
