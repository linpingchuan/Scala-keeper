package com.moon.server

import java.io.{IOException, File}
import java.util

import com.moon.server.auth.AuthenticationProvider


/**
  * 这个类实现了一个简单的单节点 ZooKeeperServer
  * 他创建了以下的链式请求处理器用来处理请求
  * PreRequestProcessor -> SyncRequestProcessor -> FinalRequestProcessor
  * Created by lin on 3/8/17.
  */
class ZooKeeperServer(dataD:File,dataL:File,tt:Int) extends SessionExpirer{
  var tickTime:Int=tt

  var dataDir:File=dataD

  var dataLogDir:File=dataL

  val authenticationProviders=new util.HashMap[String,AuthenticationProvider]

  def init(): Unit ={
    dataDir.isDirectory match{
      case true => throw new IOException("")
    }
  }


  override def expire(sessionId: Long): Unit = ???

  override def getServerId(): Long = ???

  def main(args: Array[String]) {
    val port:Int=2281

  }
}
