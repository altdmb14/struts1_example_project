package ru.struts1.action;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import ru.struts1.form.HelloWorldForm;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloWorldAction extends Action {

    public ActionForward execute(ActionMapping mapping, ActionForm form,
                                 HttpServletRequest request, HttpServletResponse response) throws Exception {
        HelloWorldForm helloWorldForm = (HelloWorldForm) form;
        helloWorldForm.setGreeting("Hello World Struts1 !");

        return mapping.findForward("success");
    }
}
