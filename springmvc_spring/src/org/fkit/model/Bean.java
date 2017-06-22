package org.fkit.model;

import org.springframework.stereotype.Repository;  



@Repository  
public class Bean {  
  
	public void sayHello1() {  
        System.out.println("姓名：覃福东  学号：201562651482");  
        
    }
	
	public String sayHi() {  
        return "姓名：覃福东  学号：201562651482";  
        
    } 
}  
