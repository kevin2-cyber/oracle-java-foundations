package com.kimikevin.lambdas;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class PrefixSuffixOperator {

    public static final String PREFIX = "__pref__";
    public static final String SUFFIX = "__suff__";

    public static UnaryOperator<String> operator = s -> PREFIX + s.trim() + SUFFIX;

}
