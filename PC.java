package domain;

public class PC implements Equipment{
    private String model;//�����ͺ�
    private String display;//��ʾ������
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
