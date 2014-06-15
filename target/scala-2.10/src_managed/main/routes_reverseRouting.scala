// @SOURCE:D:/Pawlak/Play/live/conf/routes
// @HASH:68e666b07a39f945bbad014a8ebb6ed93e91a1c0
// @DATE:Sun Jun 15 15:03:13 CEST 2014

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString


// @LINE:90
// @LINE:89
// @LINE:87
// @LINE:86
// @LINE:83
// @LINE:80
// @LINE:79
// @LINE:78
// @LINE:77
// @LINE:76
// @LINE:75
// @LINE:74
// @LINE:71
// @LINE:70
// @LINE:68
// @LINE:67
// @LINE:65
// @LINE:64
// @LINE:62
// @LINE:61
// @LINE:59
// @LINE:58
// @LINE:56
// @LINE:55
// @LINE:53
// @LINE:52
// @LINE:49
// @LINE:48
// @LINE:46
// @LINE:45
// @LINE:43
// @LINE:42
// @LINE:40
// @LINE:39
// @LINE:37
// @LINE:36
// @LINE:34
// @LINE:33
// @LINE:31
// @LINE:30
// @LINE:27
// @LINE:26
// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:6
package controllers {

// @LINE:83
class ReverseAssets {
    

// @LINE:83
def at(file:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                
    
}
                          

// @LINE:89
// @LINE:80
// @LINE:71
// @LINE:70
// @LINE:49
// @LINE:48
// @LINE:27
// @LINE:12
class ReverseUsers {
    

// @LINE:80
def delete(id:Long): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "users/" + implicitly[PathBindable[Long]].unbind("id", id) + "/delete")
}
                                                

// @LINE:48
def create(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "users/new")
}
                                                

// @LINE:70
def edit(id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "users/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                

// @LINE:71
def update(id:Long): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "users/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                

// @LINE:27
def list(p:Int = 0, s:String = "login", o:String = "asc", f:String = ""): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "users" + queryString(List(if(p == 0) None else Some(implicitly[QueryStringBindable[Int]].unbind("p", p)), if(s == "login") None else Some(implicitly[QueryStringBindable[String]].unbind("s", s)), if(o == "asc") None else Some(implicitly[QueryStringBindable[String]].unbind("o", o)), if(f == "") None else Some(implicitly[QueryStringBindable[String]].unbind("f", f)))))
}
                                                

// @LINE:49
def save(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "users")
}
                                                

// @LINE:12
def index(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "users/index")
}
                                                

// @LINE:89
def active(id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "users/active/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                
    
}
                          

// @LINE:90
// @LINE:74
// @LINE:53
// @LINE:52
// @LINE:31
// @LINE:30
// @LINE:21
// @LINE:6
class ReverseMatches {
    

// @LINE:74
def delete(id:Long): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "matches/" + implicitly[PathBindable[Long]].unbind("id", id) + "/delete")
}
                                                

// @LINE:90
def live(id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "matches/live/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                

// @LINE:30
def create(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "matches/new")
}
                                                

// @LINE:52
def edit(id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "matches/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                

// @LINE:53
def update(id:Long): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "matches/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                

// @LINE:21
def list(p:Int = 0, s:String = "weather", o:String = "asc", f:String = ""): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "matches" + queryString(List(if(p == 0) None else Some(implicitly[QueryStringBindable[Int]].unbind("p", p)), if(s == "weather") None else Some(implicitly[QueryStringBindable[String]].unbind("s", s)), if(o == "asc") None else Some(implicitly[QueryStringBindable[String]].unbind("o", o)), if(f == "") None else Some(implicitly[QueryStringBindable[String]].unbind("f", f)))))
}
                                                

// @LINE:31
def save(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "matches")
}
                                                

// @LINE:6
def index(): Call = {
   Call("GET", _prefix)
}
                                                
    
}
                          

// @LINE:87
// @LINE:77
// @LINE:62
// @LINE:61
// @LINE:40
// @LINE:39
// @LINE:24
// @LINE:9
class ReversePlayers {
    

// @LINE:87
def upload(id:Long): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "players/upload/" + queryString(List(Some(implicitly[QueryStringBindable[Long]].unbind("id", id)))))
}
                                                

