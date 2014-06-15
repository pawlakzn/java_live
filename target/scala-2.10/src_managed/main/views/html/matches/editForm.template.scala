
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



"""),_display_(Seq[Any](/*11.2*/if(flash.containsKey("success"))/*11.34*/ {_display_(Seq[Any](format.raw/*11.36*/("""
<div class="alert-message warning">
    <strong>Gotowe!</strong> """),_display_(Seq[Any](/*13.31*/flash/*13.36*/.get("success"))),format.raw/*13.51*/("""
</div>
""")))})),format.raw/*15.2*/("""

"""),_display_(Seq[Any](/*17.2*/form(routes.Matches.update(id))/*17.33*/ {_display_(Seq[Any](format.raw/*17.35*/("""
<div width="100%;" style="display:table;margin:0;padding:0;border:0;height:auto;">
    <div style="float:left;">
<h1>Edytuj Mecz</h1>
<fieldset>

    """),_display_(Seq[Any](/*23.6*/select(
    matchForm("team1.id"),
    options(Team.options),
    '_label -> "Gospodarz", '_default -> "-- Wybierz gospodarza --",
    '_showConstraints -> false
    ))),format.raw/*28.6*/("""

    """),_display_(Seq[Any](/*30.6*/select(
    matchForm("team2.id"),
    options(Team.options),
    '_label -> "Goście", '_default -> "-- Wybierz gości --",
    '_showConstraints -> false
    ))),format.raw/*35.6*/("""

    """),_display_(Seq[Any](/*37.6*/select(
    matchForm("game.id"),
    options(Game.options),
    '_label -> "Rozgrywki", '_default -> "-- Wybierz rozgrywki --",
    '_showConstraints -> false
    ))),format.raw/*42.6*/("""

    """),_display_(Seq[Any](/*44.6*/inputText(matchForm("queue"), '_label -> "Kolejka"))),format.raw/*44.57*/("""
    """),_display_(Seq[Any](/*45.6*/inputText(matchForm("match_date"), '_label -> "Data i godzina"))),format.raw/*45.69*/("""

    """),_display_(Seq[Any](/*47.6*/select(
    matchForm("referee.id"),
    options(Referee.options),
    '_label -> "Sędzia", '_default -> "-- Wybierz sędziego --",
    '_showConstraints -> false
    ))),format.raw/*52.6*/("""

    """),_display_(Seq[Any](/*54.6*/inputText(matchForm("weather"), '_label -> "Pogoda"))),format.raw/*54.58*/("""
    """),_display_(Seq[Any](/*55.6*/inputText(matchForm("viewers"), '_label -> "Widzowie"))),format.raw/*55.60*/("""

