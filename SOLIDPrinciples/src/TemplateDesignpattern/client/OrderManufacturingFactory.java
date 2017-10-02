package TemplateDesignpattern.client;

import TemplateDesignpattern.process.GeneralmanufacturingProcess;
import TemplateDesignpattern.process.SmartPhoneManufacturing;
import TemplateDesignpattern.process.StorageDeviceMannufacturing;

public class OrderManufacturingFactory {
    public static void main(String[] args) throws InterruptedException {
        GeneralmanufacturingProcess smartPhoneManufacturing =new SmartPhoneManufacturing("smartphone");
        Thread t1=new Thread(smartPhoneManufacturing);
        GeneralmanufacturingProcess storageDeviceMannufacturing =new StorageDeviceMannufacturing("StorageDevice");
        Thread t2=new Thread(storageDeviceMannufacturing);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("main method finished after manufacturing completed");
    }
}
