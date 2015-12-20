// @SOURCE:/Users/vkhazin/Projects/Samples/play-framework-docker/conf/routes
// @HASH:f94c37f141a2fd9c4c81ec2672feceaf0bd6b469
// @DATE:Fri Dec 18 18:02:00 EST 2015


import scala.language.reflectiveCalls
import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset

import Router.queryString

object Routes extends Router.Routes {

import ReverseRouteContext.empty

private var _prefix = "/"

def setPrefix(prefix: String): Unit = {
  _prefix = prefix
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" }


// @LINE:6
private[this] lazy val controllers_Application_echo0_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
private[this] lazy val controllers_Application_echo0_invoker = createInvoker(
controllers.Application.echo,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "echo", Nil,"GET", """Echo""", Routes.prefix + """"""))
        

// @LINE:7
private[this] lazy val controllers_Application_echo1_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("echo"))))
private[this] lazy val controllers_Application_echo1_invoker = createInvoker(
controllers.Application.echo,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "echo", Nil,"GET", """""", Routes.prefix + """echo"""))
        

// @LINE:8
private[this] lazy val controllers_Application_echo2_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("v1"))))
private[this] lazy val controllers_Application_echo2_invoker = createInvoker(
controllers.Application.echo,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "echo", Nil,"GET", """""", Routes.prefix + """v1"""))
        

// @LINE:9
private[this] lazy val controllers_Application_echo3_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("v1/echo"))))
private[this] lazy val controllers_Application_echo3_invoker = createInvoker(
controllers.Application.echo,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "echo", Nil,"GET", """""", Routes.prefix + """v1/echo"""))
        
def documentation = List(("""GET""", prefix,"""controllers.Application.echo"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """echo""","""controllers.Application.echo"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """v1""","""controllers.Application.echo"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """v1/echo""","""controllers.Application.echo""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]]
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:6
case controllers_Application_echo0_route(params) => {
   call { 
        controllers_Application_echo0_invoker.call(controllers.Application.echo)
   }
}
        

// @LINE:7
case controllers_Application_echo1_route(params) => {
   call { 
        controllers_Application_echo1_invoker.call(controllers.Application.echo)
   }
}
        

// @LINE:8
case controllers_Application_echo2_route(params) => {
   call { 
        controllers_Application_echo2_invoker.call(controllers.Application.echo)
   }
}
        

// @LINE:9
case controllers_Application_echo3_route(params) => {
   call { 
        controllers_Application_echo3_invoker.call(controllers.Application.echo)
   }
}
        
}

}
     