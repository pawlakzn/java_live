
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

<h1>Edytuj sędziego</h1>

"""),_display_(Seq[Any](/*11.2*/form(routes.Referees.update(id))/*11.34*/ {_display_(Seq[Any](format.raw/*11.36*/("""

<fieldset>

    """),_display_(Seq[Any](/*15.6*/inputText(refereeForm("firstname"), '_label -> "Imię"))),format.raw/*15.60*/("""
    """),_display_(Seq[Any](/*16.6*/inputText(refereeForm("lastname"), '_label -> "Nazwisko"))),format.raw/*16.63*/("""
    """),_display_(Seq[Any](/*17.6*/inputText(refereeForm("city"), '_label -> "Miasto"))),format.raw/*17.57*/("""

</fieldset>

<div class="actions">
    <input type="submit" value="Edytuj sędziego" class="btn primary"> or
    <a href=""""),_display_(Seq[Any](/*23.15*/routes/*23.21*/.Referees.list())),format.raw/*23.37*/("""" class="btn">Anuluj</a>
</div>

""")))})),format.raw/*26.2*/("""

"""),_display_(Seq[Any](/*28.2*/form(routes.Referees.delete(id), 'class -> "topRight")/*28.56*/ {_display_(Seq[Any](format.raw/*28.58*/("""
<input type="submit" value="Usuń sędziego" class="btn danger">
""")))})),format.raw/*30.2*/("""

""")))})),format.raw/*32.2*/("""
"""))}
    }
    
    def render(id:Long,refereeForm:Form[Referee]): play.api.templates.HtmlFormat.Appendable = apply(id,refereeForm)
    
    def f:((Long,Form[Referee]) => play.api.templates.HtmlFormat.Appendable) = (id,refereeForm) => apply(id,refereeForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat May 24 22:59:38 CEST 2014
                    SOURCE: D:/Pawlak/Play/test/app/views/referees/editForm.scala.html
                    HASH: 8a8e4fc7657a182ed0973548550b3925b1a476d2
                    MATRIX: 798->1|939->64|971->88|1055->39|1085->61|1114->142|1153->147|1164->151|1202->153|1270->186|1311->218|1351->220|1409->243|1485->297|1527->304|1606->361|1648->368|1721->419|1887->549|1902->555|1940->571|2008->608|2048->613|2111->667|2151->669|2249->736|2285->741
                    LINES: 26->1|29->5|29->5|30->1|32->4|33->5|35->7|35->7|35->7|39->11|39->11|39->11|43->15|43->15|44->16|44->16|45->17|45->17|51->23|51->23|51->23|54->26|56->28|56->28|56->28|58->30|60->32
                    -- GENERATED --
                */
            