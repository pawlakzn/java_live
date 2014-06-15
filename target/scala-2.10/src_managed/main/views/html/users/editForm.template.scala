
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
object editForm extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[Long,Form[User],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(id: Long, userForm: Form[User]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._

implicit def /*5.2*/implicitFieldConstructor/*5.26*/ = {{ FieldConstructor(twitterBootstrapInput.render) }};
Seq[Any](format.raw/*1.34*/("""

"""),format.raw/*4.1*/("""
"""),format.raw/*5.80*/("""

"""),_display_(Seq[Any](/*7.2*/main/*7.6*/ {_display_(Seq[Any](format.raw/*7.8*/("""

<h1>Edytuj konto</h1>

"""),_display_(Seq[Any](/*11.2*/form(routes.Users.update(id))/*11.31*/ {_display_(Seq[Any](format.raw/*11.33*/("""

<fieldset>

    """),_display_(Seq[Any](/*15.6*/inputText(userForm("login"), '_label -> "Login"))),format.raw/*15.54*/("""
    """),_display_(Seq[Any](/*16.6*/inputText(userForm("password"), '_label -> "Hasło"))),format.raw/*16.57*/("""
    """),_display_(Seq[Any](/*17.6*/inputText(userForm("email"), '_label -> "E-mail"))),format.raw/*17.55*/("""
    """),_display_(Seq[Any](/*18.6*/inputText(userForm("name"), '_label -> "Imię"))),format.raw/*18.52*/("""
    """),_display_(Seq[Any](/*19.6*/inputText(userForm("lastname"), '_label -> "Nazwisko"))),format.raw/*19.60*/("""

</fieldset>

<div class="actions">
    <input type="submit" value="Edytuj konto" class="btn primary"> or
    <a href=""""),_display_(Seq[Any](/*25.15*/routes/*25.21*/.Users.list())),format.raw/*25.34*/("""" class="btn">Anuluj</a>
</div>

""")))})),format.raw/*28.2*/("""

"""),_display_(Seq[Any](/*30.2*/form(routes.Users.delete(id), 'class -> "topRight")/*30.53*/ {_display_(Seq[Any](format.raw/*30.55*/("""
<input type="submit" value="Usuń konto" class="btn danger">
""")))})),format.raw/*32.2*/("""

""")))})),format.raw/*34.2*/("""
"""))}
    }
    
    def render(id:Long,userForm:Form[User]): play.api.templates.HtmlFormat.Appendable = apply(id,userForm)
    
    def f:((Long,Form[User]) => play.api.templates.HtmlFormat.Appendable) = (id,userForm) => apply(id,userForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Jun 15 23:09:50 CEST 2014
                    SOURCE: D:/Pawlak/Play/live/app/views/users/editForm.scala.html
                    HASH: 320961439e05ae6a3153efde6e8325ee816850de
                    MATRIX: 792->1|927->58|959->82|1043->33|1073->55|1102->136|1141->141|1152->145|1190->147|1255->177|1293->206|1333->208|1391->231|1461->279|1503->286|1576->337|1618->344|1689->393|1731->400|1799->446|1841->453|1917->507|2080->634|2095->640|2130->653|2198->690|2238->695|2298->746|2338->748|2433->812|2469->817
                    LINES: 26->1|29->5|29->5|30->1|32->4|33->5|35->7|35->7|35->7|39->11|39->11|39->11|43->15|43->15|44->16|44->16|45->17|45->17|46->18|46->18|47->19|47->19|53->25|53->25|53->25|56->28|58->30|58->30|58->30|60->32|62->34
                    -- GENERATED --
                */
            