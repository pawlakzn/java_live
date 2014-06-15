// @SOURCE:D:/Pawlak/Play/live/conf/routes
// @HASH:b1cbac74d6cddbd58916b920fb953019a131e26c
// @DATE:Sun Jun 15 23:09:43 CEST 2014

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString


// @LINE:99
// @LINE:98
// @LINE:96
// @LINE:95
// @LINE:92
// @LINE:89
// @LINE:88
// @LINE:87
// @LINE:86
// @LINE:85
// @LINE:84
// @LINE:83
// @LINE:82
// @LINE:79
// @LINE:78
// @LINE:76
// @LINE:75
// @LINE:73
// @LINE:72
// @LINE:70
// @LINE:69
// @LINE:67
// @LINE:66
// @LINE:64
// @LINE:63
// @LINE:61
// @LINE:60
// @LINE:58
// @LINE:57
// @LINE:54
// @LINE:53
// @LINE:51
// @LINE:50
// @LINE:48
// @LINE:47
// @LINE:45
// @LINE:44
// @LINE:42
// @LINE:41
// @LINE:39
// @LINE:38
// @LINE:36
// @LINE:35
// @LINE:33
// @LINE:32
// @LINE:29
// @LINE:28
// @LINE:27
// @LINE:26
// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:6
package controllers {

// @LINE:92
class ReverseAssets {
    

// @LINE:92
def at(file:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                
    
}
                          

// @LINE:89
// @LINE:79
// @LINE:78
// @LINE:54
// @LINE:53
// @LINE:29
// @LINE:14
class ReverseVideos {
    

// @LINE:89
def delete(id:Long): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "videos/" + implicitly[PathBindable[Long]].unbind("id", id) + "/delete")
}
                                                

// @LINE:53
def create(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "videos/new")
}
                                                

// @LINE:78
def edit(id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "videos/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                

// @LINE:79
def update(id:Long): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "videos/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                

// @LINE:29
def list(p:Int = 0, s:String = "name", o:String = "asc", f:String = ""): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "videos" + queryString(List(if(p == 0) None else Some(implicitly[QueryStringBindable[Int]].unbind("p", p)), if(s == "name") None else Some(implicitly[QueryStringBindable[String]].unbind("s", s)), if(o == "asc") None else Some(implicitly[QueryStringBindable[String]].unbind("o", o)), if(f == "") None else Some(implicitly[QueryStringBindable[String]].unbind("f", f)))))
}
                                                

// @LINE:54
def save(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "videos")
}
                                                

// @LINE:14
def index(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "videos/index")
}
                                                
    
}
                          

// @LINE:98
// @LINE:88
// @LINE:76
// @LINE:75
// @LINE:51
// @LINE:50
// @LINE:28
// @LINE:12
class ReverseUsers {
    

// @LINE:88
def delete(id:Long): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "users/" + implicitly[PathBindable[Long]].unbind("id", id) + "/delete")
}
                                                

// @LINE:50
def create(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "users/new")
}
                                                

// @LINE:75
def edit(id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "users/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                

// @LINE:76
def update(id:Long): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "users/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                

// @LINE:28
def list(p:Int = 0, s:String = "login", o:String = "asc", f:String = ""): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "users" + queryString(List(if(p == 0) None else Some(implicitly[QueryStringBindable[Int]].unbind("p", p)), if(s == "login") None else Some(implicitly[QueryStringBindable[String]].unbind("s", s)), if(o == "asc") None else Some(implicitly[QueryStringBindable[String]].unbind("o", o)), if(f == "") None else Some(implicitly[QueryStringBindable[String]].unbind("f", f)))))
}
                                                

// @LINE:51
def save(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "users")
}
                                                

// @LINE:12
def index(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "users/index")
}
                                                

// @LINE:98
def active(id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "users/active/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                
    
}
                          

// @LINE:99
// @LINE:82
// @LINE:58
// @LINE:57
// @LINE:33
// @LINE:32
// @LINE:22
// @LINE:6
class ReverseMatches {
    

// @LINE:82
def delete(id:Long): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "matches/" + implicitly[PathBindable[Long]].unbind("id", id) + "/delete")
}
                                                

// @LINE:99
def live(id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "matches/live/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                

// @LINE:32
def create(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "matches/new")
}
                                                

