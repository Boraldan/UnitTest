package ru.boraldan.task1;

import ru.boraldan.task1.controllers.CalculatorController;
import ru.boraldan.task1.models.CalculatorModel;
import ru.boraldan.task1.views.CalculatorView;

public class CalculatorApp {
    public static void main(String[] args) {
        CalculatorModel model = new CalculatorModel();
        CalculatorView view = new CalculatorView();
        CalculatorController controller = new CalculatorController(model, view);

        controller.run();
    }
}
