
package views.html.videos

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
object list extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template4[com.avaje.ebean.Page[Video],String,String,String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(currentPage: com.avaje.ebean.Page[Video], currentSortBy: String, currentOrder: String, currentFilter: String):play.api.templates.HtmlFormat.Appendable = {
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
routes.Videos.list(newPage, sortBy, order, currentFilter)

}};
Seq[Any](format.raw/*1.112*/("""

"""),format.raw/*5.42*/("""
"""),format.raw/*27.2*/("""

"""),format.raw/*31.37*/("""
"""),format.raw/*36.2*/("""

"""),_display_(Seq[Any](/*38.2*/main/*38.6*/ {_display_(Seq[Any](format.raw/*38.8*/("""

<h1 id="homeTitle">"""),_display_(Seq[Any](/*40.21*/Messages("videos.list.title", currentPage.getTotalRowCount))),format.raw/*40.80*/("""</h1>

"""),_display_(Seq[Any](/*42.2*/if(flash.containsKey("success"))/*42.34*/ {_display_(Seq[Any](format.raw/*42.36*/("""
<div class="alert-message warning">
    <strong>Gotowe!</strong> """),_display_(Seq[Any](/*44.31*/flash/*44.36*/.get("success"))),format.raw/*44.51*/("""
</div>
""")))})),format.raw/*46.2*/("""

<div id="actions">

    <form action=""""),_display_(Seq[Any](/*50.20*/link(0, "name"))),format.raw/*50.35*/("""" method="GET">
    <input type="search" id="searchbox" name="f" value=""""),_display_(Seq[Any](/*51.58*/currentFilter)),format.raw/*51.71*/("""" placeholder="Filtruj po nazwie">
    <input type="submit" id="searchsubmit" value="Sortuj" class="btn primary">
    </form>

    <a class="btn success" id="add" href=""""),_display_(Seq[Any](/*55.44*/routes/*55.50*/.Videos.create())),format.raw/*55.66*/("""">Dodaj wideo</a>

</div>

"""),_display_(Seq[Any](/*59.2*/if(currentPage.getTotalRowCount == 0)/*59.39*/ {_display_(Seq[Any](format.raw/*59.41*/("""

<div class="well">
    <em>Nie ma nic do wyświetlenia</em>
</div>

""")))}/*65.3*/else/*65.8*/{_display_(Seq[Any](format.raw/*65.9*/("""

<table class="computers zebra-striped">
    <thead>
    <tr>
        """),_display_(Seq[Any](/*70.10*/header("name", "Nazwa"))),format.raw/*70.33*/("""
        <th>Mecz</th>
    </tr>
    </thead>
    <tbody>

    """),_display_(Seq[Any](/*76.6*/for(video <- currentPage.getList) yield /*76.39*/ {_display_(Seq[Any](format.raw/*76.41*/("""
    <tr>
        <td><a href=""""),_display_(Seq[Any](/*78.23*/routes/*78.29*/.Videos.edit(video.id))),format.raw/*78.51*/("""">"""),_display_(Seq[Any](/*78.54*/video/*78.59*/.name)),format.raw/*78.64*/("""</a></td>
        <td>
            """),_display_(Seq[Any](/*80.14*/if(video.vmatch == null)/*80.38*/ {_display_(Seq[Any](format.raw/*80.40*/("""
            <em>-</em>
            """)))}/*82.15*/else/*82.20*/{_display_(Seq[Any](format.raw/*82.21*/("""
            """),_display_(Seq[Any](/*83.14*/video/*83.19*/.vmatch.team1.name)),format.raw/*83.37*/(""" - """),_display_(Seq[Any](/*83.41*/video/*83.46*/.vmatch.team2.name)),format.raw/*83.64*/("""
            """)))})),format.raw/*84.14*/("""
        </td>
    </tr>
    """)))})),format.raw/*87.6*/("""

    </tbody>
</table>

<div id="pagination" class="pagination">
    <ul>
        """),_display_(Seq[Any](/*94.10*/if(currentPage.hasPrev)/*94.33*/ {_display_(Seq[Any](format.raw/*94.35*/("""
        <li class="prev">
            <a href=""""),_display_(Seq[Any](/*96.23*/link(currentPage.getPageIndex - 1, null))),format.raw/*96.63*/("""">&larr; Poprzedni</a>
        </li>
        """)))}/*98.11*/else/*98.16*/{_display_(Seq[Any](format.raw/*98.17*/("""
        <li class="prev disabled">
            <a>&larr; Poprzedni</a>
        </li>
        """)))})),format.raw/*102.10*/("""
        <li class="current">
            <a>Wyświetla """),_display_(Seq[Any](/*104.27*/currentPage/*104.38*/.getDisplayXtoYofZ(" do "," z "))),format.raw/*104.70*/("""</a>
        </li>
        """),_display_(Seq[Any](/*106.10*/if(currentPage.hasNext)/*106.33*/ {_display_(Seq[Any](format.raw/*106.35*/("""
        <li class="next">
            <a href=""""),_display_(Seq[Any](/*108.23*/link(currentPage.getPageIndex + 1, null))),format.raw/*108.63*/("""">Następny &rarr;</a>
        </li>
        """)))}/*110.11*/else/*110.16*/{_display_(Seq[Any](format.raw/*110.17*/("""
        <li class="next disabled">
            <a>Następny &rarr;</a>
        </li>
        """)))})),format.raw/*114.10*/("""
    </ul>
</div>

""")))})),format.raw/*118.2*/("""

""")))})),format.raw/*120.2*/("""

            """))}
    }
    
    def render(currentPage:com.avaje.ebean.Page[Video],currentSortBy:String,currentOrder:String,currentFilter:String): play.api.templates.HtmlFormat.Appendable = apply(currentPage,currentSortBy,currentOrder,currentFilter)
    
    def f:((com.avaje.ebean.Page[Video],String,String,String) => play.api.templates.HtmlFormat.Appendable) = (currentPage,currentSortBy,currentOrder,currentFilter) => apply(currentPage,currentSortBy,currentOrder,currentFilter)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Jun 15 23:26:22 CEST 2014
                    SOURCE: D:/Pawlak/Play/live/app/views/videos/list.scala.html
                    HASH: bba71c9300c70bd0448fd34d1b8ede1486a1146d
                    MATRIX: 822->1|1010->731|1024->737|1135->767|1185->781|1197->784|1236->801|1281->810|1315->836|1403->900|1453->914|1487->926|1526->929|1553->934|1589->245|1600->249|1996->111|2027->242|2056->614|2088->728|2117->948|2157->953|2169->957|2208->959|2268->983|2349->1042|2394->1052|2435->1084|2475->1086|2580->1155|2594->1160|2631->1175|2673->1186|2754->1231|2791->1246|2901->1320|2936->1333|3146->1507|3161->1513|3199->1529|3266->1561|3312->1598|3352->1600|3446->1677|3458->1682|3496->1683|3609->1760|3654->1783|3759->1853|3808->1886|3848->1888|3918->1922|3933->1928|3977->1950|4016->1953|4030->1958|4057->1963|4131->2001|4164->2025|4204->2027|4262->2067|4275->2072|4314->2073|4365->2088|4379->2093|4419->2111|4459->2115|4473->2120|4513->2138|4560->2153|4624->2186|4751->2277|4783->2300|4823->2302|4910->2353|4972->2393|5039->2442|5052->2447|5091->2448|5223->2547|5318->2605|5339->2616|5394->2648|5461->2678|5494->2701|5535->2703|5623->2754|5686->2794|5753->2842|5767->2847|5807->2848|5938->2946|5994->2970|6031->2975
                    LINES: 26->1|28->32|28->32|30->32|31->33|31->33|31->33|31->33|31->33|31->33|32->34|32->34|32->34|32->34|34->6|34->6|56->1|58->5|59->27|61->31|62->36|64->38|64->38|64->38|66->40|66->40|68->42|68->42|68->42|70->44|70->44|70->44|72->46|76->50|76->50|77->51|77->51|81->55|81->55|81->55|85->59|85->59|85->59|91->65|91->65|91->65|96->70|96->70|102->76|102->76|102->76|104->78|104->78|104->78|104->78|104->78|104->78|106->80|106->80|106->80|108->82|108->82|108->82|109->83|109->83|109->83|109->83|109->83|109->83|110->84|113->87|120->94|120->94|120->94|122->96|122->96|124->98|124->98|124->98|128->102|130->104|130->104|130->104|132->106|132->106|132->106|134->108|134->108|136->110|136->110|136->110|140->114|144->118|146->120
                    -- GENERATED --
                */
            