
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
    <title>Zentasks</title>
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
    <input type="password" name="password" placeholder="Hasło">
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
                    DATE: Sat Jun 14 21:04:07 CEST 2014
                    SOURCE: D:/Pawlak/Play/test/app/views/login.scala.html
                    HASH: d1f3592148f89d9d547d357a9d37256a112e863a
                    MATRIX: 791->1|916->32|1054->135|1068->141|1121->173|1227->244|1241->250|1297->284|1401->353|1415->359|1480->402|1585->471|1600->477|1658->512|1789->607|1804->613|1842->629|2006->757|2021->763|2063->783|2142->826|2157->832|2194->847|2289->907|2303->913|2350->951|2390->953|2452->980|2485->1004|2525->1006|2586->1032|2599->1036|2641->1056|2681->1065|2721->1070|2759->1099|2799->1101|2862->1129|2876->1134|2913->1149|2953->1158|3063->1232|3085->1245|3113->1251|3288->1395
                    LINES: 26->1|29->1|34->6|34->6|34->6|36->8|36->8|36->8|37->9|37->9|37->9|38->10|38->10|38->10|47->19|47->19|47->19|51->23|51->23|51->23|52->24|52->24|52->24|57->29|57->29|57->29|57->29|61->33|61->33|61->33|63->35|63->35|63->35|65->37|67->39|67->39|67->39|69->41|69->41|69->41|71->43|74->46|74->46|74->46|83->55
                    -- GENERATED --
                */
            