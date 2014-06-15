
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
object list extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template5[com.avaje.ebean.Page[User],String,String,String,User,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(currentPage: com.avaje.ebean.Page[User], currentSortBy: String, currentOrder: String, currentFilter: String, loggeduser: User):play.api.templates.HtmlFormat.Appendable = {
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
Seq[Any](format.raw/*1.129*/("""

"""),format.raw/*5.42*/("""
"""),format.raw/*27.2*/("""

"""),format.raw/*31.37*/("""
"""),format.raw/*36.2*/("""

"""),_display_(Seq[Any](/*38.2*/main/*38.6*/ {_display_(Seq[Any](format.raw/*38.8*/("""

<h1 id="homeTitle">"""),_display_(Seq[Any](/*40.21*/Messages("users.list.title", currentPage.getTotalRowCount))),format.raw/*40.79*/("""</h1>

"""),_display_(Seq[Any](/*42.2*/if(flash.containsKey("success"))/*42.34*/ {_display_(Seq[Any](format.raw/*42.36*/("""
<div class="alert-message warning">
    <strong>Gotowe!</strong> """),_display_(Seq[Any](/*44.31*/flash/*44.36*/.get("success"))),format.raw/*44.51*/("""
</div>
""")))})),format.raw/*46.2*/("""

<div id="actions">

    <form action=""""),_display_(Seq[Any](/*50.20*/link(0, "login"))),format.raw/*50.36*/("""" method="GET">
    <input type="search" id="searchbox" name="f" value=""""),_display_(Seq[Any](/*51.58*/currentFilter)),format.raw/*51.71*/("""" placeholder="Filtruj po loginie">
    <input type="submit" id="searchsubmit" value="Sortuj" class="btn primary">
    </form>

    <a class="btn success" id="add" href=""""),_display_(Seq[Any](/*55.44*/routes/*55.50*/.Users.create())),format.raw/*55.65*/("""">Dodaj konto</a>

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
        """),_display_(Seq[Any](/*74.10*/header("status", "Status"))),format.raw/*74.36*/("""
    </tr>
    </thead>
    <tbody>

    """),_display_(Seq[Any](/*79.6*/for(user <- currentPage.getList) yield /*79.38*/ {_display_(Seq[Any](format.raw/*79.40*/("""
    <tr>
        <td><a href=""""),_display_(Seq[Any](/*81.23*/routes/*81.29*/.Users.edit(user.id))),format.raw/*81.49*/("""">"""),_display_(Seq[Any](/*81.52*/user/*81.56*/.login)),format.raw/*81.62*/("""</a></td>
        <td>
            """),_display_(Seq[Any](/*83.14*/if(user.email == null)/*83.36*/ {_display_(Seq[Any](format.raw/*83.38*/("""
            <em>-</em>
            """)))}/*85.15*/else/*85.20*/{_display_(Seq[Any](format.raw/*85.21*/("""
            """),_display_(Seq[Any](/*86.14*/user/*86.18*/.email)),format.raw/*86.24*/("""
            """)))})),format.raw/*87.14*/("""
        </td>
        <td>
            """),_display_(Seq[Any](/*90.14*/if(user.name == null)/*90.35*/ {_display_(Seq[Any](format.raw/*90.37*/("""
            <em>-</em>
            """)))}/*92.15*/else/*92.20*/{_display_(Seq[Any](format.raw/*92.21*/("""
            """),_display_(Seq[Any](/*93.14*/user/*93.18*/.name)),format.raw/*93.23*/("""
            """)))})),format.raw/*94.14*/("""
        </td>
        <td>
            """),_display_(Seq[Any](/*97.14*/if(user.lastname == null)/*97.39*/ {_display_(Seq[Any](format.raw/*97.41*/("""
            <em>-</em>
            """)))}/*99.15*/else/*99.20*/{_display_(Seq[Any](format.raw/*99.21*/("""
            """),_display_(Seq[Any](/*100.14*/user/*100.18*/.lastname)),format.raw/*100.27*/("""
            """)))})),format.raw/*101.14*/("""
        </td>
        <td>
            """),_display_(Seq[Any](/*104.14*/if(user.status == 0)/*104.34*/ {_display_(Seq[Any](format.raw/*104.36*/("""
            nieaktywny """),_display_(Seq[Any](/*105.25*/if(loggeduser.status == 2)/*105.51*/{_display_(Seq[Any](format.raw/*105.52*/("""<a class="btn info small" id="add" href=""""),_display_(Seq[Any](/*105.94*/routes/*105.100*/.Users.active(user.id))),format.raw/*105.122*/("""">Aktywuj</a>""")))})),format.raw/*105.136*/("""
            """)))}/*106.15*/else/*106.20*/{_display_(Seq[Any](format.raw/*106.21*/("""
           aktywny
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
    
    def render(currentPage:com.avaje.ebean.Page[User],currentSortBy:String,currentOrder:String,currentFilter:String,loggeduser:User): play.api.templates.HtmlFormat.Appendable = apply(currentPage,currentSortBy,currentOrder,currentFilter,loggeduser)
    
    def f:((com.avaje.ebean.Page[User],String,String,String,User) => play.api.templates.HtmlFormat.Appendable) = (currentPage,currentSortBy,currentOrder,currentFilter,loggeduser) => apply(currentPage,currentSortBy,currentOrder,currentFilter,loggeduser)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Jun 15 23:09:50 CEST 2014
                    SOURCE: D:/Pawlak/Play/live/app/views/users/list.scala.html
                    HASH: 6a4e11064dfbdfbbe68cdd981a933f94a704aadb
                    MATRIX: 825->1|1030->747|1044->753|1155->783|1205->797|1217->800|1256->817|1301->826|1335->852|1423->916|1473->930|1507->942|1546->945|1573->950|1609->262|1620->266|2015->128|2046->259|2075->630|2107->744|2136->964|2176->969|2188->973|2227->975|2287->999|2367->1057|2412->1067|2453->1099|2493->1101|2598->1170|2612->1175|2649->1190|2691->1201|2772->1246|2810->1262|2920->1336|2955->1349|3166->1524|3181->1530|3218->1545|3285->1577|3331->1614|3371->1616|3465->1693|3477->1698|3515->1699|3628->1776|3674->1800|3721->1811|3767->1835|3814->1846|3858->1868|3905->1879|3957->1909|4004->1920|4052->1946|4134->1993|4182->2025|4222->2027|4292->2061|4307->2067|4349->2087|4388->2090|4401->2094|4429->2100|4503->2138|4534->2160|4574->2162|4632->2202|4645->2207|4684->2208|4735->2223|4748->2227|4776->2233|4823->2248|4903->2292|4933->2313|4973->2315|5031->2355|5044->2360|5083->2361|5134->2376|5147->2380|5174->2385|5221->2400|5301->2444|5335->2469|5375->2471|5433->2511|5446->2516|5485->2517|5537->2532|5551->2536|5583->2545|5631->2560|5712->2604|5742->2624|5783->2626|5846->2652|5882->2678|5922->2679|6001->2721|6018->2727|6064->2749|6112->2763|6147->2779|6161->2784|6201->2785|6269->2820|6334->2853|6462->2944|6495->2967|6536->2969|6624->3020|6687->3060|6755->3109|6769->3114|6809->3115|6941->3214|7036->3272|7057->3283|7112->3315|7179->3345|7212->3368|7253->3370|7341->3421|7404->3461|7471->3509|7485->3514|7525->3515|7656->3613|7712->3637|7749->3642
                    LINES: 26->1|28->32|28->32|30->32|31->33|31->33|31->33|31->33|31->33|31->33|32->34|32->34|32->34|32->34|34->6|34->6|56->1|58->5|59->27|61->31|62->36|64->38|64->38|64->38|66->40|66->40|68->42|68->42|68->42|70->44|70->44|70->44|72->46|76->50|76->50|77->51|77->51|81->55|81->55|81->55|85->59|85->59|85->59|91->65|91->65|91->65|96->70|96->70|97->71|97->71|98->72|98->72|99->73|99->73|100->74|100->74|105->79|105->79|105->79|107->81|107->81|107->81|107->81|107->81|107->81|109->83|109->83|109->83|111->85|111->85|111->85|112->86|112->86|112->86|113->87|116->90|116->90|116->90|118->92|118->92|118->92|119->93|119->93|119->93|120->94|123->97|123->97|123->97|125->99|125->99|125->99|126->100|126->100|126->100|127->101|130->104|130->104|130->104|131->105|131->105|131->105|131->105|131->105|131->105|131->105|132->106|132->106|132->106|134->108|137->111|144->118|144->118|144->118|146->120|146->120|148->122|148->122|148->122|152->126|154->128|154->128|154->128|156->130|156->130|156->130|158->132|158->132|160->134|160->134|160->134|164->138|168->142|170->144
                    -- GENERATED --
                */
            