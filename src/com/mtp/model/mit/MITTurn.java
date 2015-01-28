package com.mtp.model.mit;

/**
 * @author jlamby
 *
 */
public class MITTurn extends MITBaseInstruction {

    private int turnType;

    public MITTurn(int turnType) {
        this.turnType = turnType;
    }

    public int getTurnType() {
        return turnType;
    }

    public void setTurnType(int turnType) {
        this.turnType = turnType;
    }

    @Override
    public String toString() {
        return "MITTurn [turnType=" + turnType + "]";
    }

}
