
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

<p>
    <input type="login" name="login" placeholder="Login" value=""""),_display_(Seq[Any](/*36.66*/userForm("login")/*36.83*/.value)),format.raw/*36.89*/("""">
</p>
<p>
    <input type="password" name="password" placeholder="Hasło" value=""""),_display_(Seq[Any](/*39.72*/userForm("password")/*39.92*/.value)),format.raw/*39.98*/("""">
</p>
<p>
    <input type="email" name="email" placeholder="E-mail" value=""""),_display_(Seq[Any](/*42.67*/userForm("email")/*42.84*/.value)),format.raw/*42.90*/("""">
</p>

    <input type="submit" value="Zarejestruj" class="btn primary">
    <a href=""""),_display_(Seq[Any](/*46.15*/routes/*46.21*/.Users.list())),format.raw/*46.34*/("""" class="btn">Anuluj</a>

""")))})),format.raw/*48.2*/("""

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
                    DATE: Sat Jun 14 21:17:46 CEST 2014
                    SOURCE: D:/Pawlak/Play/test/app/views/users/createForm.scala.html
                    HASH: f3122a2a2adb40719746e4676021cea9dfc0713d
                    MATRIX: 789->1|922->23|952->45|1088->146|1102->152|1155->184|1262->255|1277->261|1334->295|1439->364|1454->370|1520->413|1625->482|1640->488|1698->523|1829->618|1844->624|1882->640|2046->768|2061->774|2103->794|2182->837|2197->843|2234->858|2329->918|2363->943|2403->945|2537->1043|2563->1060|2591->1066|2713->1152|2742->1172|2770->1178|2887->1259|2913->1276|2941->1282|3070->1375|3085->1381|3120->1394|3180->1423
                    LINES: 26->1|30->1|32->4|36->8|36->8|36->8|38->10|38->10|38->10|39->11|39->11|39->11|40->12|40->12|40->12|49->21|49->21|49->21|53->25|53->25|53->25|54->26|54->26|54->26|59->31|59->31|59->31|64->36|64->36|64->36|67->39|67->39|67->39|70->42|70->42|70->42|74->46|74->46|74->46|76->48
                    -- GENERATED --
                */
            