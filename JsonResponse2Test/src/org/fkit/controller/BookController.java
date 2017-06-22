package org.fkit.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.fkit.domain.Book;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


/**   
 * @Description: 
 * <br>网站：<a href="http://www.fkit.org">疯狂Java</a> 
 * @author 肖文吉	36750064@qq.com   
 * @version V1.0   
 */
@Controller
@RequestMapping("/json")
public class BookController {
	
	
    @RequestMapping(value="/testRequestBody")
    // @ResponseBody会将集合数据转换json格式返回客户端
    @ResponseBody
    public Object getJson() {
    	SimpleDateFormat format = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
    	String Date_b = format.format(new Date());    	
    	
    	List<Book> list = new ArrayList<Book>();
    	list.add(new Book("覃福东","201562651482","2015电子商务2班",Date_b));
    	Date_b = format.format(new Date());  
    	list.add(new Book("王二","201588888888","2015网络传销1班",Date_b));
    	return list;
    }

}
