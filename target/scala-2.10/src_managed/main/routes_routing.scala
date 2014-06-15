// @SOURCE:D:/Pawlak/Play/live/conf/routes
// @HASH:68e666b07a39f945bbad014a8ebb6ed93e91a1c0
// @DATE:Sun Jun 15 15:03:13 CEST 2014


import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString

object Routes extends Router.Routes {

private var _prefix = "/"

def setPrefix(prefix: String) {
  _prefix = prefix
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" }


// @LINE:6
private[this] lazy val controllers_Matches_index0 = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
        

// @LINE:8
private[this] lazy val controllers_Referees_index1 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("referees/index"))))
        

// @LINE:9
private[this] lazy val controllers_Players_index2 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("players/index"))))
        

// @LINE:10
private[this] lazy val controllers_Seasons_index3 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("seasons/index"))))
        

// @LINE:11
private[this] lazy val controllers_Games_index4 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("games/index"))))
        

// @LINE:12
private[this] lazy val controllers_Users_index5 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("users/index"))))
        

// @LINE:13
private[this] lazy val controllers_Teams_index6 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("teams/index"))))
        

// @LINE:16
private[this] lazy val controllers_Application_login7 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("login"))))
        

// @LINE:17
private[this] lazy val controllers_Application_authenticate8 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("login"))))
        

// @LINE:18
private[this] lazy val controllers_Application_logout9 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("logout"))))
        

// @LINE:21
private[this] lazy val controllers_Matches_list10 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("matches"))))
        

// @LINE:22
private[this] lazy val controllers_Teams_list11 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("teams"))))
        

// @LINE:23
private[this] lazy val controllers_Referees_list12 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("referees"))))
        

// @LINE:24
private[this] lazy val controllers_Players_list13 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("players"))))
        

// @LINE:25
private[this] lazy val controllers_Seasons_list14 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("seasons"))))
        

// @LINE:26
private[this] lazy val controllers_Games_list15 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("games"))))
        

// @LINE:27
private[this] lazy val controllers_Users_list16 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("users"))))
        

// @LINE:30
private[this] lazy val controllers_Matches_create17 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("matches/new"))))
        

// @LINE:31
private[this] lazy val controllers_Matches_save18 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("matches"))))
        

// @LINE:33
private[this] lazy val controllers_Teams_create19 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("teams/new"))))
        

// @LINE:34
private[this] lazy val controllers_Teams_save20 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("teams"))))
        

// @LINE:36
private[this] lazy val controllers_Referees_create21 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("referees/new"))))
        

// @LINE:37
private[this] lazy val controllers_Referees_save22 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("referees"))))
        

// @LINE:39
private[this] lazy val controllers_Players_create23 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("players/new"))))
        

// @LINE:40
private[this] lazy val controllers_Players_save24 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("players"))))
        

// @LINE:42
private[this] lazy val controllers_Seasons_create25 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("seasons/new"))))
        

// @LINE:43
private[this] lazy val controllers_Seasons_save26 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("seasons"))))
        

// @LINE:45
private[this] lazy val controllers_Games_create27 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("games/new"))))
        

// @LINE:46
private[this] lazy val controllers_Games_save28 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("games"))))
        

// @LINE:48
private[this] lazy val controllers_Users_create29 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("users/new"))))
        

// @LINE:49
private[this] lazy val controllers_Users_save30 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("users"))))
        

// @LINE:52
private[this] lazy val controllers_Matches_edit31 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("matches/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:53
private[this] lazy val controllers_Matches_update32 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("matches/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:55
private[this] lazy val controllers_Teams_edit33 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("teams/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:56
private[this] lazy val controllers_Teams_update34 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("teams/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:58
private[this] lazy val controllers_Referees_edit35 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("referees/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:59
private[this] lazy val controllers_Referees_update36 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("referees/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:61
private[this] lazy val controllers_Players_edit37 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("players/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:62
private[this] lazy val controllers_Players_update38 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("players/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:64
private[this] lazy val controllers_Seasons_edit39 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("seasons/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:65
private[this] lazy val controllers_Seasons_update40 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("seasons/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:67
private[this] lazy val controllers_Games_edit41 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("games/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:68
private[this] lazy val controllers_Games_update42 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("games/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:70
private[this] lazy val controllers_Users_edit43 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("users/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:71
private[this] lazy val controllers_Users_update44 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("users/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:74
private[this] lazy val controllers_Matches_delete45 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("matches/"),DynamicPart("id", """[^/]+""",true),StaticPart("/delete"))))
        

// @LINE:75
private[this] lazy val controllers_Teams_delete46 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("teams/"),DynamicPart("id", """[^/]+""",true),StaticPart("/delete"))))
        

// @LINE:76
private[this] lazy val controllers_Referees_delete47 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("referees/"),DynamicPart("id", """[^/]+""",true),StaticPart("/delete"))))
        

// @LINE:77
private[this] lazy val controllers_Players_delete48 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("players/"),DynamicPart("id", """[^/]+""",true),StaticPart("/delete"))))
        

// @LINE:78
private[this] lazy val controllers_Seasons_delete49 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("seasons/"),DynamicPart("id", """[^/]+""",true),StaticPart("/delete"))))
        

