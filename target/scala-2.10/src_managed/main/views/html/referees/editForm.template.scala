
package views.html.referees

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
object editForm extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[Long,Form[Referee],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(id: Long, refereeForm: Form[Referee]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._

implicit def /*5.2*/implicitFieldConstructor/*5.26*/ = {{ FieldConstructor(twitterBootstrapInput.render) }};
Seq[Any](format.raw/*1.40*/("""

"""),format.raw/*4.1*/("""
"""),format.raw/*5.80*/("""

"""),_display_(Seq[Any](/*7.2*/main/*7.6*/ {_display_(Seq[Any](format.raw/*7.8*/("""

"""),_display_(Seq[Any](/*9.2*/if(flash.containsKey("wrong"))/*9.32*/ {_display_(Seq[Any](format.raw/*9.34*/("""
<div class="alert-message warning">
    <strong>Błąd!</strong> """),_display_(Seq[Any](/*11.29*/flash/*11.34*/.get("wrong"))),format.raw/*11.47*/("""
</div>
""")))})),format.raw/*13.2*/("""

<h1>Edytuj sędziego</h1>

"""),_display_(Seq[Any](/*17.2*/form(routes.Referees.update(id))/*17.34*/ {_display_(Seq[Any](format.raw/*17.36*/("""

<fieldset>

    """),_display_(Seq[Any](/*21.6*/inputText(refereeForm("firstname"), '_label -> "Imię"))),format.raw/*21.60*/("""
    """),_display_(Seq[Any](/*22.6*/inputText(refereeForm("lastname"), '_label -> "Nazwisko"))),format.raw/*22.63*/("""
    """),_display_(Seq[Any](/*23.6*/inputText(refereeForm("city"), '_label -> "Miasto"))),format.raw/*23.57*/("""

</fieldset>

<div class="actions">
    <input type="submit" value="Edytuj sędziego" class="btn primary"> or
    <a href=""""),_display_(Seq[Any](/*29.15*/routes/*29.21*/.Referees.list())),format.raw/*29.37*/("""" class="btn">Anuluj</a>
</div>

""")))})),format.raw/*32.2*/("""

"""),_display_(Seq[Any](/*34.2*/form(routes.Referees.delete(id), 'class -> "topRight")/*34.56*/ {_display_(Seq[Any](format.raw/*34.58*/("""
<input type="submit" value="Usuń sędziego" class="btn danger">
""")))})),format.raw/*36.2*/("""

""")))})),format.raw/*38.2*/("""
"""))}
    }
    
    def render(id:Long,refereeForm:Form[Referee]): play.api.templates.HtmlFormat.Appendable = apply(id,refereeForm)
    
    def f:((Long,Form[Referee]) => play.api.templates.HtmlFormat.Appendable) = (id,refereeForm) => apply(id,refereeForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Jun 16 17:32:31 CEST 2014
                    SOURCE: D:/Pawlak/Play/live/app/views/referees/editForm.scala.html
                    HASH: 393b35c2b4419f2f9544f37c9ac8bf8eb23c47cf
                    MATRIX: 798->1|939->64|971->88|1055->39|1085->61|1114->142|1153->147|1164->151|1202->153|1241->158|1279->188|1318->190|1421->257|1435->262|1470->275|1512->286|1580->319|1621->351|1661->353|1719->376|1795->430|1837->437|1916->494|1958->501|2031->552|2197->682|2212->688|2250->704|2318->741|2358->746|2421->800|2461->802|2559->869|2595->874
                    LINES: 26->1|29->5|29->5|30->1|32->4|33->5|35->7|35->7|35->7|37->9|37->9|37->9|39->11|39->11|39->11|41->13|45->17|45->17|45->17|49->21|49->21|50->22|50->22|51->23|51->23|57->29|57->29|57->29|60->32|62->34|62->34|62->34|64->36|66->38
                    -- GENERATED --
                */
            