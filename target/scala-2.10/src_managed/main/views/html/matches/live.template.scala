
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
        <div class="panelHeader">Zdjęcia</div>
        <div class="panelContent">
            <div class="moreItems"><a href="/">zobacz wszystkie <img src=""""),_display_(Seq[Any](/*84.76*/routes/*84.82*/.Assets.at("images/list_arrow.png"))),format.raw/*84.117*/("""" border="0" /></a></div>
        </div>
        <div class="panelHeader">Wideo</div>
        <div class="panelContent">
            <iframe class="videoItem" title="YouTube video player" width="252" height="160" src="http://www.youtube.com/embed/utXXBcW55Dg?rel=0" frameborder="0" allowfullscreen></iframe>
            <iframe class="videoItem" title="YouTube video player" width="252" height="160" src="http://www.youtube.com/embed/36AFnuBhRy8?rel=0" frameborder="0" allowfullscreen></iframe>
            <div class="moreItems"><a href="/">zobacz wszystkie <img src=""""),_display_(Seq[Any](/*90.76*/routes/*90.82*/.Assets.at("images/list_arrow.png"))),format.raw/*90.117*/("""" border="0" /></a></div>
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
                    DATE: Sun Jun 15 17:37:46 CEST 2014
                    SOURCE: D:/Pawlak/Play/live/app/views/matches/live.scala.html
                    HASH: 8691b2a8f3f30dd1840a4e8c809d0f95fb969aac
                    MATRIX: 786->1|904->25|1046->132|1060->138|1113->170|1217->239|1231->245|1287->279|1568->524|1583->530|1621->546|1932->821|1947->827|2012->869|2194->1015|2227->1038|2283->1071|2482->1234|2514->1257|2542->1263|2688->1373|2716->1392|2744->1398|2816->1433|2845->1452|2874->1458|3012->1560|3041->1579|3070->1585|3142->1620|3176->1644|3205->1650|3355->1764|3387->1787|3415->1793|3585->1927|3613->1946|3639->1963|3654->1969|3664->1992|3684->2003|3724->2005|3774->2058|3794->2069|3834->2071|3868->2108|3888->2119|3928->2121|3955->2151|3975->2162|4015->2164|4049->2201|4069->2212|4109->2214|4142->2250|4162->2261|4202->2263|4233->2297|4253->2308|4293->2310|4339->2343|4484->2452|4499->2458|4564->2500|4743->2643|4758->2649|4821->2690|5437->3270|5452->3276|5512->3313|5589->3353|5629->3383|5658->3389|5697->3391|5736->3420|5765->3426|5888->3513|5903->3519|5966->3559|6046->3602|6076->3622|6105->3628|6227->3714|6242->3720|6302->3757|6379->3797|6409->3817|6438->3823|7082->4431|7097->4437|7155->4472|7767->5048|7782->5054|7840->5089
                    LINES: 26->1|29->1|34->6|34->6|34->6|35->7|35->7|35->7|44->16|44->16|44->16|52->24|52->24|52->24|54->26|54->26|54->26|57->29|57->29|57->29|59->31|59->31|59->31|59->31|59->31|59->31|60->32|60->32|60->32|60->32|60->32|60->32|62->34|62->34|62->34|66->38|66->38|66->38|66->38|66->39|66->39|66->39|66->40|66->40|66->40|66->41|66->41|66->41|66->42|66->42|66->42|66->43|66->43|66->43|66->44|66->44|66->44|66->45|66->45|66->45|66->46|69->49|69->49|69->49|75->55|75->55|75->55|85->65|85->65|85->65|85->65|85->65|85->65|85->65|85->65|85->65|86->66|86->66|86->66|86->66|86->66|86->66|87->67|87->67|87->67|87->67|87->67|87->67|104->84|104->84|104->84|110->90|110->90|110->90
                    -- GENERATED --
                */
            