// @LINE:79
private[this] lazy val controllers_Games_delete50 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("games/"),DynamicPart("id", """[^/]+""",true),StaticPart("/delete"))))
        

// @LINE:80
private[this] lazy val controllers_Users_delete51 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("users/"),DynamicPart("id", """[^/]+""",true),StaticPart("/delete"))))
        

// @LINE:83
private[this] lazy val controllers_Assets_at52 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
        

// @LINE:86
private[this] lazy val controllers_Teams_upload53 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("teams/upload/"))))
        

// @LINE:87
private[this] lazy val controllers_Players_upload54 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("players/upload/"))))
        

// @LINE:89
private[this] lazy val controllers_Users_active55 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("users/active/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:90
private[this] lazy val controllers_Matches_live56 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("matches/live/"),DynamicPart("id", """[^/]+""",true))))
        
def documentation = List(("""GET""", prefix,"""controllers.Matches.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """referees/index""","""controllers.Referees.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """players/index""","""controllers.Players.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """seasons/index""","""controllers.Seasons.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """games/index""","""controllers.Games.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """users/index""","""controllers.Users.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """teams/index""","""controllers.Teams.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """login""","""controllers.Application.login()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """login""","""controllers.Application.authenticate()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """logout""","""controllers.Application.logout()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """matches""","""controllers.Matches.list(p:Int ?= 0, s:String ?= "weather", o:String ?= "asc", f:String ?= "")"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """teams""","""controllers.Teams.list(p:Int ?= 0, s:String ?= "name", o:String ?= "asc", f:String ?= "")"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """referees""","""controllers.Referees.list(p:Int ?= 0, s:String ?= "lastname", o:String ?= "asc", f:String ?= "")"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """players""","""controllers.Players.list(p:Int ?= 0, s:String ?= "lastname", o:String ?= "asc", f:String ?= "")"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """seasons""","""controllers.Seasons.list(p:Int ?= 0, s:String ?= "year_start", o:String ?= "asc", f:String ?= "")"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """games""","""controllers.Games.list(p:Int ?= 0, s:String ?= "name", o:String ?= "asc", f:String ?= "")"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """users""","""controllers.Users.list(p:Int ?= 0, s:String ?= "login", o:String ?= "asc", f:String ?= "")"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """matches/new""","""controllers.Matches.create()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """matches""","""controllers.Matches.save()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """teams/new""","""controllers.Teams.create()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """teams""","""controllers.Teams.save()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """referees/new""","""controllers.Referees.create()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """referees""","""controllers.Referees.save()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """players/new""","""controllers.Players.create()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """players""","""controllers.Players.save()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """seasons/new""","""controllers.Seasons.create()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """seasons""","""controllers.Seasons.save()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """games/new""","""controllers.Games.create()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """games""","""controllers.Games.save()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """users/new""","""controllers.Users.create()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """users""","""controllers.Users.save()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """matches/$id<[^/]+>""","""controllers.Matches.edit(id:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """matches/$id<[^/]+>""","""controllers.Matches.update(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """teams/$id<[^/]+>""","""controllers.Teams.edit(id:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """teams/$id<[^/]+>""","""controllers.Teams.update(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """referees/$id<[^/]+>""","""controllers.Referees.edit(id:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """referees/$id<[^/]+>""","""controllers.Referees.update(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """players/$id<[^/]+>""","""controllers.Players.edit(id:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """players/$id<[^/]+>""","""controllers.Players.update(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """seasons/$id<[^/]+>""","""controllers.Seasons.edit(id:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """seasons/$id<[^/]+>""","""controllers.Seasons.update(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """games/$id<[^/]+>""","""controllers.Games.edit(id:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """games/$id<[^/]+>""","""controllers.Games.update(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """users/$id<[^/]+>""","""controllers.Users.edit(id:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """users/$id<[^/]+>""","""controllers.Users.update(id:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """matches/$id<[^/]+>/delete""","""controllers.Matches.delete(id:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """teams/$id<[^/]+>/delete""","""controllers.Teams.delete(id:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """referees/$id<[^/]+>/delete""","""controllers.Referees.delete(id:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """players/$id<[^/]+>/delete""","""controllers.Players.delete(id:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """seasons/$id<[^/]+>/delete""","""controllers.Seasons.delete(id:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """games/$id<[^/]+>/delete""","""controllers.Games.delete(id:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """users/$id<[^/]+>/delete""","""controllers.Users.delete(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """teams/upload/""","""controllers.Teams.upload(id:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """players/upload/""","""controllers.Players.upload(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """users/active/$id<[^/]+>""","""controllers.Users.active(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """matches/live/$id<[^/]+>""","""controllers.Matches.live(id:Long)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]] 
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:6
case controllers_Matches_index0(params) => {
   call { 
        invokeHandler(controllers.Matches.index(), HandlerDef(this, "controllers.Matches", "index", Nil,"GET", """ Default path will just redirect to the list""", Routes.prefix + """"""))
   }
}
        

// @LINE:8
case controllers_Referees_index1(params) => {
   call { 
        invokeHandler(controllers.Referees.index(), HandlerDef(this, "controllers.Referees", "index", Nil,"GET", """GET     /matches/index              controllers.Matches.index()""", Routes.prefix + """referees/index"""))
   }
}
        

// @LINE:9
case controllers_Players_index2(params) => {
   call { 
        invokeHandler(controllers.Players.index(), HandlerDef(this, "controllers.Players", "index", Nil,"GET", """""", Routes.prefix + """players/index"""))
   }
}
        

// @LINE:10
case controllers_Seasons_index3(params) => {
   call { 
        invokeHandler(controllers.Seasons.index(), HandlerDef(this, "controllers.Seasons", "index", Nil,"GET", """""", Routes.prefix + """seasons/index"""))
   }
}
        

// @LINE:11
case controllers_Games_index4(params) => {
   call { 
        invokeHandler(controllers.Games.index(), HandlerDef(this, "controllers.Games", "index", Nil,"GET", """""", Routes.prefix + """games/index"""))
   }
}
        

// @LINE:12
case controllers_Users_index5(params) => {
   call { 
        invokeHandler(controllers.Users.index(), HandlerDef(this, "controllers.Users", "index", Nil,"GET", """""", Routes.prefix + """users/index"""))
   }
}
        

// @LINE:13
case controllers_Teams_index6(params) => {
   call { 
        invokeHandler(controllers.Teams.index(), HandlerDef(this, "controllers.Teams", "index", Nil,"GET", """""", Routes.prefix + """teams/index"""))
   }
}
        

// @LINE:16
case controllers_Application_login7(params) => {
   call { 
        invokeHandler(controllers.Application.login(), HandlerDef(this, "controllers.Application", "login", Nil,"GET", """ Authentication""", Routes.prefix + """login"""))
   }
}
        

// @LINE:17
case controllers_Application_authenticate8(params) => {
   call { 
        invokeHandler(controllers.Application.authenticate(), HandlerDef(this, "controllers.Application", "authenticate", Nil,"POST", """""", Routes.prefix + """login"""))
   }
}
        

// @LINE:18
case controllers_Application_logout9(params) => {
   call { 
        invokeHandler(controllers.Application.logout(), HandlerDef(this, "controllers.Application", "logout", Nil,"GET", """""", Routes.prefix + """logout"""))
   }
}
        

// @LINE:21
case controllers_Matches_list10(params) => {
   call(params.fromQuery[Int]("p", Some(0)), params.fromQuery[String]("s", Some("weather")), params.fromQuery[String]("o", Some("asc")), params.fromQuery[String]("f", Some(""))) { (p, s, o, f) =>
        invokeHandler(controllers.Matches.list(p, s, o, f), HandlerDef(this, "controllers.Matches", "list", Seq(classOf[Int], classOf[String], classOf[String], classOf[String]),"GET", """  list (look at the default values for pagination parameters)""", Routes.prefix + """matches"""))
   }
}
        

// @LINE:22
case controllers_Teams_list11(params) => {
   call(params.fromQuery[Int]("p", Some(0)), params.fromQuery[String]("s", Some("name")), params.fromQuery[String]("o", Some("asc")), params.fromQuery[String]("f", Some(""))) { (p, s, o, f) =>
        invokeHandler(controllers.Teams.list(p, s, o, f), HandlerDef(this, "controllers.Teams", "list", Seq(classOf[Int], classOf[String], classOf[String], classOf[String]),"GET", """""", Routes.prefix + """teams"""))
   }
}
        

// @LINE:23
case controllers_Referees_list12(params) => {
   call(params.fromQuery[Int]("p", Some(0)), params.fromQuery[String]("s", Some("lastname")), params.fromQuery[String]("o", Some("asc")), params.fromQuery[String]("f", Some(""))) { (p, s, o, f) =>
        invokeHandler(controllers.Referees.list(p, s, o, f), HandlerDef(this, "controllers.Referees", "list", Seq(classOf[Int], classOf[String], classOf[String], classOf[String]),"GET", """""", Routes.prefix + """referees"""))
   }
}
        

// @LINE:24
case controllers_Players_list13(params) => {
   call(params.fromQuery[Int]("p", Some(0)), params.fromQuery[String]("s", Some("lastname")), params.fromQuery[String]("o", Some("asc")), params.fromQuery[String]("f", Some(""))) { (p, s, o, f) =>
        invokeHandler(controllers.Players.list(p, s, o, f), HandlerDef(this, "controllers.Players", "list", Seq(classOf[Int], classOf[String], classOf[String], classOf[String]),"GET", """""", Routes.prefix + """players"""))
   }
}
        

// @LINE:25
case controllers_Seasons_list14(params) => {
   call(params.fromQuery[Int]("p", Some(0)), params.fromQuery[String]("s", Some("year_start")), params.fromQuery[String]("o", Some("asc")), params.fromQuery[String]("f", Some(""))) { (p, s, o, f) =>
        invokeHandler(controllers.Seasons.list(p, s, o, f), HandlerDef(this, "controllers.Seasons", "list", Seq(classOf[Int], classOf[String], classOf[String], classOf[String]),"GET", """""", Routes.prefix + """seasons"""))
   }
}
        

// @LINE:26
case controllers_Games_list15(params) => {
   call(params.fromQuery[Int]("p", Some(0)), params.fromQuery[String]("s", Some("name")), params.fromQuery[String]("o", Some("asc")), params.fromQuery[String]("f", Some(""))) { (p, s, o, f) =>
        invokeHandler(controllers.Games.list(p, s, o, f), HandlerDef(this, "controllers.Games", "list", Seq(classOf[Int], classOf[String], classOf[String], classOf[String]),"GET", """""", Routes.prefix + """games"""))
   }
}
        

// @LINE:27
case controllers_Users_list16(params) => {
   call(params.fromQuery[Int]("p", Some(0)), params.fromQuery[String]("s", Some("login")), params.fromQuery[String]("o", Some("asc")), params.fromQuery[String]("f", Some(""))) { (p, s, o, f) =>
        invokeHandler(controllers.Users.list(p, s, o, f), HandlerDef(this, "controllers.Users", "list", Seq(classOf[Int], classOf[String], classOf[String], classOf[String]),"GET", """""", Routes.prefix + """users"""))
   }
}
        

// @LINE:30
case controllers_Matches_create17(params) => {
   call { 
        invokeHandler(controllers.Matches.create(), HandlerDef(this, "controllers.Matches", "create", Nil,"GET", """ Add""", Routes.prefix + """matches/new"""))
   }
}
        

// @LINE:31
case controllers_Matches_save18(params) => {
   call { 
        invokeHandler(controllers.Matches.save(), HandlerDef(this, "controllers.Matches", "save", Nil,"POST", """""", Routes.prefix + """matches"""))
   }
}
        

// @LINE:33
case controllers_Teams_create19(params) => {
   call { 
        invokeHandler(controllers.Teams.create(), HandlerDef(this, "controllers.Teams", "create", Nil,"GET", """""", Routes.prefix + """teams/new"""))
   }
}
        

// @LINE:34
case controllers_Teams_save20(params) => {
   call { 
        invokeHandler(controllers.Teams.save(), HandlerDef(this, "controllers.Teams", "save", Nil,"POST", """""", Routes.prefix + """teams"""))
   }
}
        

// @LINE:36
case controllers_Referees_create21(params) => {
   call { 
        invokeHandler(controllers.Referees.create(), HandlerDef(this, "controllers.Referees", "create", Nil,"GET", """""", Routes.prefix + """referees/new"""))
   }
}
        

// @LINE:37
case controllers_Referees_save22(params) => {
   call { 
        invokeHandler(controllers.Referees.save(), HandlerDef(this, "controllers.Referees", "save", Nil,"POST", """""", Routes.prefix + """referees"""))
   }
}
        

// @LINE:39
case controllers_Players_create23(params) => {
   call { 
        invokeHandler(controllers.Players.create(), HandlerDef(this, "controllers.Players", "create", Nil,"GET", """""", Routes.prefix + """players/new"""))
   }
}
        

// @LINE:40
case controllers_Players_save24(params) => {
   call { 
        invokeHandler(controllers.Players.save(), HandlerDef(this, "controllers.Players", "save", Nil,"POST", """""", Routes.prefix + """players"""))
   }
}
        

// @LINE:42
case controllers_Seasons_create25(params) => {
   call { 
        invokeHandler(controllers.Seasons.create(), HandlerDef(this, "controllers.Seasons", "create", Nil,"GET", """""", Routes.prefix + """seasons/new"""))
   }
}
        

// @LINE:43
case controllers_Seasons_save26(params) => {
   call { 
        invokeHandler(controllers.Seasons.save(), HandlerDef(this, "controllers.Seasons", "save", Nil,"POST", """""", Routes.prefix + """seasons"""))
   }
}
        

// @LINE:45
case controllers_Games_create27(params) => {
   call { 
        invokeHandler(controllers.Games.create(), HandlerDef(this, "controllers.Games", "create", Nil,"GET", """""", Routes.prefix + """games/new"""))
   }
}
        

// @LINE:46
case controllers_Games_save28(params) => {
   call { 
        invokeHandler(controllers.Games.save(), HandlerDef(this, "controllers.Games", "save", Nil,"POST", """""", Routes.prefix + """games"""))
   }
}
        

// @LINE:48
case controllers_Users_create29(params) => {
   call { 
        invokeHandler(controllers.Users.create(), HandlerDef(this, "controllers.Users", "create", Nil,"GET", """""", Routes.prefix + """users/new"""))
   }
}
        

// @LINE:49
case controllers_Users_save30(params) => {
   call { 
        invokeHandler(controllers.Users.save(), HandlerDef(this, "controllers.Users", "save", Nil,"POST", """""", Routes.prefix + """users"""))
   }
}
        

// @LINE:52
case controllers_Matches_edit31(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Matches.edit(id), HandlerDef(this, "controllers.Matches", "edit", Seq(classOf[Long]),"GET", """ Edit""", Routes.prefix + """matches/$id<[^/]+>"""))
   }
}
        

// @LINE:53
case controllers_Matches_update32(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Matches.update(id), HandlerDef(this, "controllers.Matches", "update", Seq(classOf[Long]),"POST", """""", Routes.prefix + """matches/$id<[^/]+>"""))
   }
}
        

// @LINE:55
case controllers_Teams_edit33(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Teams.edit(id), HandlerDef(this, "controllers.Teams", "edit", Seq(classOf[Long]),"GET", """""", Routes.prefix + """teams/$id<[^/]+>"""))
   }
}
        

// @LINE:56
case controllers_Teams_update34(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Teams.update(id), HandlerDef(this, "controllers.Teams", "update", Seq(classOf[Long]),"POST", """""", Routes.prefix + """teams/$id<[^/]+>"""))
   }
}
        

// @LINE:58
case controllers_Referees_edit35(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Referees.edit(id), HandlerDef(this, "controllers.Referees", "edit", Seq(classOf[Long]),"GET", """""", Routes.prefix + """referees/$id<[^/]+>"""))
   }
}
        

// @LINE:59
case controllers_Referees_update36(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Referees.update(id), HandlerDef(this, "controllers.Referees", "update", Seq(classOf[Long]),"POST", """""", Routes.prefix + """referees/$id<[^/]+>"""))
   }
}
        

