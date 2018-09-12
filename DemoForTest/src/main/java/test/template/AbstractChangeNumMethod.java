package test.template;

import java.util.LinkedHashMap;

public abstract class AbstractChangeNumMethod {
	
	protected abstract boolean checkNum(int num, int divisor);
	
	public final String change (int inputNum, LinkedHashMap<Integer,String> ruleMap) {
		if (0 == inputNum || null == ruleMap) {
			return null;
		}
		StringBuilder sb = new StringBuilder();
		for (int divisor : ruleMap.keySet()) {
			if (checkNum(inputNum, divisor)) {
				sb.append(ruleMap.get(divisor));
			}
		}
		if (0 == sb.length()) {
			sb.append(inputNum);
		}
		return sb.toString();
	}
}
