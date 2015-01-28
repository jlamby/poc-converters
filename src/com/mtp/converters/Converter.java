package com.mtp.converters;

/**
 * @author jlamby
 *
 */
public interface Converter<S,T> {

    boolean canConvert(Class<?> clazz);

    T convert(S i);

}
