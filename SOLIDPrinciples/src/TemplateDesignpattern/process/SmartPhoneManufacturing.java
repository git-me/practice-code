package TemplateDesignpattern.process;

public class SmartPhoneManufacturing extends GeneralmanufacturingProcess  {

    private String proces;
   private  GeneralmanufacturingProcess generalmanufacturingProcessp  ;

    public SmartPhoneManufacturing(String name) {

        super(name);
    }

    @Override
    protected void assemble() {
        System.out.println("assembling smartphone");
    }

    @Override
    protected void test() {
        System.out.println("testing smartphone");
    }

    @Override
    protected void packaging() {
        System.out.println("packaging smartphone");
    }

    @Override
    protected void sotre() {
        System.out.println("storing smartphone");
    }


    @Override
    public void run() {

        generalmanufacturingProcessp   =new SmartPhoneManufacturing("smartphone");

        try {
            Thread.sleep(3000);
            generalmanufacturingProcessp.StartManufacturing();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}