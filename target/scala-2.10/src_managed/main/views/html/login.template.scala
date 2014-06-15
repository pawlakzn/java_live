
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._
/**/
object login extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[Application.Login],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(form: Form[Application.Login]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.33*/("""

<html>
<head>
    <title>Relacje LIVE</title>
    <link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*6.55*/routes/*6.61*/.Assets.at("images/favicon.png"))),format.raw/*6.93*/("""">

    <link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(Seq[Any](/*8.66*/routes/*8.72*/.Assets.at("stylesheets/main.css"))),format.raw/*8.106*/("""">
    <link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(Seq[Any](/*9.66*/routes/*9.72*/.Assets.at("stylesheets/bootstrap.min.css"))),format.raw/*9.115*/("""">
    <link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(Seq[Any](/*10.66*/routes/*10.72*/.Assets.at("stylesheets/login.css"))),format.raw/*10.107*/("""">



</head>
<body>

<header class="topbar">
    <h1 class="fill">
        <a href=""""),_display_(Seq[Any](/*19.19*/routes/*19.25*/.Matches.index())),format.raw/*19.41*/("""">
            System relacji LIVE meczów piłkarskich
        </a>
        <div style="float:right;">
            <a href=""""),_display_(Seq[Any](/*23.23*/routes/*23.29*/.Application.login())),format.raw/*23.49*/("""">Logowanie</a></a>
            <a href=""""),_display_(Seq[Any](/*24.23*/routes/*24.29*/.Users.create())),format.raw/*24.44*/("""">Rejestracja</a>
        </div>
    </h1>
</header>

"""),_display_(Seq[Any](/*29.2*/helper/*29.8*/.form(routes.Application.authenticate)/*29.46*/ {_display_(Seq[Any](format.raw/*29.48*/("""

<h1>Logowanie</h1>

"""),_display_(Seq[Any](/*33.2*/if(form.hasGlobalErrors)/*33.26*/ {_display_(Seq[Any](format.raw/*33.28*/("""
<p class="error">
    """),_display_(Seq[Any](/*35.6*/form/*35.10*/.globalError.message)),format.raw/*35.30*/("""
</p>
""")))})),format.raw/*37.2*/("""

"""),_display_(Seq[Any](/*39.2*/if(flash.contains("success"))/*39.31*/ {_display_(Seq[Any](format.raw/*39.33*/("""
<p class="success">
    """),_display_(Seq[Any](/*41.6*/flash/*41.11*/.get("success"))),format.raw/*41.26*/("""
</p>
""")))})),format.raw/*43.2*/("""

<p>
    <input type="login" name="login" placeholder="Login" value=""""),_display_(Seq[Any](/*46.66*/form("login")/*46.79*/.value)),format.raw/*46.85*/("""">
</p>
<p>
    <input type="password" name="password" placeholder="Hasło" value=""""),_display_(Seq[Any](/*49.72*/form("password")/*49.88*/.value)),format.raw/*49.94*/("""">
</p>
<p>
    <button type="submit">Zaloguj</button>
</p>

""")))})),format.raw/*55.2*/("""

</body>
</html>
    


"""))}
    }
    
    def render(form:Form[Application.Login]): play.api.templates.HtmlFormat.Appendable = apply(form)
    
    def f:((Form[Application.Login]) => play.api.templates.HtmlFormat.Appendable) = (form) => apply(form)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Jun 15 11:18:35 CEST 2014
                    SOURCE: D:/Pawlak/Play/live/app/views/login.scala.html
                    HASH: 4d5a542ce63f01cc94f8ed226b06205ff3b59c5f
                    MATRIX: 791->1|916->32|1058->139|1072->145|1125->177|1231->248|1245->254|1301->288|1405->357|1419->363|1484->406|1589->475|1604->481|1662->516|1793->611|1808->617|1846->633|2010->761|2025->767|2067->787|2146->830|2161->836|2198->851|2293->911|2307->917|2354->955|2394->957|2456->984|2489->1008|2529->1010|2590->1036|2603->1040|2645->1060|2685->1069|2725->1074|2763->1103|2803->1105|2866->1133|2880->1138|2917->1153|2957->1162|3067->1236|3089->1249|3117->1255|3239->1341|3264->1357|3292->1363|3391->1431
                    LINES: 26->1|29->1|34->6|34->6|34->6|36->8|36->8|36->8|37->9|37->9|37->9|38->10|38->10|38->10|47->19|47->19|47->19|51->23|51->23|51->23|52->24|52->24|52->24|57->29|57->29|57->29|57->29|61->33|61->33|61->33|63->35|63->35|63->35|65->37|67->39|67->39|67->39|69->41|69->41|69->41|71->43|74->46|74->46|74->46|77->49|77->49|77->49|83->55
                    -- GENERATED --
                */
            