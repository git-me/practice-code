package TemplateDesignpattern.process;

public class StorageDeviceMannufacturing extends GeneralmanufacturingProcess  {

    private String process;
    private GeneralmanufacturingProcess generalmanufacturingProcessp ;

    public StorageDeviceMannufacturing(String name) {
        super(name);


    }

    @Override
    protected void assemble() {
        System.out.println("assembling StorageDevice");
    }

    @Override
    protected void test() {
        System.out.println("testing StorageDevice");
    }

    @Override
    protected void packaging() {
        System.out.println("packiging StorageDevice");
    }

    @Override
    protected void sotre() {
        System.out.println("storing StorageDevice");
    }

    @Override
    public void run() {

        generalmanufacturingProcessp   =new StorageDeviceMannufacturing("storage");
        generalmanufacturingProcessp.StartManufacturing();
    }
}
