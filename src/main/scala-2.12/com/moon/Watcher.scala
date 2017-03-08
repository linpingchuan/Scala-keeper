package com.moon

import com.moon.proto.WatcherEvent

/**
  * Created by Paul on 2017/3/8.
  */
trait Watcher {

  trait Event {
    // 连接状态常量
    val KeeperStateChanged: Int = 0
    val KeeperStateUnknown: Int = -1
    val KeeperStateDisconnected: Int = 0
    val KeeperStateNoSyncConnected: Int = 1
    val KeeperStateSyncConnected: Int = 3
    val KeeperStateStateExpired: Int = -112
    val EventNone: Int = -1
    // 事件类型常量
    val EventNodeCreated: Int = 1
    val EventNodeDeleted: Int = 2
    val EventNodeDataChanged: Int = 3
    val EventNodeChildrenChanged: Int = 4
  }

  def process(event:WatcherEvent)
}
