/**
 * 
 */
package com.maeq.mstring.test;

import com.maeq.mstring.impl.MString;

/**
 * @author maeq
 *
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String temp;
		MString s = new MString();
		System.out.println(s);
		// com.maeq.mstring.impl.MString@11f24bb
		// @ 之后为 hashcode 若没有定义toString方法 则调用基类Object的toString方法

		MString s2 = new MString("t");
		
	}

}