// @LINE:77
def delete(id:Long): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "players/" + implicitly[PathBindable[Long]].unbind("id", id) + "/delete")
}
                                                

// @LINE:39
def create(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "players/new")
}
                                                

// @LINE:61
def edit(id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "players/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                

// @LINE:62
def update(id:Long): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "players/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                

// @LINE:24
def list(p:Int = 0, s:String = "lastname", o:String = "asc", f:String = ""): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "players" + queryString(List(if(p == 0) None else Some(implicitly[QueryStringBindable[Int]].unbind("p", p)), if(s == "lastname") None else Some(implicitly[QueryStringBindable[String]].unbind("s", s)), if(o == "asc") None else Some(implicitly[QueryStringBindable[String]].unbind("o", o)), if(f == "") None else Some(implicitly[QueryStringBindable[String]].unbind("f", f)))))
}
                                                

// @LINE:40
def save(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "players")
}
                                                

// @LINE:9
def index(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "players/index")
}
                                                
    
}
                          

// @LINE:86
// @LINE:75
// @LINE:56
// @LINE:55
// @LINE:34
// @LINE:33
// @LINE:22
// @LINE:13
class ReverseTeams {
    

// @LINE:86
def upload(id:Long): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "teams/upload/" + queryString(List(Some(implicitly[QueryStringBindable[Long]].unbind("id", id)))))
}
                                                

// @LINE:75
def delete(id:Long): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "teams/" + implicitly[PathBindable[Long]].unbind("id", id) + "/delete")
}
                                                

// @LINE:33
def create(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "teams/new")
}
                                                

// @LINE:55
def edit(id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "teams/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                

// @LINE:56
def update(id:Long): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "teams/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                

// @LINE:22
def list(p:Int = 0, s:String = "name", o:String = "asc", f:String = ""): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "teams" + queryString(List(if(p == 0) None else Some(implicitly[QueryStringBindable[Int]].unbind("p", p)), if(s == "name") None else Some(implicitly[QueryStringBindable[String]].unbind("s", s)), if(o == "asc") None else Some(implicitly[QueryStringBindable[String]].unbind("o", o)), if(f == "") None else Some(implicitly[QueryStringBindable[String]].unbind("f", f)))))
}
                                                

// @LINE:34
def save(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "teams")
}
                                                

// @LINE:13
def index(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "teams/index")
}
                                                
    
}
                          

// @LINE:76
// @LINE:59
// @LINE:58
// @LINE:37
// @LINE:36
// @LINE:23
// @LINE:8
class ReverseReferees {
    

// @LINE:76
def delete(id:Long): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "referees/" + implicitly[PathBindable[Long]].unbind("id", id) + "/delete")
}
                                                

// @LINE:36
def create(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "referees/new")
}
                                                

// @LINE:58
def edit(id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "referees/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                

// @LINE:59
def update(id:Long): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "referees/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                

// @LINE:23
def list(p:Int = 0, s:String = "lastname", o:String = "asc", f:String = ""): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "referees" + queryString(List(if(p == 0) None else Some(implicitly[QueryStringBindable[Int]].unbind("p", p)), if(s == "lastname") None else Some(implicitly[QueryStringBindable[String]].unbind("s", s)), if(o == "asc") None else Some(implicitly[QueryStringBindable[String]].unbind("o", o)), if(f == "") None else Some(implicitly[QueryStringBindable[String]].unbind("f", f)))))
}
                                                

// @LINE:37
def save(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "referees")
}
                                                

// @LINE:8
def index(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "referees/index")
}
                                                
    
}
                          

// @LINE:18
// @LINE:17
// @LINE:16
class ReverseApplication {
    

// @LINE:18
def logout(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "logout")
}
                                                

// @LINE:17
def authenticate(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "login")
}
                                                

// @LINE:16
def login(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "login")
}
                                                
    
}
                          

// @LINE:79
// @LINE:68
// @LINE:67
// @LINE:46
// @LINE:45
// @LINE:26
// @LINE:11
class ReverseGames {
    

// @LINE:79
def delete(id:Long): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "games/" + implicitly[PathBindable[Long]].unbind("id", id) + "/delete")
}
                                                

