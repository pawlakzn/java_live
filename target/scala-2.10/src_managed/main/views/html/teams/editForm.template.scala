
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
object editForm extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template3[Long,String,Form[Team],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(id: Long, crest: String, zespolForm: Form[Team]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._

implicit def /*5.2*/implicitFieldConstructor/*5.26*/ = {{ FieldConstructor(twitterBootstrapInput.render) }};
Seq[Any](format.raw/*1.51*/("""

"""),format.raw/*4.1*/("""
"""),format.raw/*5.80*/("""

"""),_display_(Seq[Any](/*7.2*/main/*7.6*/ {_display_(Seq[Any](format.raw/*7.8*/("""

<h1>Edytuj Zespół</h1>

"""),_display_(Seq[Any](/*11.2*/if(flash.containsKey("wrong"))/*11.32*/ {_display_(Seq[Any](format.raw/*11.34*/("""
<div class="alert-message warning">
    <strong>Gotowe!</strong> """),_display_(Seq[Any](/*13.31*/flash/*13.36*/.get("wrong"))),format.raw/*13.49*/("""
</div>
""")))})),format.raw/*15.2*/("""


"""),_display_(Seq[Any](/*18.2*/if(flash.containsKey("success"))/*18.34*/ {_display_(Seq[Any](format.raw/*18.36*/("""
    <div class="alert-message warning">
        <strong>Gotowe!</strong> """),_display_(Seq[Any](/*20.35*/flash/*20.40*/.get("success"))),format.raw/*20.55*/("""
    </div>
""")))})),format.raw/*22.2*/("""

"""),_display_(Seq[Any](/*24.2*/form(routes.Teams.update(id))/*24.31*/ {_display_(Seq[Any](format.raw/*24.33*/("""

<fieldset>

    """),_display_(Seq[Any](/*28.6*/inputText(zespolForm("name"), '_label -> "Nazwa zespołu"))),format.raw/*28.63*/("""
    """),_display_(Seq[Any](/*29.6*/select(
    zespolForm("crest"),
    options(Team.crest_options),
    '_label -> "Herb", '_default -> "-- Wybierz herb --",
    '_showConstraints -> false
    ))),format.raw/*34.6*/("""

</fieldset>

<img src=""""),_display_(Seq[Any](/*38.12*/routes/*38.18*/.Assets.at(crest))),format.raw/*38.35*/("""" style="margin:5px;">

<div class="actions">
    <input type="submit" value="Edytuj zespół" class="btn primary"> or
    <a href=""""),_display_(Seq[Any](/*42.15*/routes/*42.21*/.Teams.list())),format.raw/*42.34*/("""" class="btn">Anuluj</a>
</div>

""")))})),format.raw/*45.2*/("""

"""),_display_(Seq[Any](/*47.2*/form(routes.Teams.delete(id), 'class -> "topRight")/*47.53*/ {_display_(Seq[Any](format.raw/*47.55*/("""
    <input type="submit" value="Usuń ten zespół" class="btn danger">
""")))})),format.raw/*49.2*/("""

"""),_display_(Seq[Any](/*51.2*/form(action = routes.Teams.upload(id), 'enctype -> "multipart/form-data")/*51.75*/ {_display_(Seq[Any](format.raw/*51.77*/("""
    <input type="file" name="picture">
    <input type="submit">
""")))})),format.raw/*54.2*/("""

""")))})),format.raw/*56.2*/("""

"""))}
    }
    
    def render(id:Long,crest:String,zespolForm:Form[Team]): play.api.templates.HtmlFormat.Appendable = apply(id,crest,zespolForm)
    
    def f:((Long,String,Form[Team]) => play.api.templates.HtmlFormat.Appendable) = (id,crest,zespolForm) => apply(id,crest,zespolForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Jun 16 17:58:46 CEST 2014
                    SOURCE: D:/Pawlak/Play/live/app/views/teams/editForm.scala.html
                    HASH: d343e6a80c8926ce7415d7ff7de4dc6b416e543e
                    MATRIX: 799->1|951->75|983->99|1067->50|1097->72|1126->153|1165->158|1176->162|1214->164|1280->195|1319->225|1359->227|1464->296|1478->301|1513->314|1555->325|1597->332|1638->364|1678->366|1791->443|1805->448|1842->463|1888->478|1928->483|1966->512|2006->514|2064->537|2143->594|2185->601|2371->766|2437->796|2452->802|2491->819|2662->954|2677->960|2712->973|2780->1010|2820->1015|2880->1066|2920->1068|3024->1141|3064->1146|3146->1219|3186->1221|3287->1291|3323->1296
                    LINES: 26->1|29->5|29->5|30->1|32->4|33->5|35->7|35->7|35->7|39->11|39->11|39->11|41->13|41->13|41->13|43->15|46->18|46->18|46->18|48->20|48->20|48->20|50->22|52->24|52->24|52->24|56->28|56->28|57->29|62->34|66->38|66->38|66->38|70->42|70->42|70->42|73->45|75->47|75->47|75->47|77->49|79->51|79->51|79->51|82->54|84->56
                    -- GENERATED --
                */
            