
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
object live extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[Match],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(matchForm: Form[Match]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.26*/("""

<html>
<head>
    <title>Relacje LIVE</title>
    <link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*6.55*/routes/*6.61*/.Assets.at("images/favicon.png"))),format.raw/*6.93*/("""">
    <link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(Seq[Any](/*7.66*/routes/*7.72*/.Assets.at("stylesheets/live.css"))),format.raw/*7.106*/("""">

</head>
<body>

<div id="header">
    <table class="headerPanel" width="100%" cellspacing="0" cellpadding="0">
        <tr>
            <td class="sideColumn">&nbsp;</td>
            <td class="centralColumn" valign="top"><a href=""""),_display_(Seq[Any](/*16.62*/routes/*16.68*/.Matches.index())),format.raw/*16.84*/("""">Lista meczów</a></td>
            <td class="sideColumn">&nbsp;</td>
        </tr>
    </table>
</div>
<div id="scoreBoard">
    <table class="boardTable" cellspacing="0" cellpadding="0">
        <tr>
            <td class="emblemColumn" valign="bottom"><img src=""""),_display_(Seq[Any](/*24.65*/routes/*24.71*/.Assets.at(matchForm("team1.crest").value))),format.raw/*24.113*/(""""/></td>
            <td class="boardColumn" valign="top">
                <div class="matchDate">Rozpoczęcie meczu: <span id="matchStartDate">"""),_display_(Seq[Any](/*26.86*/matchForm("match_date")/*26.109*/.value.format("dd-MM-yyyy kk:mm"))),format.raw/*26.142*/("""</span></div>
                <table class="scoreTable" width="90%">
                    <tr>
                        <td class="scoreTeam" id="scoreTeamHost">"""),_display_(Seq[Any](/*29.67*/matchForm("team1.name")/*29.90*/.value)),format.raw/*29.96*/("""</td>
                        <td class="scoreGoals">
                            <span id="hostGoalsFull">"""),_display_(Seq[Any](/*31.55*/matchForm("score1")/*31.74*/.value)),format.raw/*31.80*/("""</span>:<span id="guestGoalsFull">"""),_display_(Seq[Any](/*31.115*/matchForm("score2")/*31.134*/.value)),format.raw/*31.140*/("""</span>
                            <div id="halfGoals" class="halfGoals">(<span id="hostGoalsHalf">"""),_display_(Seq[Any](/*32.94*/matchForm("score1")/*32.113*/.value)),format.raw/*32.119*/("""</span>:<span id="guestGoalsHalf">"""),_display_(Seq[Any](/*32.154*/matchForm("score2_half")/*32.178*/.value)),format.raw/*32.184*/("""</span>)</div>
                        </td>
                        <td class="scoreTeam" id="scoreTeamGuest">"""),_display_(Seq[Any](/*34.68*/matchForm("team2.name")/*34.91*/.value)),format.raw/*34.97*/("""</td>
                    </tr>
                </table>
                <div class="matchTime" id="matchTime">
                 """),_display_(Seq[Any](/*38.19*/matchForm("status")/*38.38*/.value.toString()/*38.55*/ match/*38.61*/{/*39.21*/case "0" =>/*39.32*/ {_display_(Seq[Any](format.raw/*39.34*/("""Mecz się jeszcze nie rozpoczął""")))}/*40.21*/case "1" =>/*40.32*/ {_display_(Seq[Any](format.raw/*40.34*/("""Trwa 1. połowa""")))}/*41.21*/case "2" =>/*41.32*/ {_display_(Seq[Any](format.raw/*41.34*/("""Przerwa""")))}/*42.21*/case "3" =>/*42.32*/ {_display_(Seq[Any](format.raw/*42.34*/("""Trwa 2. połowa""")))}/*43.21*/case "4" =>/*43.32*/ {_display_(Seq[Any](format.raw/*43.34*/("""Trwa dogrywka""")))}/*44.21*/case "5" =>/*44.32*/ {_display_(Seq[Any](format.raw/*44.34*/("""Rzuty karne""")))}/*45.21*/case "6" =>/*45.32*/ {_display_(Seq[Any](format.raw/*45.34*/("""Koniec meczu""")))}})),format.raw/*46.19*/("""
                </div>
            </td>
            <td class="emblemColumn" valign="bottom"><img src=""""),_display_(Seq[Any](/*49.65*/routes/*49.71*/.Assets.at(matchForm("team2.crest").value))),format.raw/*49.113*/(""""/></td>
        </tr>
    </table>
</div>
<div id="contentWrapper">
    <div class="leftCol">
        <div class="colHeader"><img src=""""),_display_(Seq[Any](/*55.43*/routes/*55.49*/.Assets.at("images/col_header_arrow.png"))),format.raw/*55.90*/("""" width="20" height="15" /> Relacja LIVE: &nbsp;<span id="headerTeamNames">-</span></div>
        <div class="colContent">
            <div class="playersPanel">
                <div class="topPart"></div>
                <div class="middlePart">
                    <table id="playersTable">
                        <tr>
                            <td colspan="2">
                                <table class="matchDetails" cellpadding="0" cellspacing="0" width="100%">
                                    <tr>
                                        <td ><img src=""""),_display_(Seq[Any](/*65.57*/routes/*65.63*/.Assets.at("images/live/referee.png"))),format.raw/*65.100*/("""" /> Sędzia: <strong id="matchReferee">"""),_display_(Seq[Any](/*65.140*/matchForm("referee.firstname")/*65.170*/.value)),format.raw/*65.176*/(""" """),_display_(Seq[Any](/*65.178*/matchForm("referee.lastname")/*65.207*/.value)),format.raw/*65.213*/("""</strong></td>
                                        <td  align="center"><img src=""""),_display_(Seq[Any](/*66.72*/routes/*66.78*/.Assets.at("images/live/spectators.png"))),format.raw/*66.118*/("""" /> Widzów: <strong id="matchSpectators">"""),_display_(Seq[Any](/*66.161*/matchForm("viewers")/*66.181*/.value)),format.raw/*66.187*/("""</strong></td>
                                        <td  align="right"><img src=""""),_display_(Seq[Any](/*67.71*/routes/*67.77*/.Assets.at("images/live/weather.png"))),format.raw/*67.114*/("""" /> Pogoda: <strong id="matchWeather">"""),_display_(Seq[Any](/*67.154*/matchForm("weather")/*67.174*/.value)),format.raw/*67.180*/("""</strong></td>
                                    </tr>
                                </table>
                            </td>
                        </tr>
                    </table>
                </div>
                <div class="bottomPart"></div>
            </div>

            <div class="liveHeader">Minuta po minucie:</div>
            <div id="eventList"></div>
        </div>
    </div>
    <div class="rightCol">
        <div class="panelHeader">Statystyki</div>
        <div class="panelContent" style="background-color:white;color:black;text-align:center;float:center;margin: 7 7 7 7;border-radius: 12px;font-size:12px;">
            <strong>Bramki</strong><br>
            """),_display_(Seq[Any](/*85.14*/matchForm("statistics.goals1")/*85.44*/.value)),format.raw/*85.50*/(""":"""),_display_(Seq[Any](/*85.52*/matchForm("statistics.goals2")/*85.82*/.value)),format.raw/*85.88*/(""" ("""),_display_(Seq[Any](/*85.91*/matchForm("statistics.goals1_half")/*85.126*/.value)),format.raw/*85.132*/(""":"""),_display_(Seq[Any](/*85.134*/matchForm("statistics.goals2_half")/*85.169*/.value)),format.raw/*85.175*/(""")<br>
            <strong>Słupki/Poprzeczki:</strong><br>
            """),_display_(Seq[Any](/*87.14*/matchForm("statistics.goalpost1")/*87.47*/.value)),format.raw/*87.53*/(""":"""),_display_(Seq[Any](/*87.55*/matchForm("statistics.goalpost2")/*87.88*/.value)),format.raw/*87.94*/(""" ("""),_display_(Seq[Any](/*87.97*/matchForm("statistics.goalpost1_half")/*87.135*/.value)),format.raw/*87.141*/(""":"""),_display_(Seq[Any](/*87.143*/matchForm("statistics.goalpost2_half")/*87.181*/.value)),format.raw/*87.187*/(""")<br>
            <strong>Strzały celne:</strong><br>
            """),_display_(Seq[Any](/*89.14*/matchForm("statistics.attempts_target1")/*89.54*/.value)),format.raw/*89.60*/(""":"""),_display_(Seq[Any](/*89.62*/matchForm("statistics.attempts_target2")/*89.102*/.value)),format.raw/*89.108*/(""" ("""),_display_(Seq[Any](/*89.111*/matchForm("statistics.attempts_target1_half")/*89.156*/.value)),format.raw/*89.162*/(""":"""),_display_(Seq[Any](/*89.164*/matchForm("statistics.attempts_target2_half")/*89.209*/.value)),format.raw/*89.215*/(""")<br>
            <strong>Strzały niecelne:</strong><br>
            """),_display_(Seq[Any](/*91.14*/matchForm("statistics.attempts_offtarget1")/*91.57*/.value)),format.raw/*91.63*/(""":"""),_display_(Seq[Any](/*91.65*/matchForm("statistics.attempts_offtarget2")/*91.108*/.value)),format.raw/*91.114*/(""" ("""),_display_(Seq[Any](/*91.117*/matchForm("statistics.attempts_offtarget1_half")/*91.165*/.value)),format.raw/*91.171*/(""":"""),_display_(Seq[Any](/*91.173*/matchForm("statistics.attempts_offtarget2_half")/*91.221*/.value)),format.raw/*91.227*/(""")<br>
            <strong>Strzały zablokowane:</strong><br>
            """),_display_(Seq[Any](/*93.14*/matchForm("statistics.attempts_blocked1")/*93.55*/.value)),format.raw/*93.61*/(""":"""),_display_(Seq[Any](/*93.63*/matchForm("statistics.attempts_blocked2")/*93.104*/.value)),format.raw/*93.110*/(""" ("""),_display_(Seq[Any](/*93.113*/matchForm("statistics.attempts_blocked1_half")/*93.159*/.value)),format.raw/*93.165*/(""":"""),_display_(Seq[Any](/*93.167*/matchForm("statistics.attempts_blocked2_half")/*93.213*/.value)),format.raw/*93.219*/(""")<br>
            <strong>Rzuty rożne</strong>:<br>
            """),_display_(Seq[Any](/*95.14*/matchForm("statistics.corners1")/*95.46*/.value)),format.raw/*95.52*/(""":"""),_display_(Seq[Any](/*95.54*/matchForm("statistics.corners2")/*95.86*/.value)),format.raw/*95.92*/(""" ("""),_display_(Seq[Any](/*95.95*/matchForm("statistics.corners1_half")/*95.132*/.value)),format.raw/*95.138*/(""":"""),_display_(Seq[Any](/*95.140*/matchForm("statistics.corners2_half")/*95.177*/.value)),format.raw/*95.183*/(""")<br>
             <strong>Faule:</strong><br>
            """),_display_(Seq[Any](/*97.14*/matchForm("statistics.fouls1")/*97.44*/.value)),format.raw/*97.50*/(""":"""),_display_(Seq[Any](/*97.52*/matchForm("statistics.fouls2")/*97.82*/.value)),format.raw/*97.88*/(""" ("""),_display_(Seq[Any](/*97.91*/matchForm("statistics.fouls1_half")/*97.126*/.value)),format.raw/*97.132*/(""":"""),_display_(Seq[Any](/*97.134*/matchForm("statistics.fouls2_half")/*97.169*/.value)),format.raw/*97.175*/(""")<br>
            <strong>Spalone:</strong><br>
            """),_display_(Seq[Any](/*99.14*/matchForm("statistics.offsides1")/*99.47*/.value)),format.raw/*99.53*/(""":"""),_display_(Seq[Any](/*99.55*/matchForm("statistics.offsides2")/*99.88*/.value)),format.raw/*99.94*/(""" ("""),_display_(Seq[Any](/*99.97*/matchForm("statistics.offsides1_half")/*99.135*/.value)),format.raw/*99.141*/(""":"""),_display_(Seq[Any](/*99.143*/matchForm("statistics.offsides2_half")/*99.181*/.value)),format.raw/*99.187*/(""")<br>
            <strong>Żółte kartki:</strong><br>
            """),_display_(Seq[Any](/*101.14*/matchForm("statistics.yellow_cards1")/*101.51*/.value)),format.raw/*101.57*/(""":"""),_display_(Seq[Any](/*101.59*/matchForm("statistics.yellow_cards2")/*101.96*/.value)),format.raw/*101.102*/(""" ("""),_display_(Seq[Any](/*101.105*/matchForm("statistics.yellow_cards1_half")/*101.147*/.value)),format.raw/*101.153*/(""":"""),_display_(Seq[Any](/*101.155*/matchForm("statistics.yellow_cards2_half")/*101.197*/.value)),format.raw/*101.203*/(""")<br>
            <strong>Czerwone kartki:</strong><br>
            """),_display_(Seq[Any](/*103.14*/matchForm("statistics.red_cards1")/*103.48*/.value)),format.raw/*103.54*/(""":"""),_display_(Seq[Any](/*103.56*/matchForm("statistics.red_cards2")/*103.90*/.value)),format.raw/*103.96*/(""" ("""),_display_(Seq[Any](/*103.99*/matchForm("statistics.red_cards1_half")/*103.138*/.value)),format.raw/*103.144*/(""":"""),_display_(Seq[Any](/*103.146*/matchForm("statistics.red_cards2_half")/*103.185*/.value)),format.raw/*103.191*/(""")<br>
        </div>
        <div class="panelHeader">Zdjęcia</div>
        <div class="panelContent">
            <div class="moreItems"><a href="/">zobacz wszystkie <img src=""""),_display_(Seq[Any](/*107.76*/routes/*107.82*/.Assets.at("images/list_arrow.png"))),format.raw/*107.117*/("""" border="0" /></a></div>
        </div>
        <div class="panelHeader">Wideo</div>
        <div class="panelContent">
            <iframe class="videoItem" title="YouTube video player" width="252" height="160" src="http://www.youtube.com/embed/utXXBcW55Dg?rel=0" frameborder="0" allowfullscreen></iframe>
            <iframe class="videoItem" title="YouTube video player" width="252" height="160" src="http://www.youtube.com/embed/36AFnuBhRy8?rel=0" frameborder="0" allowfullscreen></iframe>
            <div class="moreItems"><a href="/">zobacz wszystkie <img src=""""),_display_(Seq[Any](/*113.76*/routes/*113.82*/.Assets.at("images/list_arrow.png"))),format.raw/*113.117*/("""" border="0" /></a></div>
        </div>
    </div>

</body>
</html>
    


"""))}
    }
    
    def render(matchForm:Form[Match]): play.api.templates.HtmlFormat.Appendable = apply(matchForm)
    
    def f:((Form[Match]) => play.api.templates.HtmlFormat.Appendable) = (matchForm) => apply(matchForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Jun 15 20:18:00 CEST 2014
                    SOURCE: D:/Pawlak/Play/live/app/views/matches/live.scala.html
                    HASH: e05902922471b940407e6cc3adcb7b6b8fc94180
                    MATRIX: 786->1|904->25|1046->132|1060->138|1113->170|1217->239|1231->245|1287->279|1568->524|1583->530|1621->546|1932->821|1947->827|2012->869|2194->1015|2227->1038|2283->1071|2482->1234|2514->1257|2542->1263|2688->1373|2716->1392|2744->1398|2816->1433|2845->1452|2874->1458|3012->1560|3041->1579|3070->1585|3142->1620|3176->1644|3205->1650|3355->1764|3387->1787|3415->1793|3585->1927|3613->1946|3639->1963|3654->1969|3664->1992|3684->2003|3724->2005|3774->2058|3794->2069|3834->2071|3868->2108|3888->2119|3928->2121|3955->2151|3975->2162|4015->2164|4049->2201|4069->2212|4109->2214|4142->2250|4162->2261|4202->2263|4233->2297|4253->2308|4293->2310|4339->2343|4484->2452|4499->2458|4564->2500|4743->2643|4758->2649|4821->2690|5437->3270|5452->3276|5512->3313|5589->3353|5629->3383|5658->3389|5697->3391|5736->3420|5765->3426|5888->3513|5903->3519|5966->3559|6046->3602|6076->3622|6105->3628|6227->3714|6242->3720|6302->3757|6379->3797|6409->3817|6438->3823|7190->4539|7229->4569|7257->4575|7295->4577|7334->4607|7362->4613|7401->4616|7446->4651|7475->4657|7514->4659|7559->4694|7588->4700|7697->4773|7739->4806|7767->4812|7805->4814|7847->4847|7875->4853|7914->4856|7962->4894|7991->4900|8030->4902|8078->4940|8107->4946|8212->5015|8261->5055|8289->5061|8327->5063|8377->5103|8406->5109|8446->5112|8501->5157|8530->5163|8569->5165|8624->5210|8653->5216|8761->5288|8813->5331|8841->5337|8879->5339|8932->5382|8961->5388|9001->5391|9059->5439|9088->5445|9127->5447|9185->5495|9214->5501|9325->5576|9375->5617|9403->5623|9441->5625|9492->5666|9521->5672|9561->5675|9617->5721|9646->5727|9685->5729|9741->5775|9770->5781|9873->5848|9914->5880|9942->5886|9980->5888|10021->5920|10049->5926|10088->5929|10135->5966|10164->5972|10203->5974|10250->6011|10279->6017|10377->6079|10416->6109|10444->6115|10482->6117|10521->6147|10549->6153|10588->6156|10633->6191|10662->6197|10701->6199|10746->6234|10775->6240|10874->6303|10916->6336|10944->6342|10982->6344|11024->6377|11052->6383|11091->6386|11139->6424|11168->6430|11207->6432|11255->6470|11284->6476|11389->6544|11436->6581|11465->6587|11504->6589|11551->6626|11581->6632|11622->6635|11675->6677|11705->6683|11745->6685|11798->6727|11828->6733|11936->6804|11980->6838|12009->6844|12048->6846|12092->6880|12121->6886|12161->6889|12211->6928|12241->6934|12281->6936|12331->6975|12361->6981|12580->7163|12596->7169|12655->7204|13268->7780|13284->7786|13343->7821
                    LINES: 26->1|29->1|34->6|34->6|34->6|35->7|35->7|35->7|44->16|44->16|44->16|52->24|52->24|52->24|54->26|54->26|54->26|57->29|57->29|57->29|59->31|59->31|59->31|59->31|59->31|59->31|60->32|60->32|60->32|60->32|60->32|60->32|62->34|62->34|62->34|66->38|66->38|66->38|66->38|66->39|66->39|66->39|66->40|66->40|66->40|66->41|66->41|66->41|66->42|66->42|66->42|66->43|66->43|66->43|66->44|66->44|66->44|66->45|66->45|66->45|66->46|69->49|69->49|69->49|75->55|75->55|75->55|85->65|85->65|85->65|85->65|85->65|85->65|85->65|85->65|85->65|86->66|86->66|86->66|86->66|86->66|86->66|87->67|87->67|87->67|87->67|87->67|87->67|105->85|105->85|105->85|105->85|105->85|105->85|105->85|105->85|105->85|105->85|105->85|105->85|107->87|107->87|107->87|107->87|107->87|107->87|107->87|107->87|107->87|107->87|107->87|107->87|109->89|109->89|109->89|109->89|109->89|109->89|109->89|109->89|109->89|109->89|109->89|109->89|111->91|111->91|111->91|111->91|111->91|111->91|111->91|111->91|111->91|111->91|111->91|111->91|113->93|113->93|113->93|113->93|113->93|113->93|113->93|113->93|113->93|113->93|113->93|113->93|115->95|115->95|115->95|115->95|115->95|115->95|115->95|115->95|115->95|115->95|115->95|115->95|117->97|117->97|117->97|117->97|117->97|117->97|117->97|117->97|117->97|117->97|117->97|117->97|119->99|119->99|119->99|119->99|119->99|119->99|119->99|119->99|119->99|119->99|119->99|119->99|121->101|121->101|121->101|121->101|121->101|121->101|121->101|121->101|121->101|121->101|121->101|121->101|123->103|123->103|123->103|123->103|123->103|123->103|123->103|123->103|123->103|123->103|123->103|123->103|127->107|127->107|127->107|133->113|133->113|133->113
                    -- GENERATED --
                */
            