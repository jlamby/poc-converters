package com.mtp.model.mit;

/**
 * @author jlamby
 *
 */
public class MITVigilanceMessage extends MITBaseInstruction {

    private String message;

    public MITVigilanceMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "MITVigilanceMessage [message=" + message + "]";
    }
}
