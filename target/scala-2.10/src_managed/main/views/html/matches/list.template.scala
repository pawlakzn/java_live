
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
object list extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template5[com.avaje.ebean.Page[Match],String,String,String,User,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(currentPage: com.avaje.ebean.Page[Match], currentSortBy: String, currentOrder: String, currentFilter: String, loggeduser: User):play.api.templates.HtmlFormat.Appendable = {
        _display_ {
def /*32.2*/header/*32.8*/(key:String, title:String):play.api.templates.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*32.38*/("""
<th class=""""),_display_(Seq[Any](/*33.13*/key/*33.16*/.replace(".","_"))),format.raw/*33.33*/(""" header """),_display_(Seq[Any](/*33.42*/if(currentSortBy == key){/*33.68*/{if(currentOrder == "asc") "headerSortDown" else "headerSortUp"}})),format.raw/*33.132*/("""">
<a href=""""),_display_(Seq[Any](/*34.11*/link(0, key))),format.raw/*34.23*/("""">"""),_display_(Seq[Any](/*34.26*/title)),format.raw/*34.31*/("""</a>
</th>
""")))};def /*6.2*/link/*6.6*/(newPage:Int, newSortBy:String) = {{

var sortBy = currentSortBy
var order = currentOrder

if(newSortBy != null) {
sortBy = newSortBy
if(currentSortBy == newSortBy) {
if(currentOrder == "asc") {
order = "desc"
} else {
order = "asc"
}
} else {
order = "asc"
}
}

// Generate the link
routes.Matches.list(newPage, sortBy, order, currentFilter)

}};
Seq[Any](format.raw/*1.130*/("""

"""),format.raw/*5.42*/("""
"""),format.raw/*27.2*/("""

"""),format.raw/*31.37*/("""
"""),format.raw/*36.2*/("""

"""),_display_(Seq[Any](/*38.2*/main/*38.6*/ {_display_(Seq[Any](format.raw/*38.8*/("""

<h1 id="homeTitle">"""),_display_(Seq[Any](/*40.21*/Messages("matches.list.title", currentPage.getTotalRowCount))),format.raw/*40.81*/("""</h1>

"""),_display_(Seq[Any](/*42.2*/if(flash.containsKey("success"))/*42.34*/ {_display_(Seq[Any](format.raw/*42.36*/("""
<div class="alert-message warning">
    <strong>Gotowe!</strong> """),_display_(Seq[Any](/*44.31*/flash/*44.36*/.get("success"))),format.raw/*44.51*/("""
</div>
""")))})),format.raw/*46.2*/("""


<a class="btn success" id="add" href=""""),_display_(Seq[Any](/*49.40*/routes/*49.46*/.Matches.create())),format.raw/*49.63*/("""" style="float:right;margi-top:15px;margin-bottom:15px;">Dodaj mecz</a>



"""),_display_(Seq[Any](/*53.2*/if(currentPage.getTotalRowCount == 0)/*53.39*/ {_display_(Seq[Any](format.raw/*53.41*/("""

<div class="well">
    <em>Nie ma nic do wyświetlenia</em>
</div>

""")))}/*59.3*/else/*59.8*/{_display_(Seq[Any](format.raw/*59.9*/("""

<table class="computers zebra-striped">
    <thead>
    <tr>
        """),_display_(Seq[Any](/*64.10*/header("team1", "Gospodarz"))),format.raw/*64.38*/("""
        """),_display_(Seq[Any](/*65.10*/header("team2", "Gość"))),format.raw/*65.33*/("""
        <th>Rozgrywki</th>
        <th>Data</th>
        <th>Wynik</th>
        <th>Akcja</th>
    </tr>
    </thead>
    <tbody>

    """),_display_(Seq[Any](/*74.6*/for(matches <- currentPage.getList) yield /*74.41*/ {_display_(Seq[Any](format.raw/*74.43*/("""
    <tr>
        <td>"""),_display_(Seq[Any](/*76.14*/matches/*76.21*/.team1.name)),format.raw/*76.32*/("""</td>
        <td>"""),_display_(Seq[Any](/*77.14*/matches/*77.21*/.team2.name)),format.raw/*77.32*/("""</td>
        <td>
            """),_display_(Seq[Any](/*79.14*/if(matches.game.name == null)/*79.43*/ {_display_(Seq[Any](format.raw/*79.45*/("""
            <em>-</em>
            """)))}/*81.15*/else/*81.20*/{_display_(Seq[Any](format.raw/*81.21*/("""
            """),_display_(Seq[Any](/*82.14*/matches/*82.21*/.game.name)),format.raw/*82.31*/("""
            """)))})),format.raw/*83.14*/("""
        </td>
        <td>
            """),_display_(Seq[Any](/*86.14*/if(matches.match_date == null)/*86.44*/ {_display_(Seq[Any](format.raw/*86.46*/("""
            <em>-</em>
            """)))}/*88.15*/else/*88.20*/{_display_(Seq[Any](format.raw/*88.21*/("""
            """),_display_(Seq[Any](/*89.14*/matches/*89.21*/.match_date.format("dd-MM-yyyy kk:mm"))),format.raw/*89.59*/("""
            """)))})),format.raw/*90.14*/("""
        </td>
        <td>
            """),_display_(Seq[Any](/*93.14*/if(matches.score1 == null || matches.score2 == null)/*93.66*/ {_display_(Seq[Any](format.raw/*93.68*/("""
            <em>-</em>
            """)))}/*95.15*/else/*95.20*/{_display_(Seq[Any](format.raw/*95.21*/("""
            """),_display_(Seq[Any](/*96.14*/matches/*96.21*/.score1)),format.raw/*96.28*/(""":"""),_display_(Seq[Any](/*96.30*/matches/*96.37*/.score2)),format.raw/*96.44*/(""" ("""),_display_(Seq[Any](/*96.47*/matches/*96.54*/.score1)),format.raw/*96.61*/(""":"""),_display_(Seq[Any](/*96.63*/matches/*96.70*/.score2)),format.raw/*96.77*/(""")
            """)))})),format.raw/*97.14*/("""
        </td>
        <td>
            <a class="btn danger small" id="add" href=""""),_display_(Seq[Any](/*100.57*/routes/*100.63*/.Matches.live(matches.id))),format.raw/*100.88*/("""">Zobacz</a>
            """),_display_(Seq[Any](/*101.14*/if(loggeduser.status > 0)/*101.39*/{_display_(Seq[Any](format.raw/*101.40*/("""
            <a class="btn info small" id="add" href=""""),_display_(Seq[Any](/*102.55*/routes/*102.61*/.Matches.edit(matches.id))),format.raw/*102.86*/("""">Edytuj</a>
            """)))})),format.raw/*103.14*/("""
        </td>
    </tr>
    """)))})),format.raw/*106.6*/("""

    </tbody>
</table>

<div id="pagination" class="pagination">
    <ul>
        """),_display_(Seq[Any](/*113.10*/if(currentPage.hasPrev)/*113.33*/ {_display_(Seq[Any](format.raw/*113.35*/("""
        <li class="prev">
            <a href=""""),_display_(Seq[Any](/*115.23*/link(currentPage.getPageIndex - 1, null))),format.raw/*115.63*/("""">&larr; Poprzedni</a>
        </li>
        """)))}/*117.11*/else/*117.16*/{_display_(Seq[Any](format.raw/*117.17*/("""
        <li class="prev disabled">
            <a>&larr; Poprzedni</a>
        </li>
        """)))})),format.raw/*121.10*/("""
        <li class="current">
            <a>Wyświetla """),_display_(Seq[Any](/*123.27*/currentPage/*123.38*/.getDisplayXtoYofZ(" do "," z "))),format.raw/*123.70*/("""</a>
        </li>
        """),_display_(Seq[Any](/*125.10*/if(currentPage.hasNext)/*125.33*/ {_display_(Seq[Any](format.raw/*125.35*/("""
        <li class="next">
            <a href=""""),_display_(Seq[Any](/*127.23*/link(currentPage.getPageIndex + 1, null))),format.raw/*127.63*/("""">Następny &rarr;</a>
        </li>
        """)))}/*129.11*/else/*129.16*/{_display_(Seq[Any](format.raw/*129.17*/("""
        <li class="next disabled">
            <a>Następny &rarr;</a>
        </li>
        """)))})),format.raw/*133.10*/("""
    </ul>
</div>

""")))})),format.raw/*137.2*/("""

""")))})),format.raw/*139.2*/("""

            """))}
    }
    
    def render(currentPage:com.avaje.ebean.Page[Match],currentSortBy:String,currentOrder:String,currentFilter:String,loggeduser:User): play.api.templates.HtmlFormat.Appendable = apply(currentPage,currentSortBy,currentOrder,currentFilter,loggeduser)
    
    def f:((com.avaje.ebean.Page[Match],String,String,String,User) => play.api.templates.HtmlFormat.Appendable) = (currentPage,currentSortBy,currentOrder,currentFilter,loggeduser) => apply(currentPage,currentSortBy,currentOrder,currentFilter,loggeduser)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Jun 15 23:09:50 CEST 2014
                    SOURCE: D:/Pawlak/Play/live/app/views/matches/list.scala.html
                    HASH: e8400f0f07c3a1373729a19ef139db88deefed8d
                    MATRIX: 828->1|1034->750|1048->756|1159->786|1209->800|1221->803|1260->820|1305->829|1339->855|1427->919|1477->933|1511->945|1550->948|1577->953|1613->263|1624->267|2021->129|2052->260|2081->633|2113->747|2142->967|2182->972|2194->976|2233->978|2293->1002|2375->1062|2420->1072|2461->1104|2501->1106|2606->1175|2620->1180|2657->1195|2699->1206|2780->1251|2795->1257|2834->1274|2949->1354|2995->1391|3035->1393|3129->1470|3141->1475|3179->1476|3292->1553|3342->1581|3389->1592|3434->1615|3615->1761|3666->1796|3706->1798|3767->1823|3783->1830|3816->1841|3872->1861|3888->1868|3921->1879|3991->1913|4029->1942|4069->1944|4127->1984|4140->1989|4179->1990|4230->2005|4246->2012|4278->2022|4325->2037|4405->2081|4444->2111|4484->2113|4542->2153|4555->2158|4594->2159|4645->2174|4661->2181|4721->2219|4768->2234|4848->2278|4909->2330|4949->2332|5007->2372|5020->2377|5059->2378|5110->2393|5126->2400|5155->2407|5193->2409|5209->2416|5238->2423|5277->2426|5293->2433|5322->2440|5360->2442|5376->2449|5405->2456|5453->2472|5577->2559|5593->2565|5641->2590|5705->2617|5740->2642|5780->2643|5873->2699|5889->2705|5937->2730|5997->2757|6062->2790|6190->2881|6223->2904|6264->2906|6352->2957|6415->2997|6483->3046|6497->3051|6537->3052|6669->3151|6764->3209|6785->3220|6840->3252|6907->3282|6940->3305|6981->3307|7069->3358|7132->3398|7199->3446|7213->3451|7253->3452|7384->3550|7440->3574|7477->3579
                    LINES: 26->1|28->32|28->32|30->32|31->33|31->33|31->33|31->33|31->33|31->33|32->34|32->34|32->34|32->34|34->6|34->6|56->1|58->5|59->27|61->31|62->36|64->38|64->38|64->38|66->40|66->40|68->42|68->42|68->42|70->44|70->44|70->44|72->46|75->49|75->49|75->49|79->53|79->53|79->53|85->59|85->59|85->59|90->64|90->64|91->65|91->65|100->74|100->74|100->74|102->76|102->76|102->76|103->77|103->77|103->77|105->79|105->79|105->79|107->81|107->81|107->81|108->82|108->82|108->82|109->83|112->86|112->86|112->86|114->88|114->88|114->88|115->89|115->89|115->89|116->90|119->93|119->93|119->93|121->95|121->95|121->95|122->96|122->96|122->96|122->96|122->96|122->96|122->96|122->96|122->96|122->96|122->96|122->96|123->97|126->100|126->100|126->100|127->101|127->101|127->101|128->102|128->102|128->102|129->103|132->106|139->113|139->113|139->113|141->115|141->115|143->117|143->117|143->117|147->121|149->123|149->123|149->123|151->125|151->125|151->125|153->127|153->127|155->129|155->129|155->129|159->133|163->137|165->139
                    -- GENERATED --
                */
            