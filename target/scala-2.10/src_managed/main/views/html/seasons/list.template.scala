
package views.html.seasons

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
object list extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template4[com.avaje.ebean.Page[Season],String,String,String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(currentPage: com.avaje.ebean.Page[Season], currentSortBy: String, currentOrder: String, currentFilter: String):play.api.templates.HtmlFormat.Appendable = {
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
routes.Seasons.list(newPage, sortBy, order, currentFilter)

}};
Seq[Any](format.raw/*1.113*/("""

"""),format.raw/*5.42*/("""
"""),format.raw/*27.2*/("""

"""),format.raw/*31.37*/("""
"""),format.raw/*36.2*/("""

"""),_display_(Seq[Any](/*38.2*/panel/*38.7*/ {_display_(Seq[Any](format.raw/*38.9*/("""

<h1 id="homeTitle">"""),_display_(Seq[Any](/*40.21*/Messages("seasons.list.title", currentPage.getTotalRowCount))),format.raw/*40.81*/("""</h1>

"""),_display_(Seq[Any](/*42.2*/if(flash.containsKey("success"))/*42.34*/ {_display_(Seq[Any](format.raw/*42.36*/("""
<div class="alert-message warning">
    <strong>Gotowe!</strong> """),_display_(Seq[Any](/*44.31*/flash/*44.36*/.get("success"))),format.raw/*44.51*/("""
</div>
""")))})),format.raw/*46.2*/("""

<div id="actions">

    <form action=""""),_display_(Seq[Any](/*50.20*/link(0, "year_start"))),format.raw/*50.41*/("""" method="GET">
    <input type="search" id="searchbox" name="f" value=""""),_display_(Seq[Any](/*51.58*/currentFilter)),format.raw/*51.71*/("""" placeholder="Filtruj po rozpoczęciu">
    <input type="submit" id="searchsubmit" value="Sortuj" class="btn primary">
    </form>

    <a class="btn success" id="add" href=""""),_display_(Seq[Any](/*55.44*/routes/*55.50*/.Seasons.create())),format.raw/*55.67*/("""">Dodaj sezon</a>

</div>

"""),_display_(Seq[Any](/*59.2*/if(currentPage.getTotalRowCount == 0)/*59.39*/ {_display_(Seq[Any](format.raw/*59.41*/("""

<div class="well">
    <em>Nie ma nic do wyświetlenia</em>
</div>

""")))}/*65.3*/else/*65.8*/{_display_(Seq[Any](format.raw/*65.9*/("""

<table class="computers zebra-striped">
    <thead>
    <tr>
        """),_display_(Seq[Any](/*70.10*/header("year_start", "Rok rozpoczęcia"))),format.raw/*70.49*/("""
        """),_display_(Seq[Any](/*71.10*/header("year_end", "Rok zakończenia"))),format.raw/*71.47*/("""
    </tr>
    </thead>
    <tbody>

    """),_display_(Seq[Any](/*76.6*/for(season <- currentPage.getList) yield /*76.40*/ {_display_(Seq[Any](format.raw/*76.42*/("""
    <tr>
        <td><a href=""""),_display_(Seq[Any](/*78.23*/routes/*78.29*/.Seasons.edit(season.id))),format.raw/*78.53*/("""">"""),_display_(Seq[Any](/*78.56*/season/*78.62*/.year_start.date.format("YYYY"))),format.raw/*78.93*/("""</a></td>
        <td>
            """),_display_(Seq[Any](/*80.14*/if(season.year_end == null)/*80.41*/ {_display_(Seq[Any](format.raw/*80.43*/("""
            <em>-</em>
            """)))}/*82.15*/else/*82.20*/{_display_(Seq[Any](format.raw/*82.21*/("""
            """),_display_(Seq[Any](/*83.14*/season/*83.20*/.year_end.date.format("YYYY"))),format.raw/*83.49*/("""
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
    
    def render(currentPage:com.avaje.ebean.Page[Season],currentSortBy:String,currentOrder:String,currentFilter:String): play.api.templates.HtmlFormat.Appendable = apply(currentPage,currentSortBy,currentOrder,currentFilter)
    
    def f:((com.avaje.ebean.Page[Season],String,String,String) => play.api.templates.HtmlFormat.Appendable) = (currentPage,currentSortBy,currentOrder,currentFilter) => apply(currentPage,currentSortBy,currentOrder,currentFilter)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Jun 14 21:20:43 CEST 2014
                    SOURCE: D:/Pawlak/Play/test/app/views/seasons/list.scala.html
                    HASH: 2e0a98ac42a7747a578b0a63467c3dc5114c735b
                    MATRIX: 824->1|1013->733|1027->739|1138->769|1188->783|1200->786|1239->803|1284->812|1318->838|1406->902|1456->916|1490->928|1529->931|1556->936|1592->246|1603->250|2000->112|2031->243|2060->616|2092->730|2121->950|2161->955|2174->960|2213->962|2273->986|2355->1046|2400->1056|2441->1088|2481->1090|2586->1159|2600->1164|2637->1179|2679->1190|2760->1235|2803->1256|2913->1330|2948->1343|3163->1522|3178->1528|3217->1545|3284->1577|3330->1614|3370->1616|3464->1693|3476->1698|3514->1699|3627->1776|3688->1815|3735->1826|3794->1863|3876->1910|3926->1944|3966->1946|4036->1980|4051->1986|4097->2010|4136->2013|4151->2019|4204->2050|4278->2088|4314->2115|4354->2117|4412->2157|4425->2162|4464->2163|4515->2178|4530->2184|4581->2213|4628->2228|4692->2261|4819->2352|4851->2375|4891->2377|4978->2428|5040->2468|5107->2517|5120->2522|5159->2523|5291->2622|5386->2680|5407->2691|5462->2723|5529->2753|5562->2776|5603->2778|5691->2829|5754->2869|5821->2917|5835->2922|5875->2923|6006->3021|6062->3045|6099->3050
                    LINES: 26->1|28->32|28->32|30->32|31->33|31->33|31->33|31->33|31->33|31->33|32->34|32->34|32->34|32->34|34->6|34->6|56->1|58->5|59->27|61->31|62->36|64->38|64->38|64->38|66->40|66->40|68->42|68->42|68->42|70->44|70->44|70->44|72->46|76->50|76->50|77->51|77->51|81->55|81->55|81->55|85->59|85->59|85->59|91->65|91->65|91->65|96->70|96->70|97->71|97->71|102->76|102->76|102->76|104->78|104->78|104->78|104->78|104->78|104->78|106->80|106->80|106->80|108->82|108->82|108->82|109->83|109->83|109->83|110->84|113->87|120->94|120->94|120->94|122->96|122->96|124->98|124->98|124->98|128->102|130->104|130->104|130->104|132->106|132->106|132->106|134->108|134->108|136->110|136->110|136->110|140->114|144->118|146->120
                    -- GENERATED --
                */
            