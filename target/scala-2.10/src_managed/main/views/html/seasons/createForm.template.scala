
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
object createForm extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[Season],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(seasonForm: Form[Season]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._

implicit def /*5.2*/implicitFieldConstructor/*5.26*/ = {{ FieldConstructor(twitterBootstrapInput.render) }};
Seq[Any](format.raw/*1.28*/("""

"""),format.raw/*4.1*/("""
"""),format.raw/*5.80*/("""

"""),_display_(Seq[Any](/*7.2*/main/*7.6*/ {_display_(Seq[Any](format.raw/*7.8*/("""

<h1>Dodaj sezon</h1>

"""),_display_(Seq[Any](/*11.2*/form(routes.Seasons.save())/*11.29*/ {_display_(Seq[Any](format.raw/*11.31*/("""

<fieldset>

    """),_display_(Seq[Any](/*15.6*/inputText(seasonForm("year_start"), '_label -> "Rok rozpoczęcia"))),format.raw/*15.71*/("""
    """),_display_(Seq[Any](/*16.6*/inputText(seasonForm("year_end"), '_label -> "Rok zakończenia"))),format.raw/*16.69*/("""

</fieldset>

<div class="actions">
    <input type="submit" value="Dodaj sezon" class="btn primary"> or
    <a href=""""),_display_(Seq[Any](/*22.15*/routes/*22.21*/.Seasons.list())),format.raw/*22.36*/("""" class="btn">Anuluj</a>
</div>

""")))})),format.raw/*25.2*/("""

""")))})))}
    }
    
    def render(seasonForm:Form[Season]): play.api.templates.HtmlFormat.Appendable = apply(seasonForm)
    
    def f:((Form[Season]) => play.api.templates.HtmlFormat.Appendable) = (seasonForm) => apply(seasonForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat May 24 22:59:39 CEST 2014
                    SOURCE: D:/Pawlak/Play/test/app/views/seasons/createForm.scala.html
                    HASH: 096faf89a72633ead219d3264eef8da29d212864
                    MATRIX: 793->1|922->52|954->76|1038->27|1068->49|1097->130|1136->135|1147->139|1185->141|1249->170|1285->197|1325->199|1383->222|1470->287|1512->294|1597->357|1759->483|1774->489|1811->504|1879->541
                    LINES: 26->1|29->5|29->5|30->1|32->4|33->5|35->7|35->7|35->7|39->11|39->11|39->11|43->15|43->15|44->16|44->16|50->22|50->22|50->22|53->25
                    -- GENERATED --
                */
            