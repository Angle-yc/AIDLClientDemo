package com.angle.hshb.aidlservicedemo;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Administrator on 2017/10/20.
 */

public class MessageBean implements Parcelable{
    private String content;
    private int level;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public static Creator<MessageBean> getCREATOR() {
        return CREATOR;
    }

    public MessageBean() {
    }

    protected MessageBean(Parcel in) {
        content = in.readString();
        level = in.readInt();
    }
    public MessageBean(String content, int level) {
        this.content = content;
        this.level = level;
    }

    public void readFromParcel(Parcel dest) {
        //注意，此处的读值顺序应当是和writeToParcel()方法中一致的
        this.content = dest.readString();
        this.level = dest.readInt();
    }

    public static final Creator<MessageBean> CREATOR = new Creator<MessageBean>() {
        @Override
        public MessageBean createFromParcel(Parcel in) {
            return new MessageBean(in);
        }

        @Override
        public MessageBean[] newArray(int size) {
            return new MessageBean[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(content);
        dest.writeInt(level);
    }

    @Override
    public String toString() {
        return "【内容==" + content + ",级别==" + level + "】";
    }
}
