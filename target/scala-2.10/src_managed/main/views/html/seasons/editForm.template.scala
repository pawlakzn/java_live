
package views.html.seasons

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
object editForm extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[Long,Form[Season],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(id: Long, seasonForm: Form[Season]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._

implicit def /*5.2*/implicitFieldConstructor/*5.26*/ = {{ FieldConstructor(twitterBootstrapInput.render) }};
Seq[Any](format.raw/*1.38*/("""

"""),format.raw/*4.1*/("""
"""),format.raw/*5.80*/("""

"""),_display_(Seq[Any](/*7.2*/main/*7.6*/ {_display_(Seq[Any](format.raw/*7.8*/("""

<h1>Edytuj Sezon</h1>

"""),_display_(Seq[Any](/*11.2*/form(routes.Seasons.update(id))/*11.33*/ {_display_(Seq[Any](format.raw/*11.35*/("""

<fieldset>

    """),_display_(Seq[Any](/*15.6*/inputText(seasonForm("year_start"), '_label -> "Rok rozpoczęcia"))),format.raw/*15.71*/("""
    """),_display_(Seq[Any](/*16.6*/inputText(seasonForm("year_end"), '_label -> "Rok zakończenia"))),format.raw/*16.69*/("""

</fieldset>

<div class="actions">
    <input type="submit" value="Edytuj sezon" class="btn primary"> or
    <a href=""""),_display_(Seq[Any](/*22.15*/routes/*22.21*/.Seasons.list())),format.raw/*22.36*/("""" class="btn">Anuluj</a>
</div>

""")))})),format.raw/*25.2*/("""

"""),_display_(Seq[Any](/*27.2*/form(routes.Seasons.delete(id), 'class -> "topRight")/*27.55*/ {_display_(Seq[Any](format.raw/*27.57*/("""
<input type="submit" value="Usuń ten sezon" class="btn danger">
""")))})),format.raw/*29.2*/("""

""")))})),format.raw/*31.2*/("""
"""))}
    }
    
    def render(id:Long,seasonForm:Form[Season]): play.api.templates.HtmlFormat.Appendable = apply(id,seasonForm)
    
    def f:((Long,Form[Season]) => play.api.templates.HtmlFormat.Appendable) = (id,seasonForm) => apply(id,seasonForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Jun 15 23:09:50 CEST 2014
                    SOURCE: D:/Pawlak/Play/live/app/views/seasons/editForm.scala.html
                    HASH: 0cdb1af531bea550aafdb9ea8d61c2db0623525d
                    MATRIX: 796->1|935->62|967->86|1051->37|1081->59|1110->140|1149->145|1160->149|1198->151|1263->181|1303->212|1343->214|1401->237|1488->302|1530->309|1615->372|1778->499|1793->505|1830->520|1898->557|1938->562|2000->615|2040->617|2139->685|2175->690
                    LINES: 26->1|29->5|29->5|30->1|32->4|33->5|35->7|35->7|35->7|39->11|39->11|39->11|43->15|43->15|44->16|44->16|50->22|50->22|50->22|53->25|55->27|55->27|55->27|57->29|59->31
                    -- GENERATED --
                */
            