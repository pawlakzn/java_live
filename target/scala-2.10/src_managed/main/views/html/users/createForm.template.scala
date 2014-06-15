
package views.html.users

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
object createForm extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[User],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(userForm: Form[User]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._


Seq[Any](format.raw/*1.24*/("""

"""),format.raw/*4.1*/("""
<html>
<head>
    <title>Zentasks</title>
    <link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*8.55*/routes/*8.61*/.Assets.at("images/favicon.png"))),format.raw/*8.93*/("""">

    <link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(Seq[Any](/*10.66*/routes/*10.72*/.Assets.at("stylesheets/main.css"))),format.raw/*10.106*/("""">
    <link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(Seq[Any](/*11.66*/routes/*11.72*/.Assets.at("stylesheets/bootstrap.min.css"))),format.raw/*11.115*/("""">
    <link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(Seq[Any](/*12.66*/routes/*12.72*/.Assets.at("stylesheets/login.css"))),format.raw/*12.107*/("""">



</head>
<body>

<header class="topbar">
    <h1 class="fill">
        <a href=""""),_display_(Seq[Any](/*21.19*/routes/*21.25*/.Matches.index())),format.raw/*21.41*/("""">
            System relacji LIVE meczów piłkarskich
        </a>
        <div style="float:right;">
            <a href=""""),_display_(Seq[Any](/*25.23*/routes/*25.29*/.Application.login())),format.raw/*25.49*/("""">Logowanie</a></a>
            <a href=""""),_display_(Seq[Any](/*26.23*/routes/*26.29*/.Users.create())),format.raw/*26.44*/("""">Rejestracja</a>
        </div>
    </h1>
</header>

"""),_display_(Seq[Any](/*31.2*/form(routes.Users.save())/*31.27*/ {_display_(Seq[Any](format.raw/*31.29*/("""

<h1>Rejestracja</h1>

"""),_display_(Seq[Any](/*35.2*/if(flash.containsKey("wrong"))/*35.32*/ {_display_(Seq[Any](format.raw/*35.34*/("""
<div class="alert-message warning">
    """),_display_(Seq[Any](/*37.6*/flash/*37.11*/.get("wrong"))),format.raw/*37.24*/("""
</div>
""")))})),format.raw/*39.2*/("""

<p>
    <input type="login" name="login" placeholder="Login" value=""""),_display_(Seq[Any](/*42.66*/userForm("login")/*42.83*/.value)),format.raw/*42.89*/("""">
</p>
<p>
    <input type="password" name="password" placeholder="Hasło" value=""""),_display_(Seq[Any](/*45.72*/userForm("password")/*45.92*/.value)),format.raw/*45.98*/("""">
</p>
<p>
    <input type="email" name="email" placeholder="E-mail" value=""""),_display_(Seq[Any](/*48.67*/userForm("email")/*48.84*/.value)),format.raw/*48.90*/("""">
</p>

    <input type="submit" value="Zarejestruj" class="btn primary">
    <a href=""""),_display_(Seq[Any](/*52.15*/routes/*52.21*/.Users.list())),format.raw/*52.34*/("""" class="btn">Anuluj</a>

""")))})),format.raw/*54.2*/("""

</body>
</html>
"""))}
    }
    
    def render(userForm:Form[User]): play.api.templates.HtmlFormat.Appendable = apply(userForm)
    
    def f:((Form[User]) => play.api.templates.HtmlFormat.Appendable) = (userForm) => apply(userForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Jun 15 23:09:50 CEST 2014
                    SOURCE: D:/Pawlak/Play/live/app/views/users/createForm.scala.html
                    HASH: c99f70339aa849ae16b4303da5416d769759ab5f
                    MATRIX: 789->1|922->23|952->45|1088->146|1102->152|1155->184|1262->255|1277->261|1334->295|1439->364|1454->370|1520->413|1625->482|1640->488|1698->523|1829->618|1844->624|1882->640|2046->768|2061->774|2103->794|2182->837|2197->843|2234->858|2329->918|2363->943|2403->945|2467->974|2506->1004|2546->1006|2625->1050|2639->1055|2674->1068|2716->1079|2826->1153|2852->1170|2880->1176|3002->1262|3031->1282|3059->1288|3176->1369|3202->1386|3230->1392|3359->1485|3374->1491|3409->1504|3469->1533
                    LINES: 26->1|30->1|32->4|36->8|36->8|36->8|38->10|38->10|38->10|39->11|39->11|39->11|40->12|40->12|40->12|49->21|49->21|49->21|53->25|53->25|53->25|54->26|54->26|54->26|59->31|59->31|59->31|63->35|63->35|63->35|65->37|65->37|65->37|67->39|70->42|70->42|70->42|73->45|73->45|73->45|76->48|76->48|76->48|80->52|80->52|80->52|82->54
                    -- GENERATED --
                */
            