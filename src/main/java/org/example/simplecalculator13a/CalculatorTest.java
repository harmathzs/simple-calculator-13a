package org.example.simplecalculator13a;

import org.junit.Test;

import java.io.IOException;

public class CalculatorTest {
    @Test
    public void testAppMain() {
        CalculatorApplication app = new CalculatorApplication();
        CalculatorApplication.isRunningTest = true;
        CalculatorApplication.main(null);
        CalculatorApplication.isRunningTest = false;
    }
    @Test
    public void testAppStart() throws IOException {
        CalculatorApplication app = new CalculatorApplication();
        CalculatorApplication.isRunningTest = true;
        app.start(null);
        CalculatorApplication.isRunningTest = false;
    }
    @Test
    public void testControllerAdd() {
        CalculatorController controller = new CalculatorController();
        controller.isRunningTest = true;
        controller.initialize(null, null);
        controller.handleCalculate(null);
        controller.isRunningTest = false;
    }
    @Test
    public void testControllerSubtract() {
        CalculatorController controller = new CalculatorController();
        controller.isRunningTest = true;
        controller.testOperation = '-';
        controller.initialize(null, null);
        controller.handleCalculate(null);
        controller.isRunningTest = false;
    }
    @Test
    public void testControllerMultiply() {
        CalculatorController controller = new CalculatorController();
        controller.isRunningTest = true;
        controller.testOperation = '*';
        controller.initialize(null, null);
        controller.handleCalculate(null);
        controller.isRunningTest = false;
    }
}
