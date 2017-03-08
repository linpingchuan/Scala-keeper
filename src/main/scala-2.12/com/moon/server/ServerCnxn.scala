package com.moon.server

import java.net.InetSocketAddress
import java.nio.ByteBuffer
import java.util

import com.moon.Watcher
import com.moon.data.Id
import com.moon.jute.Record
import com.moon.proto.{WatcherEvent, ReplyHeader}

/**
  * Created by Paul on 2017/3/8.
  */
trait ServerCnxn extends Watcher {
  val killCmd: Int = ByteBuffer.wrap("kill".getBytes()).getInt()
  val ruokCmd: Int = ByteBuffer.wrap("ruok".getBytes()).getInt()
  val dumpCmd: Int = ByteBuffer.wrap("dump".getBytes()).getInt()
  val statCmd: Int = ByteBuffer.wrap("stat".getBytes()).getInt()
  val reqsCmd: Int = ByteBuffer.wrap("reqs".getBytes()).getInt()
  val setTraceMaskCmd: Int = ByteBuffer.wrap("stmk".getBytes()).getInt()
  val getTraceMaskCmd: Int = ByteBuffer.wrap("gtmk".getBytes()).getInt()
  val imok: ByteBuffer = ByteBuffer.wrap("imok".getBytes())

  def getSessionTimeout(): Int

  def close()

  def sendResponse(h: ReplyHeader, r: Record, tag: String)

  def finishSessionInit(valid: Boolean)

  def process(event: WatcherEvent)

  def getSessionId(): Long

  def setSessionId(sessionId: Long);

  def getAuthInfo(): util.ArrayList[Id]

  def getRemoteAddress(): InetSocketAddress

  def setStats(latency: Long, avgLatency: Long)
}
