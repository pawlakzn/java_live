
package views.html.games

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
object list extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template4[com.avaje.ebean.Page[Game],String,String,String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(currentPage: com.avaje.ebean.Page[Game], currentSortBy: String, currentOrder: String, currentFilter: String):play.api.templates.HtmlFormat.Appendable = {
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
routes.Games.list(newPage, sortBy, order, currentFilter)

}};
Seq[Any](format.raw/*1.111*/("""

"""),format.raw/*5.42*/("""
"""),format.raw/*27.2*/("""

"""),format.raw/*31.37*/("""
"""),format.raw/*36.2*/("""

"""),_display_(Seq[Any](/*38.2*/main/*38.6*/ {_display_(Seq[Any](format.raw/*38.8*/("""

<h1 id="homeTitle">"""),_display_(Seq[Any](/*40.21*/Messages("games.list.title", currentPage.getTotalRowCount))),format.raw/*40.79*/("""</h1>

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

    <a class="btn success" id="add" href=""""),_display_(Seq[Any](/*55.44*/routes/*55.50*/.Games.create())),format.raw/*55.65*/("""">Dodaj rozgrywki</a>

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
        <th>Sezon</th>

    </tr>
    </thead>
    <tbody>

    """),_display_(Seq[Any](/*77.6*/for(game <- currentPage.getList) yield /*77.38*/ {_display_(Seq[Any](format.raw/*77.40*/("""
    <tr>
        <td><a href=""""),_display_(Seq[Any](/*79.23*/routes/*79.29*/.Games.edit(game.id))),format.raw/*79.49*/("""">"""),_display_(Seq[Any](/*79.52*/game/*79.56*/.name)),format.raw/*79.61*/("""</a></td>
        <td>
            """),_display_(Seq[Any](/*81.14*/if(game.season == null)/*81.37*/ {_display_(Seq[Any](format.raw/*81.39*/("""
            <em>-</em>
            """)))}/*83.15*/else/*83.20*/{_display_(Seq[Any](format.raw/*83.21*/("""
            """),_display_(Seq[Any](/*84.14*/game/*84.18*/.season.year_start.date.format("YYYY"))),format.raw/*84.56*/("""/"""),_display_(Seq[Any](/*84.58*/game/*84.62*/.season.year_end.date.format("YYYY"))),format.raw/*84.98*/("""
            """)))})),format.raw/*85.14*/("""
        </td>
     </tr>
    """)))})),format.raw/*88.6*/("""

    </tbody>
</table>

<div id="pagination" class="pagination">
    <ul>
        """),_display_(Seq[Any](/*95.10*/if(currentPage.hasPrev)/*95.33*/ {_display_(Seq[Any](format.raw/*95.35*/("""
        <li class="prev">
            <a href=""""),_display_(Seq[Any](/*97.23*/link(currentPage.getPageIndex - 1, null))),format.raw/*97.63*/("""">&larr; Poprzedni</a>
        </li>
        """)))}/*99.11*/else/*99.16*/{_display_(Seq[Any](format.raw/*99.17*/("""
        <li class="prev disabled">
            <a>&larr; Poprzedni</a>
        </li>
        """)))})),format.raw/*103.10*/("""
        <li class="current">
            <a>Wyświetla """),_display_(Seq[Any](/*105.27*/currentPage/*105.38*/.getDisplayXtoYofZ(" do "," z "))),format.raw/*105.70*/("""</a>
        </li>
        """),_display_(Seq[Any](/*107.10*/if(currentPage.hasNext)/*107.33*/ {_display_(Seq[Any](format.raw/*107.35*/("""
        <li class="next">
            <a href=""""),_display_(Seq[Any](/*109.23*/link(currentPage.getPageIndex + 1, null))),format.raw/*109.63*/("""">Następny &rarr;</a>
        </li>
        """)))}/*111.11*/else/*111.16*/{_display_(Seq[Any](format.raw/*111.17*/("""
        <li class="next disabled">
            <a>Następny &rarr;</a>
        </li>
        """)))})),format.raw/*115.10*/("""
    </ul>
</div>

""")))})),format.raw/*119.2*/("""

""")))})),format.raw/*121.2*/("""

            """))}
    }
    
    def render(currentPage:com.avaje.ebean.Page[Game],currentSortBy:String,currentOrder:String,currentFilter:String): play.api.templates.HtmlFormat.Appendable = apply(currentPage,currentSortBy,currentOrder,currentFilter)
    
    def f:((com.avaje.ebean.Page[Game],String,String,String) => play.api.templates.HtmlFormat.Appendable) = (currentPage,currentSortBy,currentOrder,currentFilter) => apply(currentPage,currentSortBy,currentOrder,currentFilter)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Jun 15 23:09:49 CEST 2014
                    SOURCE: D:/Pawlak/Play/live/app/views/games/list.scala.html
                    HASH: 4a2489f51cca87e166a3846143a5b15e30590606
                    MATRIX: 820->1|1007->729|1021->735|1132->765|1182->779|1194->782|1233->799|1278->808|1312->834|1400->898|1450->912|1484->924|1523->927|1550->932|1586->244|1597->248|1992->110|2023->241|2052->612|2084->726|2113->946|2153->951|2165->955|2204->957|2264->981|2344->1039|2389->1049|2430->1081|2470->1083|2575->1152|2589->1157|2626->1172|2668->1183|2749->1228|2786->1243|2896->1317|2931->1330|3141->1504|3156->1510|3193->1525|3264->1561|3310->1598|3350->1600|3444->1677|3456->1682|3494->1683|3607->1760|3652->1783|3760->1856|3808->1888|3848->1890|3918->1924|3933->1930|3975->1950|4014->1953|4027->1957|4054->1962|4128->2000|4160->2023|4200->2025|4258->2065|4271->2070|4310->2071|4361->2086|4374->2090|4434->2128|4472->2130|4485->2134|4543->2170|4590->2185|4655->2219|4782->2310|4814->2333|4854->2335|4941->2386|5003->2426|5070->2475|5083->2480|5122->2481|5254->2580|5349->2638|5370->2649|5425->2681|5492->2711|5525->2734|5566->2736|5654->2787|5717->2827|5784->2875|5798->2880|5838->2881|5969->2979|6025->3003|6062->3008
                    LINES: 26->1|28->32|28->32|30->32|31->33|31->33|31->33|31->33|31->33|31->33|32->34|32->34|32->34|32->34|34->6|34->6|56->1|58->5|59->27|61->31|62->36|64->38|64->38|64->38|66->40|66->40|68->42|68->42|68->42|70->44|70->44|70->44|72->46|76->50|76->50|77->51|77->51|81->55|81->55|81->55|85->59|85->59|85->59|91->65|91->65|91->65|96->70|96->70|103->77|103->77|103->77|105->79|105->79|105->79|105->79|105->79|105->79|107->81|107->81|107->81|109->83|109->83|109->83|110->84|110->84|110->84|110->84|110->84|110->84|111->85|114->88|121->95|121->95|121->95|123->97|123->97|125->99|125->99|125->99|129->103|131->105|131->105|131->105|133->107|133->107|133->107|135->109|135->109|137->111|137->111|137->111|141->115|145->119|147->121
                    -- GENERATED --
                */
            