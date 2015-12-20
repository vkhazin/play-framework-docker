// @SOURCE:/Users/vkhazin/Projects/Samples/play-framework-docker/conf/routes
// @HASH:f94c37f141a2fd9c4c81ec2672feceaf0bd6b469
// @DATE:Fri Dec 18 18:02:00 EST 2015

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset

import Router.queryString


// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers {

// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {


// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
def echo(): Call = {
   () match {
// @LINE:6
case ()  =>
  import ReverseRouteContext.empty
  Call("GET", _prefix)
                                         
   }
}
                                                

}
                          
}
                  


// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.javascript {
import ReverseRouteContext.empty

// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {


// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
def echo : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.echo",
   """
      function() {
      if (true) {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
      if (true) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "echo"})
      }
      if (true) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "v1"})
      }
      if (true) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "v1/echo"})
      }
      }
   """
)
                        

}
              
}
        


// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.ref {


// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {


// @LINE:6
def echo(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.echo(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "echo", Seq(), "GET", """Echo""", _prefix + """""")
)
                      

}
                          
}
        
    