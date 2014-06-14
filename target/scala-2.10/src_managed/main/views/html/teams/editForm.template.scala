
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

"""),_display_(Seq[Any](/*11.2*/if(flash.containsKey("success"))/*11.34*/ {_display_(Seq[Any](format.raw/*11.36*/("""
    <div class="alert-message warning">
        <strong>Gotowe!</strong> """),_display_(Seq[Any](/*13.35*/flash/*13.40*/.get("success"))),format.raw/*13.55*/("""
    </div>
""")))})),format.raw/*15.2*/("""

"""),_display_(Seq[Any](/*17.2*/form(routes.Teams.update(id))/*17.31*/ {_display_(Seq[Any](format.raw/*17.33*/("""

<fieldset>

    """),_display_(Seq[Any](/*21.6*/inputText(zespolForm("name"), '_label -> "Nazwa zespołu"))),format.raw/*21.63*/("""
    """),_display_(Seq[Any](/*22.6*/select(
    zespolForm("crest"),
    options(Team.crest_options),
    '_label -> "Herb", '_default -> "-- Wybierz herb --",
    '_showConstraints -> false
    ))),format.raw/*27.6*/("""

</fieldset>

<img src=""""),_display_(Seq[Any](/*31.12*/routes/*31.18*/.Assets.at(crest))),format.raw/*31.35*/("""" style="margin:5px;">

<div class="actions">
    <input type="submit" value="Edytuj zespół" class="btn primary"> or
    <a href=""""),_display_(Seq[Any](/*35.15*/routes/*35.21*/.Teams.list())),format.raw/*35.34*/("""" class="btn">Anuluj</a>
</div>

""")))})),format.raw/*38.2*/("""

"""),_display_(Seq[Any](/*40.2*/form(routes.Teams.delete(id), 'class -> "topRight")/*40.53*/ {_display_(Seq[Any](format.raw/*40.55*/("""
    <input type="submit" value="Usuń ten zespół" class="btn danger">
""")))})),format.raw/*42.2*/("""

"""),_display_(Seq[Any](/*44.2*/form(action = routes.Teams.upload(id), 'enctype -> "multipart/form-data")/*44.75*/ {_display_(Seq[Any](format.raw/*44.77*/("""
    <input type="file" name="picture">
    <input type="submit">
""")))})),format.raw/*47.2*/("""

""")))})),format.raw/*49.2*/("""

"""))}
    }
    
    def render(id:Long,crest:String,zespolForm:Form[Team]): play.api.templates.HtmlFormat.Appendable = apply(id,crest,zespolForm)
    
    def f:((Long,String,Form[Team]) => play.api.templates.HtmlFormat.Appendable) = (id,crest,zespolForm) => apply(id,crest,zespolForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Jun 14 15:09:51 CEST 2014
                    SOURCE: D:/Pawlak/Play/test/app/views/teams/editForm.scala.html
                    HASH: bbcc23f3c7940a73d1181bb5472cd738a3fd75ed
                    MATRIX: 799->1|951->75|983->99|1067->50|1097->72|1126->153|1165->158|1176->162|1214->164|1280->195|1321->227|1361->229|1474->306|1488->311|1525->326|1571->341|1611->346|1649->375|1689->377|1747->400|1826->457|1868->464|2054->629|2120->659|2135->665|2174->682|2345->817|2360->823|2395->836|2463->873|2503->878|2563->929|2603->931|2707->1004|2747->1009|2829->1082|2869->1084|2970->1154|3006->1159
                    LINES: 26->1|29->5|29->5|30->1|32->4|33->5|35->7|35->7|35->7|39->11|39->11|39->11|41->13|41->13|41->13|43->15|45->17|45->17|45->17|49->21|49->21|50->22|55->27|59->31|59->31|59->31|63->35|63->35|63->35|66->38|68->40|68->40|68->40|70->42|72->44|72->44|72->44|75->47|77->49
                    -- GENERATED --
                */
            