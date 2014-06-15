
package views.html.referees

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
object list extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template4[com.avaje.ebean.Page[Referee],String,String,String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(currentPage: com.avaje.ebean.Page[Referee], currentSortBy: String, currentOrder: String, currentFilter: String):play.api.templates.HtmlFormat.Appendable = {
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
routes.Referees.list(newPage, sortBy, order, currentFilter)

}};
Seq[Any](format.raw/*1.114*/("""

"""),format.raw/*5.42*/("""
"""),format.raw/*27.2*/("""

"""),format.raw/*31.37*/("""
"""),format.raw/*36.2*/("""

"""),_display_(Seq[Any](/*38.2*/main/*38.6*/ {_display_(Seq[Any](format.raw/*38.8*/("""

<h1 id="homeTitle">"""),_display_(Seq[Any](/*40.21*/Messages("referees.list.title", currentPage.getTotalRowCount))),format.raw/*40.82*/("""</h1>

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

    <a class="btn success" id="add" href=""""),_display_(Seq[Any](/*55.44*/routes/*55.50*/.Referees.create())),format.raw/*55.68*/("""">Dodaj sędziego</a>

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
        """),_display_(Seq[Any](/*72.10*/header("city", "Miasto"))),format.raw/*72.34*/("""
    </tr>
    </thead>
    <tbody>

    """),_display_(Seq[Any](/*77.6*/for(referee <- currentPage.getList) yield /*77.41*/ {_display_(Seq[Any](format.raw/*77.43*/("""
    <tr>
        <td><a href=""""),_display_(Seq[Any](/*79.23*/routes/*79.29*/.Referees.edit(referee.id))),format.raw/*79.55*/("""">"""),_display_(Seq[Any](/*79.58*/referee/*79.65*/.lastname)),format.raw/*79.74*/("""</a></td>
        <td>
            """),_display_(Seq[Any](/*81.14*/if(referee.firstname == null)/*81.43*/ {_display_(Seq[Any](format.raw/*81.45*/("""
            <em>-</em>
            """)))}/*83.15*/else/*83.20*/{_display_(Seq[Any](format.raw/*83.21*/("""
            """),_display_(Seq[Any](/*84.14*/referee/*84.21*/.firstname)),format.raw/*84.31*/("""
            """)))})),format.raw/*85.14*/("""
        </td>
        <td>
            """),_display_(Seq[Any](/*88.14*/if(referee.city == null)/*88.38*/ {_display_(Seq[Any](format.raw/*88.40*/("""
            <em>-</em>
            """)))}/*90.15*/else/*90.20*/{_display_(Seq[Any](format.raw/*90.21*/("""
            """),_display_(Seq[Any](/*91.14*/referee/*91.21*/.city)),format.raw/*91.26*/("""
            """)))})),format.raw/*92.14*/("""
        </td>
    </tr>
    """)))})),format.raw/*95.6*/("""

    </tbody>
</table>

<div id="pagination" class="pagination">
    <ul>
        """),_display_(Seq[Any](/*102.10*/if(currentPage.hasPrev)/*102.33*/ {_display_(Seq[Any](format.raw/*102.35*/("""
        <li class="prev">
            <a href=""""),_display_(Seq[Any](/*104.23*/link(currentPage.getPageIndex - 1, null))),format.raw/*104.63*/("""">&larr; Poprzedni</a>
        </li>
        """)))}/*106.11*/else/*106.16*/{_display_(Seq[Any](format.raw/*106.17*/("""
        <li class="prev disabled">
            <a>&larr; Poprzedni</a>
        </li>
        """)))})),format.raw/*110.10*/("""
        <li class="current">
            <a>Wyświetla """),_display_(Seq[Any](/*112.27*/currentPage/*112.38*/.getDisplayXtoYofZ(" do "," z "))),format.raw/*112.70*/("""</a>
        </li>
        """),_display_(Seq[Any](/*114.10*/if(currentPage.hasNext)/*114.33*/ {_display_(Seq[Any](format.raw/*114.35*/("""
        <li class="next">
            <a href=""""),_display_(Seq[Any](/*116.23*/link(currentPage.getPageIndex + 1, null))),format.raw/*116.63*/("""">Następny &rarr;</a>
        </li>
        """)))}/*118.11*/else/*118.16*/{_display_(Seq[Any](format.raw/*118.17*/("""
        <li class="next disabled">
            <a>Następny &rarr;</a>
        </li>
        """)))})),format.raw/*122.10*/("""
    </ul>
</div>

""")))})),format.raw/*126.2*/("""

""")))})),format.raw/*128.2*/("""

            """))}
    }
    
    def render(currentPage:com.avaje.ebean.Page[Referee],currentSortBy:String,currentOrder:String,currentFilter:String): play.api.templates.HtmlFormat.Appendable = apply(currentPage,currentSortBy,currentOrder,currentFilter)
    
    def f:((com.avaje.ebean.Page[Referee],String,String,String) => play.api.templates.HtmlFormat.Appendable) = (currentPage,currentSortBy,currentOrder,currentFilter) => apply(currentPage,currentSortBy,currentOrder,currentFilter)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Jun 15 23:09:50 CEST 2014
                    SOURCE: D:/Pawlak/Play/live/app/views/referees/list.scala.html
                    HASH: 97a87143b5a22b99825969c0f726f35fde6de355
                    MATRIX: 826->1|1016->735|1030->741|1141->771|1191->785|1203->788|1242->805|1287->814|1321->840|1409->904|1459->918|1493->930|1532->933|1559->938|1595->247|1606->251|2004->113|2035->244|2064->618|2096->732|2125->952|2165->957|2177->961|2216->963|2276->987|2359->1048|2404->1058|2445->1090|2485->1092|2590->1161|2604->1166|2641->1181|2683->1192|2764->1237|2805->1256|2915->1330|2950->1343|3162->1519|3177->1525|3217->1543|3287->1578|3333->1615|3373->1617|3467->1694|3479->1699|3517->1700|3630->1777|3682->1807|3729->1818|3778->1845|3825->1856|3871->1880|3953->1927|4004->1962|4044->1964|4114->1998|4129->2004|4177->2030|4216->2033|4232->2040|4263->2049|4337->2087|4375->2116|4415->2118|4473->2158|4486->2163|4525->2164|4576->2179|4592->2186|4624->2196|4671->2211|4751->2255|4784->2279|4824->2281|4882->2321|4895->2326|4934->2327|4985->2342|5001->2349|5028->2354|5075->2369|5139->2402|5267->2493|5300->2516|5341->2518|5429->2569|5492->2609|5560->2658|5574->2663|5614->2664|5746->2763|5841->2821|5862->2832|5917->2864|5984->2894|6017->2917|6058->2919|6146->2970|6209->3010|6276->3058|6290->3063|6330->3064|6461->3162|6517->3186|6554->3191
                    LINES: 26->1|28->32|28->32|30->32|31->33|31->33|31->33|31->33|31->33|31->33|32->34|32->34|32->34|32->34|34->6|34->6|56->1|58->5|59->27|61->31|62->36|64->38|64->38|64->38|66->40|66->40|68->42|68->42|68->42|70->44|70->44|70->44|72->46|76->50|76->50|77->51|77->51|81->55|81->55|81->55|85->59|85->59|85->59|91->65|91->65|91->65|96->70|96->70|97->71|97->71|98->72|98->72|103->77|103->77|103->77|105->79|105->79|105->79|105->79|105->79|105->79|107->81|107->81|107->81|109->83|109->83|109->83|110->84|110->84|110->84|111->85|114->88|114->88|114->88|116->90|116->90|116->90|117->91|117->91|117->91|118->92|121->95|128->102|128->102|128->102|130->104|130->104|132->106|132->106|132->106|136->110|138->112|138->112|138->112|140->114|140->114|140->114|142->116|142->116|144->118|144->118|144->118|148->122|152->126|154->128
                    -- GENERATED --
                */
            