// @LINE:45
def create(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "games/new")
}
                                                

// @LINE:67
def edit(id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "games/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                

// @LINE:68
def update(id:Long): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "games/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                

// @LINE:26
def list(p:Int = 0, s:String = "name", o:String = "asc", f:String = ""): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "games" + queryString(List(if(p == 0) None else Some(implicitly[QueryStringBindable[Int]].unbind("p", p)), if(s == "name") None else Some(implicitly[QueryStringBindable[String]].unbind("s", s)), if(o == "asc") None else Some(implicitly[QueryStringBindable[String]].unbind("o", o)), if(f == "") None else Some(implicitly[QueryStringBindable[String]].unbind("f", f)))))
}
                                                

// @LINE:46
def save(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "games")
}
                                                

// @LINE:11
def index(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "games/index")
}
                                                
    
}
                          

// @LINE:78
// @LINE:65
// @LINE:64
// @LINE:43
// @LINE:42
// @LINE:25
// @LINE:10
class ReverseSeasons {
    

// @LINE:78
def delete(id:Long): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "seasons/" + implicitly[PathBindable[Long]].unbind("id", id) + "/delete")
}
                                                

// @LINE:42
def create(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "seasons/new")
}
                                                

// @LINE:64
def edit(id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "seasons/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                

// @LINE:65
def update(id:Long): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "seasons/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                

// @LINE:25
def list(p:Int = 0, s:String = "year_start", o:String = "asc", f:String = ""): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "seasons" + queryString(List(if(p == 0) None else Some(implicitly[QueryStringBindable[Int]].unbind("p", p)), if(s == "year_start") None else Some(implicitly[QueryStringBindable[String]].unbind("s", s)), if(o == "asc") None else Some(implicitly[QueryStringBindable[String]].unbind("o", o)), if(f == "") None else Some(implicitly[QueryStringBindable[String]].unbind("f", f)))))
}
                                                

// @LINE:43
def save(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "seasons")
}
                                                

// @LINE:10
def index(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "seasons/index")
}
                                                
    
}
                          
}
                  


// @LINE:90
// @LINE:89
// @LINE:87
// @LINE:86
// @LINE:83
// @LINE:80
// @LINE:79
// @LINE:78
// @LINE:77
// @LINE:76
// @LINE:75
// @LINE:74
// @LINE:71
// @LINE:70
// @LINE:68
// @LINE:67
// @LINE:65
// @LINE:64
// @LINE:62
// @LINE:61
// @LINE:59
// @LINE:58
// @LINE:56
// @LINE:55
// @LINE:53
// @LINE:52
// @LINE:49
// @LINE:48
// @LINE:46
// @LINE:45
// @LINE:43
// @LINE:42
// @LINE:40
// @LINE:39
// @LINE:37
// @LINE:36
// @LINE:34
// @LINE:33
// @LINE:31
// @LINE:30
// @LINE:27
// @LINE:26
// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:6
package controllers.javascript {

// @LINE:83
class ReverseAssets {
    

// @LINE:83
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        
    
}
              

// @LINE:89
// @LINE:80
// @LINE:71
// @LINE:70
// @LINE:49
// @LINE:48
// @LINE:27
// @LINE:12
class ReverseUsers {
    

// @LINE:80
def delete : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Users.delete",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "users/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/delete"})
      }
   """
)
                        

// @LINE:48
def create : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Users.create",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "users/new"})
      }
   """
)
                        

// @LINE:70
def edit : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Users.edit",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "users/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:71
def update : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Users.update",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "users/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:27
def list : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Users.list",
   """
      function(p,s,o,f) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "users" + _qS([(p == null ? null : (""" + implicitly[QueryStringBindable[Int]].javascriptUnbind + """)("p", p)), (s == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("s", s)), (o == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("o", o)), (f == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("f", f))])})
      }
   """
)
                        

// @LINE:49
def save : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Users.save",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "users"})
      }
   """
)
                        

// @LINE:12
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Users.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "users/index"})
      }
   """
)
                        

// @LINE:89
def active : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Users.active",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "users/active/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        
    
}
              

