public class DesafioTemperatura {
    public static void main(String[] args) {
        double grausCelsius = 30.4;
        double grausFahrenheit = (grausCelsius * 1.8) + 32;

        String mensagem = String.format("A temperatura de %f Celsius é equivalente a %f Fahrenheit", grausCelsius, grausFahrenheit);

        System.out.println(mensagem);

        int grausFahrenheitInteiro = (int) grausFahrenheit;
        System.out.println("A temperatura em Fahrenheit inteira é: " + grausFahrenheitInteiro);
    }
}