// @LINE:61
case controllers_Players_edit37(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Players.edit(id), HandlerDef(this, "controllers.Players", "edit", Seq(classOf[Long]),"GET", """""", Routes.prefix + """players/$id<[^/]+>"""))
   }
}
        

// @LINE:62
case controllers_Players_update38(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Players.update(id), HandlerDef(this, "controllers.Players", "update", Seq(classOf[Long]),"POST", """""", Routes.prefix + """players/$id<[^/]+>"""))
   }
}
        

// @LINE:64
case controllers_Seasons_edit39(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Seasons.edit(id), HandlerDef(this, "controllers.Seasons", "edit", Seq(classOf[Long]),"GET", """""", Routes.prefix + """seasons/$id<[^/]+>"""))
   }
}
        

// @LINE:65
case controllers_Seasons_update40(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Seasons.update(id), HandlerDef(this, "controllers.Seasons", "update", Seq(classOf[Long]),"POST", """""", Routes.prefix + """seasons/$id<[^/]+>"""))
   }
}
        

// @LINE:67
case controllers_Games_edit41(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Games.edit(id), HandlerDef(this, "controllers.Games", "edit", Seq(classOf[Long]),"GET", """""", Routes.prefix + """games/$id<[^/]+>"""))
   }
}
        

// @LINE:68
case controllers_Games_update42(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Games.update(id), HandlerDef(this, "controllers.Games", "update", Seq(classOf[Long]),"POST", """""", Routes.prefix + """games/$id<[^/]+>"""))
   }
}
        

