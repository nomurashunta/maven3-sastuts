package jp.sample.sastruts.test.action;

import org.seasar.struts.annotation.Execute;

public class IndexAction
{
    @Execute(validator = false)
    public String index()
    {
    	System.out.println("aaaa!!!");
        return "index.jsp";
    }
}
