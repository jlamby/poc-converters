package com.mtp.model;

/**
 * @author jlamby
 *
 */
public class VigilanceMessage extends BaseInstruction {

    private String message;

    public VigilanceMessage(String message) {
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
        return "VigilanceMessage [message=" + message + "]";
    }

}
