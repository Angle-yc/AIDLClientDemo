
package com.angle.hshb.aidlservicedemo;

import com.angle.hshb.aidlservicedemo.MessageBean;

import com.angle.hshb.aidlservicedemo.IDemandListener;



interface IDemandManager {
    MessageBean getDemand();

    void setDemandIn(in MessageBean msg);//客户端->服务端

    //out和inout都需要重写MessageBean的readFromParcel方法
    void setDemandOut(out MessageBean msg);//服务端->客户端

    void setDemandInOut(inout MessageBean msg);//客户端<->服务端

    void registerListener(IDemandListener listener);

    void unregisterListener(IDemandListener listener);
}
