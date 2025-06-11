package exercicio_8.core;

public class ConversorTemperatura {

public static double celsiusParaFahrenheit(double celsius) {
return (celsius * 9.0 / 5.0) + 32.0;
}

public static double fahrenheitParaCelsius(double fahrenheit) {
return (5.0 / 9.0) * (fahrenheit - 32.0);
}
}
