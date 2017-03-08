package com.moon.server

/**
  * 在ZooKeeperServer中，使用这个接口来追踪会话。
  * 在单节点和leader的ZooKeeperServer使用同个接口。
  * FollowerZooKeeperServer使用一个拥有通道的SessionTracker用来将追踪信息转发给leader
  * Created by lin on 3/8/17.
  */
trait SessionTracker {



  def createSession(sessionTimeout: Int): Long

  def addSession(id: Long, to: Int)

  def touchSession(sessionId: Long, sessionTimeout: Int)

  def shutdown()

  def removeSession(sessionId: Long)

  def checkSession(sessionId: Long)
}
trait SessionExpirer {
  def expire(sessionId: Long)

  def getServerId(): Long
}