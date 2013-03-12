package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class options_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link href=\"css/bootstrap.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"css/bootstrap-responsive.css\" rel=\"stylesheet\">\n");
      out.write("        <link type=\"text/css\" href=\"css/hot-sneaks/jquery-ui-1.8.21.custom.css\" rel=\"stylesheet\" />\n");
      out.write("        <link href=\"css/style.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <script type=\"text/javascript\" src=\"js/jquery-1.7.2.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" language=\"javascript\" src=\"js/bootstrap.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" language=\"javascript\" src=\"js/bootstrap.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" language=\"javascript\" src=\"js/mustache.js\"></script>\n");
      out.write("\n");
      out.write("\t<script type=\"text/javascript\" src=\"js/jquery-ui-1.8.21.custom.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"js/jquery.js\"></script>\n");
      out.write("        <title>Make My Day!</title>\n");
      out.write("    </head>\n");
      out.write("<!--<body  style=\"background-color:#6ab200; background-image: -ms-linear-gradient(top, #FFFFFF, #6ab200); background-image: -webkit-gradient(linear, 0 0, 0 100%, from(#FFFFFF), to(#6ab200)); background-image: -webkit-linear-gradient(top, #FFFFFF, #6ab200); background-image: -o-linear-gradient(top, #FFFFFF, #6ab200); background-image: linear-gradient(top, #ffffff, #6ab200); background-image: -moz-linear-gradient(top, #ffffff, #6ab200);\"> -->\n");
      out.write("<body>\n");
      out.write("    \n");
      out.write("    <a href=\"index.jsp\" >Try another!</a>\n");
      out.write("        <script>\n");
      out.write("            var json = {\"plans\": [\n");
      out.write("                {\n");
      out.write("                    \"name\" : \"Plan1\",\n");
      out.write("                    \"events\": [\n");
      out.write("                        {\"startTime\": \"Sat Jul 07 09:30:00 PDT 2012\", \n");
      out.write("                         \"cat\": \"Fitness\",\n");
      out.write("                         \"address\":\"344 Tully Road,San Jose\",\n");
      out.write("                         \"eventUrl\":\"http://www.meetup.com/AsianMeetups/events/64437182/\",\n");
      out.write("                         \"eventName\":\"Water Balloons!  (Saturday, 7/7/12, 930am - South SJ)\",\n");
      out.write("                         \"endTime\":\"Sat Jul 07 12:30:00 PDT 2012\",\n");
      out.write("                         \"photoUrl\":\"http://photos1.meetupstatic.com/photos/event/f/b/f/global_43996031.jpeg\",\n");
      out.write("                         \"RSVPNum\":41,\n");
      out.write("                         \"duration\": \"1 hour\", \n");
      out.write("                         \"direction\": \"35.0mi\"\n");
      out.write("                        },\n");
      out.write("                        {\"startTime\": \"Sat Jul 07 09:30:00 PDT 2012\", \n");
      out.write("                         \"cat\": \"Fitness\",\n");
      out.write("                         \"address\":\"344 Tully Road,San Jose\",\n");
      out.write("                         \"eventUrl\":\"http://www.meetup.com/AsianMeetups/events/64437182/\",\n");
      out.write("                         \"eventName\":\"Water Balloons!  (Saturday, 7/7/12, 930am - South SJ)\",\n");
      out.write("                         \"endTime\":\"Sat Jul 07 12:30:00 PDT 2012\",\n");
      out.write("                         \"photoUrl\":\"http://photos1.meetupstatic.com/photos/event/f/b/f/global_43996031.jpeg\",\n");
      out.write("                         \"RSVPNum\":41,\n");
      out.write("                         \"duration\": \"1 hour\", \n");
      out.write("                         \"direction\": \"35.0mi\"\n");
      out.write("                        },\n");
      out.write("                         {\"startTime\": \"Sat Jul 07 09:30:00 PDT 2012\", \n");
      out.write("                         \"cat\": \"Fitness\",\n");
      out.write("                         \"address\":\"344 Tully Road,San Jose\",\n");
      out.write("                         \"eventUrl\":\"http://www.meetup.com/AsianMeetups/events/64437182/\",\n");
      out.write("                         \"eventName\":\"Water Balloons!  (Saturday, 7/7/12, 930am - South SJ)\",\n");
      out.write("                         \"endTime\":\"Sat Jul 07 12:30:00 PDT 2012\",\n");
      out.write("                         \"photoUrl\":\"http://photos1.meetupstatic.com/photos/event/f/b/f/global_43996031.jpeg\",\n");
      out.write("                         \"RSVPNum\":41,\n");
      out.write("                         \"duration\": \"\", \n");
      out.write("                         \"direction\": \"\"\n");
      out.write("                        }\n");
      out.write("                    ]\n");
      out.write("                },\n");
      out.write("                {\n");
      out.write("                    \"name\" : \"Plan2\",\n");
      out.write("                    \"events\": [\n");
      out.write("                        {\"startTime\": \"Sat Jul 07 09:30:00 PDT 2012\", \n");
      out.write("                         \"cat\": \"Fitness\",\n");
      out.write("                         \"address\":\"344 Tully Road,San Jose\",\n");
      out.write("                         \"eventUrl\":\"http://www.meetup.com/AsianMeetups/events/64437182/\",\n");
      out.write("                         \"eventName\":\"Water Balloons!  (Saturday, 7/7/12, 930am - South SJ)\",\n");
      out.write("                         \"endTime\":\"Sat Jul 07 12:30:00 PDT 2012\",\n");
      out.write("                         \"photoUrl\":\"http://photos1.meetupstatic.com/photos/event/f/b/f/global_43996031.jpeg\",\n");
      out.write("                         \"RSVPNum\":41,\n");
      out.write("                         \"duration\": \"1 hour\", \n");
      out.write("                         \"direction\": \"35.0mi\"\n");
      out.write("                        },\n");
      out.write("                        {\"startTime\": \"Sat Jul 07 09:30:00 PDT 2012\", \n");
      out.write("                         \"cat\": \"Fitness\",\n");
      out.write("                         \"address\":\"344 Tully Road,San Jose\",\n");
      out.write("                         \"eventUrl\":\"http://www.meetup.com/AsianMeetups/events/64437182/\",\n");
      out.write("                         \"eventName\":\"Water Balloons!  (Saturday, 7/7/12, 930am - South SJ)\",\n");
      out.write("                         \"endTime\":\"Sat Jul 07 12:30:00 PDT 2012\",\n");
      out.write("                         \"photoUrl\":\"http://photos1.meetupstatic.com/photos/event/f/b/f/global_43996031.jpeg\",\n");
      out.write("                         \"RSVPNum\":41,\n");
      out.write("                         \"duration\": \"1 hour\", \n");
      out.write("                         \"direction\": \"35.0mi\"\n");
      out.write("                        },\n");
      out.write("                        {\"startTime\": \"Sat Jul 07 09:30:00 PDT 2012\", \n");
      out.write("                         \"cat\": \"Fitness\",\n");
      out.write("                         \"address\":\"344 Tully Road,San Jose\",\n");
      out.write("                         \"eventUrl\":\"http://www.meetup.com/AsianMeetups/events/64437182/\",\n");
      out.write("                         \"eventName\":\"Water Balloons!  (Saturday, 7/7/12, 930am - South SJ)\",\n");
      out.write("                         \"endTime\":\"Sat Jul 07 12:30:00 PDT 2012\",\n");
      out.write("                         \"photoUrl\":\"http://photos1.meetupstatic.com/photos/event/f/b/f/global_43996031.jpeg\",\n");
      out.write("                         \"RSVPNum\":41,\n");
      out.write("                         \"duration\": \"\", \n");
      out.write("                         \"direction\": \"\"\n");
      out.write("                        }\n");
      out.write("                    ]\n");
      out.write("                }\n");
      out.write("            ]};\n");
      out.write("            \n");
      out.write("            \n");
      out.write(" \n");
      out.write("             \n");
      out.write("        $(function() {\n");
      out.write("            //var output = Mustache.render($('#events-template').html(), json);\n");
      out.write("            //$('#rendered-output').html(output);\n");
      out.write("\n");
      out.write("            $.getJSON('json/jsonSample.json').done( function(data) {\n");
      out.write("                var plans = [];\n");
      out.write("                var cleanedUpData = {plans: plans};\n");
      out.write("                for (var i in data.planlist) {\n");
      out.write("                    var plan = data.planlist[i];\n");
      out.write("                    var events = [];\n");
      out.write("                    var routes = [];\n");
      out.write("                    var cleanedUpPlan = {};\n");
      out.write("                    if (i == 0) {\n");
      out.write("                     cleanedUpPlan = {name: (\"Plan 1 (From your preference)\" ), events: events, routes: routes}  \n");
      out.write("                    }\n");
      out.write("                    if (i == 1) {\n");
      out.write("                      cleanedUpPlan = {name: (\"Plan 2 (More eventful!)\" ), events: events, routes: routes}  \n");
      out.write("                    }\n");
      out.write("                                        \n");
      out.write("                    plans.push(cleanedUpPlan);\n");
      out.write("                    for (var j in plan) {\n");
      out.write("                        var event = plan[j];\n");
      out.write("                        //var route = \n");
      out.write("                        if (event[0] === \"event\") {\n");
      out.write("                            events.push(event[1]);    \n");
      out.write("                        }   \n");
      out.write("                        if (event[0] === \"route\") {\n");
      out.write("                            routes.push(event[1]);    \n");
      out.write("                        } \n");
      out.write("                    }\n");
      out.write("                }\n");
      out.write("                console.log(data);\n");
      out.write("                console.log(cleanedUpData);\n");
      out.write("                var template = $('#events-template').html();\n");
      out.write("                var html = Mustache.to_html(template, cleanedUpData);\n");
      out.write("                \n");
      out.write("                $('#rendered-output').html(html);\n");
      out.write("            }).fail(function() {\n");
      out.write("                console.log('fail!');\n");
      out.write("                console.log(arguments);\n");
      out.write("            });\n");
      out.write("        });\n");
      out.write("\n");
      out.write("        </script>\n");
      out.write("            <a href=#><img src=\"img/mmd_logo.jpg\"></a>\n");
      out.write("            \n");
      out.write("\n");
      out.write("        <script type=\"mustache-template\" id=\"events-template\">\n");
      out.write("            <p>We have planned the following sets of exciting events for you! :)</p>\n");
      out.write("            <ul class=\"thumbnails\">\n");
      out.write("\n");
      out.write("                {{#plans}}\n");
      out.write("                        \n");
      out.write("<!--                <li class=\"span4\" style=\"background-color:#6ab200; background-image: -ms-linear-gradient(top, #6ab200, #ffffff); background-image: -webkit-gradient(linear, 0 0, 0 100%, from(#6ab200), to(#ffffff)); background-image: -webkit-linear-gradient(top, #6ab200, #ffffff); background-image: -o-linear-gradient(top, #6ab200, #ffffff); background-image: linear-gradient(top, #6ab200, #ffffff); background-image: -moz-linear-gradient(top, #6ab200, #ffffff);\">-->\n");
      out.write("                <li class=\"span4\" style=\"background-color:#449AC8; background-image: -ms-linear-gradient(top, #449AC8, #ffffff); background-image: -webkit-gradient(linear, 0 0, 0 100%, from(#449AC8), to(#ffffff)); background-image: -webkit-linear-gradient(top, #449AC8, #ffffff); background-image: -o-linear-gradient(top, #449AC8, #ffffff); background-image: linear-gradient(top, #449AC8, #ffffff); background-image: -moz-linear-gradient(top, #449AC8, #ffffff);\">\n");
      out.write("<!--                <li class=\"span4\" style=\"background-color:#A3CDE4;\">-->\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <legend style=\"font-family: ARIAL; color: #0C2170;\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;{{name}}</legend> \n");
      out.write("           <!--         <div class=\"thumbnail\"> -->\n");
      out.write("                        \n");
      out.write("                         <ul class=\"thumbnails meetup-event\">\n");
      out.write("                        {{#events}}\n");
      out.write("                            <li class=\"span3\" >\n");
      out.write("                                <div class=\"thumbnail meetup-event\" style=\"overflow: auto;\">\n");
      out.write("                            <h3><a href={{eventUrl}} style=\"color: #0C2170\">{{eventName}}</a></h3>\n");
      out.write("                            <h4 style=\"color: #8E2B38;\">{{startTimeStr}} - {{endTimeStr}}</h4>\n");
      out.write("                            <img src={{photoUrl}} alt=\"\" style=\"display: inline; max-height: 50px; float: left;\">\n");
      out.write("                            <text style=\"display: inline; \">@{{address}}</text>\n");
      out.write("                            <br/>\n");
      out.write("                            <text>({{rsvpnum}} RSVP)</text><br>           \n");
      out.write("                            <img src=\"img/down_arrow.png\" style=\"max-height: 50px; border-width: 0; display: inline;\" />\n");
      out.write("                            <text>{{direction}} {{duration}}</text>\n");
      out.write("                                </div>\n");
      out.write("                            </li>\n");
      out.write("                            \n");
      out.write("                        {{/events}}\n");
      out.write("                         </ul>\n");
      out.write("                   <!-- </div> -->\n");
      out.write("               </li>\n");
      out.write("\n");
      out.write("                {{/plans}}\n");
      out.write("\n");
      out.write("           </ul>\n");
      out.write("        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<img src=\"img/end.jpeg\" style=\"max-height: 100px; display: inline\"/>\n");
      out.write("            \n");
      out.write("         &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("         &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<img src=\"img/end.jpeg\" style=\"max-height: 100px; display: inline\"/>\n");
      out.write("        </script>\n");
      out.write("        \n");
      out.write("        <div id=\"rendered-output\">\n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        \n");
      out.write("        \n");
      out.write("<!--        ");
 String url = "https://maps.google.com/maps?f=d&amp;source=s_d&amp;saddr=2029+Stierlin+Court,+Mountain+View,+CA&amp;daddr=Facebook+Inc,+Willow+Road,+Menlo+Park,+CA&amp;hl=en&amp;geocode=FZsIOwIdKFm5-CkL33pp47mPgDF0a3Fa-Wj2tA%3BFfXyOwIdayO4-CH4NlJhSitLNCmVRiKC6rqPgDH4NlJhSitLNA&amp;aq=2&amp;oq=face&amp;sll=37.43199,-122.112275&amp;sspn=0.076062,0.154324&amp;mra=ls&amp;ie=UTF8&amp;t=m&amp;ll=37.431932,-122.11235&amp;spn=0.040894,0.051498&amp;z=13&amp;output=embed";
        
      out.write("\n");
      out.write("        <div style=\"margin-left: auto; margin-right: auto;\">\n");
      out.write("        <iframe width=\"300\" height=\"300\" frameborder=\"0\" scrolling=\"no\" marginheight=\"0\" marginwidth=\"0\" src=");
      out.print(url);
      out.write("></iframe><br /><small><a href=\"https://maps.google.com/maps?f=d&amp;source=embed&amp;saddr=2029+Stierlin+Court,+Mountain+View,+CA&amp;daddr=Facebook+Inc,+Willow+Road,+Menlo+Park,+CA&amp;hl=en&amp;geocode=FZsIOwIdKFm5-CkL33pp47mPgDF0a3Fa-Wj2tA%3BFfXyOwIdayO4-CH4NlJhSitLNCmVRiKC6rqPgDH4NlJhSitLNA&amp;aq=2&amp;oq=face&amp;sll=37.43199,-122.112275&amp;sspn=0.076062,0.154324&amp;mra=ls&amp;ie=UTF8&amp;t=m&amp;ll=37.431932,-122.11235&amp;spn=0.040894,0.051498&amp;z=13\" style=\"color:#0000FF;text-align:left\">View Larger Map</a></small>\n");
      out.write("        </div>-->\n");
      out.write("    </body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
