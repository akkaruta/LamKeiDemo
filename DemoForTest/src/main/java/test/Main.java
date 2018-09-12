package test;

import java.util.LinkedHashMap;

import test.template.AbstractChangeNumMethod;
import test.template.concrete.FirstStageConcreteMethod;
import test.template.concrete.SecondStageConcreteMethod;

public class Main {
	public static void printGameNum(int totalNum,AbstractChangeNumMethod method) {
		for (int i=1; i<=totalNum; i++) {
			LinkedHashMap<Integer,String> ruleMap = new LinkedHashMap<Integer,String>();
			ruleMap.put(3, "Fizz");
			ruleMap.put(5, "Buzz");
			//ruleMap.put(6, "Faci");
			System.out.println(method.change(i, ruleMap));
		}
	}
	public static void main(String[] args) {
		AbstractChangeNumMethod method1 = new FirstStageConcreteMethod();
		AbstractChangeNumMethod method2 = new SecondStageConcreteMethod();
		LinkedHashMap<Integer,String> ruleMap = new LinkedHashMap<Integer,String>();
		ruleMap.put(3, "Fizz");
		ruleMap.put(5, "Buzz");
		//printGameNum(33,method2);
		System.out.println(method2.change(33, ruleMap));
	}
}
