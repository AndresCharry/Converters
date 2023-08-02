package view;

import javax.swing.JOptionPane;

import model.Converter;

public class View {

    public Object getPanel(String message, String title, String[] object) {
        Object value = JOptionPane.showInputDialog(null,
                message, title,
                JOptionPane.INFORMATION_MESSAGE, null,
                object, object[0]);
        return value;
    }

    public String getValue(String message, String title) {
        String value = JOptionPane.showInputDialog(null, message, title, JOptionPane.QUESTION_MESSAGE);
        return value;
    }

    // public

    public void getConverterView(String messageOfTypeConversion, String titleTheMessageOfTypeConversion,
            String[] typeOfConversion, String messageOfConversionValue, String titleTheMessageOfConversionValue,
            boolean coinConverter) {
        String type = null;
        Double value = null;
        Double conversionValue = null;
        Object typeOfCoinConverter = getPanel(messageOfTypeConversion, titleTheMessageOfTypeConversion,
                typeOfConversion);
        try {
            String valueOfMoney = getValue(messageOfConversionValue, titleTheMessageOfConversionValue);
            type = typeOfCoinConverter.toString();
            value = Double.parseDouble(valueOfMoney);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "non-numeric characters are not allowed.");
            String valueOfMoney = getValue(messageOfConversionValue, titleTheMessageOfConversionValue);
            type = typeOfCoinConverter.toString();
            value = Double.parseDouble(valueOfMoney);
        }
        Converter converter = new Converter(type, value, coinConverter);
        if (coinConverter) {
            conversionValue = converter.currencyConversion();
        } else {
            conversionValue = converter.temperatureConversion();
        }

        JOptionPane.showMessageDialog(null, "the result of conversion is: " + conversionValue,
                "Result", JOptionPane.INFORMATION_MESSAGE);
    }

    public boolean viewContinue() {
        Object[] options = { "OK", "CANCEL" };
        Object option = JOptionPane.showOptionDialog(null, "Click OK to continue", "Warning",
                JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE,
                null, options, options[0]);
        boolean follow = option.equals(0);
        return follow;
    }

    public void setViewEnd() {
        JOptionPane.showMessageDialog(null, "completed program.");
    }
}