// @LINE:70
case controllers_Users_edit43(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Users.edit(id), HandlerDef(this, "controllers.Users", "edit", Seq(classOf[Long]),"GET", """""", Routes.prefix + """users/$id<[^/]+>"""))
   }
}
        

// @LINE:71
case controllers_Users_update44(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Users.update(id), HandlerDef(this, "controllers.Users", "update", Seq(classOf[Long]),"POST", """""", Routes.prefix + """users/$id<[^/]+>"""))
   }
}
        

// @LINE:74
case controllers_Matches_delete45(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Matches.delete(id), HandlerDef(this, "controllers.Matches", "delete", Seq(classOf[Long]),"POST", """ Delete""", Routes.prefix + """matches/$id<[^/]+>/delete"""))
   }
}
        

// @LINE:75
case controllers_Teams_delete46(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Teams.delete(id), HandlerDef(this, "controllers.Teams", "delete", Seq(classOf[Long]),"POST", """""", Routes.prefix + """teams/$id<[^/]+>/delete"""))
   }
}
        

// @LINE:76
case controllers_Referees_delete47(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Referees.delete(id), HandlerDef(this, "controllers.Referees", "delete", Seq(classOf[Long]),"POST", """""", Routes.prefix + """referees/$id<[^/]+>/delete"""))
   }
}
        

