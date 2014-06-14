
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
object editForm extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[Long,Form[Game],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(id: Long, gameForm: Form[Game]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._

implicit def /*5.2*/implicitFieldConstructor/*5.26*/ = {{ FieldConstructor(twitterBootstrapInput.render) }};
Seq[Any](format.raw/*1.34*/("""

"""),format.raw/*4.1*/("""
"""),format.raw/*5.80*/("""

"""),_display_(Seq[Any](/*7.2*/main/*7.6*/ {_display_(Seq[Any](format.raw/*7.8*/("""

<h1>Edytuj rozgrywki</h1>

"""),_display_(Seq[Any](/*11.2*/form(routes.Games.update(id))/*11.31*/ {_display_(Seq[Any](format.raw/*11.33*/("""

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
    <input type="submit" value="Edytuj rozgrywki" class="btn primary"> or
    <a href=""""),_display_(Seq[Any](/*28.15*/routes/*28.21*/.Games.list())),format.raw/*28.34*/("""" class="btn">Anuluj</a>
</div>

""")))})),format.raw/*31.2*/("""

"""),_display_(Seq[Any](/*33.2*/form(routes.Games.delete(id), 'class -> "topRight")/*33.53*/ {_display_(Seq[Any](format.raw/*33.55*/("""
<input type="submit" value="Usuń sezon" class="btn danger">
""")))})),format.raw/*35.2*/("""

""")))})),format.raw/*37.2*/("""
"""))}
    }
    
    def render(id:Long,gameForm:Form[Game]): play.api.templates.HtmlFormat.Appendable = apply(id,gameForm)
    
    def f:((Long,Form[Game]) => play.api.templates.HtmlFormat.Appendable) = (id,gameForm) => apply(id,gameForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat May 24 22:59:38 CEST 2014
                    SOURCE: D:/Pawlak/Play/test/app/views/games/editForm.scala.html
                    HASH: fd0a7988ad38e25eae665bcac2ed85cd5c6aa857
                    MATRIX: 792->1|927->58|959->82|1043->33|1073->55|1102->136|1141->141|1152->145|1190->147|1259->181|1297->210|1337->212|1395->235|1464->282|1508->291|1694->456|1861->587|1876->593|1911->606|1979->643|2019->648|2079->699|2119->701|2214->765|2250->770
                    LINES: 26->1|29->5|29->5|30->1|32->4|33->5|35->7|35->7|35->7|39->11|39->11|39->11|43->15|43->15|45->17|50->22|56->28|56->28|56->28|59->31|61->33|61->33|61->33|63->35|65->37
                    -- GENERATED --
                */
            