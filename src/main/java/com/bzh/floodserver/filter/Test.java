package com.bzh.floodserver.filter;

/**
 * @author 毕泽浩
 * @Description:
 * @time 2018/11/5 15:11
 */
public class Test {

	public SAdd strengAdd(int x, Add add) {
		return val -> 30 * add.run(x, val);
	}

	public static void main(String[] args) {
		Test test = new Test();

		SAdd sAdd = test.strengAdd(10, (x, y) -> x + y);

		System.out.println(sAdd.run(5));
	}

}

interface Add {
	int run(int x, int y);
}

interface SAdd {
	int run(int val);
}

