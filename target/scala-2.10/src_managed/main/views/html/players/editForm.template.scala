
package views.html.players

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
object editForm extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template3[Long,String,Form[Player],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(id: Long, photo: String, playerForm: Form[Player]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._

implicit def /*5.2*/implicitFieldConstructor/*5.26*/ = {{ FieldConstructor(twitterBootstrapInput.render) }};
Seq[Any](format.raw/*1.53*/("""

"""),format.raw/*4.1*/("""
"""),format.raw/*5.80*/("""

"""),_display_(Seq[Any](/*7.2*/main/*7.6*/ {_display_(Seq[Any](format.raw/*7.8*/("""

<h1>Edytuj piłkarza</h1>

"""),_display_(Seq[Any](/*11.2*/if(flash.containsKey("success"))/*11.34*/ {_display_(Seq[Any](format.raw/*11.36*/("""
<div class="alert-message warning">
    <strong>Gotowe!</strong> """),_display_(Seq[Any](/*13.31*/flash/*13.36*/.get("success"))),format.raw/*13.51*/("""
</div>
""")))})),format.raw/*15.2*/("""

"""),_display_(Seq[Any](/*17.2*/form(routes.Players.update(id))/*17.33*/ {_display_(Seq[Any](format.raw/*17.35*/("""

<fieldset>

    """),_display_(Seq[Any](/*21.6*/inputText(playerForm("firstname"), '_label -> "Imię"))),format.raw/*21.59*/("""
    """),_display_(Seq[Any](/*22.6*/inputText(playerForm("lastname"), '_label -> "Nazwisko"))),format.raw/*22.62*/("""

    """),_display_(Seq[Any](/*24.6*/select(
    playerForm("team.id"),
    options(Team.options),
    '_label -> "Zespół", '_default -> "-- Wybierz zespół --",
    '_showConstraints -> false
    ))),format.raw/*29.6*/("""

    """),_display_(Seq[Any](/*31.6*/inputText(playerForm("date_birth"), '_label -> "Data urodzin"))),format.raw/*31.68*/("""

    """),_display_(Seq[Any](/*33.6*/select(
    playerForm("photo"),
    options(Player.photo_options),
    '_label -> "Zdjęcie", '_default -> "-- Wybierz zdjęcie --",
    '_showConstraints -> false
    ))),format.raw/*38.6*/("""

    """),_display_(Seq[Any](/*40.6*/inputText(playerForm("height"), '_label -> "Wzrost"))),format.raw/*40.58*/("""
    """),_display_(Seq[Any](/*41.6*/inputText(playerForm("weight"), '_label -> "Waga"))),format.raw/*41.56*/("""
    """),_display_(Seq[Any](/*42.6*/inputText(playerForm("position"), '_label -> "Pozycja"))),format.raw/*42.61*/("""
    """),_display_(Seq[Any](/*43.6*/inputText(playerForm("number"), '_label -> "Numer"))),format.raw/*43.57*/("""

</fieldset>

<img src=""""),_display_(Seq[Any](/*47.12*/routes/*47.18*/.Assets.at(photo))),format.raw/*47.35*/("""" style="margin:5px;">

<div class="actions">
    <input type="submit" value="Edytuj piłkarza" class="btn primary"> or
    <a href=""""),_display_(Seq[Any](/*51.15*/routes/*51.21*/.Players.list())),format.raw/*51.36*/("""" class="btn">Anuluj</a>
</div>

""")))})),format.raw/*54.2*/("""

"""),_display_(Seq[Any](/*56.2*/form(routes.Players.delete(id), 'class -> "topRight")/*56.55*/ {_display_(Seq[Any](format.raw/*56.57*/("""
<input type="submit" value="Usuń piłkarza" class="btn danger">
""")))})),format.raw/*58.2*/("""

"""),_display_(Seq[Any](/*60.2*/form(action = routes.Players.upload(id), 'enctype -> "multipart/form-data")/*60.77*/ {_display_(Seq[Any](format.raw/*60.79*/("""
    <input type="file" name="picture">
    <input type="submit">
""")))})),format.raw/*63.2*/("""


""")))})))}
    }
    
    def render(id:Long,photo:String,playerForm:Form[Player]): play.api.templates.HtmlFormat.Appendable = apply(id,photo,playerForm)
    
    def f:((Long,String,Form[Player]) => play.api.templates.HtmlFormat.Appendable) = (id,photo,playerForm) => apply(id,photo,playerForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Jun 14 23:14:58 CEST 2014
                    SOURCE: D:/Pawlak/Play/live/app/views/players/editForm.scala.html
                    HASH: 5703b00343d61fc1341c8e49f729a135c9c60ec0
                    MATRIX: 803->1|957->77|989->101|1073->52|1103->74|1132->155|1171->160|1182->164|1220->166|1288->199|1329->231|1369->233|1474->302|1488->307|1525->322|1567->333|1607->338|1647->369|1687->371|1745->394|1820->447|1862->454|1940->510|1984->519|2170->684|2214->693|2298->755|2342->764|2536->937|2580->946|2654->998|2696->1005|2768->1055|2810->1062|2887->1117|2929->1124|3002->1175|3068->1205|3083->1211|3122->1228|3295->1365|3310->1371|3347->1386|3415->1423|3455->1428|3517->1481|3557->1483|3655->1550|3695->1555|3779->1630|3819->1632|3920->1702
                    LINES: 26->1|29->5|29->5|30->1|32->4|33->5|35->7|35->7|35->7|39->11|39->11|39->11|41->13|41->13|41->13|43->15|45->17|45->17|45->17|49->21|49->21|50->22|50->22|52->24|57->29|59->31|59->31|61->33|66->38|68->40|68->40|69->41|69->41|70->42|70->42|71->43|71->43|75->47|75->47|75->47|79->51|79->51|79->51|82->54|84->56|84->56|84->56|86->58|88->60|88->60|88->60|91->63
                    -- GENERATED --
                */
            