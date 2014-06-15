
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

"""),_display_(Seq[Any](/*38.2*/main/*38.6*/ {_display_(Seq[Any](format.raw/*38.8*/("""

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
                    DATE: Sun Jun 15 10:01:06 CEST 2014
                    SOURCE: D:/Pawlak/Play/live/app/views/players/list.scala.html
                    HASH: 9e8095e76bc2addbb0196e9708677faa58e327c3
                    MATRIX: 824->1|1013->733|1027->739|1138->769|1188->783|1200->786|1239->803|1284->812|1318->838|1406->902|1456->916|1490->928|1529->931|1556->936|1592->246|1603->250|2000->112|2031->243|2060->616|2092->730|2121->950|2161->955|2173->959|2212->961|2272->985|2354->1045|2399->1055|2440->1087|2480->1089|2585->1158|2599->1163|2636->1178|2678->1189|2759->1234|2800->1253|2910->1327|2945->1340|3157->1516|3172->1522|3211->1539|3281->1574|3327->1611|3367->1613|3461->1690|3473->1695|3511->1696|3624->1773|3676->1803|3723->1814|3772->1841|3819->1852|3870->1881|3917->1892|3968->1921|4015->1932|4062->1957|4144->2004|4194->2038|4234->2040|4304->2074|4319->2080|4365->2104|4404->2107|4419->2113|4450->2122|4524->2160|4561->2188|4601->2190|4659->2230|4672->2235|4711->2236|4762->2251|4777->2257|4809->2267|4856->2282|4936->2326|4968->2349|5008->2351|5066->2391|5079->2396|5118->2397|5169->2412|5184->2418|5216->2428|5263->2443|5343->2487|5379->2514|5419->2516|5477->2556|5490->2561|5529->2562|5581->2577|5597->2583|5629->2592|5677->2607|5758->2651|5793->2676|5834->2678|5893->2718|5907->2723|5947->2724|5999->2739|6015->2745|6045->2752|6093->2767|6158->2800|6286->2891|6319->2914|6360->2916|6448->2967|6511->3007|6579->3056|6593->3061|6633->3062|6765->3161|6860->3219|6881->3230|6936->3262|7003->3292|7036->3315|7077->3317|7165->3368|7228->3408|7295->3456|7309->3461|7349->3462|7480->3560|7536->3584|7573->3589
                    LINES: 26->1|28->32|28->32|30->32|31->33|31->33|31->33|31->33|31->33|31->33|32->34|32->34|32->34|32->34|34->6|34->6|56->1|58->5|59->27|61->31|62->36|64->38|64->38|64->38|66->40|66->40|68->42|68->42|68->42|70->44|70->44|70->44|72->46|76->50|76->50|77->51|77->51|81->55|81->55|81->55|85->59|85->59|85->59|91->65|91->65|91->65|96->70|96->70|97->71|97->71|98->72|98->72|99->73|99->73|100->74|100->74|105->79|105->79|105->79|107->81|107->81|107->81|107->81|107->81|107->81|109->83|109->83|109->83|111->85|111->85|111->85|112->86|112->86|112->86|113->87|116->90|116->90|116->90|118->92|118->92|118->92|119->93|119->93|119->93|120->94|123->97|123->97|123->97|125->99|125->99|125->99|126->100|126->100|126->100|127->101|130->104|130->104|130->104|132->106|132->106|132->106|133->107|133->107|133->107|134->108|137->111|144->118|144->118|144->118|146->120|146->120|148->122|148->122|148->122|152->126|154->128|154->128|154->128|156->130|156->130|156->130|158->132|158->132|160->134|160->134|160->134|164->138|168->142|170->144
                    -- GENERATED --
                */
            