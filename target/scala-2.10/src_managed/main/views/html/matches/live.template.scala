
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
object live extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template4[Form[Match],List[Video],List[Lineup],List[Lineup],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(matchForm: Form[Match], videos: List[Video], lineup1: List[Lineup], lineup2: List[Lineup]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.93*/("""

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
                            <div id="halfGoals" class="halfGoals">(<span id="hostGoalsHalf">"""),_display_(Seq[Any](/*32.94*/matchForm("score1_half")/*32.118*/.value)),format.raw/*32.124*/("""</span>:<span id="guestGoalsHalf">"""),_display_(Seq[Any](/*32.159*/matchForm("score2_half")/*32.183*/.value)),format.raw/*32.189*/("""</span>)</div>
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

                    <div width="100%;" style="display:table;margin:0 auto;padding:0;border:0;height:auto;">
                        <div style="float:left;">
                            <strong>"""),_display_(Seq[Any](/*63.38*/matchForm("team1.name")/*63.61*/.value)),format.raw/*63.67*/("""</strong><br>
                            """),_display_(Seq[Any](/*64.30*/for(l1 <- lineup1) yield /*64.48*/ {_display_(Seq[Any](format.raw/*64.50*/("""
                                """),_display_(Seq[Any](/*65.34*/l1/*65.36*/.player1.firstname)),format.raw/*65.54*/(""" """),_display_(Seq[Any](/*65.56*/l1/*65.58*/.player1.lastname)),format.raw/*65.75*/("""<br>
                            """)))})),format.raw/*66.30*/("""
                        </div>
                        <div style="float:right;margin-left:20px;">
                            <strong>"""),_display_(Seq[Any](/*69.38*/matchForm("team2.name")/*69.61*/.value)),format.raw/*69.67*/("""</strong><br>
                            """),_display_(Seq[Any](/*70.30*/for(l2 <- lineup2) yield /*70.48*/ {_display_(Seq[Any](format.raw/*70.50*/("""
                            """),_display_(Seq[Any](/*71.30*/l2/*71.32*/.player1.firstname)),format.raw/*71.50*/(""" """),_display_(Seq[Any](/*71.52*/l2/*71.54*/.player1.lastname)),format.raw/*71.71*/("""<br>
                            """)))})),format.raw/*72.30*/("""
                        </div>
                    </div>

                    <table id="playersTable">
                        <tr>
                            <td colspan="2">
                                <table class="matchDetails" cellpadding="0" cellspacing="0" width="100%">
                                    <tr>
                                        <td ><img src=""""),_display_(Seq[Any](/*81.57*/routes/*81.63*/.Assets.at("images/live/referee.png"))),format.raw/*81.100*/("""" /> Sędzia: <strong id="matchReferee">"""),_display_(Seq[Any](/*81.140*/matchForm("referee.firstname")/*81.170*/.value)),format.raw/*81.176*/(""" """),_display_(Seq[Any](/*81.178*/matchForm("referee.lastname")/*81.207*/.value)),format.raw/*81.213*/("""</strong></td>
                                        <td  align="center"><img src=""""),_display_(Seq[Any](/*82.72*/routes/*82.78*/.Assets.at("images/live/spectators.png"))),format.raw/*82.118*/("""" /> Widzów: <strong id="matchSpectators">"""),_display_(Seq[Any](/*82.161*/matchForm("viewers")/*82.181*/.value)),format.raw/*82.187*/("""</strong></td>
                                        <td  align="right"><img src=""""),_display_(Seq[Any](/*83.71*/routes/*83.77*/.Assets.at("images/live/weather.png"))),format.raw/*83.114*/("""" /> Pogoda: <strong id="matchWeather">"""),_display_(Seq[Any](/*83.154*/matchForm("weather")/*83.174*/.value)),format.raw/*83.180*/("""</strong></td>
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
            """),_display_(Seq[Any](/*101.14*/matchForm("statistics.goals1")/*101.44*/.value)),format.raw/*101.50*/(""":"""),_display_(Seq[Any](/*101.52*/matchForm("statistics.goals2")/*101.82*/.value)),format.raw/*101.88*/(""" ("""),_display_(Seq[Any](/*101.91*/matchForm("statistics.goals1_half")/*101.126*/.value)),format.raw/*101.132*/(""":"""),_display_(Seq[Any](/*101.134*/matchForm("statistics.goals2_half")/*101.169*/.value)),format.raw/*101.175*/(""")<br>
            <strong>Słupki/Poprzeczki:</strong><br>
            """),_display_(Seq[Any](/*103.14*/matchForm("statistics.goalpost1")/*103.47*/.value)),format.raw/*103.53*/(""":"""),_display_(Seq[Any](/*103.55*/matchForm("statistics.goalpost2")/*103.88*/.value)),format.raw/*103.94*/(""" ("""),_display_(Seq[Any](/*103.97*/matchForm("statistics.goalpost1_half")/*103.135*/.value)),format.raw/*103.141*/(""":"""),_display_(Seq[Any](/*103.143*/matchForm("statistics.goalpost2_half")/*103.181*/.value)),format.raw/*103.187*/(""")<br>
            <strong>Strzały celne:</strong><br>
            """),_display_(Seq[Any](/*105.14*/matchForm("statistics.attempts_target1")/*105.54*/.value)),format.raw/*105.60*/(""":"""),_display_(Seq[Any](/*105.62*/matchForm("statistics.attempts_target2")/*105.102*/.value)),format.raw/*105.108*/(""" ("""),_display_(Seq[Any](/*105.111*/matchForm("statistics.attempts_target1_half")/*105.156*/.value)),format.raw/*105.162*/(""":"""),_display_(Seq[Any](/*105.164*/matchForm("statistics.attempts_target2_half")/*105.209*/.value)),format.raw/*105.215*/(""")<br>
            <strong>Strzały niecelne:</strong><br>
            """),_display_(Seq[Any](/*107.14*/matchForm("statistics.attempts_offtarget1")/*107.57*/.value)),format.raw/*107.63*/(""":"""),_display_(Seq[Any](/*107.65*/matchForm("statistics.attempts_offtarget2")/*107.108*/.value)),format.raw/*107.114*/(""" ("""),_display_(Seq[Any](/*107.117*/matchForm("statistics.attempts_offtarget1_half")/*107.165*/.value)),format.raw/*107.171*/(""":"""),_display_(Seq[Any](/*107.173*/matchForm("statistics.attempts_offtarget2_half")/*107.221*/.value)),format.raw/*107.227*/(""")<br>
            <strong>Strzały zablokowane:</strong><br>
            """),_display_(Seq[Any](/*109.14*/matchForm("statistics.attempts_blocked1")/*109.55*/.value)),format.raw/*109.61*/(""":"""),_display_(Seq[Any](/*109.63*/matchForm("statistics.attempts_blocked2")/*109.104*/.value)),format.raw/*109.110*/(""" ("""),_display_(Seq[Any](/*109.113*/matchForm("statistics.attempts_blocked1_half")/*109.159*/.value)),format.raw/*109.165*/(""":"""),_display_(Seq[Any](/*109.167*/matchForm("statistics.attempts_blocked2_half")/*109.213*/.value)),format.raw/*109.219*/(""")<br>
            <strong>Rzuty rożne</strong>:<br>
            """),_display_(Seq[Any](/*111.14*/matchForm("statistics.corners1")/*111.46*/.value)),format.raw/*111.52*/(""":"""),_display_(Seq[Any](/*111.54*/matchForm("statistics.corners2")/*111.86*/.value)),format.raw/*111.92*/(""" ("""),_display_(Seq[Any](/*111.95*/matchForm("statistics.corners1_half")/*111.132*/.value)),format.raw/*111.138*/(""":"""),_display_(Seq[Any](/*111.140*/matchForm("statistics.corners2_half")/*111.177*/.value)),format.raw/*111.183*/(""")<br>
             <strong>Faule:</strong><br>
            """),_display_(Seq[Any](/*113.14*/matchForm("statistics.fouls1")/*113.44*/.value)),format.raw/*113.50*/(""":"""),_display_(Seq[Any](/*113.52*/matchForm("statistics.fouls2")/*113.82*/.value)),format.raw/*113.88*/(""" ("""),_display_(Seq[Any](/*113.91*/matchForm("statistics.fouls1_half")/*113.126*/.value)),format.raw/*113.132*/(""":"""),_display_(Seq[Any](/*113.134*/matchForm("statistics.fouls2_half")/*113.169*/.value)),format.raw/*113.175*/(""")<br>
            <strong>Spalone:</strong><br>
            """),_display_(Seq[Any](/*115.14*/matchForm("statistics.offsides1")/*115.47*/.value)),format.raw/*115.53*/(""":"""),_display_(Seq[Any](/*115.55*/matchForm("statistics.offsides2")/*115.88*/.value)),format.raw/*115.94*/(""" ("""),_display_(Seq[Any](/*115.97*/matchForm("statistics.offsides1_half")/*115.135*/.value)),format.raw/*115.141*/(""":"""),_display_(Seq[Any](/*115.143*/matchForm("statistics.offsides2_half")/*115.181*/.value)),format.raw/*115.187*/(""")<br>
            <strong>Żółte kartki:</strong><br>
            """),_display_(Seq[Any](/*117.14*/matchForm("statistics.yellow_cards1")/*117.51*/.value)),format.raw/*117.57*/(""":"""),_display_(Seq[Any](/*117.59*/matchForm("statistics.yellow_cards2")/*117.96*/.value)),format.raw/*117.102*/(""" ("""),_display_(Seq[Any](/*117.105*/matchForm("statistics.yellow_cards1_half")/*117.147*/.value)),format.raw/*117.153*/(""":"""),_display_(Seq[Any](/*117.155*/matchForm("statistics.yellow_cards2_half")/*117.197*/.value)),format.raw/*117.203*/(""")<br>
            <strong>Czerwone kartki:</strong><br>
            """),_display_(Seq[Any](/*119.14*/matchForm("statistics.red_cards1")/*119.48*/.value)),format.raw/*119.54*/(""":"""),_display_(Seq[Any](/*119.56*/matchForm("statistics.red_cards2")/*119.90*/.value)),format.raw/*119.96*/(""" ("""),_display_(Seq[Any](/*119.99*/matchForm("statistics.red_cards1_half")/*119.138*/.value)),format.raw/*119.144*/(""":"""),_display_(Seq[Any](/*119.146*/matchForm("statistics.red_cards2_half")/*119.185*/.value)),format.raw/*119.191*/(""")<br>
        </div>
        <div class="panelHeader">Zdjęcia</div>
        <div class="panelContent">
            <div class="moreItems"><a href="/">zobacz wszystkie <img src=""""),_display_(Seq[Any](/*123.76*/routes/*123.82*/.Assets.at("images/list_arrow.png"))),format.raw/*123.117*/("""" border="0" /></a></div>
        </div>
        """),_display_(Seq[Any](/*125.10*/if(!videos.isEmpty)/*125.29*/{_display_(Seq[Any](format.raw/*125.30*/("""
        <div class="panelHeader">Wideo</div>
        <div class="panelContent">
            """),_display_(Seq[Any](/*128.14*/for(v <- videos) yield /*128.30*/ {_display_(Seq[Any](format.raw/*128.32*/("""
                <iframe class="videoItem" title="YouTube video player" width="252" height="160" src=""""),_display_(Seq[Any](/*129.103*/v/*129.104*/.path)),format.raw/*129.109*/("""" frameborder="0" allowfullscreen style="max-width:100%;"></iframe>
            """)))})),format.raw/*130.14*/("""
         </div>
        """)))})),format.raw/*132.10*/("""
    </div>

</body>
</html>
    


"""))}
    }
    
    def render(matchForm:Form[Match],videos:List[Video],lineup1:List[Lineup],lineup2:List[Lineup]): play.api.templates.HtmlFormat.Appendable = apply(matchForm,videos,lineup1,lineup2)
    
    def f:((Form[Match],List[Video],List[Lineup],List[Lineup]) => play.api.templates.HtmlFormat.Appendable) = (matchForm,videos,lineup1,lineup2) => apply(matchForm,videos,lineup1,lineup2)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Jun 16 18:12:54 CEST 2014
                    SOURCE: D:/Pawlak/Play/live/app/views/matches/live.scala.html
                    HASH: a496e7ef10e07547c232c32260edca7194a781e0
                    MATRIX: 824->1|1009->92|1151->199|1165->205|1218->237|1322->306|1336->312|1392->346|1673->591|1688->597|1726->613|2037->888|2052->894|2117->936|2299->1082|2332->1105|2388->1138|2587->1301|2619->1324|2647->1330|2793->1440|2821->1459|2849->1465|2921->1500|2950->1519|2979->1525|3117->1627|3151->1651|3180->1657|3252->1692|3286->1716|3315->1722|3465->1836|3497->1859|3525->1865|3695->1999|3723->2018|3749->2035|3764->2041|3774->2064|3794->2075|3834->2077|3884->2130|3904->2141|3944->2143|3978->2180|3998->2191|4038->2193|4065->2223|4085->2234|4125->2236|4159->2273|4179->2284|4219->2286|4252->2322|4272->2333|4312->2335|4343->2369|4363->2380|4403->2382|4449->2415|4594->2524|4609->2530|4674->2572|4853->2715|4868->2721|4931->2762|5418->3213|5450->3236|5478->3242|5558->3286|5592->3304|5632->3306|5703->3341|5714->3343|5754->3361|5792->3363|5803->3365|5842->3382|5909->3417|6085->3557|6117->3580|6145->3586|6225->3630|6259->3648|6299->3650|6366->3681|6377->3683|6417->3701|6455->3703|6466->3705|6505->3722|6572->3757|7000->4149|7015->4155|7075->4192|7152->4232|7192->4262|7221->4268|7260->4270|7299->4299|7328->4305|7451->4392|7466->4398|7529->4438|7609->4481|7639->4501|7668->4507|7790->4593|7805->4599|7865->4636|7942->4676|7972->4696|8001->4702|8754->5418|8794->5448|8823->5454|8862->5456|8902->5486|8931->5492|8971->5495|9017->5530|9047->5536|9087->5538|9133->5573|9163->5579|9273->5652|9316->5685|9345->5691|9384->5693|9427->5726|9456->5732|9496->5735|9545->5773|9575->5779|9615->5781|9664->5819|9694->5825|9800->5894|9850->5934|9879->5940|9918->5942|9969->5982|9999->5988|10040->5991|10096->6036|10126->6042|10166->6044|10222->6089|10252->6095|10361->6167|10414->6210|10443->6216|10482->6218|10536->6261|10566->6267|10607->6270|10666->6318|10696->6324|10736->6326|10795->6374|10825->6380|10937->6455|10988->6496|11017->6502|11056->6504|11108->6545|11138->6551|11179->6554|11236->6600|11266->6606|11306->6608|11363->6654|11393->6660|11497->6727|11539->6759|11568->6765|11607->6767|11649->6799|11678->6805|11718->6808|11766->6845|11796->6851|11836->6853|11884->6890|11914->6896|12013->6958|12053->6988|12082->6994|12121->6996|12161->7026|12190->7032|12230->7035|12276->7070|12306->7076|12346->7078|12392->7113|12422->7119|12522->7182|12565->7215|12594->7221|12633->7223|12676->7256|12705->7262|12745->7265|12794->7303|12824->7309|12864->7311|12913->7349|12943->7355|13048->7423|13095->7460|13124->7466|13163->7468|13210->7505|13240->7511|13281->7514|13334->7556|13364->7562|13404->7564|13457->7606|13487->7612|13595->7683|13639->7717|13668->7723|13707->7725|13751->7759|13780->7765|13820->7768|13870->7807|13900->7813|13940->7815|13990->7854|14020->7860|14239->8042|14255->8048|14314->8083|14403->8135|14432->8154|14472->8155|14606->8252|14639->8268|14680->8270|14822->8374|14834->8375|14863->8380|14978->8462|15039->8490
                    LINES: 26->1|29->1|34->6|34->6|34->6|35->7|35->7|35->7|44->16|44->16|44->16|52->24|52->24|52->24|54->26|54->26|54->26|57->29|57->29|57->29|59->31|59->31|59->31|59->31|59->31|59->31|60->32|60->32|60->32|60->32|60->32|60->32|62->34|62->34|62->34|66->38|66->38|66->38|66->38|66->39|66->39|66->39|66->40|66->40|66->40|66->41|66->41|66->41|66->42|66->42|66->42|66->43|66->43|66->43|66->44|66->44|66->44|66->45|66->45|66->45|66->46|69->49|69->49|69->49|75->55|75->55|75->55|83->63|83->63|83->63|84->64|84->64|84->64|85->65|85->65|85->65|85->65|85->65|85->65|86->66|89->69|89->69|89->69|90->70|90->70|90->70|91->71|91->71|91->71|91->71|91->71|91->71|92->72|101->81|101->81|101->81|101->81|101->81|101->81|101->81|101->81|101->81|102->82|102->82|102->82|102->82|102->82|102->82|103->83|103->83|103->83|103->83|103->83|103->83|121->101|121->101|121->101|121->101|121->101|121->101|121->101|121->101|121->101|121->101|121->101|121->101|123->103|123->103|123->103|123->103|123->103|123->103|123->103|123->103|123->103|123->103|123->103|123->103|125->105|125->105|125->105|125->105|125->105|125->105|125->105|125->105|125->105|125->105|125->105|125->105|127->107|127->107|127->107|127->107|127->107|127->107|127->107|127->107|127->107|127->107|127->107|127->107|129->109|129->109|129->109|129->109|129->109|129->109|129->109|129->109|129->109|129->109|129->109|129->109|131->111|131->111|131->111|131->111|131->111|131->111|131->111|131->111|131->111|131->111|131->111|131->111|133->113|133->113|133->113|133->113|133->113|133->113|133->113|133->113|133->113|133->113|133->113|133->113|135->115|135->115|135->115|135->115|135->115|135->115|135->115|135->115|135->115|135->115|135->115|135->115|137->117|137->117|137->117|137->117|137->117|137->117|137->117|137->117|137->117|137->117|137->117|137->117|139->119|139->119|139->119|139->119|139->119|139->119|139->119|139->119|139->119|139->119|139->119|139->119|143->123|143->123|143->123|145->125|145->125|145->125|148->128|148->128|148->128|149->129|149->129|149->129|150->130|152->132
                    -- GENERATED --
                */
            