// @LINE:90
// @LINE:74
// @LINE:53
// @LINE:52
// @LINE:31
// @LINE:30
// @LINE:21
// @LINE:6
class ReverseMatches {
    

// @LINE:74
def delete : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Matches.delete",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "matches/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/delete"})
      }
   """
)
                        

// @LINE:90
def live : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Matches.live",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "matches/live/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:30
def create : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Matches.create",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "matches/new"})
      }
   """
)
                        

// @LINE:52
def edit : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Matches.edit",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "matches/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:53
def update : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Matches.update",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "matches/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:21
def list : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Matches.list",
   """
      function(p,s,o,f) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "matches" + _qS([(p == null ? null : (""" + implicitly[QueryStringBindable[Int]].javascriptUnbind + """)("p", p)), (s == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("s", s)), (o == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("o", o)), (f == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("f", f))])})
      }
   """
)
                        

// @LINE:31
def save : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Matches.save",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "matches"})
      }
   """
)
                        

// @LINE:6
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Matches.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        
    
}
              

// @LINE:87
// @LINE:77
// @LINE:62
// @LINE:61
// @LINE:40
// @LINE:39
// @LINE:24
// @LINE:9
class ReversePlayers {
    

// @LINE:87
def upload : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Players.upload",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "players/upload/" + _qS([(""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("id", id)])})
      }
   """
)
                        

// @LINE:77
def delete : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Players.delete",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "players/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/delete"})
      }
   """
)
                        

// @LINE:39
def create : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Players.create",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "players/new"})
      }
   """
)
                        

// @LINE:61
def edit : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Players.edit",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "players/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:62
def update : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Players.update",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "players/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:24
def list : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Players.list",
   """
      function(p,s,o,f) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "players" + _qS([(p == null ? null : (""" + implicitly[QueryStringBindable[Int]].javascriptUnbind + """)("p", p)), (s == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("s", s)), (o == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("o", o)), (f == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("f", f))])})
      }
   """
)
                        

// @LINE:40
def save : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Players.save",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "players"})
      }
   """
)
                        

// @LINE:9
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Players.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "players/index"})
      }
   """
)
                        
    
}
              

// @LINE:86
// @LINE:75
// @LINE:56
// @LINE:55
// @LINE:34
// @LINE:33
// @LINE:22
// @LINE:13
class ReverseTeams {
    

// @LINE:86
def upload : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Teams.upload",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "teams/upload/" + _qS([(""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("id", id)])})
      }
   """
)
                        

// @LINE:75
def delete : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Teams.delete",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "teams/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/delete"})
      }
   """
)
                        

// @LINE:33
def create : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Teams.create",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "teams/new"})
      }
   """
)
                        

// @LINE:55
def edit : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Teams.edit",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "teams/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:56
def update : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Teams.update",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "teams/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:22
def list : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Teams.list",
   """
      function(p,s,o,f) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "teams" + _qS([(p == null ? null : (""" + implicitly[QueryStringBindable[Int]].javascriptUnbind + """)("p", p)), (s == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("s", s)), (o == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("o", o)), (f == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("f", f))])})
      }
   """
)
                        

// @LINE:34
def save : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Teams.save",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "teams"})
      }
   """
)
                        

// @LINE:13
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Teams.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "teams/index"})
      }
   """
)
                        
    
}
              

// @LINE:76
// @LINE:59
// @LINE:58
// @LINE:37
// @LINE:36
// @LINE:23
// @LINE:8
class ReverseReferees {
    

// @LINE:76
def delete : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Referees.delete",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "referees/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/delete"})
      }
   """
)
                        

// @LINE:36
def create : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Referees.create",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "referees/new"})
      }
   """
)
                        

// @LINE:58
def edit : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Referees.edit",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "referees/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:59
def update : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Referees.update",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "referees/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:23
def list : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Referees.list",
   """
      function(p,s,o,f) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "referees" + _qS([(p == null ? null : (""" + implicitly[QueryStringBindable[Int]].javascriptUnbind + """)("p", p)), (s == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("s", s)), (o == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("o", o)), (f == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("f", f))])})
      }
   """
)
                        

// @LINE:37
def save : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Referees.save",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "referees"})
      }
   """
)
                        

