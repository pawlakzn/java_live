
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
object main extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Html,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(content: Html):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.17*/("""

<!DOCTYPE html>
<html>
    <head>
        <title>Relacje LIVE</title>
        <link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(Seq[Any](/*7.70*/routes/*7.76*/.Assets.at("stylesheets/bootstrap.min.css"))),format.raw/*7.119*/(""""> 
        <link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(Seq[Any](/*8.70*/routes/*8.76*/.Assets.at("stylesheets/main.css"))),format.raw/*8.110*/("""">

    </head>
    <body>
        
        <header class="topbar">
            <h1 class="fill">
                """),_display_(Seq[Any](/*15.18*/if(session.get("login"))/*15.42*/{_display_(Seq[Any](format.raw/*15.43*/("""
                <a href=""""),_display_(Seq[Any](/*16.27*/routes/*16.33*/.Matches.index())),format.raw/*16.49*/("""">Panel</a>
                """)))}/*17.19*/else/*17.24*/{_display_(Seq[Any](format.raw/*17.25*/("""
                <a href=""""),_display_(Seq[Any](/*18.27*/routes/*18.33*/.Matches.index())),format.raw/*18.49*/("""">
                    System relacji LIVE meczów piłkarskich
                </a>
                """)))})),format.raw/*21.18*/("""
                """),_display_(Seq[Any](/*22.18*/if(session.get("login"))/*22.42*/{_display_(Seq[Any](format.raw/*22.43*/("""
                <div style="float:right;">
                    <a href=""""),_display_(Seq[Any](/*24.31*/routes/*24.37*/.Matches.index())),format.raw/*24.53*/("""">Mecze</a>
                    <a href=""""),_display_(Seq[Any](/*25.31*/routes/*25.37*/.Teams.index())),format.raw/*25.51*/("""">Zespoły</a>
                    <a href=""""),_display_(Seq[Any](/*26.31*/routes/*26.37*/.Referees.index())),format.raw/*26.54*/("""">Sędziowie</a>
                    <a href=""""),_display_(Seq[Any](/*27.31*/routes/*27.37*/.Players.index())),format.raw/*27.53*/("""">Piłkarze</a>
                    <a href=""""),_display_(Seq[Any](/*28.31*/routes/*28.37*/.Seasons.index())),format.raw/*28.53*/("""">Sezony</a>
                    <a href=""""),_display_(Seq[Any](/*29.31*/routes/*29.37*/.Games.index())),format.raw/*29.51*/("""">Rozgrywki</a>
                    <a href=""""),_display_(Seq[Any](/*30.31*/routes/*30.37*/.Users.index())),format.raw/*30.51*/("""">Użytkownicy</a>
                    <a href=""""),_display_(Seq[Any](/*31.31*/routes/*31.37*/.Videos.index())),format.raw/*31.52*/("""">Wideo</a>
                    <a href=""""),_display_(Seq[Any](/*32.31*/routes/*32.37*/.Application.logout())),format.raw/*32.58*/("""">Wyloguj</a>
                </div>
                """)))}/*34.19*/else/*34.24*/{_display_(Seq[Any](format.raw/*34.25*/("""
                <div style="float:right;">
                    <a href=""""),_display_(Seq[Any](/*36.31*/routes/*36.37*/.Application.login())),format.raw/*36.57*/("""">Logowanie</a></a>
                    <a href=""""),_display_(Seq[Any](/*37.31*/routes/*37.37*/.Users.create())),format.raw/*37.52*/("""">Rejestracja</a>
                </div>
                """)))})),format.raw/*39.18*/("""
            </h1>
        </header>
        
        <section id="main">
            """),_display_(Seq[Any](/*44.14*/content)),format.raw/*44.21*/("""
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
                    DATE: Sun Jun 15 23:09:49 CEST 2014
                    SOURCE: D:/Pawlak/Play/live/app/views/main.scala.html
                    HASH: ad2b8ca1d9687af4fc98cc736939eabcc8be9da9
                    MATRIX: 771->1|880->16|1056->157|1070->163|1135->206|1243->279|1257->285|1313->319|1464->434|1497->458|1536->459|1599->486|1614->492|1652->508|1700->538|1713->543|1752->544|1815->571|1830->577|1868->593|2000->693|2054->711|2087->735|2126->736|2236->810|2251->816|2289->832|2367->874|2382->880|2418->894|2498->938|2513->944|2552->961|2634->1007|2649->1013|2687->1029|2768->1074|2783->1080|2821->1096|2900->1139|2915->1145|2951->1159|3033->1205|3048->1211|3084->1225|3168->1273|3183->1279|3220->1294|3298->1336|3313->1342|3356->1363|3429->1418|3442->1423|3481->1424|3591->1498|3606->1504|3648->1524|3734->1574|3749->1580|3786->1595|3876->1653|3999->1740|4028->1747
                    LINES: 26->1|29->1|35->7|35->7|35->7|36->8|36->8|36->8|43->15|43->15|43->15|44->16|44->16|44->16|45->17|45->17|45->17|46->18|46->18|46->18|49->21|50->22|50->22|50->22|52->24|52->24|52->24|53->25|53->25|53->25|54->26|54->26|54->26|55->27|55->27|55->27|56->28|56->28|56->28|57->29|57->29|57->29|58->30|58->30|58->30|59->31|59->31|59->31|60->32|60->32|60->32|62->34|62->34|62->34|64->36|64->36|64->36|65->37|65->37|65->37|67->39|72->44|72->44
                    -- GENERATED --
                */
            