package com.aisparser;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.infra.Blackhole;

/** */
public class SixbitBenchmark {
    @Benchmark
    public void testMethod(Blackhole blackhole) {
        Sixbit bits = new Sixbit();
        bits.init("19NS7Sp02wo?HETKA2K6mUM20<L=");
        blackhole.consume(bits.bit_length());
        blackhole.consume(bits.length());
        try {
            blackhole.consume(bits.get(6));
            blackhole.consume(bits.get(9));
            blackhole.consume(bits.get(21));
        } catch (SixbitsExhaustedException e) {
        }
        blackhole.consume(bits);
    }
}