// @LINE:8
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Referees.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "referees/index"})
      }
   """
)
                        
    
}
              

// @LINE:18
// @LINE:17
// @LINE:16
class ReverseApplication {
    

// @LINE:18
def logout : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.logout",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "logout"})
      }
   """
)
                        

// @LINE:17
def authenticate : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.authenticate",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
      }
   """
)
                        

// @LINE:16
def login : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.login",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
      }
   """
)
                        
    
}
              

// @LINE:79
// @LINE:68
// @LINE:67
// @LINE:46
// @LINE:45
// @LINE:26
// @LINE:11
class ReverseGames {
    

// @LINE:79
def delete : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Games.delete",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "games/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/delete"})
      }
   """
)
                        

// @LINE:45
def create : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Games.create",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "games/new"})
      }
   """
)
                        

// @LINE:67
def edit : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Games.edit",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "games/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:68
def update : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Games.update",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "games/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:26
def list : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Games.list",
   """
      function(p,s,o,f) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "games" + _qS([(p == null ? null : (""" + implicitly[QueryStringBindable[Int]].javascriptUnbind + """)("p", p)), (s == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("s", s)), (o == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("o", o)), (f == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("f", f))])})
      }
   """
)
                        

// @LINE:46
def save : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Games.save",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "games"})
      }
   """
)
                        

// @LINE:11
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Games.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "games/index"})
      }
   """
)
                        
    
}
              

// @LINE:78
// @LINE:65
// @LINE:64
// @LINE:43
// @LINE:42
// @LINE:25
// @LINE:10
class ReverseSeasons {
    

// @LINE:78
def delete : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Seasons.delete",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "seasons/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/delete"})
      }
   """
)
                        

// @LINE:42
def create : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Seasons.create",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "seasons/new"})
      }
   """
)
                        

// @LINE:64
def edit : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Seasons.edit",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "seasons/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:65
def update : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Seasons.update",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "seasons/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:25
def list : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Seasons.list",
   """
      function(p,s,o,f) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "seasons" + _qS([(p == null ? null : (""" + implicitly[QueryStringBindable[Int]].javascriptUnbind + """)("p", p)), (s == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("s", s)), (o == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("o", o)), (f == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("f", f))])})
      }
   """
)
                        

// @LINE:43
def save : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Seasons.save",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "seasons"})
      }
   """
)
                        

// @LINE:10
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Seasons.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "seasons/index"})
      }
   """
)
                        
    
}
              
}
        


// @LINE:90
// @LINE:89
// @LINE:87
// @LINE:86
// @LINE:83
// @LINE:80
// @LINE:79
// @LINE:78
// @LINE:77
// @LINE:76
// @LINE:75
// @LINE:74
// @LINE:71
// @LINE:70
// @LINE:68
// @LINE:67
// @LINE:65
// @LINE:64
// @LINE:62
// @LINE:61
// @LINE:59
// @LINE:58
// @LINE:56
// @LINE:55
// @LINE:53
// @LINE:52
// @LINE:49
// @LINE:48
// @LINE:46
// @LINE:45
// @LINE:43
// @LINE:42
// @LINE:40
// @LINE:39
// @LINE:37
// @LINE:36
// @LINE:34
// @LINE:33
// @LINE:31
// @LINE:30
// @LINE:27
// @LINE:26
// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:6
package controllers.ref {


// @LINE:83
class ReverseAssets {
    

// @LINE:83
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      
    
}
                          

// @LINE:89
// @LINE:80
// @LINE:71
// @LINE:70
// @LINE:49
// @LINE:48
// @LINE:27
// @LINE:12
class ReverseUsers {
    

// @LINE:80
def delete(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Users.delete(id), HandlerDef(this, "controllers.Users", "delete", Seq(classOf[Long]), "POST", """""", _prefix + """users/$id<[^/]+>/delete""")
)
                      

// @LINE:48
def create(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Users.create(), HandlerDef(this, "controllers.Users", "create", Seq(), "GET", """""", _prefix + """users/new""")
)
                      

// @LINE:70
def edit(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Users.edit(id), HandlerDef(this, "controllers.Users", "edit", Seq(classOf[Long]), "GET", """""", _prefix + """users/$id<[^/]+>""")
)
                      

// @LINE:71
def update(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Users.update(id), HandlerDef(this, "controllers.Users", "update", Seq(classOf[Long]), "POST", """""", _prefix + """users/$id<[^/]+>""")
)
                      

// @LINE:27
def list(p:Int, s:String, o:String, f:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Users.list(p, s, o, f), HandlerDef(this, "controllers.Users", "list", Seq(classOf[Int], classOf[String], classOf[String], classOf[String]), "GET", """""", _prefix + """users""")
)
                      

// @LINE:49
def save(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Users.save(), HandlerDef(this, "controllers.Users", "save", Seq(), "POST", """""", _prefix + """users""")
)
                      

// @LINE:12
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Users.index(), HandlerDef(this, "controllers.Users", "index", Seq(), "GET", """""", _prefix + """users/index""")
)
                      

// @LINE:89
def active(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Users.active(id), HandlerDef(this, "controllers.Users", "active", Seq(classOf[Long]), "GET", """""", _prefix + """users/active/$id<[^/]+>""")
)
                      
    
}
                          

