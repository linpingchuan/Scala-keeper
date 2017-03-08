package com.moon

import java.io.File
import java.util.concurrent.LinkedBlockingQueue

import com.moon.proto.WatcherEvent

/**
  * Created by Paul on 2017/3/8.
  */
class AsyncTest {
  val hostPort="127.0.0.1:33221"
  val events=new LinkedBlockingQueue[WatcherEvent]()
  val baseTest=new File("")

//  @Before
}


