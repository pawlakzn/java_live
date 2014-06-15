
package views.html.matches

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
object createForm extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[Match],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(matchForm: Form[Match]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._

implicit def /*5.2*/implicitFieldConstructor/*5.26*/ = {{ FieldConstructor(twitterBootstrapInput.render) }};
Seq[Any](format.raw/*1.26*/("""

"""),format.raw/*4.1*/("""
"""),format.raw/*5.80*/("""

"""),_display_(Seq[Any](/*7.2*/main/*7.6*/ {_display_(Seq[Any](format.raw/*7.8*/("""

<h1>Dodaj mecz</h1>

"""),_display_(Seq[Any](/*11.2*/form(routes.Matches.save())/*11.29*/ {_display_(Seq[Any](format.raw/*11.31*/("""

<fieldset>

    """),_display_(Seq[Any](/*15.6*/select(
    matchForm("team1.id"),
    options(Team.options),
    '_label -> "Gospodarz", '_default -> "-- Wybierz gospodarza --",
    '_showConstraints -> false
    ))),format.raw/*20.6*/("""

    """),_display_(Seq[Any](/*22.6*/select(
    matchForm("team2.id"),
    options(Team.options),
    '_label -> "Goście", '_default -> "-- Wybierz gości --",
    '_showConstraints -> false
    ))),format.raw/*27.6*/("""

    """),_display_(Seq[Any](/*29.6*/select(
    matchForm("game.id"),
    options(Game.options),
    '_label -> "Rozgrywki", '_default -> "-- Wybierz rozgrywki --",
    '_showConstraints -> false
    ))),format.raw/*34.6*/("""

    """),_display_(Seq[Any](/*36.6*/inputText(matchForm("queue"), '_label -> "Kolejka"))),format.raw/*36.57*/("""

    """),_display_(Seq[Any](/*38.6*/inputText(matchForm("match_date"), '_label -> "Data i godzina"))),format.raw/*38.69*/("""

    """),_display_(Seq[Any](/*40.6*/inputText(matchForm("weather"), '_label -> "Pogoda"))),format.raw/*40.58*/("""
    """),_display_(Seq[Any](/*41.6*/inputText(matchForm("viewers"), '_label -> "Widzowie"))),format.raw/*41.60*/("""

</fieldset>

<div class="actions">
    <input type="submit" value="Dodaj mecz" class="btn primary"> or
    <a href=""""),_display_(Seq[Any](/*47.15*/routes/*47.21*/.Matches.list())),format.raw/*47.36*/("""" class="btn">Anuluj</a>
</div>

""")))})),format.raw/*50.2*/("""

""")))})))}
    }
    
    def render(matchForm:Form[Match]): play.api.templates.HtmlFormat.Appendable = apply(matchForm)
    
    def f:((Form[Match]) => play.api.templates.HtmlFormat.Appendable) = (matchForm) => apply(matchForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Jun 15 23:09:49 CEST 2014
                    SOURCE: D:/Pawlak/Play/live/app/views/matches/createForm.scala.html
                    HASH: 19ee8dbaba6d459dfb906ac51c6caa26fa4cbdc9
                    MATRIX: 792->1|919->50|951->74|1035->25|1065->47|1094->128|1133->133|1144->137|1182->139|1245->167|1281->194|1321->196|1379->219|1572->391|1616->400|1801->564|1845->573|2036->743|2080->752|2153->803|2197->812|2282->875|2326->884|2400->936|2442->943|2518->997|2679->1122|2694->1128|2731->1143|2799->1180
                    LINES: 26->1|29->5|29->5|30->1|32->4|33->5|35->7|35->7|35->7|39->11|39->11|39->11|43->15|48->20|50->22|55->27|57->29|62->34|64->36|64->36|66->38|66->38|68->40|68->40|69->41|69->41|75->47|75->47|75->47|78->50
                    -- GENERATED --
                */
            