// @LINE:90
// @LINE:74
// @LINE:53
// @LINE:52
// @LINE:31
// @LINE:30
// @LINE:21
// @LINE:6
class ReverseMatches {
    

// @LINE:74
def delete(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Matches.delete(id), HandlerDef(this, "controllers.Matches", "delete", Seq(classOf[Long]), "POST", """ Delete""", _prefix + """matches/$id<[^/]+>/delete""")
)
                      

// @LINE:90
def live(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Matches.live(id), HandlerDef(this, "controllers.Matches", "live", Seq(classOf[Long]), "GET", """""", _prefix + """matches/live/$id<[^/]+>""")
)
                      

// @LINE:30
def create(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Matches.create(), HandlerDef(this, "controllers.Matches", "create", Seq(), "GET", """ Add""", _prefix + """matches/new""")
)
                      

// @LINE:52
def edit(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Matches.edit(id), HandlerDef(this, "controllers.Matches", "edit", Seq(classOf[Long]), "GET", """ Edit""", _prefix + """matches/$id<[^/]+>""")
)
                      

// @LINE:53
def update(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Matches.update(id), HandlerDef(this, "controllers.Matches", "update", Seq(classOf[Long]), "POST", """""", _prefix + """matches/$id<[^/]+>""")
)
                      

// @LINE:21
def list(p:Int, s:String, o:String, f:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Matches.list(p, s, o, f), HandlerDef(this, "controllers.Matches", "list", Seq(classOf[Int], classOf[String], classOf[String], classOf[String]), "GET", """  list (look at the default values for pagination parameters)""", _prefix + """matches""")
)
                      

// @LINE:31
def save(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Matches.save(), HandlerDef(this, "controllers.Matches", "save", Seq(), "POST", """""", _prefix + """matches""")
)
                      

// @LINE:6
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Matches.index(), HandlerDef(this, "controllers.Matches", "index", Seq(), "GET", """ Default path will just redirect to the list""", _prefix + """""")
)
                      
    
}
                          

// @LINE:87
// @LINE:77
// @LINE:62
// @LINE:61
// @LINE:40
// @LINE:39
// @LINE:24
// @LINE:9
class ReversePlayers {
    

// @LINE:87
def upload(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Players.upload(id), HandlerDef(this, "controllers.Players", "upload", Seq(classOf[Long]), "POST", """""", _prefix + """players/upload/""")
)
                      

// @LINE:77
def delete(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Players.delete(id), HandlerDef(this, "controllers.Players", "delete", Seq(classOf[Long]), "POST", """""", _prefix + """players/$id<[^/]+>/delete""")
)
                      

// @LINE:39
def create(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Players.create(), HandlerDef(this, "controllers.Players", "create", Seq(), "GET", """""", _prefix + """players/new""")
)
                      

// @LINE:61
def edit(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Players.edit(id), HandlerDef(this, "controllers.Players", "edit", Seq(classOf[Long]), "GET", """""", _prefix + """players/$id<[^/]+>""")
)
                      

// @LINE:62
def update(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Players.update(id), HandlerDef(this, "controllers.Players", "update", Seq(classOf[Long]), "POST", """""", _prefix + """players/$id<[^/]+>""")
)
                      

// @LINE:24
def list(p:Int, s:String, o:String, f:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Players.list(p, s, o, f), HandlerDef(this, "controllers.Players", "list", Seq(classOf[Int], classOf[String], classOf[String], classOf[String]), "GET", """""", _prefix + """players""")
)
                      

// @LINE:40
def save(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Players.save(), HandlerDef(this, "controllers.Players", "save", Seq(), "POST", """""", _prefix + """players""")
)
                      

// @LINE:9
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Players.index(), HandlerDef(this, "controllers.Players", "index", Seq(), "GET", """""", _prefix + """players/index""")
)
                      
    
}
                          

