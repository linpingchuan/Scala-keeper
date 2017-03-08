package com.moon.server.auth

import com.moon.server.ServerCnxn

/**
  * Created by lin on 3/8/17.
  */
trait AuthenticationProvider {
  def getScheme():String

  def handleAuthentication(cnxn:ServerCnxn,authData:Array[Byte])

  def matches(id:String,aclExpr:String)

  def isAuthenticated():Boolean

  def isValid(id:String):Boolean
}
