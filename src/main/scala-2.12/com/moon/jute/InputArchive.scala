package com.moon.jute

/**
  * Created by Paul on 2017/3/8.
  */
trait InputArchive {
  def readByte(tag: String): Byte

  def readBool(tag: String): Boolean

  def readInt(tag: String): Int

  def readLong(tag: String): Long

  def readFloat(tag: String): Float

  def readDouble(tag: String): Double

  def readString(tag: String): String

  def readBuffer(tag: String): Array[Byte]

  def readRecord(r: Record, tag: String)

  def startRecord(tag: String)

  def endRecord(tag: String)

  def startVector(tag: String): Index

  def endVector(tag: String)

  def startMap(tag: String): Index

  def endMap(tag: String)
}
