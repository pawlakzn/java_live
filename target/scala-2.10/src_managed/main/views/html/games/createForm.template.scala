
package views.html.games

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
object createForm extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[Game],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(gameForm: Form[Game]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._

implicit def /*5.2*/implicitFieldConstructor/*5.26*/ = {{ FieldConstructor(twitterBootstrapInput.render) }};
Seq[Any](format.raw/*1.24*/("""

"""),format.raw/*4.1*/("""
"""),format.raw/*5.80*/("""

"""),_display_(Seq[Any](/*7.2*/main/*7.6*/ {_display_(Seq[Any](format.raw/*7.8*/("""

<h1>Dodaj rozgrywki</h1>

"""),_display_(Seq[Any](/*11.2*/form(routes.Games.save())/*11.27*/ {_display_(Seq[Any](format.raw/*11.29*/("""

<fieldset>

    """),_display_(Seq[Any](/*15.6*/inputText(gameForm("name"), '_label -> "Nazwa"))),format.raw/*15.53*/("""

    """),_display_(Seq[Any](/*17.6*/select(
    gameForm("season.id"),
    options(Season.options),
    '_label -> "Sezon", '_default -> "-- Wybierz sezon --",
    '_showConstraints -> false
    ))),format.raw/*22.6*/("""

</fieldset>

<div class="actions">
    <input type="submit" value="Dodaj rozgrywki" class="btn primary"> or
    <a href=""""),_display_(Seq[Any](/*28.15*/routes/*28.21*/.Games.list())),format.raw/*28.34*/("""" class="btn">Anuluj</a>
</div>

""")))})),format.raw/*31.2*/("""

""")))})))}
    }
    
    def render(gameForm:Form[Game]): play.api.templates.HtmlFormat.Appendable = apply(gameForm)
    
    def f:((Form[Game]) => play.api.templates.HtmlFormat.Appendable) = (gameForm) => apply(gameForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat May 24 22:59:38 CEST 2014
                    SOURCE: D:/Pawlak/Play/test/app/views/games/createForm.scala.html
                    HASH: ff1d4a1c729abb3f5f05acded465a2c627c05ad1
                    MATRIX: 789->1|914->48|946->72|1030->23|1060->45|1089->126|1128->131|1139->135|1177->137|1245->170|1279->195|1319->197|1377->220|1446->267|1490->276|1676->441|1842->571|1857->577|1892->590|1960->627
                    LINES: 26->1|29->5|29->5|30->1|32->4|33->5|35->7|35->7|35->7|39->11|39->11|39->11|43->15|43->15|45->17|50->22|56->28|56->28|56->28|59->31
                    -- GENERATED --
                */
            