
package views.html.videos

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
object editForm extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[Long,Form[Video],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(id: Long, videoForm: Form[Video]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._

implicit def /*5.2*/implicitFieldConstructor/*5.26*/ = {{ FieldConstructor(twitterBootstrapInput.render) }};
Seq[Any](format.raw/*1.36*/("""

"""),format.raw/*4.1*/("""
"""),format.raw/*5.80*/("""

"""),_display_(Seq[Any](/*7.2*/main/*7.6*/ {_display_(Seq[Any](format.raw/*7.8*/("""

<h1>Edytuj wideo</h1>

"""),_display_(Seq[Any](/*11.2*/form(routes.Videos.update(id))/*11.32*/ {_display_(Seq[Any](format.raw/*11.34*/("""

<fieldset>

    """),_display_(Seq[Any](/*15.6*/inputText(videoForm("name"), '_label -> "Nazwa"))),format.raw/*15.54*/("""

    """),_display_(Seq[Any](/*17.6*/select(
    videoForm("vmatch.id"),
    options(Match.options),
    '_label -> "Mecz", '_default -> "-- Wybierz mecz --",
    '_showConstraints -> false
    ))),format.raw/*22.6*/("""

    """),_display_(Seq[Any](/*24.6*/textarea(videoForm("path"), '_label -> "Ścieżka"))),format.raw/*24.55*/("""

</fieldset>

<div class="actions">
    <input type="submit" value="Edytuj wideo" class="btn primary"> or
    <a href=""""),_display_(Seq[Any](/*30.15*/routes/*30.21*/.Videos.list())),format.raw/*30.35*/("""" class="btn">Anuluj</a>
</div>

""")))})),format.raw/*33.2*/("""

"""),_display_(Seq[Any](/*35.2*/if(!videoForm("path").value.isEmpty)/*35.38*/{_display_(Seq[Any](format.raw/*35.39*/("""
<iframe class="videoItem" title="YouTube video player" width="640" height="360" src="""),_display_(Seq[Any](/*36.86*/videoForm("path")/*36.103*/.value)),format.raw/*36.109*/(""" frameborder="0" allowfullscreen style="max-width:100%;"></iframe>
""")))})),format.raw/*37.2*/("""

"""),_display_(Seq[Any](/*39.2*/form(routes.Videos.delete(id), 'class -> "topRight")/*39.54*/ {_display_(Seq[Any](format.raw/*39.56*/("""
<input type="submit" value="Usuń wideo" class="btn danger">
""")))})),format.raw/*41.2*/("""

""")))})),format.raw/*43.2*/("""
"""))}
    }
    
    def render(id:Long,videoForm:Form[Video]): play.api.templates.HtmlFormat.Appendable = apply(id,videoForm)
    
    def f:((Long,Form[Video]) => play.api.templates.HtmlFormat.Appendable) = (id,videoForm) => apply(id,videoForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Jun 16 17:20:58 CEST 2014
                    SOURCE: D:/Pawlak/Play/live/app/views/videos/editForm.scala.html
                    HASH: e65434063a03d93d63eca37f219bdc6450ceab6c
                    MATRIX: 794->1|931->60|963->84|1047->35|1077->57|1106->138|1145->143|1156->147|1194->149|1259->179|1298->209|1338->211|1396->234|1466->282|1510->291|1694->454|1738->463|1809->512|1972->639|1987->645|2023->659|2091->696|2131->701|2176->737|2215->738|2338->825|2365->842|2394->848|2494->917|2534->922|2595->974|2635->976|2730->1040|2766->1045
                    LINES: 26->1|29->5|29->5|30->1|32->4|33->5|35->7|35->7|35->7|39->11|39->11|39->11|43->15|43->15|45->17|50->22|52->24|52->24|58->30|58->30|58->30|61->33|63->35|63->35|63->35|64->36|64->36|64->36|65->37|67->39|67->39|67->39|69->41|71->43
                    -- GENERATED --
                */
            