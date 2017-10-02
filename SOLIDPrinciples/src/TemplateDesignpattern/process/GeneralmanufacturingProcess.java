package TemplateDesignpattern.process;

public abstract class GeneralmanufacturingProcess  implements Runnable {
    private  String process;
    GeneralmanufacturingProcess(String name) {
        this.process=name;
    }

    //methods are protected so that only derivatives of this class can access these methods
    //also package separation is done to avoid access to non derivatives
        protected abstract void assemble();
        protected abstract void test();
        protected  abstract void packaging();
        protected abstract void sotre();

    void StartManufacturing() {
        synchronized (this) {
            if (process != null && !process.isEmpty()) {
                assemble();
                test();
                packaging();
                sotre();
            }
        }
    }
}