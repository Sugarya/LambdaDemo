package com.sugarya.core.template;

import com.sugarya.utils.Out;

import java.util.function.Consumer;

public abstract class AbstractComputer {

    public void work(){
        powerOn();
        int hardware = checkHardware();
        loadOS(hardware);
    }

    public void work(Consumer<Integer> consumer){
        powerOn();
        int hardwareParam = checkHardware();
        consumer.accept(hardwareParam);
    }

    protected void powerOn(){
        Out.println("开启电源");
    }

    protected int checkHardware(){
        Out.println("检查硬件");
        return 1;
    }

    protected abstract void loadOS(int hardware);

}
