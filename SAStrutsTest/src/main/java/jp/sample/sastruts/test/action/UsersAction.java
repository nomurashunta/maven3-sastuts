package jp.sample.sastruts.test.action;

import org.seasar.struts.annotation.Execute;

public class UsersAction
{
    @Execute(validator = false)
    public String index()
    {
    	System.out.println("sample!");
        return "users.jsp";
    }
}
