package com.example.dimasarifpratama;

public class Remote {

    private int mId;
    private int mPower;
    private String mTime;

    public Remote() { }
    public Remote(int mId, int mPower, String mTime) {
        this.mId = mId;
        this.mTime = mTime;
        this.mPower = mPower;
    }
    public int getmId() {

        return mId;
    }
    public void setmId(int mId) {

        this.mId = mId;
    }
    public int getmPower() {
        return mPower;
    }
    public void setmPower(int mPower) {
        this.mPower = mPower;
    }
}