// @LINE:57
def edit(id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "matches/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                

// @LINE:58
def update(id:Long): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "matches/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                

// @LINE:22
def list(p:Int = 0, s:String = "weather", o:String = "asc", f:String = ""): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "matches" + queryString(List(if(p == 0) None else Some(implicitly[QueryStringBindable[Int]].unbind("p", p)), if(s == "weather") None else Some(implicitly[QueryStringBindable[String]].unbind("s", s)), if(o == "asc") None else Some(implicitly[QueryStringBindable[String]].unbind("o", o)), if(f == "") None else Some(implicitly[QueryStringBindable[String]].unbind("f", f)))))
}
                                                

// @LINE:33
def save(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "matches")
}
                                                

// @LINE:6
def index(): Call = {
   Call("GET", _prefix)
}
                                                
    
}
                          

// @LINE:96
// @LINE:85
// @LINE:67
// @LINE:66
// @LINE:42
// @LINE:41
// @LINE:25
// @LINE:9
class ReversePlayers {
    

// @LINE:96
def upload(id:Long): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "players/upload/" + queryString(List(Some(implicitly[QueryStringBindable[Long]].unbind("id", id)))))
}
                                                

// @LINE:85
def delete(id:Long): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "players/" + implicitly[PathBindable[Long]].unbind("id", id) + "/delete")
}
                                                

// @LINE:41
def create(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "players/new")
}
                                                

// @LINE:66
def edit(id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "players/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                

// @LINE:67
def update(id:Long): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "players/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                

// @LINE:25
def list(p:Int = 0, s:String = "lastname", o:String = "asc", f:String = ""): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "players" + queryString(List(if(p == 0) None else Some(implicitly[QueryStringBindable[Int]].unbind("p", p)), if(s == "lastname") None else Some(implicitly[QueryStringBindable[String]].unbind("s", s)), if(o == "asc") None else Some(implicitly[QueryStringBindable[String]].unbind("o", o)), if(f == "") None else Some(implicitly[QueryStringBindable[String]].unbind("f", f)))))
}
                                                

// @LINE:42
def save(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "players")
}
                                                

// @LINE:9
def index(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "players/index")
}
                                                
    
}
                          

// @LINE:95
// @LINE:83
// @LINE:61
// @LINE:60
// @LINE:36
// @LINE:35
// @LINE:23
// @LINE:13
class ReverseTeams {
    

// @LINE:95
def upload(id:Long): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "teams/upload/" + queryString(List(Some(implicitly[QueryStringBindable[Long]].unbind("id", id)))))
}
                                                

// @LINE:83
def delete(id:Long): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "teams/" + implicitly[PathBindable[Long]].unbind("id", id) + "/delete")
}
                                                

// @LINE:35
def create(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "teams/new")
}
                                                

// @LINE:60
def edit(id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "teams/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                

// @LINE:61
def update(id:Long): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "teams/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                

// @LINE:23
def list(p:Int = 0, s:String = "name", o:String = "asc", f:String = ""): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "teams" + queryString(List(if(p == 0) None else Some(implicitly[QueryStringBindable[Int]].unbind("p", p)), if(s == "name") None else Some(implicitly[QueryStringBindable[String]].unbind("s", s)), if(o == "asc") None else Some(implicitly[QueryStringBindable[String]].unbind("o", o)), if(f == "") None else Some(implicitly[QueryStringBindable[String]].unbind("f", f)))))
}
                                                

// @LINE:36
def save(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "teams")
}
                                                

// @LINE:13
def index(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "teams/index")
}
                                                
    
}
                          

// @LINE:84
// @LINE:64
// @LINE:63
// @LINE:39
// @LINE:38
// @LINE:24
// @LINE:8
class ReverseReferees {
    

// @LINE:84
def delete(id:Long): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "referees/" + implicitly[PathBindable[Long]].unbind("id", id) + "/delete")
}
                                                

// @LINE:38
def create(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "referees/new")
}
                                                

// @LINE:63
def edit(id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "referees/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                

// @LINE:64
def update(id:Long): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "referees/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                

// @LINE:24
def list(p:Int = 0, s:String = "lastname", o:String = "asc", f:String = ""): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "referees" + queryString(List(if(p == 0) None else Some(implicitly[QueryStringBindable[Int]].unbind("p", p)), if(s == "lastname") None else Some(implicitly[QueryStringBindable[String]].unbind("s", s)), if(o == "asc") None else Some(implicitly[QueryStringBindable[String]].unbind("o", o)), if(f == "") None else Some(implicitly[QueryStringBindable[String]].unbind("f", f)))))
}
                                                

// @LINE:39
def save(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "referees")
}
                                                

// @LINE:8
def index(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "referees/index")
}
                                                
    
}
                          

// @LINE:19
// @LINE:18
// @LINE:17
class ReverseApplication {
    

// @LINE:19
def logout(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "logout")
}
                                                

