/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.59
 * Generated at: 2015-05-12 06:54:06 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.view.register;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

private static org.apache.jasper.runtime.ProtectedFunctionMapper _jspx_fnmap_0;

static {
  _jspx_fnmap_0= org.apache.jasper.runtime.ProtectedFunctionMapper.getMapForFunction("f:url", org.seasar.struts.taglib.S2Functions.class, "url", new Class[] {java.lang.String.class});
}

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/WEB-INF/view/common/common.jsp", Long.valueOf(1431143320000L));
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005fform;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fs_005fform = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fs_005fform.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("  \r\n");
      out.write("  \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("<title>登録</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<h1>登録ページ</h1>\n");
      out.write("\n");
      out.write("<h2>\n");
      out.write("<a href='");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${f:url(\"/index\")}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, _jspx_fnmap_0, false));
      out.write("'>TOP</a>\n");
      out.write("<a href='");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${f:url(\"/register\")}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, _jspx_fnmap_0, false));
      out.write("'>登録</a>\n");
      out.write("<a href='");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${f:url(\"/list\")}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, _jspx_fnmap_0, false));
      out.write("'>一覧</a>\n");
      out.write("</h2>\n");
      out.write("\n");
      out.write("\n");
      out.write("Recomemberを登録します。<br>\n");
      out.write("\n");
      out.write("<!-- <form method=\"post\" action=\"registerComfirm\">-->\n");
      if (_jspx_meth_s_005fform_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_s_005fform_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  s:form
    org.seasar.struts.taglib.S2FormTag _jspx_th_s_005fform_005f0 = (org.seasar.struts.taglib.S2FormTag) _005fjspx_005ftagPool_005fs_005fform.get(org.seasar.struts.taglib.S2FormTag.class);
    _jspx_th_s_005fform_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005fform_005f0.setParent(null);
    int _jspx_eval_s_005fform_005f0 = _jspx_th_s_005fform_005f0.doStartTag();
    if (_jspx_eval_s_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\t名前 <input id=\"new-name\" type=\"text\" name=\"newName\"><br>\n");
        out.write("\t電話番号<input id=\"new-phone\" type=\"text\" name=\"newPhone\"><br>\n");
        out.write("\t誕生日<br>\n");
        out.write("\t好きな食べ物のジャンル\n");
        out.write("\t\t<select name=\"food\">\n");
        out.write("  \t\t<option value=\"\">選択してください</option>\n");
        out.write("  \t\t<option value=\"1\">和食</option>\n");
        out.write("  \t\t<option value=\"2\">洋食</option>\n");
        out.write("  \t\t<option value=\"3\">中華</option>\n");
        out.write("   \t\t</select><br>\n");
        out.write("   \t話したことが\n");
        out.write("   \t\t<input type=\"radio\" name=\"talkFlag\" value=\"1\">ある\n");
        out.write("\t\t<input type=\"radio\" name=\"talkFlag\" value=\"2\" checked>ない<br>\n");
        out.write("\tノート\n");
        out.write("\t\t<textarea name=\"note\" cols=40 rows=4></textarea>\n");
        out.write("\t\t\n");
        out.write("\t\t<input type=\"submit\" name=\"registerConfirm\" value=\"確認\">\n");
        out.write("\t\t\n");
        int evalDoAfterBody = _jspx_th_s_005fform_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_s_005fform_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fform.reuse(_jspx_th_s_005fform_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fform.reuse(_jspx_th_s_005fform_005f0);
    return false;
  }
}
