package com.mtp;

import java.util.Arrays;
import java.util.List;

import com.mtp.converters.BaseConverter;
import com.mtp.converters.TurnConverter;
import com.mtp.converters.VigilanceMessageConverter;
import com.mtp.model.BaseInstruction;
import com.mtp.model.mit.MITBaseInstruction;
import com.mtp.model.mit.MITTurn;
import com.mtp.model.mit.MITVigilanceMessage;

/**
 * @author jlamby
 *
 */
public class Main {

    static List<BaseConverter<?,?>> converters = Arrays.asList(
            new TurnConverter(),
            new VigilanceMessageConverter());

    public static void main(String[] args) {
        MITVigilanceMessage o1 = new MITVigilanceMessage("test");
        MITTurn o2 = new MITTurn(1);

        System.out.println(getConverter(o1.getClass()).convert(o1));
        System.out.println(getConverter(o2.getClass()).convert(o2));
    }

    @SuppressWarnings("unchecked")
    static BaseConverter<MITBaseInstruction,BaseInstruction> getConverter(Class<?> clazz) {
        for (BaseConverter<?,?> converter : converters) {
            if (converter.canConvert(clazz)) {
                return (BaseConverter<MITBaseInstruction, BaseInstruction>) converter;
            }
        }

        return null;
    }
}