
package views.html.players

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
object createForm extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[Player],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(playerForm: Form[Player]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._

implicit def /*5.2*/implicitFieldConstructor/*5.26*/ = {{ FieldConstructor(twitterBootstrapInput.render) }};
Seq[Any](format.raw/*1.28*/("""

"""),format.raw/*4.1*/("""
"""),format.raw/*5.80*/("""

"""),_display_(Seq[Any](/*7.2*/main/*7.6*/ {_display_(Seq[Any](format.raw/*7.8*/("""

<h1>Dodaj piłkarza</h1>

"""),_display_(Seq[Any](/*11.2*/form(routes.Players.save())/*11.29*/ {_display_(Seq[Any](format.raw/*11.31*/("""

<fieldset>

    """),_display_(Seq[Any](/*15.6*/inputText(playerForm("firstname"), '_label -> "Imię"))),format.raw/*15.59*/("""
    """),_display_(Seq[Any](/*16.6*/inputText(playerForm("lastname"), '_label -> "Nazwisko"))),format.raw/*16.62*/("""

    """),_display_(Seq[Any](/*18.6*/select(
    playerForm("team.id"),
    options(Team.options),
    '_label -> "Zespół", '_default -> "-- Wybierz zespół --",
    '_showConstraints -> false
    ))),format.raw/*23.6*/("""

    """),_display_(Seq[Any](/*25.6*/inputText(playerForm("date_birth"), '_label -> "Data urodzin"))),format.raw/*25.68*/("""
    """),_display_(Seq[Any](/*26.6*/inputText(playerForm("photo"), '_label -> "Zdjęcie"))),format.raw/*26.58*/("""
    """),_display_(Seq[Any](/*27.6*/inputText(playerForm("height"), '_label -> "Wzrost"))),format.raw/*27.58*/("""
    """),_display_(Seq[Any](/*28.6*/inputText(playerForm("weight"), '_label -> "Waga"))),format.raw/*28.56*/("""
    """),_display_(Seq[Any](/*29.6*/inputText(playerForm("position"), '_label -> "Pozycja"))),format.raw/*29.61*/("""
    """),_display_(Seq[Any](/*30.6*/inputText(playerForm("number"), '_label -> "Numer"))),format.raw/*30.57*/("""

</fieldset>

<div class="actions">
    <input type="submit" value="Dodaj piłkarza" class="btn primary"> or
    <a href=""""),_display_(Seq[Any](/*36.15*/routes/*36.21*/.Players.list())),format.raw/*36.36*/("""" class="btn">Anuluj</a>
</div>

""")))})),format.raw/*39.2*/("""

""")))})))}
    }
    
    def render(playerForm:Form[Player]): play.api.templates.HtmlFormat.Appendable = apply(playerForm)
    
    def f:((Form[Player]) => play.api.templates.HtmlFormat.Appendable) = (playerForm) => apply(playerForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Jun 15 23:09:50 CEST 2014
                    SOURCE: D:/Pawlak/Play/live/app/views/players/createForm.scala.html
                    HASH: e7cb1a49aebdcf1e3e379d4dd0c9faa4fea56c29
                    MATRIX: 793->1|922->52|954->76|1038->27|1068->49|1097->130|1136->135|1147->139|1185->141|1252->173|1288->200|1328->202|1386->225|1461->278|1503->285|1581->341|1625->350|1811->515|1855->524|1939->586|1981->593|2055->645|2097->652|2171->704|2213->711|2285->761|2327->768|2404->823|2446->830|2519->881|2684->1010|2699->1016|2736->1031|2804->1068
                    LINES: 26->1|29->5|29->5|30->1|32->4|33->5|35->7|35->7|35->7|39->11|39->11|39->11|43->15|43->15|44->16|44->16|46->18|51->23|53->25|53->25|54->26|54->26|55->27|55->27|56->28|56->28|57->29|57->29|58->30|58->30|64->36|64->36|64->36|67->39
                    -- GENERATED --
                */
            