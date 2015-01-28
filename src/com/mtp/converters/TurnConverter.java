package com.mtp.converters;

import com.mtp.model.Turn;
import com.mtp.model.mit.MITTurn;

/**
 * @author jlamby
 *
 */
public class TurnConverter implements BaseConverter<MITTurn, Turn> {

    @Override
    public boolean canConvert(Class<?> clazz) {
        return MITTurn.class.equals(clazz);
    }

    @Override
    public Turn convert(MITTurn i) {
        return new Turn(i.getTurnType());
    }

}
