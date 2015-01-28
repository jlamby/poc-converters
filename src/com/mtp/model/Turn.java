package com.mtp.model;

/**
 * @author jlamby
 *
 */
public class Turn extends BaseInstruction {

    private int type;

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public Turn(int type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Turn [type=" + type + "]";
    }
}
