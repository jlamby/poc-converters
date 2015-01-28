package com.mtp.converters;

import com.mtp.model.BaseInstruction;
import com.mtp.model.mit.MITBaseInstruction;

/**
 * @author jlamby
 *
 */
public interface BaseConverter<S extends MITBaseInstruction, T extends BaseInstruction> extends Converter<S,T>{

}