</fieldset>
    </div>
    <div style="float:right;margin-left:30px;">
        <h1>Edytuj Statystyki</h1>
        <strong>"""),_display_(Seq[Any](/*61.18*/matchForm("team1.name")/*61.41*/.value)),format.raw/*61.47*/("""</strong> - <strong>"""),_display_(Seq[Any](/*61.68*/matchForm("team2.name")/*61.91*/.value)),format.raw/*61.97*/("""</strong><br><br>
        Bramki<br>
        <input class="input_stat" id="goals1" name="goals1" value=""""),_display_(Seq[Any](/*63.69*/statisticForm("goals1")/*63.92*/.value)),format.raw/*63.98*/("""">
        <input class="input_stat" id="goals2" name="goals2" value=""""),_display_(Seq[Any](/*64.69*/statisticForm("goals2")/*64.92*/.value)),format.raw/*64.98*/("""">
        (
        <input class="input_stat" id="goals1_half" name="goals1_half" value=""""),_display_(Seq[Any](/*66.79*/statisticForm("goals1_half")/*66.107*/.value)),format.raw/*66.113*/("""">
        <input class="input_stat" id="goals2_half" name="goals2_half" value=""""),_display_(Seq[Any](/*67.79*/statisticForm("goals2_half")/*67.107*/.value)),format.raw/*67.113*/("""">
        )<br>
        Słupki/Poprzeczki:<br>
        <input class="input_stat" id="goalpost1" name="goalpost1" value=""""),_display_(Seq[Any](/*70.75*/statisticForm("goalpost1")/*70.101*/.value)),format.raw/*70.107*/("""">
        <input class="input_stat" id="goalpost2" name="goalpost2" value=""""),_display_(Seq[Any](/*71.75*/statisticForm("goalpost2")/*71.101*/.value)),format.raw/*71.107*/("""">
        (
        <input class="input_stat" id="goalpost1_half" name="goalpost1_half" value=""""),_display_(Seq[Any](/*73.85*/statisticForm("goalpost1_half")/*73.116*/.value)),format.raw/*73.122*/("""">
        <input class="input_stat" id="goalpost2_half" name="goalpost2_half" value=""""),_display_(Seq[Any](/*74.85*/statisticForm("goalpost2_half")/*74.116*/.value)),format.raw/*74.122*/("""">
        )<br>
        Strzały celne:<br>
        <input class="input_stat" id="attempts_target1" name="attempts_target1" value=""""),_display_(Seq[Any](/*77.89*/statisticForm("attempts_target1")/*77.122*/.value)),format.raw/*77.128*/("""">
        <input class="input_stat" id="attempts_target2" name="attempts_target2" value=""""),_display_(Seq[Any](/*78.89*/statisticForm("attempts_target2")/*78.122*/.value)),format.raw/*78.128*/("""">
        (
        <input class="input_stat" id="attempts_target1_half" name="attempts_target1_half" value=""""),_display_(Seq[Any](/*80.99*/statisticForm("attempts_target1_half")/*80.137*/.value)),format.raw/*80.143*/("""">
        <input class="input_stat" id="attempts_target2_half" name="attempts_target2_half" value=""""),_display_(Seq[Any](/*81.99*/statisticForm("attempts_target2_half")/*81.137*/.value)),format.raw/*81.143*/("""">
        )<br>
        Strzały niecelne:<br>
        <input class="input_stat" id="attempts_offtarget1" name="attempts_offtarget1" value=""""),_display_(Seq[Any](/*84.95*/statisticForm("attempts_offtarget1")/*84.131*/.value)),format.raw/*84.137*/("""">
        <input class="input_stat" id="attempts_offtarget2" name="attempts_offtarget2" value=""""),_display_(Seq[Any](/*85.95*/statisticForm("attempts_offtarget2")/*85.131*/.value)),format.raw/*85.137*/("""">
        (
        <input class="input_stat" id="attempts_offtarget1_half" name="attempts_offtarget1_half" value=""""),_display_(Seq[Any](/*87.105*/statisticForm("attempts_offtarget1_half")/*87.146*/.value)),format.raw/*87.152*/("""">
        <input class="input_stat" id="attempts_offtarget2_half" name="attempts_offtarget2_half" value=""""),_display_(Seq[Any](/*88.105*/statisticForm("attempts_offtarget2_half")/*88.146*/.value)),format.raw/*88.152*/("""">
        )<br>
        Strzały zablokowane:<br>
        <input class="input_stat" id="attempts_blocked1" name="attempts_blocked1" value=""""),_display_(Seq[Any](/*91.91*/statisticForm("attempts_blocked1")/*91.125*/.value)),format.raw/*91.131*/("""">
        <input class="input_stat" id="attempts_blocked2" name="attempts_blocked2" value=""""),_display_(Seq[Any](/*92.91*/statisticForm("attempts_blocked2")/*92.125*/.value)),format.raw/*92.131*/("""">
        (
        <input class="input_stat" id="attempts_blocked1_half" name="attempts_blocked1_half" value=""""),_display_(Seq[Any](/*94.101*/statisticForm("attempts_blocked1_half")/*94.140*/.value)),format.raw/*94.146*/("""">
        <input class="input_stat" id="attempts_blocked2_half" name="attempts_blocked2_half" value=""""),_display_(Seq[Any](/*95.101*/statisticForm("attempts_blocked2_half")/*95.140*/.value)),format.raw/*95.146*/("""">
        )<br>
        Rzuty rożne:<br>
        <input class="input_stat" id="corners1" name="corners1" value=""""),_display_(Seq[Any](/*98.73*/statisticForm("corners1")/*98.98*/.value)),format.raw/*98.104*/("""">
        <input class="input_stat" id="corners2" name="corners2" value=""""),_display_(Seq[Any](/*99.73*/statisticForm("corners2")/*99.98*/.value)),format.raw/*99.104*/("""">
        (
        <input class="input_stat" id="corners1_half" name="corners1_half" value=""""),_display_(Seq[Any](/*101.83*/statisticForm("corners1_half")/*101.113*/.value)),format.raw/*101.119*/("""">
        <input class="input_stat" id="corners2_half" name="corners2_half" value=""""),_display_(Seq[Any](/*102.83*/statisticForm("corners2_half")/*102.113*/.value)),format.raw/*102.119*/("""">
        )<br>
        Faule:<br>
        <input class="input_stat" id="fouls1" name="fouls1" value=""""),_display_(Seq[Any](/*105.69*/statisticForm("fouls1")/*105.92*/.value)),format.raw/*105.98*/("""">
        <input class="input_stat" id="fouls2" name="fouls2" value=""""),_display_(Seq[Any](/*106.69*/statisticForm("fouls2")/*106.92*/.value)),format.raw/*106.98*/("""">
        (
        <input class="input_stat" id="fouls1_half" name="fouls1_half" value=""""),_display_(Seq[Any](/*108.79*/statisticForm("fouls1_half")/*108.107*/.value)),format.raw/*108.113*/("""">
        <input class="input_stat" id="fouls2_half" name="fouls2_half" value=""""),_display_(Seq[Any](/*109.79*/statisticForm("fouls2_half")/*109.107*/.value)),format.raw/*109.113*/("""">
        )<br>
        Spalone:<br>
        <input class="input_stat" id="offsides1" name="offsides1" value=""""),_display_(Seq[Any](/*112.75*/statisticForm("offsides1")/*112.101*/.value)),format.raw/*112.107*/("""">
        <input class="input_stat" id="offsides2" name="offsides2" value=""""),_display_(Seq[Any](/*113.75*/statisticForm("offsides2")/*113.101*/.value)),format.raw/*113.107*/("""">
        (
        <input class="input_stat" id="offsides1_half" name="offsides1_half" value=""""),_display_(Seq[Any](/*115.85*/statisticForm("offsides1_half")/*115.116*/.value)),format.raw/*115.122*/("""">
        <input class="input_stat" id="offsides2_half" name="offsides2_half" value=""""),_display_(Seq[Any](/*116.85*/statisticForm("offsides2_half")/*116.116*/.value)),format.raw/*116.122*/("""">
        )<br>
        Żółte kartki:<br>
        <input class="input_stat" id="yellow_cards1" name="yellow_cards1" value=""""),_display_(Seq[Any](/*119.83*/statisticForm("yellow_cards1")/*119.113*/.value)),format.raw/*119.119*/("""">
        <input class="input_stat" id="yellow_cards2" name="yellow_cards2" value=""""),_display_(Seq[Any](/*120.83*/statisticForm("yellow_cards2")/*120.113*/.value)),format.raw/*120.119*/("""">
        (
        <input class="input_stat" id="yellow_cards1_half" name="yellow_cards1_half" value=""""),_display_(Seq[Any](/*122.93*/statisticForm("yellow_cards1_half")/*122.128*/.value)),format.raw/*122.134*/("""">
        <input class="input_stat" id="yellow_cards2_half" name="yellow_cards2_half" value=""""),_display_(Seq[Any](/*123.93*/statisticForm("yellow_cards2_half")/*123.128*/.value)),format.raw/*123.134*/("""">
        )<br>
        Czerwone kartki:<br>
        <input class="input_stat" id="red_cards1" name="red_cards1" value=""""),_display_(Seq[Any](/*126.77*/statisticForm("red_cards1")/*126.104*/.value)),format.raw/*126.110*/("""">
        <input class="input_stat" id="red_cards2" name="red_cards2" value=""""),_display_(Seq[Any](/*127.77*/statisticForm("red_cards2")/*127.104*/.value)),format.raw/*127.110*/("""">
        (
        <input class="input_stat" id="red_cards1_half" name="red_cards1_half" value=""""),_display_(Seq[Any](/*129.87*/statisticForm("red_cards1_half")/*129.119*/.value)),format.raw/*129.125*/("""">
        <input class="input_stat" id="red_cards2_half" name="red_cards2_half" value=""""),_display_(Seq[Any](/*130.87*/statisticForm("red_cards2_half")/*130.119*/.value)),format.raw/*130.125*/("""">
        )<br>

    </div>
