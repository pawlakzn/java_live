
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
                <a href=""""),_display_(Seq[Any](/*15.27*/routes/*15.33*/.Matches.index())),format.raw/*15.49*/("""">
                    System relacji LIVE meczów piłkarskich
                </a>
                <div style="float:right;">
                    <a href=""""),_display_(Seq[Any](/*19.31*/routes/*19.37*/.Application.login())),format.raw/*19.57*/("""">Logowanie</a></a>
                    <a href=""""),_display_(Seq[Any](/*20.31*/routes/*20.37*/.Users.create())),format.raw/*20.52*/("""">Rejestracja</a>
                </div>
            </h1>
        </header>
        
        <section id="main">
            """),_display_(Seq[Any](/*26.14*/content)),format.raw/*26.21*/("""
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
                    DATE: Sat Jun 14 21:04:36 CEST 2014
                    SOURCE: D:/Pawlak/Play/test/app/views/main.scala.html
                    HASH: 182ee58b639a883b9ebce78b4e8a947de76f17a0
                    MATRIX: 771->1|880->16|1056->157|1070->163|1135->206|1243->279|1257->285|1313->319|1473->443|1488->449|1526->465|1718->621|1733->627|1775->647|1861->697|1876->703|1913->718|2076->845|2105->852
                    LINES: 26->1|29->1|35->7|35->7|35->7|36->8|36->8|36->8|43->15|43->15|43->15|47->19|47->19|47->19|48->20|48->20|48->20|54->26|54->26
                    -- GENERATED --
                */
            