
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

"""),_display_(Seq[Any](/*38.2*/panel/*38.7*/ {_display_(Seq[Any](format.raw/*38.9*/("""

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
                    DATE: Sat Jun 14 21:20:43 CEST 2014
                    SOURCE: D:/Pawlak/Play/test/app/views/referees/list.scala.html
                    HASH: 1acdbc1a4b644f283027b33d33c1b12c6c2b3dca
                    MATRIX: 826->1|1016->735|1030->741|1141->771|1191->785|1203->788|1242->805|1287->814|1321->840|1409->904|1459->918|1493->930|1532->933|1559->938|1595->247|1606->251|2004->113|2035->244|2064->618|2096->732|2125->952|2165->957|2178->962|2217->964|2277->988|2360->1049|2405->1059|2446->1091|2486->1093|2591->1162|2605->1167|2642->1182|2684->1193|2765->1238|2806->1257|2916->1331|2951->1344|3163->1520|3178->1526|3218->1544|3288->1579|3334->1616|3374->1618|3468->1695|3480->1700|3518->1701|3631->1778|3683->1808|3730->1819|3779->1846|3826->1857|3872->1881|3954->1928|4005->1963|4045->1965|4115->1999|4130->2005|4178->2031|4217->2034|4233->2041|4264->2050|4338->2088|4376->2117|4416->2119|4474->2159|4487->2164|4526->2165|4577->2180|4593->2187|4625->2197|4672->2212|4752->2256|4785->2280|4825->2282|4883->2322|4896->2327|4935->2328|4986->2343|5002->2350|5029->2355|5076->2370|5140->2403|5268->2494|5301->2517|5342->2519|5430->2570|5493->2610|5561->2659|5575->2664|5615->2665|5747->2764|5842->2822|5863->2833|5918->2865|5985->2895|6018->2918|6059->2920|6147->2971|6210->3011|6277->3059|6291->3064|6331->3065|6462->3163|6518->3187|6555->3192
                    LINES: 26->1|28->32|28->32|30->32|31->33|31->33|31->33|31->33|31->33|31->33|32->34|32->34|32->34|32->34|34->6|34->6|56->1|58->5|59->27|61->31|62->36|64->38|64->38|64->38|66->40|66->40|68->42|68->42|68->42|70->44|70->44|70->44|72->46|76->50|76->50|77->51|77->51|81->55|81->55|81->55|85->59|85->59|85->59|91->65|91->65|91->65|96->70|96->70|97->71|97->71|98->72|98->72|103->77|103->77|103->77|105->79|105->79|105->79|105->79|105->79|105->79|107->81|107->81|107->81|109->83|109->83|109->83|110->84|110->84|110->84|111->85|114->88|114->88|114->88|116->90|116->90|116->90|117->91|117->91|117->91|118->92|121->95|128->102|128->102|128->102|130->104|130->104|132->106|132->106|132->106|136->110|138->112|138->112|138->112|140->114|140->114|140->114|142->116|142->116|144->118|144->118|144->118|148->122|152->126|154->128
                    -- GENERATED --
                */
            