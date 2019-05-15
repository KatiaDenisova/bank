package com.example.bank;

public enum  CardObj {
    BLACK(R.layout.card),
    BLUE(R.layout.card2),
    DARL_BLUE(R.layout.card3);



    private int mLayoutResId;

    CardObj( int mLayoutResId) {

        this.mLayoutResId = mLayoutResId;
    }

    public int getmLayoutResId() {
        return mLayoutResId;
    }
}
