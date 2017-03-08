package com.moon.server.impl

import java.net.InetSocketAddress
import java.util

import com.moon.Watcher
import com.moon.data.Id
import com.moon.jute.Record
import com.moon.proto.{WatcherEvent, ReplyHeader}
import com.moon.server.ServerCnxn

/**
  * Created by lin on 3/8/17.
  */
class NIOServerCnxn extends Watcher with ServerCnxn{
  class Factory extends Thread{

  }


  override def getSessionTimeout(): Int = ???

  override def setSessionId(sessionId: Long): Unit = ???

  override def setStats(latency: Long, avgLatency: Long): Unit = ???

  override def finishSessionInit(valid: Boolean): Unit = ???

  override def getSessionId(): Long = ???

  override def getRemoteAddress(): InetSocketAddress = ???

  override def process(event: WatcherEvent): Unit = ???

  override def close(): Unit = ???

  override def sendResponse(h: ReplyHeader, r: Record, tag: String): Unit = ???

  override def getAuthInfo(): util.ArrayList[Id] = ???
}
