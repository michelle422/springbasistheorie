package be.vdab.converters;

public interface Converter<S, T> {
	T convert(S source);
}
