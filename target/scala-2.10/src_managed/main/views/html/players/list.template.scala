
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
object list extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template4[com.avaje.ebean.Page[Player],String,String,String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(currentPage: com.avaje.ebean.Page[Player], currentSortBy: String, currentOrder: String, currentFilter: String):play.api.templates.HtmlFormat.Appendable = {
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
routes.Players.list(newPage, sortBy, order, currentFilter)

}};
Seq[Any](format.raw/*1.113*/("""

"""),format.raw/*5.42*/("""
"""),format.raw/*27.2*/("""

"""),format.raw/*31.37*/("""
"""),format.raw/*36.2*/("""

"""),_display_(Seq[Any](/*38.2*/panel/*38.7*/ {_display_(Seq[Any](format.raw/*38.9*/("""

<h1 id="homeTitle">"""),_display_(Seq[Any](/*40.21*/Messages("players.list.title", currentPage.getTotalRowCount))),format.raw/*40.81*/("""</h1>

"""),_display_(Seq[Any](/*42.2*/if(flash.containsKey("success"))/*42.34*/ {_display_(Seq[Any](format.raw/*42.36*/("""
<div class="alert-message warning">
    <strong>Gotowe!</strong> """),_display_(Seq[Any](/*44.31*/flash/*44.36*/.get("success"))),format.raw/*44.51*/("""
</div>
""")))})),format.raw/*46.2*/("""

<div id="actions">

    <form action=""""),_display_(Seq[Any](/*50.20*/link(0, "lastname"))),format.raw/*50.39*/("""" method="GET">
    <input type="search" id="searchbox" name="f" value=""""),_display_(Seq[Any](/*51.58*/currentFilter)),format.raw/*51.71*/("""" placeholder="Filtruj po nazwisku">
    <input type="submit" id="searchsubmit" value="Sortuj" class="btn primary">
    </form>

    <a class="btn success" id="add" href=""""),_display_(Seq[Any](/*55.44*/routes/*55.50*/.Players.create())),format.raw/*55.67*/("""">Dodaj piłkarza</a>

</div>

"""),_display_(Seq[Any](/*59.2*/if(currentPage.getTotalRowCount == 0)/*59.39*/ {_display_(Seq[Any](format.raw/*59.41*/("""

<div class="well">
    <em>Nie ma nic do wyświetlenia</em>
</div>

""")))}/*65.3*/else/*65.8*/{_display_(Seq[Any](format.raw/*65.9*/("""

<table class="computers zebra-striped">
    <thead>
    <tr>
        """),_display_(Seq[Any](/*70.10*/header("lastname", "Nazwisko"))),format.raw/*70.40*/("""
        """),_display_(Seq[Any](/*71.10*/header("firstname", "Imię"))),format.raw/*71.37*/("""
        """),_display_(Seq[Any](/*72.10*/header("team.name", "Zespół"))),format.raw/*72.39*/("""
        """),_display_(Seq[Any](/*73.10*/header("position", "Pozycja"))),format.raw/*73.39*/("""
        """),_display_(Seq[Any](/*74.10*/header("number", "Numer"))),format.raw/*74.35*/("""
    </tr>
    </thead>
    <tbody>

    """),_display_(Seq[Any](/*79.6*/for(player <- currentPage.getList) yield /*79.40*/ {_display_(Seq[Any](format.raw/*79.42*/("""
    <tr>
        <td><a href=""""),_display_(Seq[Any](/*81.23*/routes/*81.29*/.Players.edit(player.id))),format.raw/*81.53*/("""">"""),_display_(Seq[Any](/*81.56*/player/*81.62*/.lastname)),format.raw/*81.71*/("""</a></td>
        <td>
            """),_display_(Seq[Any](/*83.14*/if(player.firstname == null)/*83.42*/ {_display_(Seq[Any](format.raw/*83.44*/("""
            <em>-</em>
            """)))}/*85.15*/else/*85.20*/{_display_(Seq[Any](format.raw/*85.21*/("""
            """),_display_(Seq[Any](/*86.14*/player/*86.20*/.firstname)),format.raw/*86.30*/("""
            """)))})),format.raw/*87.14*/("""
        </td>
        <td>
            """),_display_(Seq[Any](/*90.14*/if(player.team == null)/*90.37*/ {_display_(Seq[Any](format.raw/*90.39*/("""
            <em>-</em>
            """)))}/*92.15*/else/*92.20*/{_display_(Seq[Any](format.raw/*92.21*/("""
            """),_display_(Seq[Any](/*93.14*/player/*93.20*/.team.name)),format.raw/*93.30*/("""
            """)))})),format.raw/*94.14*/("""
        </td>
        <td>
            """),_display_(Seq[Any](/*97.14*/if(player.position == null)/*97.41*/ {_display_(Seq[Any](format.raw/*97.43*/("""
            <em>-</em>
            """)))}/*99.15*/else/*99.20*/{_display_(Seq[Any](format.raw/*99.21*/("""
            """),_display_(Seq[Any](/*100.14*/player/*100.20*/.position)),format.raw/*100.29*/("""
            """)))})),format.raw/*101.14*/("""
        </td>
        <td>
            """),_display_(Seq[Any](/*104.14*/if(player.number == null)/*104.39*/ {_display_(Seq[Any](format.raw/*104.41*/("""
            <em>-</em>
            """)))}/*106.15*/else/*106.20*/{_display_(Seq[Any](format.raw/*106.21*/("""
            """),_display_(Seq[Any](/*107.14*/player/*107.20*/.number)),format.raw/*107.27*/("""
            """)))})),format.raw/*108.14*/("""
        </td>
    </tr>
    """)))})),format.raw/*111.6*/("""

    </tbody>
</table>

<div id="pagination" class="pagination">
    <ul>
        """),_display_(Seq[Any](/*118.10*/if(currentPage.hasPrev)/*118.33*/ {_display_(Seq[Any](format.raw/*118.35*/("""
        <li class="prev">
            <a href=""""),_display_(Seq[Any](/*120.23*/link(currentPage.getPageIndex - 1, null))),format.raw/*120.63*/("""">&larr; Poprzedni</a>
        </li>
        """)))}/*122.11*/else/*122.16*/{_display_(Seq[Any](format.raw/*122.17*/("""
        <li class="prev disabled">
            <a>&larr; Poprzedni</a>
        </li>
        """)))})),format.raw/*126.10*/("""
        <li class="current">
            <a>Wyświetla """),_display_(Seq[Any](/*128.27*/currentPage/*128.38*/.getDisplayXtoYofZ(" do "," z "))),format.raw/*128.70*/("""</a>
        </li>
        """),_display_(Seq[Any](/*130.10*/if(currentPage.hasNext)/*130.33*/ {_display_(Seq[Any](format.raw/*130.35*/("""
        <li class="next">
            <a href=""""),_display_(Seq[Any](/*132.23*/link(currentPage.getPageIndex + 1, null))),format.raw/*132.63*/("""">Następny &rarr;</a>
        </li>
        """)))}/*134.11*/else/*134.16*/{_display_(Seq[Any](format.raw/*134.17*/("""
        <li class="next disabled">
            <a>Następny &rarr;</a>
        </li>
        """)))})),format.raw/*138.10*/("""
    </ul>
</div>

""")))})),format.raw/*142.2*/("""

""")))})),format.raw/*144.2*/("""

            """))}
    }
    
    def render(currentPage:com.avaje.ebean.Page[Player],currentSortBy:String,currentOrder:String,currentFilter:String): play.api.templates.HtmlFormat.Appendable = apply(currentPage,currentSortBy,currentOrder,currentFilter)
    
    def f:((com.avaje.ebean.Page[Player],String,String,String) => play.api.templates.HtmlFormat.Appendable) = (currentPage,currentSortBy,currentOrder,currentFilter) => apply(currentPage,currentSortBy,currentOrder,currentFilter)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Jun 14 21:20:43 CEST 2014
                    SOURCE: D:/Pawlak/Play/test/app/views/players/list.scala.html
                    HASH: 117146d4db2a4e1ea3e341fd0df7efbd2f34e0b4
                    MATRIX: 824->1|1013->733|1027->739|1138->769|1188->783|1200->786|1239->803|1284->812|1318->838|1406->902|1456->916|1490->928|1529->931|1556->936|1592->246|1603->250|2000->112|2031->243|2060->616|2092->730|2121->950|2161->955|2174->960|2213->962|2273->986|2355->1046|2400->1056|2441->1088|2481->1090|2586->1159|2600->1164|2637->1179|2679->1190|2760->1235|2801->1254|2911->1328|2946->1341|3158->1517|3173->1523|3212->1540|3282->1575|3328->1612|3368->1614|3462->1691|3474->1696|3512->1697|3625->1774|3677->1804|3724->1815|3773->1842|3820->1853|3871->1882|3918->1893|3969->1922|4016->1933|4063->1958|4145->2005|4195->2039|4235->2041|4305->2075|4320->2081|4366->2105|4405->2108|4420->2114|4451->2123|4525->2161|4562->2189|4602->2191|4660->2231|4673->2236|4712->2237|4763->2252|4778->2258|4810->2268|4857->2283|4937->2327|4969->2350|5009->2352|5067->2392|5080->2397|5119->2398|5170->2413|5185->2419|5217->2429|5264->2444|5344->2488|5380->2515|5420->2517|5478->2557|5491->2562|5530->2563|5582->2578|5598->2584|5630->2593|5678->2608|5759->2652|5794->2677|5835->2679|5894->2719|5908->2724|5948->2725|6000->2740|6016->2746|6046->2753|6094->2768|6159->2801|6287->2892|6320->2915|6361->2917|6449->2968|6512->3008|6580->3057|6594->3062|6634->3063|6766->3162|6861->3220|6882->3231|6937->3263|7004->3293|7037->3316|7078->3318|7166->3369|7229->3409|7296->3457|7310->3462|7350->3463|7481->3561|7537->3585|7574->3590
                    LINES: 26->1|28->32|28->32|30->32|31->33|31->33|31->33|31->33|31->33|31->33|32->34|32->34|32->34|32->34|34->6|34->6|56->1|58->5|59->27|61->31|62->36|64->38|64->38|64->38|66->40|66->40|68->42|68->42|68->42|70->44|70->44|70->44|72->46|76->50|76->50|77->51|77->51|81->55|81->55|81->55|85->59|85->59|85->59|91->65|91->65|91->65|96->70|96->70|97->71|97->71|98->72|98->72|99->73|99->73|100->74|100->74|105->79|105->79|105->79|107->81|107->81|107->81|107->81|107->81|107->81|109->83|109->83|109->83|111->85|111->85|111->85|112->86|112->86|112->86|113->87|116->90|116->90|116->90|118->92|118->92|118->92|119->93|119->93|119->93|120->94|123->97|123->97|123->97|125->99|125->99|125->99|126->100|126->100|126->100|127->101|130->104|130->104|130->104|132->106|132->106|132->106|133->107|133->107|133->107|134->108|137->111|144->118|144->118|144->118|146->120|146->120|148->122|148->122|148->122|152->126|154->128|154->128|154->128|156->130|156->130|156->130|158->132|158->132|160->134|160->134|160->134|164->138|168->142|170->144
                    -- GENERATED --
                */
            