// @LINE:18
def authenticate(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "login")
}
                                                

// @LINE:17
def login(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "login")
}
                                                
    
}
                          

// @LINE:87
// @LINE:73
// @LINE:72
// @LINE:48
// @LINE:47
// @LINE:27
// @LINE:11
class ReverseGames {
    

// @LINE:87
def delete(id:Long): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "games/" + implicitly[PathBindable[Long]].unbind("id", id) + "/delete")
}
                                                

// @LINE:47
def create(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "games/new")
}
                                                

// @LINE:72
def edit(id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "games/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                

// @LINE:73
def update(id:Long): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "games/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                

// @LINE:27
def list(p:Int = 0, s:String = "name", o:String = "asc", f:String = ""): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "games" + queryString(List(if(p == 0) None else Some(implicitly[QueryStringBindable[Int]].unbind("p", p)), if(s == "name") None else Some(implicitly[QueryStringBindable[String]].unbind("s", s)), if(o == "asc") None else Some(implicitly[QueryStringBindable[String]].unbind("o", o)), if(f == "") None else Some(implicitly[QueryStringBindable[String]].unbind("f", f)))))
}
                                                

// @LINE:48
def save(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "games")
}
                                                

// @LINE:11
def index(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "games/index")
}
                                                
    
}
                          

// @LINE:86
// @LINE:70
// @LINE:69
// @LINE:45
// @LINE:44
// @LINE:26
// @LINE:10
class ReverseSeasons {
    

// @LINE:86
def delete(id:Long): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "seasons/" + implicitly[PathBindable[Long]].unbind("id", id) + "/delete")
}
                                                

// @LINE:44
def create(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "seasons/new")
}
                                                

// @LINE:69
def edit(id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "seasons/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                

// @LINE:70
def update(id:Long): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "seasons/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                

// @LINE:26
def list(p:Int = 0, s:String = "year_start", o:String = "asc", f:String = ""): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "seasons" + queryString(List(if(p == 0) None else Some(implicitly[QueryStringBindable[Int]].unbind("p", p)), if(s == "year_start") None else Some(implicitly[QueryStringBindable[String]].unbind("s", s)), if(o == "asc") None else Some(implicitly[QueryStringBindable[String]].unbind("o", o)), if(f == "") None else Some(implicitly[QueryStringBindable[String]].unbind("f", f)))))
}
                                                

// @LINE:45
def save(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "seasons")
}
                                                

// @LINE:10
def index(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "seasons/index")
}
                                                
    
}
                          
}
                  


// @LINE:99
// @LINE:98
// @LINE:96
// @LINE:95
// @LINE:92
// @LINE:89
// @LINE:88
// @LINE:87
// @LINE:86
// @LINE:85
// @LINE:84
// @LINE:83
// @LINE:82
// @LINE:79
// @LINE:78
// @LINE:76
// @LINE:75
// @LINE:73
// @LINE:72
// @LINE:70
// @LINE:69
// @LINE:67
// @LINE:66
// @LINE:64
// @LINE:63
// @LINE:61
// @LINE:60
// @LINE:58
// @LINE:57
// @LINE:54
// @LINE:53
// @LINE:51
// @LINE:50
// @LINE:48
// @LINE:47
// @LINE:45
// @LINE:44
// @LINE:42
// @LINE:41
// @LINE:39
// @LINE:38
// @LINE:36
// @LINE:35
// @LINE:33
// @LINE:32
// @LINE:29
// @LINE:28
// @LINE:27
// @LINE:26
// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:6
package controllers.javascript {

// @LINE:92
class ReverseAssets {
    

// @LINE:92
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
// @LINE:79
// @LINE:78
// @LINE:54
// @LINE:53
// @LINE:29
// @LINE:14
class ReverseVideos {
    

// @LINE:89
def delete : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Videos.delete",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "videos/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/delete"})
      }
   """
)
                        

// @LINE:53
def create : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Videos.create",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "videos/new"})
      }
   """
)
                        

// @LINE:78
def edit : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Videos.edit",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "videos/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:79
def update : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Videos.update",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "videos/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:29
def list : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Videos.list",
   """
      function(p,s,o,f) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "videos" + _qS([(p == null ? null : (""" + implicitly[QueryStringBindable[Int]].javascriptUnbind + """)("p", p)), (s == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("s", s)), (o == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("o", o)), (f == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("f", f))])})
      }
   """
)
                        

// @LINE:54
def save : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Videos.save",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "videos"})
      }
   """
)
                        

// @LINE:14
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Videos.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "videos/index"})
      }
   """
)
                        
    
}
              

