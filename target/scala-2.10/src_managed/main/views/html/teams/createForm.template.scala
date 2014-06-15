
package views.html.teams

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
object createForm extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[Team],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(zespolForm: Form[Team]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._

implicit def /*5.2*/implicitFieldConstructor/*5.26*/ = {{ FieldConstructor(twitterBootstrapInput.render) }};
Seq[Any](format.raw/*1.26*/("""

"""),format.raw/*4.1*/("""
"""),format.raw/*5.80*/("""

"""),_display_(Seq[Any](/*7.2*/main/*7.6*/ {_display_(Seq[Any](format.raw/*7.8*/("""

<h1>Dodaj zespół</h1>

"""),_display_(Seq[Any](/*11.2*/form(routes.Teams.save())/*11.27*/ {_display_(Seq[Any](format.raw/*11.29*/("""

<fieldset>

    """),_display_(Seq[Any](/*15.6*/inputText(zespolForm("name"), '_label -> "Nazwa zespołu"))),format.raw/*15.63*/("""
    """),_display_(Seq[Any](/*16.6*/inputText(zespolForm("crest"), '_label -> "Nazwa obrazka z herbem"))),format.raw/*16.73*/("""

</fieldset>

<div class="actions">
    <input type="submit" value="Dodaj zespół" class="btn primary"> or
    <a href=""""),_display_(Seq[Any](/*22.15*/routes/*22.21*/.Teams.list())),format.raw/*22.34*/("""" class="btn">Anuluj</a>
</div>

""")))})),format.raw/*25.2*/("""

""")))})))}
    }
    
    def render(zespolForm:Form[Team]): play.api.templates.HtmlFormat.Appendable = apply(zespolForm)
    
    def f:((Form[Team]) => play.api.templates.HtmlFormat.Appendable) = (zespolForm) => apply(zespolForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Jun 15 23:09:50 CEST 2014
                    SOURCE: D:/Pawlak/Play/live/app/views/teams/createForm.scala.html
                    HASH: b685a290305126fe318b882d76c4429dc4275607
                    MATRIX: 789->1|916->50|948->74|1032->25|1062->47|1091->128|1130->133|1141->137|1179->139|1244->169|1278->194|1318->196|1376->219|1455->276|1497->283|1586->350|1749->477|1764->483|1799->496|1867->533
                    LINES: 26->1|29->5|29->5|30->1|32->4|33->5|35->7|35->7|35->7|39->11|39->11|39->11|43->15|43->15|44->16|44->16|50->22|50->22|50->22|53->25
                    -- GENERATED --
                */
            