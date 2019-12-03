package domain;

public class PC implements Equipment{
    private String model;//机器型号
    private String display;//显示器名称
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    PC(String model,String display){
        this.display = display;
        this.model = model;
    }

    public PC() {
    }

    @Override
    public String getDescription() {
        return model+"("+display+")";
    }
}