// @LINE:98
// @LINE:88
// @LINE:76
// @LINE:75
// @LINE:51
// @LINE:50
// @LINE:28
// @LINE:12
class ReverseUsers {
    

// @LINE:88
def delete : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Users.delete",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "users/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/delete"})
      }
   """
)
                        

// @LINE:50
def create : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Users.create",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "users/new"})
      }
   """
)
                        

// @LINE:75
def edit : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Users.edit",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "users/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:76
def update : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Users.update",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "users/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:28
def list : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Users.list",
   """
      function(p,s,o,f) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "users" + _qS([(p == null ? null : (""" + implicitly[QueryStringBindable[Int]].javascriptUnbind + """)("p", p)), (s == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("s", s)), (o == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("o", o)), (f == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("f", f))])})
      }
   """
)
                        

// @LINE:51
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
                        

// @LINE:98
def active : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Users.active",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "users/active/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        
    
}
              

// @LINE:99
// @LINE:82
// @LINE:58
// @LINE:57
// @LINE:33
// @LINE:32
// @LINE:22
// @LINE:6
class ReverseMatches {
    

// @LINE:82
def delete : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Matches.delete",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "matches/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/delete"})
      }
   """
)
                        

// @LINE:99
def live : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Matches.live",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "matches/live/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:32
def create : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Matches.create",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "matches/new"})
      }
   """
)
                        

// @LINE:57
def edit : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Matches.edit",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "matches/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:58
def update : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Matches.update",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "matches/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:22
def list : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Matches.list",
   """
      function(p,s,o,f) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "matches" + _qS([(p == null ? null : (""" + implicitly[QueryStringBindable[Int]].javascriptUnbind + """)("p", p)), (s == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("s", s)), (o == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("o", o)), (f == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("f", f))])})
      }
   """
)
                        

// @LINE:33
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
              

// @LINE:96
// @LINE:85
// @LINE:67
// @LINE:66
// @LINE:42
// @LINE:41
// @LINE:25
// @LINE:9
class ReversePlayers {
    

// @LINE:96
def upload : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Players.upload",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "players/upload/" + _qS([(""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("id", id)])})
      }
   """
)
                        

// @LINE:85
def delete : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Players.delete",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "players/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/delete"})
      }
   """
)
                        

// @LINE:41
def create : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Players.create",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "players/new"})
      }
   """
)
                        

// @LINE:66
def edit : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Players.edit",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "players/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:67
def update : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Players.update",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "players/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:25
def list : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Players.list",
   """
      function(p,s,o,f) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "players" + _qS([(p == null ? null : (""" + implicitly[QueryStringBindable[Int]].javascriptUnbind + """)("p", p)), (s == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("s", s)), (o == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("o", o)), (f == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("f", f))])})
      }
   """
)
                        

// @LINE:42
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
              

// @LINE:95
// @LINE:83
// @LINE:61
// @LINE:60
// @LINE:36
// @LINE:35
// @LINE:23
// @LINE:13
class ReverseTeams {
    

// @LINE:95
def upload : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Teams.upload",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "teams/upload/" + _qS([(""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("id", id)])})
      }
   """
)
                        

// @LINE:83
def delete : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Teams.delete",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "teams/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/delete"})
      }
   """
)
                        

// @LINE:35
def create : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Teams.create",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "teams/new"})
      }
   """
)
                        

// @LINE:60
def edit : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Teams.edit",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "teams/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:61
def update : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Teams.update",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "teams/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:23
def list : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Teams.list",
   """
      function(p,s,o,f) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "teams" + _qS([(p == null ? null : (""" + implicitly[QueryStringBindable[Int]].javascriptUnbind + """)("p", p)), (s == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("s", s)), (o == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("o", o)), (f == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("f", f))])})
      }
   """
)
                        

// @LINE:36
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
              

// @LINE:84
// @LINE:64
// @LINE:63
// @LINE:39
// @LINE:38
// @LINE:24
// @LINE:8
class ReverseReferees {
    

// @LINE:84
def delete : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Referees.delete",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "referees/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/delete"})
      }
   """
)
                        

// @LINE:38
def create : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Referees.create",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "referees/new"})
      }
   """
)
                        

// @LINE:63
def edit : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Referees.edit",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "referees/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:64
def update : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Referees.update",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "referees/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:24
def list : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Referees.list",
   """
      function(p,s,o,f) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "referees" + _qS([(p == null ? null : (""" + implicitly[QueryStringBindable[Int]].javascriptUnbind + """)("p", p)), (s == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("s", s)), (o == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("o", o)), (f == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("f", f))])})
      }
   """
)
                        

