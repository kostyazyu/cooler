package com.kostyazyu.cooler.matcher;

import org.junit.Assert;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * converter class for test purpose
 * @param <S> : source
 * @param <T> : target
 */
public class ModelMatcher<S, T> {

    protected Function<S, T> converter;

    public ModelMatcher(Function<S, T> converter) {
        this.converter = converter;
    }

    public void assertEquals(S expected, S actual) {
        Assert.assertEquals(converter.apply(expected), converter.apply(actual));
    }

    public void assertListEquals(List<S> expected, List<S> actual) {
        Assert.assertEquals(map(expected, converter), map(actual, converter));
    }

    public static <S, T> List<T> map(List<S> list, Function<S, T> converter) {
        return list.stream().map(converter).collect(Collectors.toList());
    }
}
