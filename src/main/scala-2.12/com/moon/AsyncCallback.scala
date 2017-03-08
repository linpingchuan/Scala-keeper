package com.moon

import com.moon.data.{ACL, Stat}

/**
  * Created by Paul on 2017/3/8.
  */
trait AsyncCallback {
  trait StatCallback extends AsyncCallback{
    def processResult(rc:Int,path:String,ctx:Object,stat:Stat)
  }

  trait DataCallback extends AsyncCallback{
    def processResult(rc:Int,path:String,ctx:Object,data:Array[Byte])
  }

  trait ACLCallBack extends AsyncCallback{
    def processResult(rc:Int,path:String,ctx:Object,acl:Vector[ACL],stat:Stat)
  }

  trait ChildrenCallback extends AsyncCallback{
    def processResult(rc:Int,path:String,ctx:Object,children:Vector[String])
  }

  trait StringCallback extends AsyncCallback{
    def processResult(rc:Int,path:String,ctx:Object,name:String)
  }

  trait VoidCallback extends AsyncCallback{
    def processResult(rc:Int,path:String,ctx:Object)
  }
}
