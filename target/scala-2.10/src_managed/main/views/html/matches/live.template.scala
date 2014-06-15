
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
object live extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[Form[Match],List[Video],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(matchForm: Form[Match], videos: List[Video]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.47*/("""

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
        """),_display_(Seq[Any](/*109.10*/if(!videos.isEmpty)/*109.29*/{_display_(Seq[Any](format.raw/*109.30*/("""
        <div class="panelHeader">Wideo</div>
        <div class="panelContent">
            """),_display_(Seq[Any](/*112.14*/for(v <- videos) yield /*112.30*/ {_display_(Seq[Any](format.raw/*112.32*/("""
                <iframe class="videoItem" title="YouTube video player" width="252" height="160" src=""""),_display_(Seq[Any](/*113.103*/v/*113.104*/.path)),format.raw/*113.109*/("""" frameborder="0" allowfullscreen style="max-width:100%;"></iframe>
            """)))})),format.raw/*114.14*/("""
         </div>
        """)))})),format.raw/*116.10*/("""
    </div>

</body>
</html>
    


"""))}
    }
    
    def render(matchForm:Form[Match],videos:List[Video]): play.api.templates.HtmlFormat.Appendable = apply(matchForm,videos)
    
    def f:((Form[Match],List[Video]) => play.api.templates.HtmlFormat.Appendable) = (matchForm,videos) => apply(matchForm,videos)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Jun 15 23:33:48 CEST 2014
                    SOURCE: D:/Pawlak/Play/live/app/views/matches/live.scala.html
                    HASH: a63c2219e8593e3fae0ff6285d4e4a5acb12c5ce
                    MATRIX: 798->1|937->46|1079->153|1093->159|1146->191|1250->260|1264->266|1320->300|1601->545|1616->551|1654->567|1965->842|1980->848|2045->890|2227->1036|2260->1059|2316->1092|2515->1255|2547->1278|2575->1284|2721->1394|2749->1413|2777->1419|2849->1454|2878->1473|2907->1479|3045->1581|3074->1600|3103->1606|3175->1641|3209->1665|3238->1671|3388->1785|3420->1808|3448->1814|3618->1948|3646->1967|3672->1984|3687->1990|3697->2013|3717->2024|3757->2026|3807->2079|3827->2090|3867->2092|3901->2129|3921->2140|3961->2142|3988->2172|4008->2183|4048->2185|4082->2222|4102->2233|4142->2235|4175->2271|4195->2282|4235->2284|4266->2318|4286->2329|4326->2331|4372->2364|4517->2473|4532->2479|4597->2521|4776->2664|4791->2670|4854->2711|5470->3291|5485->3297|5545->3334|5622->3374|5662->3404|5691->3410|5730->3412|5769->3441|5798->3447|5921->3534|5936->3540|5999->3580|6079->3623|6109->3643|6138->3649|6260->3735|6275->3741|6335->3778|6412->3818|6442->3838|6471->3844|7223->4560|7262->4590|7290->4596|7328->4598|7367->4628|7395->4634|7434->4637|7479->4672|7508->4678|7547->4680|7592->4715|7621->4721|7730->4794|7772->4827|7800->4833|7838->4835|7880->4868|7908->4874|7947->4877|7995->4915|8024->4921|8063->4923|8111->4961|8140->4967|8245->5036|8294->5076|8322->5082|8360->5084|8410->5124|8439->5130|8479->5133|8534->5178|8563->5184|8602->5186|8657->5231|8686->5237|8794->5309|8846->5352|8874->5358|8912->5360|8965->5403|8994->5409|9034->5412|9092->5460|9121->5466|9160->5468|9218->5516|9247->5522|9358->5597|9408->5638|9436->5644|9474->5646|9525->5687|9554->5693|9594->5696|9650->5742|9679->5748|9718->5750|9774->5796|9803->5802|9906->5869|9947->5901|9975->5907|10013->5909|10054->5941|10082->5947|10121->5950|10168->5987|10197->5993|10236->5995|10283->6032|10312->6038|10410->6100|10449->6130|10477->6136|10515->6138|10554->6168|10582->6174|10621->6177|10666->6212|10695->6218|10734->6220|10779->6255|10808->6261|10907->6324|10949->6357|10977->6363|11015->6365|11057->6398|11085->6404|11124->6407|11172->6445|11201->6451|11240->6453|11288->6491|11317->6497|11422->6565|11469->6602|11498->6608|11537->6610|11584->6647|11614->6653|11655->6656|11708->6698|11738->6704|11778->6706|11831->6748|11861->6754|11969->6825|12013->6859|12042->6865|12081->6867|12125->6901|12154->6907|12194->6910|12244->6949|12274->6955|12314->6957|12364->6996|12394->7002|12613->7184|12629->7190|12688->7225|12777->7277|12806->7296|12846->7297|12980->7394|13013->7410|13054->7412|13196->7516|13208->7517|13237->7522|13352->7604|13413->7632
                    LINES: 26->1|29->1|34->6|34->6|34->6|35->7|35->7|35->7|44->16|44->16|44->16|52->24|52->24|52->24|54->26|54->26|54->26|57->29|57->29|57->29|59->31|59->31|59->31|59->31|59->31|59->31|60->32|60->32|60->32|60->32|60->32|60->32|62->34|62->34|62->34|66->38|66->38|66->38|66->38|66->39|66->39|66->39|66->40|66->40|66->40|66->41|66->41|66->41|66->42|66->42|66->42|66->43|66->43|66->43|66->44|66->44|66->44|66->45|66->45|66->45|66->46|69->49|69->49|69->49|75->55|75->55|75->55|85->65|85->65|85->65|85->65|85->65|85->65|85->65|85->65|85->65|86->66|86->66|86->66|86->66|86->66|86->66|87->67|87->67|87->67|87->67|87->67|87->67|105->85|105->85|105->85|105->85|105->85|105->85|105->85|105->85|105->85|105->85|105->85|105->85|107->87|107->87|107->87|107->87|107->87|107->87|107->87|107->87|107->87|107->87|107->87|107->87|109->89|109->89|109->89|109->89|109->89|109->89|109->89|109->89|109->89|109->89|109->89|109->89|111->91|111->91|111->91|111->91|111->91|111->91|111->91|111->91|111->91|111->91|111->91|111->91|113->93|113->93|113->93|113->93|113->93|113->93|113->93|113->93|113->93|113->93|113->93|113->93|115->95|115->95|115->95|115->95|115->95|115->95|115->95|115->95|115->95|115->95|115->95|115->95|117->97|117->97|117->97|117->97|117->97|117->97|117->97|117->97|117->97|117->97|117->97|117->97|119->99|119->99|119->99|119->99|119->99|119->99|119->99|119->99|119->99|119->99|119->99|119->99|121->101|121->101|121->101|121->101|121->101|121->101|121->101|121->101|121->101|121->101|121->101|121->101|123->103|123->103|123->103|123->103|123->103|123->103|123->103|123->103|123->103|123->103|123->103|123->103|127->107|127->107|127->107|129->109|129->109|129->109|132->112|132->112|132->112|133->113|133->113|133->113|134->114|136->116
                    -- GENERATED --
                */
            