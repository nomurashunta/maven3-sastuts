package tutorial.action;

import java.util.ArrayList;

import org.seasar.struts.annotation.Execute;

public class MypageAction {
    public Integer test = 100;
    public ArrayList<String> ally = new ArrayList<String>();

    @Execute(validator = false)
    public String index() {
        ally.add("aaaaa");
        ally.add("bbbbb");
        ally.add("ccccc");
        return "index.jsp";
    }
}