
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
object createForm extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[Video],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(videoForm: Form[Video]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._

implicit def /*5.2*/implicitFieldConstructor/*5.26*/ = {{ FieldConstructor(twitterBootstrapInput.render) }};
Seq[Any](format.raw/*1.26*/("""

"""),format.raw/*4.1*/("""
"""),format.raw/*5.80*/("""

"""),_display_(Seq[Any](/*7.2*/main/*7.6*/ {_display_(Seq[Any](format.raw/*7.8*/("""

<h1>Dodaj wideo</h1>

"""),_display_(Seq[Any](/*11.2*/form(routes.Videos.save())/*11.28*/ {_display_(Seq[Any](format.raw/*11.30*/("""

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
    <input type="submit" value="Dodaj wideo" class="btn primary"> or
    <a href=""""),_display_(Seq[Any](/*30.15*/routes/*30.21*/.Videos.list())),format.raw/*30.35*/("""" class="btn">Anuluj</a>
</div>

""")))})),format.raw/*33.2*/("""

""")))})))}
    }
    
    def render(videoForm:Form[Video]): play.api.templates.HtmlFormat.Appendable = apply(videoForm)
    
    def f:((Form[Video]) => play.api.templates.HtmlFormat.Appendable) = (videoForm) => apply(videoForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Jun 16 17:20:58 CEST 2014
                    SOURCE: D:/Pawlak/Play/live/app/views/videos/createForm.scala.html
                    HASH: f12bd8a88cfb2dced7c1e49eb0e971a6be372656
                    MATRIX: 791->1|918->50|950->74|1034->25|1064->47|1093->128|1132->133|1143->137|1181->139|1245->168|1280->194|1320->196|1378->219|1448->267|1492->276|1676->439|1720->448|1791->497|1953->623|1968->629|2004->643|2072->680
                    LINES: 26->1|29->5|29->5|30->1|32->4|33->5|35->7|35->7|35->7|39->11|39->11|39->11|43->15|43->15|45->17|50->22|52->24|52->24|58->30|58->30|58->30|61->33
                    -- GENERATED --
                */
            