// @LINE:86
// @LINE:75
// @LINE:56
// @LINE:55
// @LINE:34
// @LINE:33
// @LINE:22
// @LINE:13
class ReverseTeams {
    

// @LINE:86
def upload(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Teams.upload(id), HandlerDef(this, "controllers.Teams", "upload", Seq(classOf[Long]), "POST", """ Upload""", _prefix + """teams/upload/""")
)
                      

// @LINE:75
def delete(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Teams.delete(id), HandlerDef(this, "controllers.Teams", "delete", Seq(classOf[Long]), "POST", """""", _prefix + """teams/$id<[^/]+>/delete""")
)
                      

// @LINE:33
def create(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Teams.create(), HandlerDef(this, "controllers.Teams", "create", Seq(), "GET", """""", _prefix + """teams/new""")
)
                      

// @LINE:55
def edit(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Teams.edit(id), HandlerDef(this, "controllers.Teams", "edit", Seq(classOf[Long]), "GET", """""", _prefix + """teams/$id<[^/]+>""")
)
                      

// @LINE:56
def update(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Teams.update(id), HandlerDef(this, "controllers.Teams", "update", Seq(classOf[Long]), "POST", """""", _prefix + """teams/$id<[^/]+>""")
)
                      

// @LINE:22
def list(p:Int, s:String, o:String, f:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Teams.list(p, s, o, f), HandlerDef(this, "controllers.Teams", "list", Seq(classOf[Int], classOf[String], classOf[String], classOf[String]), "GET", """""", _prefix + """teams""")
)
                      

// @LINE:34
def save(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Teams.save(), HandlerDef(this, "controllers.Teams", "save", Seq(), "POST", """""", _prefix + """teams""")
)
                      

// @LINE:13
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Teams.index(), HandlerDef(this, "controllers.Teams", "index", Seq(), "GET", """""", _prefix + """teams/index""")
)
                      
    
}
                          

// @LINE:76
// @LINE:59
// @LINE:58
// @LINE:37
// @LINE:36
// @LINE:23
// @LINE:8
class ReverseReferees {
    

// @LINE:76
def delete(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Referees.delete(id), HandlerDef(this, "controllers.Referees", "delete", Seq(classOf[Long]), "POST", """""", _prefix + """referees/$id<[^/]+>/delete""")
)
                      

// @LINE:36
def create(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Referees.create(), HandlerDef(this, "controllers.Referees", "create", Seq(), "GET", """""", _prefix + """referees/new""")
)
                      

// @LINE:58
def edit(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Referees.edit(id), HandlerDef(this, "controllers.Referees", "edit", Seq(classOf[Long]), "GET", """""", _prefix + """referees/$id<[^/]+>""")
)
                      

// @LINE:59
def update(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Referees.update(id), HandlerDef(this, "controllers.Referees", "update", Seq(classOf[Long]), "POST", """""", _prefix + """referees/$id<[^/]+>""")
)
                      

// @LINE:23
def list(p:Int, s:String, o:String, f:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Referees.list(p, s, o, f), HandlerDef(this, "controllers.Referees", "list", Seq(classOf[Int], classOf[String], classOf[String], classOf[String]), "GET", """""", _prefix + """referees""")
)
                      

// @LINE:37
def save(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Referees.save(), HandlerDef(this, "controllers.Referees", "save", Seq(), "POST", """""", _prefix + """referees""")
)
                      

// @LINE:8
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Referees.index(), HandlerDef(this, "controllers.Referees", "index", Seq(), "GET", """GET     /matches/index              controllers.Matches.index()""", _prefix + """referees/index""")
)
                      
    
}
                          

