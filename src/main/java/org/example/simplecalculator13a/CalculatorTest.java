package org.example.simplecalculator13a;

import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

/**
 * CalculatorTest
 *
 * @author Zsolt Harmath
 * @since 2025-10-02
 */
public class CalculatorTest {
    /**
     * testAppMain()
     *
     * @author Zsolt Harmath
     * @since 2025-10-02
     */
    @Test
    public void testAppMain() {
        CalculatorApplication app = new CalculatorApplication();
        CalculatorApplication.isRunningTest = true;
        CalculatorApplication.main(null);
        CalculatorApplication.isRunningTest = false;
    }
    /**
     * testAppStart()
     *
     * @author Zsolt Harmath
     * @since 2025-10-02
     */
    @Test
    public void testAppStart() throws IOException {
        CalculatorApplication app = new CalculatorApplication();
        CalculatorApplication.isRunningTest = true;
        app.start(null);
        CalculatorApplication.isRunningTest = false;
    }
    /**
     * testControllerAdd()
     *
     * @author Zsolt Harmath
     * @since 2025-10-02
     */
    @Test
    public void testControllerAdd() {
        CalculatorController controller = new CalculatorController();
        controller.isRunningTest = true;
        controller.initialize(null, null);
        controller.handleCalculate(null);

        Assert.assertEquals(controller.testA+controller.testB, controller.testResult, 0.01);

        controller.isRunningTest = false;
    }
    /**
     * testControllerSubtract()
     *
     * @author Zsolt Harmath
     * @since 2025-10-02
     */
    @Test
    public void testControllerSubtract() {
        CalculatorController controller = new CalculatorController();
        controller.isRunningTest = true;
        controller.testOperation = '-';
        controller.initialize(null, null);
        controller.handleCalculate(null);
        Assert.assertEquals(controller.testA-controller.testB, controller.testResult, 0.01);
        controller.isRunningTest = false;
    }
    /**
     * testControllerMultiply()
     *
     * @author Zsolt Harmath
     * @since 2025-10-02
     */
    @Test
    public void testControllerMultiply() {
        CalculatorController controller = new CalculatorController();
        controller.isRunningTest = true;
        controller.testOperation = '*';
        controller.initialize(null, null);
        controller.handleCalculate(null);
        Assert.assertEquals(controller.testA*controller.testB, controller.testResult, 0.01);
        controller.isRunningTest = false;
    }
    /**
     * testControllerDivide()
     *
     * @author Zsolt Harmath
     * @since 2025-10-02
     */
    @Test
    public void testControllerDivide() {
        CalculatorController controller = new CalculatorController();
        controller.isRunningTest = true;
        controller.testOperation = ':';
        controller.initialize(null, null);
        controller.handleCalculate(null);
        Assert.assertEquals(controller.testA/controller.testB, controller.testResult, 0.01);
        controller.isRunningTest = false;
    }
    /**
     * testControllerDivideByZero()
     *
     * @author Zsolt Harmath
     * @since 2025-10-02
     */
    @Test
    public void testControllerDivideByZero() {
        CalculatorController controller = new CalculatorController();
        controller.isRunningTest = true;
        controller.testOperation = ':';
        controller.testB = 0.0;
        controller.initialize(null, null);
        controller.handleCalculate(null);
        Assert.assertEquals(0.0, controller.testResult, 0.01);
        controller.isRunningTest = false;
    }
}
