
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
object list extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template4[com.avaje.ebean.Page[Match],String,String,String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(currentPage: com.avaje.ebean.Page[Match], currentSortBy: String, currentOrder: String, currentFilter: String):play.api.templates.HtmlFormat.Appendable = {
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
Seq[Any](format.raw/*1.112*/("""

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
    </tr>
    </thead>
    <tbody>

    """),_display_(Seq[Any](/*73.6*/for(matches <- currentPage.getList) yield /*73.41*/ {_display_(Seq[Any](format.raw/*73.43*/("""
    <tr>
        <td><a href=""""),_display_(Seq[Any](/*75.23*/routes/*75.29*/.Matches.edit(matches.id))),format.raw/*75.54*/("""">"""),_display_(Seq[Any](/*75.57*/matches/*75.64*/.team1.name)),format.raw/*75.75*/("""</a></td>
        <td>"""),_display_(Seq[Any](/*76.14*/matches/*76.21*/.team2.name)),format.raw/*76.32*/("""</td>
        <td>
            """),_display_(Seq[Any](/*78.14*/if(matches.game.name == null)/*78.43*/ {_display_(Seq[Any](format.raw/*78.45*/("""
            <em>-</em>
            """)))}/*80.15*/else/*80.20*/{_display_(Seq[Any](format.raw/*80.21*/("""
            """),_display_(Seq[Any](/*81.14*/matches/*81.21*/.game.name)),format.raw/*81.31*/("""
            """)))})),format.raw/*82.14*/("""
        </td>
        <td>
            """),_display_(Seq[Any](/*85.14*/if(matches.match_date == null)/*85.44*/ {_display_(Seq[Any](format.raw/*85.46*/("""
            <em>-</em>
            """)))}/*87.15*/else/*87.20*/{_display_(Seq[Any](format.raw/*87.21*/("""
            """),_display_(Seq[Any](/*88.14*/matches/*88.21*/.match_date.format("dd-MM-yyyy kk:mm"))),format.raw/*88.59*/("""
            """)))})),format.raw/*89.14*/("""
        </td>
        <td>
            """),_display_(Seq[Any](/*92.14*/if(matches.score1 == null || matches.score2 == null)/*92.66*/ {_display_(Seq[Any](format.raw/*92.68*/("""
            <em>-</em>
            """)))}/*94.15*/else/*94.20*/{_display_(Seq[Any](format.raw/*94.21*/("""
            """),_display_(Seq[Any](/*95.14*/matches/*95.21*/.score1)),format.raw/*95.28*/(""":"""),_display_(Seq[Any](/*95.30*/matches/*95.37*/.score2)),format.raw/*95.44*/(""" ("""),_display_(Seq[Any](/*95.47*/matches/*95.54*/.score1)),format.raw/*95.61*/(""":"""),_display_(Seq[Any](/*95.63*/matches/*95.70*/.score2)),format.raw/*95.77*/(""")
            """)))})),format.raw/*96.14*/("""
        </td>
    </tr>
    """)))})),format.raw/*99.6*/("""

    </tbody>
</table>

<div id="pagination" class="pagination">
    <ul>
        """),_display_(Seq[Any](/*106.10*/if(currentPage.hasPrev)/*106.33*/ {_display_(Seq[Any](format.raw/*106.35*/("""
        <li class="prev">
            <a href=""""),_display_(Seq[Any](/*108.23*/link(currentPage.getPageIndex - 1, null))),format.raw/*108.63*/("""">&larr; Poprzedni</a>
        </li>
        """)))}/*110.11*/else/*110.16*/{_display_(Seq[Any](format.raw/*110.17*/("""
        <li class="prev disabled">
            <a>&larr; Poprzedni</a>
        </li>
        """)))})),format.raw/*114.10*/("""
        <li class="current">
            <a>Wyświetla """),_display_(Seq[Any](/*116.27*/currentPage/*116.38*/.getDisplayXtoYofZ(" do "," z "))),format.raw/*116.70*/("""</a>
        </li>
        """),_display_(Seq[Any](/*118.10*/if(currentPage.hasNext)/*118.33*/ {_display_(Seq[Any](format.raw/*118.35*/("""
        <li class="next">
            <a href=""""),_display_(Seq[Any](/*120.23*/link(currentPage.getPageIndex + 1, null))),format.raw/*120.63*/("""">Następny &rarr;</a>
        </li>
        """)))}/*122.11*/else/*122.16*/{_display_(Seq[Any](format.raw/*122.17*/("""
        <li class="next disabled">
            <a>Następny &rarr;</a>
        </li>
        """)))})),format.raw/*126.10*/("""
    </ul>
</div>

""")))})),format.raw/*130.2*/("""

""")))})),format.raw/*132.2*/("""

            """))}
    }
    
    def render(currentPage:com.avaje.ebean.Page[Match],currentSortBy:String,currentOrder:String,currentFilter:String): play.api.templates.HtmlFormat.Appendable = apply(currentPage,currentSortBy,currentOrder,currentFilter)
    
    def f:((com.avaje.ebean.Page[Match],String,String,String) => play.api.templates.HtmlFormat.Appendable) = (currentPage,currentSortBy,currentOrder,currentFilter) => apply(currentPage,currentSortBy,currentOrder,currentFilter)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Jun 15 13:44:23 CEST 2014
                    SOURCE: D:/Pawlak/Play/live/app/views/matches/list.scala.html
                    HASH: b592ac8d7cc0dfd6d37486e3b5aa972eac280568
                    MATRIX: 823->1|1011->732|1025->738|1136->768|1186->782|1198->785|1237->802|1282->811|1316->837|1404->901|1454->915|1488->927|1527->930|1554->935|1590->245|1601->249|1998->111|2029->242|2058->615|2090->729|2119->949|2159->954|2171->958|2210->960|2270->984|2352->1044|2397->1054|2438->1086|2478->1088|2583->1157|2597->1162|2634->1177|2676->1188|2757->1233|2772->1239|2811->1256|2926->1336|2972->1373|3012->1375|3106->1452|3118->1457|3156->1458|3269->1535|3319->1563|3366->1574|3411->1597|3568->1719|3619->1754|3659->1756|3729->1790|3744->1796|3791->1821|3830->1824|3846->1831|3879->1842|3939->1866|3955->1873|3988->1884|4058->1918|4096->1947|4136->1949|4194->1989|4207->1994|4246->1995|4297->2010|4313->2017|4345->2027|4392->2042|4472->2086|4511->2116|4551->2118|4609->2158|4622->2163|4661->2164|4712->2179|4728->2186|4788->2224|4835->2239|4915->2283|4976->2335|5016->2337|5074->2377|5087->2382|5126->2383|5177->2398|5193->2405|5222->2412|5260->2414|5276->2421|5305->2428|5344->2431|5360->2438|5389->2445|5427->2447|5443->2454|5472->2461|5520->2477|5584->2510|5712->2601|5745->2624|5786->2626|5874->2677|5937->2717|6005->2766|6019->2771|6059->2772|6191->2871|6286->2929|6307->2940|6362->2972|6429->3002|6462->3025|6503->3027|6591->3078|6654->3118|6721->3166|6735->3171|6775->3172|6906->3270|6962->3294|6999->3299
                    LINES: 26->1|28->32|28->32|30->32|31->33|31->33|31->33|31->33|31->33|31->33|32->34|32->34|32->34|32->34|34->6|34->6|56->1|58->5|59->27|61->31|62->36|64->38|64->38|64->38|66->40|66->40|68->42|68->42|68->42|70->44|70->44|70->44|72->46|75->49|75->49|75->49|79->53|79->53|79->53|85->59|85->59|85->59|90->64|90->64|91->65|91->65|99->73|99->73|99->73|101->75|101->75|101->75|101->75|101->75|101->75|102->76|102->76|102->76|104->78|104->78|104->78|106->80|106->80|106->80|107->81|107->81|107->81|108->82|111->85|111->85|111->85|113->87|113->87|113->87|114->88|114->88|114->88|115->89|118->92|118->92|118->92|120->94|120->94|120->94|121->95|121->95|121->95|121->95|121->95|121->95|121->95|121->95|121->95|121->95|121->95|121->95|122->96|125->99|132->106|132->106|132->106|134->108|134->108|136->110|136->110|136->110|140->114|142->116|142->116|142->116|144->118|144->118|144->118|146->120|146->120|148->122|148->122|148->122|152->126|156->130|158->132
                    -- GENERATED --
                */
            