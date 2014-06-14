
package views.html.users

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
object list extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template4[com.avaje.ebean.Page[User],String,String,String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(currentPage: com.avaje.ebean.Page[User], currentSortBy: String, currentOrder: String, currentFilter: String):play.api.templates.HtmlFormat.Appendable = {
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
routes.Users.list(newPage, sortBy, order, currentFilter)

}};
Seq[Any](format.raw/*1.111*/("""

"""),format.raw/*5.42*/("""
"""),format.raw/*27.2*/("""

"""),format.raw/*31.37*/("""
"""),format.raw/*36.2*/("""

"""),_display_(Seq[Any](/*38.2*/panel/*38.7*/ {_display_(Seq[Any](format.raw/*38.9*/("""

<h1 id="homeTitle">"""),_display_(Seq[Any](/*40.21*/Messages("users.list.title", currentPage.getTotalRowCount))),format.raw/*40.79*/("""</h1>

"""),_display_(Seq[Any](/*42.2*/if(flash.containsKey("success"))/*42.34*/ {_display_(Seq[Any](format.raw/*42.36*/("""
<div class="alert-message warning">
    <strong>Gotowe!</strong> """),_display_(Seq[Any](/*44.31*/flash/*44.36*/.get("success"))),format.raw/*44.51*/("""
</div>
""")))})),format.raw/*46.2*/("""

<div id="actions">

    <form action=""""),_display_(Seq[Any](/*50.20*/link(0, "login"))),format.raw/*50.36*/("""" method="GET">
    <input type="search" id="searchbox" name="f" value=""""),_display_(Seq[Any](/*51.58*/currentFilter)),format.raw/*51.71*/("""" placeholder="Filtruj po rozpoczęciu">
    <input type="submit" id="searchsubmit" value="Sortuj" class="btn primary">
    </form>

    <a class="btn success" id="add" href=""""),_display_(Seq[Any](/*55.44*/routes/*55.50*/.Users.create())),format.raw/*55.65*/("""">Rejestracja</a>

</div>

"""),_display_(Seq[Any](/*59.2*/if(currentPage.getTotalRowCount == 0)/*59.39*/ {_display_(Seq[Any](format.raw/*59.41*/("""

<div class="well">
    <em>Nie ma nic do wyświetlenia</em>
</div>

""")))}/*65.3*/else/*65.8*/{_display_(Seq[Any](format.raw/*65.9*/("""

<table class="computers zebra-striped">
    <thead>
    <tr>
        """),_display_(Seq[Any](/*70.10*/header("login", "Login"))),format.raw/*70.34*/("""
        """),_display_(Seq[Any](/*71.10*/header("email", "email"))),format.raw/*71.34*/("""
        """),_display_(Seq[Any](/*72.10*/header("name", "Imię"))),format.raw/*72.32*/("""
        """),_display_(Seq[Any](/*73.10*/header("lastname", "Nazwisko"))),format.raw/*73.40*/("""
    </tr>
    </thead>
    <tbody>

    """),_display_(Seq[Any](/*78.6*/for(user <- currentPage.getList) yield /*78.38*/ {_display_(Seq[Any](format.raw/*78.40*/("""
    <tr>
        <td><a href=""""),_display_(Seq[Any](/*80.23*/routes/*80.29*/.Users.edit(user.id))),format.raw/*80.49*/("""">"""),_display_(Seq[Any](/*80.52*/user/*80.56*/.login)),format.raw/*80.62*/("""</a></td>
        <td>
            """),_display_(Seq[Any](/*82.14*/if(user.email == null)/*82.36*/ {_display_(Seq[Any](format.raw/*82.38*/("""
            <em>-</em>
            """)))}/*84.15*/else/*84.20*/{_display_(Seq[Any](format.raw/*84.21*/("""
            """),_display_(Seq[Any](/*85.14*/user/*85.18*/.email)),format.raw/*85.24*/("""
            """)))})),format.raw/*86.14*/("""
        </td>
        <td>
            """),_display_(Seq[Any](/*89.14*/if(user.name == null)/*89.35*/ {_display_(Seq[Any](format.raw/*89.37*/("""
            <em>-</em>
            """)))}/*91.15*/else/*91.20*/{_display_(Seq[Any](format.raw/*91.21*/("""
            """),_display_(Seq[Any](/*92.14*/user/*92.18*/.name)),format.raw/*92.23*/("""
            """)))})),format.raw/*93.14*/("""
        </td>
        <td>
            """),_display_(Seq[Any](/*96.14*/if(user.lastname == null)/*96.39*/ {_display_(Seq[Any](format.raw/*96.41*/("""
            <em>-</em>
            """)))}/*98.15*/else/*98.20*/{_display_(Seq[Any](format.raw/*98.21*/("""
            """),_display_(Seq[Any](/*99.14*/user/*99.18*/.lastname)),format.raw/*99.27*/("""
            """)))})),format.raw/*100.14*/("""
        </td>
    </tr>
    """)))})),format.raw/*103.6*/("""

    </tbody>
</table>

<div id="pagination" class="pagination">
    <ul>
        """),_display_(Seq[Any](/*110.10*/if(currentPage.hasPrev)/*110.33*/ {_display_(Seq[Any](format.raw/*110.35*/("""
        <li class="prev">
            <a href=""""),_display_(Seq[Any](/*112.23*/link(currentPage.getPageIndex - 1, null))),format.raw/*112.63*/("""">&larr; Poprzedni</a>
        </li>
        """)))}/*114.11*/else/*114.16*/{_display_(Seq[Any](format.raw/*114.17*/("""
        <li class="prev disabled">
            <a>&larr; Poprzedni</a>
        </li>
        """)))})),format.raw/*118.10*/("""
        <li class="current">
            <a>Wyświetla """),_display_(Seq[Any](/*120.27*/currentPage/*120.38*/.getDisplayXtoYofZ(" do "," z "))),format.raw/*120.70*/("""</a>
        </li>
        """),_display_(Seq[Any](/*122.10*/if(currentPage.hasNext)/*122.33*/ {_display_(Seq[Any](format.raw/*122.35*/("""
        <li class="next">
            <a href=""""),_display_(Seq[Any](/*124.23*/link(currentPage.getPageIndex + 1, null))),format.raw/*124.63*/("""">Następny &rarr;</a>
        </li>
        """)))}/*126.11*/else/*126.16*/{_display_(Seq[Any](format.raw/*126.17*/("""
        <li class="next disabled">
            <a>Następny &rarr;</a>
        </li>
        """)))})),format.raw/*130.10*/("""
    </ul>
</div>

""")))})),format.raw/*134.2*/("""

""")))})),format.raw/*136.2*/("""

            """))}
    }
    
    def render(currentPage:com.avaje.ebean.Page[User],currentSortBy:String,currentOrder:String,currentFilter:String): play.api.templates.HtmlFormat.Appendable = apply(currentPage,currentSortBy,currentOrder,currentFilter)
    
    def f:((com.avaje.ebean.Page[User],String,String,String) => play.api.templates.HtmlFormat.Appendable) = (currentPage,currentSortBy,currentOrder,currentFilter) => apply(currentPage,currentSortBy,currentOrder,currentFilter)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Jun 14 21:19:31 CEST 2014
                    SOURCE: D:/Pawlak/Play/test/app/views/users/list.scala.html
                    HASH: 5fee4b05f508a3b379e1e29ab91a65961dd70f49
                    MATRIX: 820->1|1007->729|1021->735|1132->765|1182->779|1194->782|1233->799|1278->808|1312->834|1400->898|1450->912|1484->924|1523->927|1550->932|1586->244|1597->248|1992->110|2023->241|2052->612|2084->726|2113->946|2153->951|2166->956|2205->958|2265->982|2345->1040|2390->1050|2431->1082|2471->1084|2576->1153|2590->1158|2627->1173|2669->1184|2750->1229|2788->1245|2898->1319|2933->1332|3148->1511|3163->1517|3200->1532|3267->1564|3313->1601|3353->1603|3447->1680|3459->1685|3497->1686|3610->1763|3656->1787|3703->1798|3749->1822|3796->1833|3840->1855|3887->1866|3939->1896|4021->1943|4069->1975|4109->1977|4179->2011|4194->2017|4236->2037|4275->2040|4288->2044|4316->2050|4390->2088|4421->2110|4461->2112|4519->2152|4532->2157|4571->2158|4622->2173|4635->2177|4663->2183|4710->2198|4790->2242|4820->2263|4860->2265|4918->2305|4931->2310|4970->2311|5021->2326|5034->2330|5061->2335|5108->2350|5188->2394|5222->2419|5262->2421|5320->2461|5333->2466|5372->2467|5423->2482|5436->2486|5467->2495|5515->2510|5580->2543|5708->2634|5741->2657|5782->2659|5870->2710|5933->2750|6001->2799|6015->2804|6055->2805|6187->2904|6282->2962|6303->2973|6358->3005|6425->3035|6458->3058|6499->3060|6587->3111|6650->3151|6717->3199|6731->3204|6771->3205|6902->3303|6958->3327|6995->3332
                    LINES: 26->1|28->32|28->32|30->32|31->33|31->33|31->33|31->33|31->33|31->33|32->34|32->34|32->34|32->34|34->6|34->6|56->1|58->5|59->27|61->31|62->36|64->38|64->38|64->38|66->40|66->40|68->42|68->42|68->42|70->44|70->44|70->44|72->46|76->50|76->50|77->51|77->51|81->55|81->55|81->55|85->59|85->59|85->59|91->65|91->65|91->65|96->70|96->70|97->71|97->71|98->72|98->72|99->73|99->73|104->78|104->78|104->78|106->80|106->80|106->80|106->80|106->80|106->80|108->82|108->82|108->82|110->84|110->84|110->84|111->85|111->85|111->85|112->86|115->89|115->89|115->89|117->91|117->91|117->91|118->92|118->92|118->92|119->93|122->96|122->96|122->96|124->98|124->98|124->98|125->99|125->99|125->99|126->100|129->103|136->110|136->110|136->110|138->112|138->112|140->114|140->114|140->114|144->118|146->120|146->120|146->120|148->122|148->122|148->122|150->124|150->124|152->126|152->126|152->126|156->130|160->134|162->136
                    -- GENERATED --
                */
            