
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
object createForm extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[Referee],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(refereeForm: Form[Referee]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._

implicit def /*5.2*/implicitFieldConstructor/*5.26*/ = {{ FieldConstructor(twitterBootstrapInput.render) }};
Seq[Any](format.raw/*1.30*/("""

"""),format.raw/*4.1*/("""
"""),format.raw/*5.80*/("""

"""),_display_(Seq[Any](/*7.2*/main/*7.6*/ {_display_(Seq[Any](format.raw/*7.8*/("""

<h1>Dodaj sędziego</h1>

"""),_display_(Seq[Any](/*11.2*/form(routes.Referees.save())/*11.30*/ {_display_(Seq[Any](format.raw/*11.32*/("""

<fieldset>

    """),_display_(Seq[Any](/*15.6*/inputText(refereeForm("firstname"), '_label -> "Imię"))),format.raw/*15.60*/("""
    """),_display_(Seq[Any](/*16.6*/inputText(refereeForm("lastname"), '_label -> "Nazwisko"))),format.raw/*16.63*/("""
    """),_display_(Seq[Any](/*17.6*/inputText(refereeForm("city"), '_label -> "Miasto"))),format.raw/*17.57*/("""

</fieldset>

<div class="actions">
    <input type="submit" value="Dodaj sędziego" class="btn primary"> or
    <a href=""""),_display_(Seq[Any](/*23.15*/routes/*23.21*/.Referees.list())),format.raw/*23.37*/("""" class="btn">Anuluj</a>
</div>

""")))})),format.raw/*26.2*/("""

""")))})))}
    }
    
    def render(refereeForm:Form[Referee]): play.api.templates.HtmlFormat.Appendable = apply(refereeForm)
    
    def f:((Form[Referee]) => play.api.templates.HtmlFormat.Appendable) = (refereeForm) => apply(refereeForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Jun 15 23:09:50 CEST 2014
                    SOURCE: D:/Pawlak/Play/live/app/views/referees/createForm.scala.html
                    HASH: a881359c802f387107c2c52dd7aaeb239ecab037
                    MATRIX: 795->1|926->54|958->78|1042->29|1072->51|1101->132|1140->137|1151->141|1189->143|1256->175|1293->203|1333->205|1391->228|1467->282|1509->289|1588->346|1630->353|1703->404|1868->533|1883->539|1921->555|1989->592
                    LINES: 26->1|29->5|29->5|30->1|32->4|33->5|35->7|35->7|35->7|39->11|39->11|39->11|43->15|43->15|44->16|44->16|45->17|45->17|51->23|51->23|51->23|54->26
                    -- GENERATED --
                */
            