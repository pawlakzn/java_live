
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
object createForm extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[Form[Match],Form[Statistic],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(matchForm: Form[Match], statisticForm: Form[Statistic]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._

implicit def /*5.2*/implicitFieldConstructor/*5.26*/ = {{ FieldConstructor(twitterBootstrapInput.render) }};
Seq[Any](format.raw/*1.58*/("""

"""),format.raw/*4.1*/("""
"""),format.raw/*5.80*/("""

"""),_display_(Seq[Any](/*7.2*/main/*7.6*/ {_display_(Seq[Any](format.raw/*7.8*/("""

"""),_display_(Seq[Any](/*9.2*/if(flash.containsKey("wrong"))/*9.32*/ {_display_(Seq[Any](format.raw/*9.34*/("""
<div class="alert-message warning">
    <strong>Gotowe!</strong> """),_display_(Seq[Any](/*11.31*/flash/*11.36*/.get("wrong"))),format.raw/*11.49*/("""
</div>
""")))})),format.raw/*13.2*/("""

"""),_display_(Seq[Any](/*15.2*/form(routes.Matches.save())/*15.29*/ {_display_(Seq[Any](format.raw/*15.31*/("""
<div width="100%;" style="display:table;margin:0;padding:0;border:0;height:auto;">
    <div style="float:left;">
        <h1>Dodaj Mecz</h1>
<fieldset>

    """),_display_(Seq[Any](/*21.6*/select(
    matchForm("team1.id"),
    options(Team.options),
    '_label -> "Gospodarz", '_default -> "-- Wybierz gospodarza --",
    '_showConstraints -> false
    ))),format.raw/*26.6*/("""

    """),_display_(Seq[Any](/*28.6*/select(
    matchForm("team2.id"),
    options(Team.options),
    '_label -> "Goście", '_default -> "-- Wybierz gości --",
    '_showConstraints -> false
    ))),format.raw/*33.6*/("""

    """),_display_(Seq[Any](/*35.6*/select(
    matchForm("game.id"),
    options(Game.options),
    '_label -> "Rozgrywki", '_default -> "-- Wybierz rozgrywki --",
    '_showConstraints -> false
    ))),format.raw/*40.6*/("""

    """),_display_(Seq[Any](/*42.6*/inputText(matchForm("queue"), '_label -> "Kolejka"))),format.raw/*42.57*/("""

    """),_display_(Seq[Any](/*44.6*/inputText(matchForm("match_date"), '_label -> "Data i godzina"))),format.raw/*44.69*/("""

    """),_display_(Seq[Any](/*46.6*/inputText(matchForm("weather"), '_label -> "Pogoda"))),format.raw/*46.58*/("""
    """),_display_(Seq[Any](/*47.6*/inputText(matchForm("viewers"), '_label -> "Widzowie"))),format.raw/*47.60*/("""

</fieldset>
    </div>
    <div style="float:right;margin-left:30px;">
        <h1>Dodaj Statystyki</h1>
        Bramki<br>
        <input class="input_stat" id="goals1" name="goals1" value=""""),_display_(Seq[Any](/*54.69*/statisticForm("goals1")/*54.92*/.value)),format.raw/*54.98*/("""">
        <input class="input_stat" id="goals2" name="goals2" value=""""),_display_(Seq[Any](/*55.69*/statisticForm("goals2")/*55.92*/.value)),format.raw/*55.98*/("""">
        (
        <input class="input_stat" id="goals1_half" name="goals1_half" value=""""),_display_(Seq[Any](/*57.79*/statisticForm("goals1_half")/*57.107*/.value)),format.raw/*57.113*/("""">
        <input class="input_stat" id="goals2_half" name="goals2_half" value=""""),_display_(Seq[Any](/*58.79*/statisticForm("goals2_half")/*58.107*/.value)),format.raw/*58.113*/("""">
        )<br>
        Słupki/Poprzeczki:<br>
        <input class="input_stat" id="goalpost1" name="goalpost1" value=""""),_display_(Seq[Any](/*61.75*/statisticForm("goalpost1")/*61.101*/.value)),format.raw/*61.107*/("""">
        <input class="input_stat" id="goalpost2" name="goalpost2" value=""""),_display_(Seq[Any](/*62.75*/statisticForm("goalpost2")/*62.101*/.value)),format.raw/*62.107*/("""">
        (
        <input class="input_stat" id="goalpost1_half" name="goalpost1_half" value=""""),_display_(Seq[Any](/*64.85*/statisticForm("goalpost1_half")/*64.116*/.value)),format.raw/*64.122*/("""">
        <input class="input_stat" id="goalpost2_half" name="goalpost2_half" value=""""),_display_(Seq[Any](/*65.85*/statisticForm("goalpost2_half")/*65.116*/.value)),format.raw/*65.122*/("""">
        )<br>
        Strzały celne:<br>
        <input class="input_stat" id="attempts_target1" name="attempts_target1" value=""""),_display_(Seq[Any](/*68.89*/statisticForm("attempts_target1")/*68.122*/.value)),format.raw/*68.128*/("""">
        <input class="input_stat" id="attempts_target2" name="attempts_target2" value=""""),_display_(Seq[Any](/*69.89*/statisticForm("attempts_target2")/*69.122*/.value)),format.raw/*69.128*/("""">
        (
        <input class="input_stat" id="attempts_target1_half" name="attempts_target1_half" value=""""),_display_(Seq[Any](/*71.99*/statisticForm("attempts_target1_half")/*71.137*/.value)),format.raw/*71.143*/("""">
        <input class="input_stat" id="attempts_target2_half" name="attempts_target2_half" value=""""),_display_(Seq[Any](/*72.99*/statisticForm("attempts_target2_half")/*72.137*/.value)),format.raw/*72.143*/("""">
        )<br>
        Strzały niecelne:<br>
        <input class="input_stat" id="attempts_offtarget1" name="attempts_offtarget1" value=""""),_display_(Seq[Any](/*75.95*/statisticForm("attempts_offtarget1")/*75.131*/.value)),format.raw/*75.137*/("""">
        <input class="input_stat" id="attempts_offtarget2" name="attempts_offtarget2" value=""""),_display_(Seq[Any](/*76.95*/statisticForm("attempts_offtarget2")/*76.131*/.value)),format.raw/*76.137*/("""">
        (
        <input class="input_stat" id="attempts_offtarget1_half" name="attempts_offtarget1_half" value=""""),_display_(Seq[Any](/*78.105*/statisticForm("attempts_offtarget1_half")/*78.146*/.value)),format.raw/*78.152*/("""">
        <input class="input_stat" id="attempts_offtarget2_half" name="attempts_offtarget2_half" value=""""),_display_(Seq[Any](/*79.105*/statisticForm("attempts_offtarget2_half")/*79.146*/.value)),format.raw/*79.152*/("""">
        )<br>
        Strzały zablokowane:<br>
        <input class="input_stat" id="attempts_blocked1" name="attempts_blocked1" value=""""),_display_(Seq[Any](/*82.91*/statisticForm("attempts_blocked1")/*82.125*/.value)),format.raw/*82.131*/("""">
        <input class="input_stat" id="attempts_blocked2" name="attempts_blocked2" value=""""),_display_(Seq[Any](/*83.91*/statisticForm("attempts_blocked2")/*83.125*/.value)),format.raw/*83.131*/("""">
        (
        <input class="input_stat" id="attempts_blocked1_half" name="attempts_blocked1_half" value=""""),_display_(Seq[Any](/*85.101*/statisticForm("attempts_blocked1_half")/*85.140*/.value)),format.raw/*85.146*/("""">
        <input class="input_stat" id="attempts_blocked2_half" name="attempts_blocked2_half" value=""""),_display_(Seq[Any](/*86.101*/statisticForm("attempts_blocked2_half")/*86.140*/.value)),format.raw/*86.146*/("""">
        )<br>
        Rzuty rożne:<br>
        <input class="input_stat" id="corners1" name="corners1" value=""""),_display_(Seq[Any](/*89.73*/statisticForm("corners1")/*89.98*/.value)),format.raw/*89.104*/("""">
        <input class="input_stat" id="corners2" name="corners2" value=""""),_display_(Seq[Any](/*90.73*/statisticForm("corners2")/*90.98*/.value)),format.raw/*90.104*/("""">
        (
        <input class="input_stat" id="corners1_half" name="corners1_half" value=""""),_display_(Seq[Any](/*92.83*/statisticForm("corners1_half")/*92.113*/.value)),format.raw/*92.119*/("""">
        <input class="input_stat" id="corners2_half" name="corners2_half" value=""""),_display_(Seq[Any](/*93.83*/statisticForm("corners2_half")/*93.113*/.value)),format.raw/*93.119*/("""">
        )<br>
        Faule:<br>
        <input class="input_stat" id="fouls1" name="fouls1" value=""""),_display_(Seq[Any](/*96.69*/statisticForm("fouls1")/*96.92*/.value)),format.raw/*96.98*/("""">
        <input class="input_stat" id="fouls2" name="fouls2" value=""""),_display_(Seq[Any](/*97.69*/statisticForm("fouls2")/*97.92*/.value)),format.raw/*97.98*/("""">
        (
        <input class="input_stat" id="fouls1_half" name="fouls1_half" value=""""),_display_(Seq[Any](/*99.79*/statisticForm("fouls1_half")/*99.107*/.value)),format.raw/*99.113*/("""">
        <input class="input_stat" id="fouls2_half" name="fouls2_half" value=""""),_display_(Seq[Any](/*100.79*/statisticForm("fouls2_half")/*100.107*/.value)),format.raw/*100.113*/("""">
        )<br>
        Spalone:<br>
        <input class="input_stat" id="offsides1" name="offsides1" value=""""),_display_(Seq[Any](/*103.75*/statisticForm("offsides1")/*103.101*/.value)),format.raw/*103.107*/("""">
        <input class="input_stat" id="offsides2" name="offsides2" value=""""),_display_(Seq[Any](/*104.75*/statisticForm("offsides2")/*104.101*/.value)),format.raw/*104.107*/("""">
        (
        <input class="input_stat" id="offsides1_half" name="offsides1_half" value=""""),_display_(Seq[Any](/*106.85*/statisticForm("offsides1_half")/*106.116*/.value)),format.raw/*106.122*/("""">
        <input class="input_stat" id="offsides2_half" name="offsides2_half" value=""""),_display_(Seq[Any](/*107.85*/statisticForm("offsides2_half")/*107.116*/.value)),format.raw/*107.122*/("""">
        )<br>
        Żółte kartki:<br>
        <input class="input_stat" id="yellow_cards1" name="yellow_cards1" value=""""),_display_(Seq[Any](/*110.83*/statisticForm("yellow_cards1")/*110.113*/.value)),format.raw/*110.119*/("""">
        <input class="input_stat" id="yellow_cards2" name="yellow_cards2" value=""""),_display_(Seq[Any](/*111.83*/statisticForm("yellow_cards2")/*111.113*/.value)),format.raw/*111.119*/("""">
        (
        <input class="input_stat" id="yellow_cards1_half" name="yellow_cards1_half" value=""""),_display_(Seq[Any](/*113.93*/statisticForm("yellow_cards1_half")/*113.128*/.value)),format.raw/*113.134*/("""">
        <input class="input_stat" id="yellow_cards2_half" name="yellow_cards2_half" value=""""),_display_(Seq[Any](/*114.93*/statisticForm("yellow_cards2_half")/*114.128*/.value)),format.raw/*114.134*/("""">
        )<br>
        Czerwone kartki:<br>
        <input class="input_stat" id="red_cards1" name="red_cards1" value=""""),_display_(Seq[Any](/*117.77*/statisticForm("red_cards1")/*117.104*/.value)),format.raw/*117.110*/("""">
        <input class="input_stat" id="red_cards2" name="red_cards2" value=""""),_display_(Seq[Any](/*118.77*/statisticForm("red_cards2")/*118.104*/.value)),format.raw/*118.110*/("""">
        (
        <input class="input_stat" id="red_cards1_half" name="red_cards1_half" value=""""),_display_(Seq[Any](/*120.87*/statisticForm("red_cards1_half")/*120.119*/.value)),format.raw/*120.125*/("""">
        <input class="input_stat" id="red_cards2_half" name="red_cards2_half" value=""""),_display_(Seq[Any](/*121.87*/statisticForm("red_cards2_half")/*121.119*/.value)),format.raw/*121.125*/("""">
        )<br>

    </div>
</div>


<div class="actions">
    <input type="submit" value="Dodaj mecz" class="btn primary"> or
    <a href=""""),_display_(Seq[Any](/*130.15*/routes/*130.21*/.Matches.list())),format.raw/*130.36*/("""" class="btn">Anuluj</a>
</div>

""")))})),format.raw/*133.2*/("""

""")))})))}
    }
    
    def render(matchForm:Form[Match],statisticForm:Form[Statistic]): play.api.templates.HtmlFormat.Appendable = apply(matchForm,statisticForm)
    
    def f:((Form[Match],Form[Statistic]) => play.api.templates.HtmlFormat.Appendable) = (matchForm,statisticForm) => apply(matchForm,statisticForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Jun 16 18:07:10 CEST 2014
                    SOURCE: D:/Pawlak/Play/live/app/views/matches/createForm.scala.html
                    HASH: 6a55cc18fabfe5dc5de9a4c4ef8a9d6d54b61570
                    MATRIX: 808->1|967->82|999->106|1083->57|1113->79|1142->160|1181->165|1192->169|1230->171|1269->176|1307->206|1346->208|1451->277|1465->282|1500->295|1542->306|1582->311|1618->338|1658->340|1858->505|2051->677|2095->686|2280->850|2324->859|2515->1029|2559->1038|2632->1089|2676->1098|2761->1161|2805->1170|2879->1222|2921->1229|2997->1283|3234->1484|3266->1507|3294->1513|3402->1585|3434->1608|3462->1614|3591->1707|3629->1735|3658->1741|3776->1823|3814->1851|3843->1857|4004->1982|4040->2008|4069->2014|4183->2092|4219->2118|4248->2124|4383->2223|4424->2254|4453->2260|4577->2348|4618->2379|4647->2385|4818->2520|4861->2553|4890->2559|5018->2651|5061->2684|5090->2690|5239->2803|5287->2841|5316->2847|5454->2949|5502->2987|5531->2993|5711->3137|5757->3173|5786->3179|5920->3277|5966->3313|5995->3319|6151->3438|6202->3479|6231->3485|6376->3593|6427->3634|6456->3640|6635->3783|6679->3817|6708->3823|6838->3917|6882->3951|6911->3957|7063->4072|7112->4111|7141->4117|7282->4221|7331->4260|7360->4266|7513->4383|7547->4408|7576->4414|7688->4490|7722->4515|7751->4521|7884->4618|7924->4648|7953->4654|8075->4740|8115->4770|8144->4776|8287->4883|8319->4906|8347->4912|8455->4984|8487->5007|8515->5013|8644->5106|8682->5134|8711->5140|8830->5222|8869->5250|8899->5256|9051->5371|9088->5397|9118->5403|9233->5481|9270->5507|9300->5513|9436->5612|9478->5643|9508->5649|9633->5737|9675->5768|9705->5774|9870->5902|9911->5932|9941->5938|10064->6024|10105->6054|10135->6060|10279->6167|10325->6202|10355->6208|10488->6304|10534->6339|10564->6345|10726->6470|10764->6497|10794->6503|10911->6583|10949->6610|10979->6616|11117->6717|11160->6749|11190->6755|11317->6845|11360->6877|11390->6883|11578->7034|11594->7040|11632->7055|11701->7092
                    LINES: 26->1|29->5|29->5|30->1|32->4|33->5|35->7|35->7|35->7|37->9|37->9|37->9|39->11|39->11|39->11|41->13|43->15|43->15|43->15|49->21|54->26|56->28|61->33|63->35|68->40|70->42|70->42|72->44|72->44|74->46|74->46|75->47|75->47|82->54|82->54|82->54|83->55|83->55|83->55|85->57|85->57|85->57|86->58|86->58|86->58|89->61|89->61|89->61|90->62|90->62|90->62|92->64|92->64|92->64|93->65|93->65|93->65|96->68|96->68|96->68|97->69|97->69|97->69|99->71|99->71|99->71|100->72|100->72|100->72|103->75|103->75|103->75|104->76|104->76|104->76|106->78|106->78|106->78|107->79|107->79|107->79|110->82|110->82|110->82|111->83|111->83|111->83|113->85|113->85|113->85|114->86|114->86|114->86|117->89|117->89|117->89|118->90|118->90|118->90|120->92|120->92|120->92|121->93|121->93|121->93|124->96|124->96|124->96|125->97|125->97|125->97|127->99|127->99|127->99|128->100|128->100|128->100|131->103|131->103|131->103|132->104|132->104|132->104|134->106|134->106|134->106|135->107|135->107|135->107|138->110|138->110|138->110|139->111|139->111|139->111|141->113|141->113|141->113|142->114|142->114|142->114|145->117|145->117|145->117|146->118|146->118|146->118|148->120|148->120|148->120|149->121|149->121|149->121|158->130|158->130|158->130|161->133
                    -- GENERATED --
                */
            