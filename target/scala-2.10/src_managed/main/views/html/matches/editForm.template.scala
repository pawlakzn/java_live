
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
object editForm extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[Long,Form[Match],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(id: Long, matchForm: Form[Match]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._

implicit def /*5.2*/implicitFieldConstructor/*5.26*/ = {{ FieldConstructor(twitterBootstrapInput.render) }};
Seq[Any](format.raw/*1.36*/("""

"""),format.raw/*4.1*/("""
"""),format.raw/*5.80*/("""

"""),_display_(Seq[Any](/*7.2*/main/*7.6*/ {_display_(Seq[Any](format.raw/*7.8*/("""

<h1>Edytuj Mecz</h1>

"""),_display_(Seq[Any](/*11.2*/if(flash.containsKey("success"))/*11.34*/ {_display_(Seq[Any](format.raw/*11.36*/("""
<div class="alert-message warning">
    <strong>Gotowe!</strong> """),_display_(Seq[Any](/*13.31*/flash/*13.36*/.get("success"))),format.raw/*13.51*/("""
</div>
""")))})),format.raw/*15.2*/("""

"""),_display_(Seq[Any](/*17.2*/form(routes.Matches.update(id))/*17.33*/ {_display_(Seq[Any](format.raw/*17.35*/("""

<fieldset>

    """),_display_(Seq[Any](/*21.6*/select(
    matchForm("team1.id"),
    options(Team.options),
    '_label -> "Gospodarz", '_default -> "-- Wybierz gospodarza --",
    '_showConstraints -> false
    ))),format.raw/*26.6*/("""

    """),_display_(Seq[Any](/*28.6*/select(
    matchForm("team2.id"),
    options(Team.options),
    '_label -> "Goście", '_default -> "-- Wybierz gości --",
    '_showConstraints -> false
    ))),format.raw/*33.6*/("""

    """),_display_(Seq[Any](/*35.6*/select(
    matchForm("game.id"),
    options(Game.options),
    '_label -> "Rozgrywki", '_default -> "-- Wybierz rozgrywki --",
    '_showConstraints -> false
    ))),format.raw/*40.6*/("""

    """),_display_(Seq[Any](/*42.6*/inputText(matchForm("queue"), '_label -> "Kolejka"))),format.raw/*42.57*/("""
    """),_display_(Seq[Any](/*43.6*/inputText(matchForm("match_date"), '_label -> "Data i godzina"))),format.raw/*43.69*/("""

    """),_display_(Seq[Any](/*45.6*/select(
    matchForm("referee.id"),
    options(Referee.options),
    '_label -> "Sędzia", '_default -> "-- Wybierz sędziego --",
    '_showConstraints -> false
    ))),format.raw/*50.6*/("""

    """),_display_(Seq[Any](/*52.6*/inputText(matchForm("weather"), '_label -> "Pogoda"))),format.raw/*52.58*/("""
    """),_display_(Seq[Any](/*53.6*/inputText(matchForm("viewers"), '_label -> "Widzowie"))),format.raw/*53.60*/("""

</fieldset>


<div class="actions">
    <input type="submit" value="Zapisz" class="btn primary"> or
    <a href=""""),_display_(Seq[Any](/*60.15*/routes/*60.21*/.Matches.list())),format.raw/*60.36*/("""" class="btn">Anuluj</a>
</div>

""")))})),format.raw/*63.2*/("""

"""),_display_(Seq[Any](/*65.2*/form(routes.Matches.delete(id), 'class -> "topRight")/*65.55*/ {_display_(Seq[Any](format.raw/*65.57*/("""
<input type="submit" value="Usuń ten mecz" class="btn danger">
""")))})),format.raw/*67.2*/("""

""")))})),format.raw/*69.2*/("""

"""))}
    }
    
    def render(id:Long,matchForm:Form[Match]): play.api.templates.HtmlFormat.Appendable = apply(id,matchForm)
    
    def f:((Long,Form[Match]) => play.api.templates.HtmlFormat.Appendable) = (id,matchForm) => apply(id,matchForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Jun 14 19:06:05 CEST 2014
                    SOURCE: D:/Pawlak/Play/test/app/views/matches/editForm.scala.html
                    HASH: c3529145a8d694c5189d65a69e9270108cae1965
                    MATRIX: 795->1|932->60|964->84|1048->35|1078->57|1107->138|1146->143|1157->147|1195->149|1259->178|1300->210|1340->212|1445->281|1459->286|1496->301|1538->312|1578->317|1618->348|1658->350|1716->373|1909->545|1953->554|2138->718|2182->727|2373->897|2417->906|2490->957|2532->964|2617->1027|2661->1036|2854->1208|2898->1217|2972->1269|3014->1276|3090->1330|3249->1453|3264->1459|3301->1474|3369->1511|3409->1516|3471->1569|3511->1571|3609->1638|3645->1643
                    LINES: 26->1|29->5|29->5|30->1|32->4|33->5|35->7|35->7|35->7|39->11|39->11|39->11|41->13|41->13|41->13|43->15|45->17|45->17|45->17|49->21|54->26|56->28|61->33|63->35|68->40|70->42|70->42|71->43|71->43|73->45|78->50|80->52|80->52|81->53|81->53|88->60|88->60|88->60|91->63|93->65|93->65|93->65|95->67|97->69
                    -- GENERATED --
                */
            