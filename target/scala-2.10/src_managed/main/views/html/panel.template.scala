
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
object panel extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Html,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(content: Html):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.17*/("""

<!DOCTYPE html>
<html>
<head>
    <title>Relacje LIVE</title>
    <link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(Seq[Any](/*7.66*/routes/*7.72*/.Assets.at("stylesheets/bootstrap.min.css"))),format.raw/*7.115*/("""">
    <link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(Seq[Any](/*8.66*/routes/*8.72*/.Assets.at("stylesheets/main.css"))),format.raw/*8.106*/("""">
</head>
<body>

<header class="topbar">
    <h1 class="fill">
        <a href=""""),_display_(Seq[Any](/*14.19*/routes/*14.25*/.Teams.index())),format.raw/*14.39*/("""">
            Panel
        </a>
            <div style="float:right;">
                <a href=""""),_display_(Seq[Any](/*18.27*/routes/*18.33*/.Teams.index())),format.raw/*18.47*/("""">Zespoły</a>
                <a href=""""),_display_(Seq[Any](/*19.27*/routes/*19.33*/.Referees.index())),format.raw/*19.50*/("""">Sędziowie</a>
                <a href=""""),_display_(Seq[Any](/*20.27*/routes/*20.33*/.Players.index())),format.raw/*20.49*/("""">Piłkarze</a>
                <a href=""""),_display_(Seq[Any](/*21.27*/routes/*21.33*/.Seasons.index())),format.raw/*21.49*/("""">Sezony</a>
                <a href=""""),_display_(Seq[Any](/*22.27*/routes/*22.33*/.Matches.index())),format.raw/*22.49*/("""">Mecze</a>
                <a href=""""),_display_(Seq[Any](/*23.27*/routes/*23.33*/.Games.index())),format.raw/*23.47*/("""">Rozgrywki</a>
                <a href=""""),_display_(Seq[Any](/*24.27*/routes/*24.33*/.Matches.index())),format.raw/*24.49*/("""">Mecze</a>
                """),_display_(Seq[Any](/*25.18*/if(session.get("login"))/*25.42*/{_display_(Seq[Any](format.raw/*25.43*/("""
                <a href=""""),_display_(Seq[Any](/*26.27*/routes/*26.33*/.Application.logout())),format.raw/*26.54*/("""">Wyloguj</a>
                """)))})),format.raw/*27.18*/("""
            </div>
    </h1>
</header>

<section id="main">
    """),_display_(Seq[Any](/*33.6*/content)),format.raw/*33.13*/("""
</section>


</body>
</html>
"""))}
    }
    
    def render(content:Html): play.api.templates.HtmlFormat.Appendable = apply(content)
    
    def f:((Html) => play.api.templates.HtmlFormat.Appendable) = (content) => apply(content)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Jun 15 09:54:12 CEST 2014
                    SOURCE: D:/Pawlak/Play/live/app/views/panel.scala.html
                    HASH: 3882e880215621afbc23af3256a6cbba5bf116a8
                    MATRIX: 772->1|881->16|1051->151|1065->157|1130->200|1234->269|1248->275|1304->309|1429->398|1444->404|1480->418|1619->521|1634->527|1670->541|1747->582|1762->588|1801->605|1880->648|1895->654|1933->670|2011->712|2026->718|2064->734|2140->774|2155->780|2193->796|2268->835|2283->841|2319->855|2398->898|2413->904|2451->920|2517->950|2550->974|2589->975|2653->1003|2668->1009|2711->1030|2775->1062|2882->1134|2911->1141
                    LINES: 26->1|29->1|35->7|35->7|35->7|36->8|36->8|36->8|42->14|42->14|42->14|46->18|46->18|46->18|47->19|47->19|47->19|48->20|48->20|48->20|49->21|49->21|49->21|50->22|50->22|50->22|51->23|51->23|51->23|52->24|52->24|52->24|53->25|53->25|53->25|54->26|54->26|54->26|55->27|61->33|61->33
                    -- GENERATED --
                */
            