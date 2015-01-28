package com.mtp.converters;

import com.mtp.model.VigilanceMessage;
import com.mtp.model.mit.MITVigilanceMessage;

/**
 * @author jlamby
 *
 */
public class VigilanceMessageConverter implements BaseConverter<MITVigilanceMessage, VigilanceMessage>{

    @Override
    public boolean canConvert(Class<?> clazz) {
        return MITVigilanceMessage.class.equals(clazz);
    }

    @Override
    public VigilanceMessage convert(MITVigilanceMessage i) {
        return new VigilanceMessage(i.getMessage());
    }

}
