
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

"""),_display_(Seq[Any](/*11.2*/if(flash.containsKey("wrong"))/*11.32*/ {_display_(Seq[Any](format.raw/*11.34*/("""
<div class="alert-message warning">
    """),_display_(Seq[Any](/*13.6*/flash/*13.11*/.get("wrong"))),format.raw/*13.24*/("""
</div>
""")))})),format.raw/*15.2*/("""

"""),_display_(Seq[Any](/*17.2*/form(routes.Seasons.update(id))/*17.33*/ {_display_(Seq[Any](format.raw/*17.35*/("""

<fieldset>

    """),_display_(Seq[Any](/*21.6*/inputText(seasonForm("year_start"), '_label -> "Rok rozpoczęcia"))),format.raw/*21.71*/("""
    """),_display_(Seq[Any](/*22.6*/inputText(seasonForm("year_end"), '_label -> "Rok zakończenia"))),format.raw/*22.69*/("""

</fieldset>

<div class="actions">
    <input type="submit" value="Edytuj sezon" class="btn primary"> or
    <a href=""""),_display_(Seq[Any](/*28.15*/routes/*28.21*/.Seasons.list())),format.raw/*28.36*/("""" class="btn">Anuluj</a>
</div>

""")))})),format.raw/*31.2*/("""

"""),_display_(Seq[Any](/*33.2*/form(routes.Seasons.delete(id), 'class -> "topRight")/*33.55*/ {_display_(Seq[Any](format.raw/*33.57*/("""
<input type="submit" value="Usuń ten sezon" class="btn danger">
""")))})),format.raw/*35.2*/("""

""")))})),format.raw/*37.2*/("""
"""))}
    }
    
    def render(id:Long,seasonForm:Form[Season]): play.api.templates.HtmlFormat.Appendable = apply(id,seasonForm)
    
    def f:((Long,Form[Season]) => play.api.templates.HtmlFormat.Appendable) = (id,seasonForm) => apply(id,seasonForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Jun 16 17:20:58 CEST 2014
                    SOURCE: D:/Pawlak/Play/live/app/views/seasons/editForm.scala.html
                    HASH: 080ac51d45fabf3697674ed1b128afa16c4df430
                    MATRIX: 796->1|935->62|967->86|1051->37|1081->59|1110->140|1149->145|1160->149|1198->151|1263->181|1302->211|1342->213|1421->257|1435->262|1470->275|1512->286|1552->291|1592->322|1632->324|1690->347|1777->412|1819->419|1904->482|2067->609|2082->615|2119->630|2187->667|2227->672|2289->725|2329->727|2428->795|2464->800
                    LINES: 26->1|29->5|29->5|30->1|32->4|33->5|35->7|35->7|35->7|39->11|39->11|39->11|41->13|41->13|41->13|43->15|45->17|45->17|45->17|49->21|49->21|50->22|50->22|56->28|56->28|56->28|59->31|61->33|61->33|61->33|63->35|65->37
                    -- GENERATED --
                */
            