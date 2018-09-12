package test.template.concrete;

import test.template.AbstractChangeNumMethod;

public class FirstStageConcreteMethod extends AbstractChangeNumMethod {

	@Override
	protected boolean checkNum(int num, int divisor) {
		return 0==num%divisor;
	}

}