</div>

<div class="actions">
    <input type="submit" value="Zapisz" class="btn primary"> lub
    <a href=""""),_display_(Seq[Any](/*138.15*/routes/*138.21*/.Matches.list())),format.raw/*138.36*/("""" class="btn">Anuluj</a>
</div>


""")))})),format.raw/*142.2*/("""

"""),_display_(Seq[Any](/*144.2*/form(routes.Matches.delete(id), 'class -> "topRight")/*144.55*/ {_display_(Seq[Any](format.raw/*144.57*/("""
<input type="submit" value="Usuń ten mecz" class="btn danger" style="margin-top:35px;">
""")))})),format.raw/*146.2*/("""

""")))})),format.raw/*148.2*/("""

"""))}
    }
    
    def render(id:Long,matchForm:Form[Match],statisticForm:Form[Statistic]): play.api.templates.HtmlFormat.Appendable = apply(id,matchForm,statisticForm)
    
    def f:((Long,Form[Match],Form[Statistic]) => play.api.templates.HtmlFormat.Appendable) = (id,matchForm,statisticForm) => apply(id,matchForm,statisticForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Jun 15 19:35:15 CEST 2014
                    SOURCE: D:/Pawlak/Play/live/app/views/matches/editForm.scala.html
                    HASH: 89901844bf467a3948aeb717715c3d0ed49a0afb
                    MATRIX: 811->1|981->93|1013->117|1097->68|1127->90|1156->171|1195->176|1206->180|1244->182|1288->191|1329->223|1369->225|1474->294|1488->299|1525->314|1567->325|1607->330|1647->361|1687->363|1880->521|2073->693|2117->702|2302->866|2346->875|2537->1045|2581->1054|2654->1105|2696->1112|2781->1175|2825->1184|3018->1356|3062->1365|3136->1417|3178->1424|3254->1478|3421->1609|3453->1632|3481->1638|3538->1659|3570->1682|3598->1688|3741->1795|3773->1818|3801->1824|3909->1896|3941->1919|3969->1925|4098->2018|4136->2046|4165->2052|4283->2134|4321->2162|4350->2168|4511->2293|4547->2319|4576->2325|4690->2403|4726->2429|4755->2435|4890->2534|4931->2565|4960->2571|5084->2659|5125->2690|5154->2696|5325->2831|5368->2864|5397->2870|5525->2962|5568->2995|5597->3001|5746->3114|5794->3152|5823->3158|5961->3260|6009->3298|6038->3304|6218->3448|6264->3484|6293->3490|6427->3588|6473->3624|6502->3630|6658->3749|6709->3790|6738->3796|6883->3904|6934->3945|6963->3951|7142->4094|7186->4128|7215->4134|7345->4228|7389->4262|7418->4268|7570->4383|7619->4422|7648->4428|7789->4532|7838->4571|7867->4577|8020->4694|8054->4719|8083->4725|8195->4801|8229->4826|8258->4832|8392->4929|8433->4959|8463->4965|8586->5051|8627->5081|8657->5087|8801->5194|8834->5217|8863->5223|8972->5295|9005->5318|9034->5324|9164->5417|9203->5445|9233->5451|9352->5533|9391->5561|9421->5567|9573->5682|9610->5708|9640->5714|9755->5792|9792->5818|9822->5824|9958->5923|10000->5954|10030->5960|10155->6048|10197->6079|10227->6085|10392->6213|10433->6243|10463->6249|10586->6335|10627->6365|10657->6371|10801->6478|10847->6513|10877->6519|11010->6615|11056->6650|11086->6656|11248->6781|11286->6808|11316->6814|11433->6894|11471->6921|11501->6927|11639->7028|11682->7060|11712->7066|11839->7156|11882->7188|11912->7194|12095->7340|12111->7346|12149->7361|12220->7400|12261->7405|12324->7458|12365->7460|12489->7552|12526->7557
                    LINES: 26->1|29->5|29->5|30->1|32->4|33->5|35->7|35->7|35->7|39->11|39->11|39->11|41->13|41->13|41->13|43->15|45->17|45->17|45->17|51->23|56->28|58->30|63->35|65->37|70->42|72->44|72->44|73->45|73->45|75->47|80->52|82->54|82->54|83->55|83->55|89->61|89->61|89->61|89->61|89->61|89->61|91->63|91->63|91->63|92->64|92->64|92->64|94->66|94->66|94->66|95->67|95->67|95->67|98->70|98->70|98->70|99->71|99->71|99->71|101->73|101->73|101->73|102->74|102->74|102->74|105->77|105->77|105->77|106->78|106->78|106->78|108->80|108->80|108->80|109->81|109->81|109->81|112->84|112->84|112->84|113->85|113->85|113->85|115->87|115->87|115->87|116->88|116->88|116->88|119->91|119->91|119->91|120->92|120->92|120->92|122->94|122->94|122->94|123->95|123->95|123->95|126->98|126->98|126->98|127->99|127->99|127->99|129->101|129->101|129->101|130->102|130->102|130->102|133->105|133->105|133->105|134->106|134->106|134->106|136->108|136->108|136->108|137->109|137->109|137->109|140->112|140->112|140->112|141->113|141->113|141->113|143->115|143->115|143->115|144->116|144->116|144->116|147->119|147->119|147->119|148->120|148->120|148->120|150->122|150->122|150->122|151->123|151->123|151->123|154->126|154->126|154->126|155->127|155->127|155->127|157->129|157->129|157->129|158->130|158->130|158->130|166->138|166->138|166->138|170->142|172->144|172->144|172->144|174->146|176->148
                    -- GENERATED --
                */
            