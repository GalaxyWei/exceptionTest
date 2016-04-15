/**  
 * Project Name:exceptionTest  
 * File Name:Test.java  
 * Package Name:exceptionTest.test  
 * Date:2015年9月14日下午5:29:25  
 * Copyright (c) 2015, sxw1989@126.com All Rights Reserved.  
 *  
*/  
  
package exceptionTest.test;  

import exceptionTest.exception.BaseException;

/**  
 * ClassName:Test <br/>  
 * Function: TODO ADD FUNCTION. <br/>  
 * Date:     2015年9月14日 下午5:29:25 <br/>  
 * @author   xuwei.shen  
 * @version  1.0
 * @since    JDK 1.7 
 */
public class Test {
	
	public static void base(int i)throws Exception{
		if(i>5)
		{
			throw new BaseException("parameter is over fine");
		}
		System.out.println("ok");
	}

	public static void main(String[] args) throws Exception {

		int i = 6;
		try {
			base(i);
		} catch (BaseException e) {
			  System.out.println(e.getMessage());
			
		}
	}

}
  