// @LINE:18
// @LINE:17
// @LINE:16
class ReverseApplication {
    

// @LINE:18
def logout(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.logout(), HandlerDef(this, "controllers.Application", "logout", Seq(), "GET", """""", _prefix + """logout""")
)
                      

// @LINE:17
def authenticate(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.authenticate(), HandlerDef(this, "controllers.Application", "authenticate", Seq(), "POST", """""", _prefix + """login""")
)
                      

// @LINE:16
def login(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.login(), HandlerDef(this, "controllers.Application", "login", Seq(), "GET", """ Authentication""", _prefix + """login""")
)
                      
    
}
                          

// @LINE:79
// @LINE:68
// @LINE:67
// @LINE:46
// @LINE:45
// @LINE:26
// @LINE:11
class ReverseGames {
    

// @LINE:79
def delete(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Games.delete(id), HandlerDef(this, "controllers.Games", "delete", Seq(classOf[Long]), "POST", """""", _prefix + """games/$id<[^/]+>/delete""")
)
                      

// @LINE:45
def create(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Games.create(), HandlerDef(this, "controllers.Games", "create", Seq(), "GET", """""", _prefix + """games/new""")
)
                      

// @LINE:67
def edit(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Games.edit(id), HandlerDef(this, "controllers.Games", "edit", Seq(classOf[Long]), "GET", """""", _prefix + """games/$id<[^/]+>""")
)
                      

// @LINE:68
def update(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Games.update(id), HandlerDef(this, "controllers.Games", "update", Seq(classOf[Long]), "POST", """""", _prefix + """games/$id<[^/]+>""")
)
                      

// @LINE:26
def list(p:Int, s:String, o:String, f:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Games.list(p, s, o, f), HandlerDef(this, "controllers.Games", "list", Seq(classOf[Int], classOf[String], classOf[String], classOf[String]), "GET", """""", _prefix + """games""")
)
                      

// @LINE:46
def save(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Games.save(), HandlerDef(this, "controllers.Games", "save", Seq(), "POST", """""", _prefix + """games""")
)
                      

// @LINE:11
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Games.index(), HandlerDef(this, "controllers.Games", "index", Seq(), "GET", """""", _prefix + """games/index""")
)
                      
    
}
                          

// @LINE:78
// @LINE:65
// @LINE:64
// @LINE:43
// @LINE:42
// @LINE:25
// @LINE:10
class ReverseSeasons {
    

// @LINE:78
def delete(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Seasons.delete(id), HandlerDef(this, "controllers.Seasons", "delete", Seq(classOf[Long]), "POST", """""", _prefix + """seasons/$id<[^/]+>/delete""")
)
                      

// @LINE:42
def create(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Seasons.create(), HandlerDef(this, "controllers.Seasons", "create", Seq(), "GET", """""", _prefix + """seasons/new""")
)
                      

// @LINE:64
def edit(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Seasons.edit(id), HandlerDef(this, "controllers.Seasons", "edit", Seq(classOf[Long]), "GET", """""", _prefix + """seasons/$id<[^/]+>""")
)
                      

// @LINE:65
def update(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Seasons.update(id), HandlerDef(this, "controllers.Seasons", "update", Seq(classOf[Long]), "POST", """""", _prefix + """seasons/$id<[^/]+>""")
)
                      

// @LINE:25
def list(p:Int, s:String, o:String, f:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Seasons.list(p, s, o, f), HandlerDef(this, "controllers.Seasons", "list", Seq(classOf[Int], classOf[String], classOf[String], classOf[String]), "GET", """""", _prefix + """seasons""")
)
                      

// @LINE:43
def save(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Seasons.save(), HandlerDef(this, "controllers.Seasons", "save", Seq(), "POST", """""", _prefix + """seasons""")
)
                      

// @LINE:10
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Seasons.index(), HandlerDef(this, "controllers.Seasons", "index", Seq(), "GET", """""", _prefix + """seasons/index""")
)
                      
    
}
                          
}
        
    