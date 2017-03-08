package com.moon.jute

import java.util

/**
  * Created by Paul on 2017/3/8.
  */
trait OutputArchive {
  def writeByte(b:Byte,tag: String)

  def writeBool(b:Boolean,tag: String)

  def writeInt(i:Int,tag: String)

  def writeLong(l:Long,tag: String)

  def writeFloat(f:Float,tag: String)

  def writeDouble(d:Double,tag: String)

  def writeString(s:String,tag: String)

  def writeBuffer(buf:Array[Byte],tag: String)

  def writeRecord(r: Record, tag: String)

  def startRecord(r: Record,tag: String)

  def endRecord(r: Record,tag: String)

  def startVector(v:Vector,tag: String)

  def endVector(v:Vector,tag: String)

  def startMap(v:util.TreeMap, tag: String)

  def endMap(v:util.TreeMap,tag: String)
}