// @LINE:39
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
              

// @LINE:19
// @LINE:18
// @LINE:17
class ReverseApplication {
    

// @LINE:19
def logout : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.logout",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "logout"})
      }
   """
)
                        

// @LINE:18
def authenticate : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.authenticate",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
      }
   """
)
                        

// @LINE:17
def login : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.login",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
      }
   """
)
                        
    
}
              

// @LINE:87
// @LINE:73
// @LINE:72
// @LINE:48
// @LINE:47
// @LINE:27
// @LINE:11
class ReverseGames {
    

// @LINE:87
def delete : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Games.delete",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "games/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/delete"})
      }
   """
)
                        

// @LINE:47
def create : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Games.create",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "games/new"})
      }
   """
)
                        

// @LINE:72
def edit : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Games.edit",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "games/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:73
def update : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Games.update",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "games/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:27
def list : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Games.list",
   """
      function(p,s,o,f) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "games" + _qS([(p == null ? null : (""" + implicitly[QueryStringBindable[Int]].javascriptUnbind + """)("p", p)), (s == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("s", s)), (o == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("o", o)), (f == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("f", f))])})
      }
   """
)
                        

// @LINE:48
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
              

// @LINE:86
// @LINE:70
// @LINE:69
// @LINE:45
// @LINE:44
// @LINE:26
// @LINE:10
class ReverseSeasons {
    

// @LINE:86
def delete : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Seasons.delete",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "seasons/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/delete"})
      }
   """
)
                        

