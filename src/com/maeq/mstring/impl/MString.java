/**
 * 
 */
package com.maeq.mstring.impl;

/**
 * @author maeq
 *
 */
public class MString {

	private  char[] value;	// 变量名 开始叫做arr 后参考jdk更改为value  
	
	public MString(){
		// 默认构造函数  此处要不要初始化成员变量value？
		// 长度为0的数组 并非和null等价
		// 初始化为长度0数组  可以有效的防止空指针问题
		value = new char[0];
	}
	
	// 双引号 "hello,world." 这样的字符串 编译器编译后为String类型
	// 如 MString s = new MString("hello,world.");  将调用此构造函数
	public MString(MString s){
		// 很特殊的用法  可以直接忽略private特性 直接访问对象内的变量
		this.value = s.value;
	}
	
	public MString(char[] arr){
		// TODO
	}
	
	public MString(String s){
		// TODO
	}
	
	public String toString(){
		// jdk中这里是直接返回this，此类返回的需要转换成string在返回
		return new String(value);
	}

}
