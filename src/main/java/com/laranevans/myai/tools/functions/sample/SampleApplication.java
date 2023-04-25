package com.laranevans.myai.tools.functions.sample;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.cloud.function.context.FunctionalSpringApplication;

import java.util.function.Function;

@SpringBootConfiguration
public class SampleApplication implements Function<String, String> {

	public static void main(String[] args) {
		FunctionalSpringApplication.run(SampleApplication.class, args);
	}

	@Override
	public String apply(String value) {
		// TODO Implement your own logic here.

		return value.toUpperCase();
	}

}
