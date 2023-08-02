import view.View;

public class Main {
        public static void main(String[] args) {
                // attributes
                String[] conversions = { "Coin Converter", "Temperature Converter" };

                String[] coins = { "from COP to USD",
                                "from COP to EUR",
                                "from COP to GBP",
                                "from COP to JPY",
                                "from COP to KRW",
                                "from USD to COP",
                                "from EUR to COP",
                                "from Gbp to COP",
                                "from JPY to COP",
                                "from KRW to COP" };

                String[] temperatures = { "from Celsius to Fahrenheit",
                                "from Celsius to Kelvin",
                                "from Fahrenheit to Celsius",
                                "from Fahrenheit to Kelvin",
                                "from Kelvin to Celsius",
                                "from Kelvin to Fahrenheit" };

                View view = new View();

                while (true) {

                        Object converterPanel = view.getPanel("select the converter that do you need", "converter",
                                        conversions);
                        // System.out.println(converter);
                        Boolean isCoinConverter = converterPanel == "Coin Converter";
                        Boolean isTemperatureConverter = converterPanel == "Temperature Converter";

                        if (isCoinConverter) {
                                // System.out.println("1");
                                view.getConverterView(
                                                "select the money you want to convert your money to",
                                                "Coin Converter", coins,
                                                "Enter the amount of money you wish to convert",
                                                "Coin Converter", true);
                        } else if (isTemperatureConverter) {
                                // System.out.println("2");
                                view.getConverterView(
                                                "select the temperature you want to convert",
                                                "Temperature Converter", temperatures,
                                                "Enter the amount of temperature you wish to convert",
                                                "Temperature Converter", false);
                        }
                        boolean follow = view.viewContinue();
                        if (!follow) {
                                view.setViewEnd();
                                System.exit(0);
                        }
                }

        }
}
