package com.moon.jute

/**
  * Created by Paul on 2017/3/8.
  */
trait Record {
  def serialize(archive:OutputArchive,tag:String)
  def deserialize(archive:InputArchive,tag:String)
}