// @LINE:44
def create : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Seasons.create",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "seasons/new"})
      }
   """
)
                        

// @LINE:69
def edit : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Seasons.edit",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "seasons/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:70
def update : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Seasons.update",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "seasons/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:26
def list : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Seasons.list",
   """
      function(p,s,o,f) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "seasons" + _qS([(p == null ? null : (""" + implicitly[QueryStringBindable[Int]].javascriptUnbind + """)("p", p)), (s == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("s", s)), (o == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("o", o)), (f == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("f", f))])})
      }
   """
)
                        

// @LINE:45
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
        


// @LINE:99
// @LINE:98
// @LINE:96
// @LINE:95
// @LINE:92
// @LINE:89
// @LINE:88
// @LINE:87
// @LINE:86
// @LINE:85
// @LINE:84
// @LINE:83
// @LINE:82
// @LINE:79
// @LINE:78
// @LINE:76
// @LINE:75
// @LINE:73
// @LINE:72
// @LINE:70
// @LINE:69
// @LINE:67
// @LINE:66
// @LINE:64
// @LINE:63
// @LINE:61
// @LINE:60
// @LINE:58
// @LINE:57
// @LINE:54
// @LINE:53
// @LINE:51
// @LINE:50
// @LINE:48
// @LINE:47
// @LINE:45
// @LINE:44
// @LINE:42
// @LINE:41
// @LINE:39
// @LINE:38
// @LINE:36
// @LINE:35
// @LINE:33
// @LINE:32
// @LINE:29
// @LINE:28
// @LINE:27
// @LINE:26
// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:6
package controllers.ref {


// @LINE:92
class ReverseAssets {
    

// @LINE:92
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      
    
}
                          

// @LINE:89
// @LINE:79
// @LINE:78
// @LINE:54
// @LINE:53
// @LINE:29
// @LINE:14
class ReverseVideos {
    

// @LINE:89
def delete(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Videos.delete(id), HandlerDef(this, "controllers.Videos", "delete", Seq(classOf[Long]), "POST", """""", _prefix + """videos/$id<[^/]+>/delete""")
)
                      

// @LINE:53
def create(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Videos.create(), HandlerDef(this, "controllers.Videos", "create", Seq(), "GET", """""", _prefix + """videos/new""")
)
                      

// @LINE:78
def edit(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Videos.edit(id), HandlerDef(this, "controllers.Videos", "edit", Seq(classOf[Long]), "GET", """""", _prefix + """videos/$id<[^/]+>""")
)
                      

// @LINE:79
def update(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Videos.update(id), HandlerDef(this, "controllers.Videos", "update", Seq(classOf[Long]), "POST", """""", _prefix + """videos/$id<[^/]+>""")
)
                      

// @LINE:29
def list(p:Int, s:String, o:String, f:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Videos.list(p, s, o, f), HandlerDef(this, "controllers.Videos", "list", Seq(classOf[Int], classOf[String], classOf[String], classOf[String]), "GET", """""", _prefix + """videos""")
)
                      

// @LINE:54
def save(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Videos.save(), HandlerDef(this, "controllers.Videos", "save", Seq(), "POST", """""", _prefix + """videos""")
)
                      

// @LINE:14
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Videos.index(), HandlerDef(this, "controllers.Videos", "index", Seq(), "GET", """""", _prefix + """videos/index""")
)
                      
    
}
                          

// @LINE:98
// @LINE:88
// @LINE:76
// @LINE:75
// @LINE:51
// @LINE:50
// @LINE:28
// @LINE:12
class ReverseUsers {
    

// @LINE:88
def delete(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Users.delete(id), HandlerDef(this, "controllers.Users", "delete", Seq(classOf[Long]), "POST", """""", _prefix + """users/$id<[^/]+>/delete""")
)
                      

// @LINE:50
def create(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Users.create(), HandlerDef(this, "controllers.Users", "create", Seq(), "GET", """""", _prefix + """users/new""")
)
                      

// @LINE:75
def edit(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Users.edit(id), HandlerDef(this, "controllers.Users", "edit", Seq(classOf[Long]), "GET", """""", _prefix + """users/$id<[^/]+>""")
)
                      

// @LINE:76
def update(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Users.update(id), HandlerDef(this, "controllers.Users", "update", Seq(classOf[Long]), "POST", """""", _prefix + """users/$id<[^/]+>""")
)
                      

// @LINE:28
def list(p:Int, s:String, o:String, f:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Users.list(p, s, o, f), HandlerDef(this, "controllers.Users", "list", Seq(classOf[Int], classOf[String], classOf[String], classOf[String]), "GET", """""", _prefix + """users""")
)
                      

// @LINE:51
def save(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Users.save(), HandlerDef(this, "controllers.Users", "save", Seq(), "POST", """""", _prefix + """users""")
)
                      

// @LINE:12
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Users.index(), HandlerDef(this, "controllers.Users", "index", Seq(), "GET", """""", _prefix + """users/index""")
)
                      

// @LINE:98
def active(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Users.active(id), HandlerDef(this, "controllers.Users", "active", Seq(classOf[Long]), "GET", """""", _prefix + """users/active/$id<[^/]+>""")
)
                      
    
}
                          

// @LINE:99
// @LINE:82
// @LINE:58
// @LINE:57
// @LINE:33
// @LINE:32
// @LINE:22
// @LINE:6
class ReverseMatches {
    

// @LINE:82
def delete(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Matches.delete(id), HandlerDef(this, "controllers.Matches", "delete", Seq(classOf[Long]), "POST", """ Delete""", _prefix + """matches/$id<[^/]+>/delete""")
)
                      

// @LINE:99
def live(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Matches.live(id), HandlerDef(this, "controllers.Matches", "live", Seq(classOf[Long]), "GET", """""", _prefix + """matches/live/$id<[^/]+>""")
)
                      

// @LINE:32
def create(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Matches.create(), HandlerDef(this, "controllers.Matches", "create", Seq(), "GET", """ Add""", _prefix + """matches/new""")
)
                      

// @LINE:57
def edit(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Matches.edit(id), HandlerDef(this, "controllers.Matches", "edit", Seq(classOf[Long]), "GET", """ Edit""", _prefix + """matches/$id<[^/]+>""")
)
                      

// @LINE:58
def update(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Matches.update(id), HandlerDef(this, "controllers.Matches", "update", Seq(classOf[Long]), "POST", """""", _prefix + """matches/$id<[^/]+>""")
)
                      

// @LINE:22
def list(p:Int, s:String, o:String, f:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Matches.list(p, s, o, f), HandlerDef(this, "controllers.Matches", "list", Seq(classOf[Int], classOf[String], classOf[String], classOf[String]), "GET", """  list (look at the default values for pagination parameters)""", _prefix + """matches""")
)
                      

// @LINE:33
def save(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Matches.save(), HandlerDef(this, "controllers.Matches", "save", Seq(), "POST", """""", _prefix + """matches""")
)
                      

// @LINE:6
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Matches.index(), HandlerDef(this, "controllers.Matches", "index", Seq(), "GET", """ Default path will just redirect to the list""", _prefix + """""")
)
                      
    
}
                          

// @LINE:96
// @LINE:85
// @LINE:67
// @LINE:66
// @LINE:42
// @LINE:41
// @LINE:25
// @LINE:9
class ReversePlayers {
    

// @LINE:96
def upload(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Players.upload(id), HandlerDef(this, "controllers.Players", "upload", Seq(classOf[Long]), "POST", """""", _prefix + """players/upload/""")
)
                      

// @LINE:85
def delete(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Players.delete(id), HandlerDef(this, "controllers.Players", "delete", Seq(classOf[Long]), "POST", """""", _prefix + """players/$id<[^/]+>/delete""")
)
                      

// @LINE:41
def create(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Players.create(), HandlerDef(this, "controllers.Players", "create", Seq(), "GET", """""", _prefix + """players/new""")
)
                      

// @LINE:66
def edit(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Players.edit(id), HandlerDef(this, "controllers.Players", "edit", Seq(classOf[Long]), "GET", """""", _prefix + """players/$id<[^/]+>""")
)
                      

// @LINE:67
def update(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Players.update(id), HandlerDef(this, "controllers.Players", "update", Seq(classOf[Long]), "POST", """""", _prefix + """players/$id<[^/]+>""")
)
                      

// @LINE:25
def list(p:Int, s:String, o:String, f:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Players.list(p, s, o, f), HandlerDef(this, "controllers.Players", "list", Seq(classOf[Int], classOf[String], classOf[String], classOf[String]), "GET", """""", _prefix + """players""")
)
                      

// @LINE:42
def save(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Players.save(), HandlerDef(this, "controllers.Players", "save", Seq(), "POST", """""", _prefix + """players""")
)
                      

// @LINE:9
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Players.index(), HandlerDef(this, "controllers.Players", "index", Seq(), "GET", """""", _prefix + """players/index""")
)
                      
    
}
                          

// @LINE:95
// @LINE:83
// @LINE:61
// @LINE:60
// @LINE:36
// @LINE:35
// @LINE:23
// @LINE:13
class ReverseTeams {
    

// @LINE:95
def upload(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Teams.upload(id), HandlerDef(this, "controllers.Teams", "upload", Seq(classOf[Long]), "POST", """ Upload""", _prefix + """teams/upload/""")
)
                      

// @LINE:83
def delete(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Teams.delete(id), HandlerDef(this, "controllers.Teams", "delete", Seq(classOf[Long]), "POST", """""", _prefix + """teams/$id<[^/]+>/delete""")
)
                      

// @LINE:35
def create(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Teams.create(), HandlerDef(this, "controllers.Teams", "create", Seq(), "GET", """""", _prefix + """teams/new""")
)
                      

// @LINE:60
def edit(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Teams.edit(id), HandlerDef(this, "controllers.Teams", "edit", Seq(classOf[Long]), "GET", """""", _prefix + """teams/$id<[^/]+>""")
)
                      

// @LINE:61
def update(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Teams.update(id), HandlerDef(this, "controllers.Teams", "update", Seq(classOf[Long]), "POST", """""", _prefix + """teams/$id<[^/]+>""")
)
                      

// @LINE:23
def list(p:Int, s:String, o:String, f:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Teams.list(p, s, o, f), HandlerDef(this, "controllers.Teams", "list", Seq(classOf[Int], classOf[String], classOf[String], classOf[String]), "GET", """""", _prefix + """teams""")
)
                      

// @LINE:36
def save(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Teams.save(), HandlerDef(this, "controllers.Teams", "save", Seq(), "POST", """""", _prefix + """teams""")
)
                      

// @LINE:13
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Teams.index(), HandlerDef(this, "controllers.Teams", "index", Seq(), "GET", """""", _prefix + """teams/index""")
)
                      
    
}
                          

// @LINE:84
// @LINE:64
// @LINE:63
// @LINE:39
// @LINE:38
// @LINE:24
// @LINE:8
class ReverseReferees {
    

// @LINE:84
def delete(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Referees.delete(id), HandlerDef(this, "controllers.Referees", "delete", Seq(classOf[Long]), "POST", """""", _prefix + """referees/$id<[^/]+>/delete""")
)
                      

// @LINE:38
def create(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Referees.create(), HandlerDef(this, "controllers.Referees", "create", Seq(), "GET", """""", _prefix + """referees/new""")
)
                      

// @LINE:63
def edit(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Referees.edit(id), HandlerDef(this, "controllers.Referees", "edit", Seq(classOf[Long]), "GET", """""", _prefix + """referees/$id<[^/]+>""")
)
                      

// @LINE:64
def update(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Referees.update(id), HandlerDef(this, "controllers.Referees", "update", Seq(classOf[Long]), "POST", """""", _prefix + """referees/$id<[^/]+>""")
)
                      

// @LINE:24
def list(p:Int, s:String, o:String, f:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Referees.list(p, s, o, f), HandlerDef(this, "controllers.Referees", "list", Seq(classOf[Int], classOf[String], classOf[String], classOf[String]), "GET", """""", _prefix + """referees""")
)
                      

// @LINE:39
def save(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Referees.save(), HandlerDef(this, "controllers.Referees", "save", Seq(), "POST", """""", _prefix + """referees""")
)
                      

// @LINE:8
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Referees.index(), HandlerDef(this, "controllers.Referees", "index", Seq(), "GET", """GET     /matches/index              controllers.Matches.index()""", _prefix + """referees/index""")
)
                      
    
}
                          

// @LINE:19
// @LINE:18
// @LINE:17
class ReverseApplication {
    

// @LINE:19
def logout(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.logout(), HandlerDef(this, "controllers.Application", "logout", Seq(), "GET", """""", _prefix + """logout""")
)
                      

// @LINE:18
def authenticate(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.authenticate(), HandlerDef(this, "controllers.Application", "authenticate", Seq(), "POST", """""", _prefix + """login""")
)
                      

// @LINE:17
def login(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.login(), HandlerDef(this, "controllers.Application", "login", Seq(), "GET", """ Authentication""", _prefix + """login""")
)
                      
    
}
                          

// @LINE:87
// @LINE:73
// @LINE:72
// @LINE:48
// @LINE:47
// @LINE:27
// @LINE:11
class ReverseGames {
    

// @LINE:87
def delete(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Games.delete(id), HandlerDef(this, "controllers.Games", "delete", Seq(classOf[Long]), "POST", """""", _prefix + """games/$id<[^/]+>/delete""")
)
                      

// @LINE:47
def create(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Games.create(), HandlerDef(this, "controllers.Games", "create", Seq(), "GET", """""", _prefix + """games/new""")
)
                      

// @LINE:72
def edit(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Games.edit(id), HandlerDef(this, "controllers.Games", "edit", Seq(classOf[Long]), "GET", """""", _prefix + """games/$id<[^/]+>""")
)
                      

// @LINE:73
def update(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Games.update(id), HandlerDef(this, "controllers.Games", "update", Seq(classOf[Long]), "POST", """""", _prefix + """games/$id<[^/]+>""")
)
                      

// @LINE:27
def list(p:Int, s:String, o:String, f:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Games.list(p, s, o, f), HandlerDef(this, "controllers.Games", "list", Seq(classOf[Int], classOf[String], classOf[String], classOf[String]), "GET", """""", _prefix + """games""")
)
                      

// @LINE:48
def save(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Games.save(), HandlerDef(this, "controllers.Games", "save", Seq(), "POST", """""", _prefix + """games""")
)
                      

// @LINE:11
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Games.index(), HandlerDef(this, "controllers.Games", "index", Seq(), "GET", """""", _prefix + """games/index""")
)
                      
    
}
                          

// @LINE:86
// @LINE:70
// @LINE:69
// @LINE:45
// @LINE:44
// @LINE:26
// @LINE:10
class ReverseSeasons {
    

// @LINE:86
def delete(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Seasons.delete(id), HandlerDef(this, "controllers.Seasons", "delete", Seq(classOf[Long]), "POST", """""", _prefix + """seasons/$id<[^/]+>/delete""")
)
                      

// @LINE:44
def create(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Seasons.create(), HandlerDef(this, "controllers.Seasons", "create", Seq(), "GET", """""", _prefix + """seasons/new""")
)
                      

// @LINE:69
def edit(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Seasons.edit(id), HandlerDef(this, "controllers.Seasons", "edit", Seq(classOf[Long]), "GET", """""", _prefix + """seasons/$id<[^/]+>""")
)
                      

// @LINE:70
def update(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Seasons.update(id), HandlerDef(this, "controllers.Seasons", "update", Seq(classOf[Long]), "POST", """""", _prefix + """seasons/$id<[^/]+>""")
)
                      

// @LINE:26
def list(p:Int, s:String, o:String, f:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Seasons.list(p, s, o, f), HandlerDef(this, "controllers.Seasons", "list", Seq(classOf[Int], classOf[String], classOf[String], classOf[String]), "GET", """""", _prefix + """seasons""")
)
                      

// @LINE:45
def save(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Seasons.save(), HandlerDef(this, "controllers.Seasons", "save", Seq(), "POST", """""", _prefix + """seasons""")
)
                      

// @LINE:10
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Seasons.index(), HandlerDef(this, "controllers.Seasons", "index", Seq(), "GET", """""", _prefix + """seasons/index""")
)
                      
    
}
                          
}
        
    