// @LINE:77
case controllers_Players_delete48(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Players.delete(id), HandlerDef(this, "controllers.Players", "delete", Seq(classOf[Long]),"POST", """""", Routes.prefix + """players/$id<[^/]+>/delete"""))
   }
}
        

// @LINE:78
case controllers_Seasons_delete49(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Seasons.delete(id), HandlerDef(this, "controllers.Seasons", "delete", Seq(classOf[Long]),"POST", """""", Routes.prefix + """seasons/$id<[^/]+>/delete"""))
   }
}
        

// @LINE:79
case controllers_Games_delete50(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Games.delete(id), HandlerDef(this, "controllers.Games", "delete", Seq(classOf[Long]),"POST", """""", Routes.prefix + """games/$id<[^/]+>/delete"""))
   }
}
        

// @LINE:80
case controllers_Users_delete51(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Users.delete(id), HandlerDef(this, "controllers.Users", "delete", Seq(classOf[Long]),"POST", """""", Routes.prefix + """users/$id<[^/]+>/delete"""))
   }
}
        

// @LINE:83
case controllers_Assets_at52(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
   }
}
        

// @LINE:86
case controllers_Teams_upload53(params) => {
   call(params.fromQuery[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Teams.upload(id), HandlerDef(this, "controllers.Teams", "upload", Seq(classOf[Long]),"POST", """ Upload""", Routes.prefix + """teams/upload/"""))
   }
}
        

// @LINE:87
case controllers_Players_upload54(params) => {
   call(params.fromQuery[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Players.upload(id), HandlerDef(this, "controllers.Players", "upload", Seq(classOf[Long]),"POST", """""", Routes.prefix + """players/upload/"""))
   }
}
        

// @LINE:89
case controllers_Users_active55(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Users.active(id), HandlerDef(this, "controllers.Users", "active", Seq(classOf[Long]),"GET", """""", Routes.prefix + """users/active/$id<[^/]+>"""))
   }
}
        

// @LINE:90
case controllers_Matches_live56(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Matches.live(id), HandlerDef(this, "controllers.Matches", "live", Seq(classOf[Long]),"GET", """""", Routes.prefix + """matches/live/$id<[^/]+>"""))
   }
}
        
}

}
     