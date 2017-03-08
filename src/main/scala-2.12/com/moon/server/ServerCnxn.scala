package com.moon.server

import java.nio.ByteBuffer

import com.moon.Watcher
import com.moon.proto.ReplyHeader

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

  def getSessionTimeout():Int
  def close()

  def sendResponse(h:ReplyHeader)
}
