
package com.angle.hshb.aidlservicedemo;

import com.angle.hshb.aidlservicedemo.MessageBean;


interface IDemandListener {

    void onDemandReceiver(in MessageBean msg);
}
