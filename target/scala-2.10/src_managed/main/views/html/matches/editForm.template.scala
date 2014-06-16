
package views.html.matches

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
object editForm extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template3[Long,Form[Match],Form[Statistic],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(id: Long, matchForm: Form[Match],  statisticForm: Form[Statistic]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._

implicit def /*5.2*/implicitFieldConstructor/*5.26*/ = {{ FieldConstructor(twitterBootstrapInput.render) }};
Seq[Any](format.raw/*1.69*/("""

"""),format.raw/*4.1*/("""
"""),format.raw/*5.80*/("""

"""),_display_(Seq[Any](/*7.2*/main/*7.6*/ {_display_(Seq[Any](format.raw/*7.8*/("""

"""),_display_(Seq[Any](/*9.2*/if(flash.containsKey("wrong"))/*9.32*/ {_display_(Seq[Any](format.raw/*9.34*/("""
<div class="alert-message warning">
    <strong>Błąd!</strong> """),_display_(Seq[Any](/*11.29*/flash/*11.34*/.get("wrong"))),format.raw/*11.47*/("""
</div>
""")))})),format.raw/*13.2*/("""

"""),_display_(Seq[Any](/*15.2*/if(flash.containsKey("success"))/*15.34*/ {_display_(Seq[Any](format.raw/*15.36*/("""
<div class="alert-message warning">
    <strong>Gotowe!</strong> """),_display_(Seq[Any](/*17.31*/flash/*17.36*/.get("success"))),format.raw/*17.51*/("""
</div>
""")))})),format.raw/*19.2*/("""

"""),_display_(Seq[Any](/*21.2*/form(routes.Matches.update(id))/*21.33*/ {_display_(Seq[Any](format.raw/*21.35*/("""
<div width="100%;" style="display:table;margin:0;padding:0;border:0;height:auto;">
    <div style="float:left;">
<h1>Edytuj Mecz</h1>
<fieldset>

    """),_display_(Seq[Any](/*27.6*/select(
    matchForm("team1.id"),
    options(Team.options),
    '_label -> "Gospodarz", '_default -> "-- Wybierz gospodarza --",
    '_showConstraints -> false
    ))),format.raw/*32.6*/("""

    """),_display_(Seq[Any](/*34.6*/select(
    matchForm("team2.id"),
    options(Team.options),
    '_label -> "Goście", '_default -> "-- Wybierz gości --",
    '_showConstraints -> false
    ))),format.raw/*39.6*/("""

    """),_display_(Seq[Any](/*41.6*/select(
    matchForm("game.id"),
    options(Game.options),
    '_label -> "Rozgrywki", '_default -> "-- Wybierz rozgrywki --",
    '_showConstraints -> false
    ))),format.raw/*46.6*/("""

    """),_display_(Seq[Any](/*48.6*/inputText(matchForm("queue"), '_label -> "Kolejka"))),format.raw/*48.57*/("""
    """),_display_(Seq[Any](/*49.6*/inputText(matchForm("match_date"), '_label -> "Data i godzina"))),format.raw/*49.69*/("""

    """),_display_(Seq[Any](/*51.6*/select(
    matchForm("referee.id"),
    options(Referee.options),
    '_label -> "Sędzia", '_default -> "-- Wybierz sędziego --",
    '_showConstraints -> false
    ))),format.raw/*56.6*/("""

    """),_display_(Seq[Any](/*58.6*/inputText(matchForm("weather"), '_label -> "Pogoda"))),format.raw/*58.58*/("""
    """),_display_(Seq[Any](/*59.6*/inputText(matchForm("viewers"), '_label -> "Widzowie"))),format.raw/*59.60*/("""

</fieldset>
    </div>
    <div style="float:right;margin-left:30px;">
        <h1>Edytuj Statystyki</h1>
        <strong>"""),_display_(Seq[Any](/*65.18*/matchForm("team1.name")/*65.41*/.value)),format.raw/*65.47*/("""</strong> - <strong>"""),_display_(Seq[Any](/*65.68*/matchForm("team2.name")/*65.91*/.value)),format.raw/*65.97*/("""</strong> : """),_display_(Seq[Any](/*65.110*/matchForm("statistics.id")/*65.136*/.value)),format.raw/*65.142*/(""" ^ """),_display_(Seq[Any](/*65.146*/statisticForm("id")/*65.165*/.value)),format.raw/*65.171*/("""<br><br>
        Bramki<br>
        <input class="input_stat" id="goals1" name="goals1" value=""""),_display_(Seq[Any](/*67.69*/statisticForm("goals1")/*67.92*/.value)),format.raw/*67.98*/("""">
        <input class="input_stat" id="goals2" name="goals2" value=""""),_display_(Seq[Any](/*68.69*/statisticForm("goals2")/*68.92*/.value)),format.raw/*68.98*/("""">
        (
        <input class="input_stat" id="goals1_half" name="goals1_half" value=""""),_display_(Seq[Any](/*70.79*/statisticForm("goals1_half")/*70.107*/.value)),format.raw/*70.113*/("""">
        <input class="input_stat" id="goals2_half" name="goals2_half" value=""""),_display_(Seq[Any](/*71.79*/statisticForm("goals2_half")/*71.107*/.value)),format.raw/*71.113*/("""">
        )<br>
        Słupki/Poprzeczki:<br>
        <input class="input_stat" id="goalpost1" name="goalpost1" value=""""),_display_(Seq[Any](/*74.75*/statisticForm("goalpost1")/*74.101*/.value)),format.raw/*74.107*/("""">
        <input class="input_stat" id="goalpost2" name="goalpost2" value=""""),_display_(Seq[Any](/*75.75*/statisticForm("goalpost2")/*75.101*/.value)),format.raw/*75.107*/("""">
        (
        <input class="input_stat" id="goalpost1_half" name="goalpost1_half" value=""""),_display_(Seq[Any](/*77.85*/statisticForm("goalpost1_half")/*77.116*/.value)),format.raw/*77.122*/("""">
        <input class="input_stat" id="goalpost2_half" name="goalpost2_half" value=""""),_display_(Seq[Any](/*78.85*/statisticForm("goalpost2_half")/*78.116*/.value)),format.raw/*78.122*/("""">
        )<br>
        Strzały celne:<br>
        <input class="input_stat" id="attempts_target1" name="attempts_target1" value=""""),_display_(Seq[Any](/*81.89*/statisticForm("attempts_target1")/*81.122*/.value)),format.raw/*81.128*/("""">
        <input class="input_stat" id="attempts_target2" name="attempts_target2" value=""""),_display_(Seq[Any](/*82.89*/statisticForm("attempts_target2")/*82.122*/.value)),format.raw/*82.128*/("""">
        (
        <input class="input_stat" id="attempts_target1_half" name="attempts_target1_half" value=""""),_display_(Seq[Any](/*84.99*/statisticForm("attempts_target1_half")/*84.137*/.value)),format.raw/*84.143*/("""">
        <input class="input_stat" id="attempts_target2_half" name="attempts_target2_half" value=""""),_display_(Seq[Any](/*85.99*/statisticForm("attempts_target2_half")/*85.137*/.value)),format.raw/*85.143*/("""">
        )<br>
        Strzały niecelne:<br>
        <input class="input_stat" id="attempts_offtarget1" name="attempts_offtarget1" value=""""),_display_(Seq[Any](/*88.95*/statisticForm("attempts_offtarget1")/*88.131*/.value)),format.raw/*88.137*/("""">
        <input class="input_stat" id="attempts_offtarget2" name="attempts_offtarget2" value=""""),_display_(Seq[Any](/*89.95*/statisticForm("attempts_offtarget2")/*89.131*/.value)),format.raw/*89.137*/("""">
        (
        <input class="input_stat" id="attempts_offtarget1_half" name="attempts_offtarget1_half" value=""""),_display_(Seq[Any](/*91.105*/statisticForm("attempts_offtarget1_half")/*91.146*/.value)),format.raw/*91.152*/("""">
        <input class="input_stat" id="attempts_offtarget2_half" name="attempts_offtarget2_half" value=""""),_display_(Seq[Any](/*92.105*/statisticForm("attempts_offtarget2_half")/*92.146*/.value)),format.raw/*92.152*/("""">
        )<br>
        Strzały zablokowane:<br>
        <input class="input_stat" id="attempts_blocked1" name="attempts_blocked1" value=""""),_display_(Seq[Any](/*95.91*/statisticForm("attempts_blocked1")/*95.125*/.value)),format.raw/*95.131*/("""">
        <input class="input_stat" id="attempts_blocked2" name="attempts_blocked2" value=""""),_display_(Seq[Any](/*96.91*/statisticForm("attempts_blocked2")/*96.125*/.value)),format.raw/*96.131*/("""">
        (
        <input class="input_stat" id="attempts_blocked1_half" name="attempts_blocked1_half" value=""""),_display_(Seq[Any](/*98.101*/statisticForm("attempts_blocked1_half")/*98.140*/.value)),format.raw/*98.146*/("""">
        <input class="input_stat" id="attempts_blocked2_half" name="attempts_blocked2_half" value=""""),_display_(Seq[Any](/*99.101*/statisticForm("attempts_blocked2_half")/*99.140*/.value)),format.raw/*99.146*/("""">
        )<br>
        Rzuty rożne:<br>
        <input class="input_stat" id="corners1" name="corners1" value=""""),_display_(Seq[Any](/*102.73*/statisticForm("corners1")/*102.98*/.value)),format.raw/*102.104*/("""">
        <input class="input_stat" id="corners2" name="corners2" value=""""),_display_(Seq[Any](/*103.73*/statisticForm("corners2")/*103.98*/.value)),format.raw/*103.104*/("""">
        (
        <input class="input_stat" id="corners1_half" name="corners1_half" value=""""),_display_(Seq[Any](/*105.83*/statisticForm("corners1_half")/*105.113*/.value)),format.raw/*105.119*/("""">
        <input class="input_stat" id="corners2_half" name="corners2_half" value=""""),_display_(Seq[Any](/*106.83*/statisticForm("corners2_half")/*106.113*/.value)),format.raw/*106.119*/("""">
        )<br>
        Faule:<br>
        <input class="input_stat" id="fouls1" name="fouls1" value=""""),_display_(Seq[Any](/*109.69*/statisticForm("fouls1")/*109.92*/.value)),format.raw/*109.98*/("""">
        <input class="input_stat" id="fouls2" name="fouls2" value=""""),_display_(Seq[Any](/*110.69*/statisticForm("fouls2")/*110.92*/.value)),format.raw/*110.98*/("""">
        (
        <input class="input_stat" id="fouls1_half" name="fouls1_half" value=""""),_display_(Seq[Any](/*112.79*/statisticForm("fouls1_half")/*112.107*/.value)),format.raw/*112.113*/("""">
        <input class="input_stat" id="fouls2_half" name="fouls2_half" value=""""),_display_(Seq[Any](/*113.79*/statisticForm("fouls2_half")/*113.107*/.value)),format.raw/*113.113*/("""">
        )<br>
        Spalone:<br>
        <input class="input_stat" id="offsides1" name="offsides1" value=""""),_display_(Seq[Any](/*116.75*/statisticForm("offsides1")/*116.101*/.value)),format.raw/*116.107*/("""">
        <input class="input_stat" id="offsides2" name="offsides2" value=""""),_display_(Seq[Any](/*117.75*/statisticForm("offsides2")/*117.101*/.value)),format.raw/*117.107*/("""">
        (
        <input class="input_stat" id="offsides1_half" name="offsides1_half" value=""""),_display_(Seq[Any](/*119.85*/statisticForm("offsides1_half")/*119.116*/.value)),format.raw/*119.122*/("""">
        <input class="input_stat" id="offsides2_half" name="offsides2_half" value=""""),_display_(Seq[Any](/*120.85*/statisticForm("offsides2_half")/*120.116*/.value)),format.raw/*120.122*/("""">
        )<br>
        Żółte kartki:<br>
        <input class="input_stat" id="yellow_cards1" name="yellow_cards1" value=""""),_display_(Seq[Any](/*123.83*/statisticForm("yellow_cards1")/*123.113*/.value)),format.raw/*123.119*/("""">
        <input class="input_stat" id="yellow_cards2" name="yellow_cards2" value=""""),_display_(Seq[Any](/*124.83*/statisticForm("yellow_cards2")/*124.113*/.value)),format.raw/*124.119*/("""">
        (
        <input class="input_stat" id="yellow_cards1_half" name="yellow_cards1_half" value=""""),_display_(Seq[Any](/*126.93*/statisticForm("yellow_cards1_half")/*126.128*/.value)),format.raw/*126.134*/("""">
        <input class="input_stat" id="yellow_cards2_half" name="yellow_cards2_half" value=""""),_display_(Seq[Any](/*127.93*/statisticForm("yellow_cards2_half")/*127.128*/.value)),format.raw/*127.134*/("""">
        )<br>
        Czerwone kartki:<br>
        <input class="input_stat" id="red_cards1" name="red_cards1" value=""""),_display_(Seq[Any](/*130.77*/statisticForm("red_cards1")/*130.104*/.value)),format.raw/*130.110*/("""">
        <input class="input_stat" id="red_cards2" name="red_cards2" value=""""),_display_(Seq[Any](/*131.77*/statisticForm("red_cards2")/*131.104*/.value)),format.raw/*131.110*/("""">
        (
        <input class="input_stat" id="red_cards1_half" name="red_cards1_half" value=""""),_display_(Seq[Any](/*133.87*/statisticForm("red_cards1_half")/*133.119*/.value)),format.raw/*133.125*/("""">
        <input class="input_stat" id="red_cards2_half" name="red_cards2_half" value=""""),_display_(Seq[Any](/*134.87*/statisticForm("red_cards2_half")/*134.119*/.value)),format.raw/*134.125*/("""">
        )<br>

    </div>
</div>

<input class="input_stat" type="hidden" id="team1.name" name="team1.name" value=""""),_display_(Seq[Any](/*140.83*/matchForm("team1.name")/*140.106*/.value)),format.raw/*140.112*/("""">
<input class="input_stat" type="hidden" id="team2.name" name="team2.name" value=""""),_display_(Seq[Any](/*141.83*/matchForm("team2.name")/*141.106*/.value)),format.raw/*141.112*/("""">
<input class="input_stat" type="hidden" id="id" name="id" value=""""),_display_(Seq[Any](/*142.67*/statisticForm("id")/*142.86*/.value)),format.raw/*142.92*/("""">

<div class="actions">
    <input type="submit" value="Zapisz" class="btn primary"> lub
    <a href=""""),_display_(Seq[Any](/*146.15*/routes/*146.21*/.Matches.list())),format.raw/*146.36*/("""" class="btn">Anuluj</a>
</div>


""")))})),format.raw/*150.2*/("""

"""),_display_(Seq[Any](/*152.2*/form(routes.Matches.delete(id), 'class -> "topRight")/*152.55*/ {_display_(Seq[Any](format.raw/*152.57*/("""
<input type="submit" value="Usuń ten mecz" class="btn danger" style="margin-top:35px;">
""")))})),format.raw/*154.2*/("""

""")))})),format.raw/*156.2*/("""

"""))}
    }
    
    def render(id:Long,matchForm:Form[Match],statisticForm:Form[Statistic]): play.api.templates.HtmlFormat.Appendable = apply(id,matchForm,statisticForm)
    
    def f:((Long,Form[Match],Form[Statistic]) => play.api.templates.HtmlFormat.Appendable) = (id,matchForm,statisticForm) => apply(id,matchForm,statisticForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Jun 16 19:04:28 CEST 2014
                    SOURCE: D:/Pawlak/Play/live/app/views/matches/editForm.scala.html
                    HASH: 603f77eede7ea8d0914dd76903b659e753d34d33
                    MATRIX: 811->1|981->93|1013->117|1097->68|1127->90|1156->171|1195->176|1206->180|1244->182|1283->187|1321->217|1360->219|1463->286|1477->291|1512->304|1554->315|1594->320|1635->352|1675->354|1780->423|1794->428|1831->443|1873->454|1913->459|1953->490|1993->492|2186->650|2379->822|2423->831|2608->995|2652->1004|2843->1174|2887->1183|2960->1234|3002->1241|3087->1304|3131->1313|3324->1485|3368->1494|3442->1546|3484->1553|3560->1607|3727->1738|3759->1761|3787->1767|3844->1788|3876->1811|3904->1817|3954->1830|3990->1856|4019->1862|4060->1866|4089->1885|4118->1891|4252->1989|4284->2012|4312->2018|4420->2090|4452->2113|4480->2119|4609->2212|4647->2240|4676->2246|4794->2328|4832->2356|4861->2362|5022->2487|5058->2513|5087->2519|5201->2597|5237->2623|5266->2629|5401->2728|5442->2759|5471->2765|5595->2853|5636->2884|5665->2890|5836->3025|5879->3058|5908->3064|6036->3156|6079->3189|6108->3195|6257->3308|6305->3346|6334->3352|6472->3454|6520->3492|6549->3498|6729->3642|6775->3678|6804->3684|6938->3782|6984->3818|7013->3824|7169->3943|7220->3984|7249->3990|7394->4098|7445->4139|7474->4145|7653->4288|7697->4322|7726->4328|7856->4422|7900->4456|7929->4462|8081->4577|8130->4616|8159->4622|8300->4726|8349->4765|8378->4771|8532->4888|8567->4913|8597->4919|8710->4995|8745->5020|8775->5026|8909->5123|8950->5153|8980->5159|9103->5245|9144->5275|9174->5281|9318->5388|9351->5411|9380->5417|9489->5489|9522->5512|9551->5518|9681->5611|9720->5639|9750->5645|9869->5727|9908->5755|9938->5761|10090->5876|10127->5902|10157->5908|10272->5986|10309->6012|10339->6018|10475->6117|10517->6148|10547->6154|10672->6242|10714->6273|10744->6279|10909->6407|10950->6437|10980->6443|11103->6529|11144->6559|11174->6565|11318->6672|11364->6707|11394->6713|11527->6809|11573->6844|11603->6850|11765->6975|11803->7002|11833->7008|11950->7088|11988->7115|12018->7121|12156->7222|12199->7254|12229->7260|12356->7350|12399->7382|12429->7388|12591->7513|12625->7536|12655->7542|12778->7628|12812->7651|12842->7657|12949->7727|12978->7746|13007->7752|13153->7861|13169->7867|13207->7882|13278->7921|13319->7926|13382->7979|13423->7981|13547->8073|13584->8078
                    LINES: 26->1|29->5|29->5|30->1|32->4|33->5|35->7|35->7|35->7|37->9|37->9|37->9|39->11|39->11|39->11|41->13|43->15|43->15|43->15|45->17|45->17|45->17|47->19|49->21|49->21|49->21|55->27|60->32|62->34|67->39|69->41|74->46|76->48|76->48|77->49|77->49|79->51|84->56|86->58|86->58|87->59|87->59|93->65|93->65|93->65|93->65|93->65|93->65|93->65|93->65|93->65|93->65|93->65|93->65|95->67|95->67|95->67|96->68|96->68|96->68|98->70|98->70|98->70|99->71|99->71|99->71|102->74|102->74|102->74|103->75|103->75|103->75|105->77|105->77|105->77|106->78|106->78|106->78|109->81|109->81|109->81|110->82|110->82|110->82|112->84|112->84|112->84|113->85|113->85|113->85|116->88|116->88|116->88|117->89|117->89|117->89|119->91|119->91|119->91|120->92|120->92|120->92|123->95|123->95|123->95|124->96|124->96|124->96|126->98|126->98|126->98|127->99|127->99|127->99|130->102|130->102|130->102|131->103|131->103|131->103|133->105|133->105|133->105|134->106|134->106|134->106|137->109|137->109|137->109|138->110|138->110|138->110|140->112|140->112|140->112|141->113|141->113|141->113|144->116|144->116|144->116|145->117|145->117|145->117|147->119|147->119|147->119|148->120|148->120|148->120|151->123|151->123|151->123|152->124|152->124|152->124|154->126|154->126|154->126|155->127|155->127|155->127|158->130|158->130|158->130|159->131|159->131|159->131|161->133|161->133|161->133|162->134|162->134|162->134|168->140|168->140|168->140|169->141|169->141|169->141|170->142|170->142|170->142|174->146|174->146|174->146|178->150|180->152|180->152|180->152|182->154|184->156
                    -- GENERATED --
                */
            