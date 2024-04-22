package nested.nested.inner.ex1;

public class Car {
    private String model;
    private int chargeLevel;
    private Engine engine;
    
    public Car(String model, int chargeLevel) {
        this.model = model;
        this.chargeLevel = chargeLevel;
        this.engine = new Engine(this);
    }
    
    /**
     * 엔진 에서만 사용하는 메서드
     * @return
     */
    public String getModel() {
        return model;
    }
    
    /**
     * 엔진 에서만 사용하는 메서드
     * @return
     */
    public int getChargeLevel() {
        return chargeLevel;
    }
    
    public void start() {
        engine.start();
        System.out.println(model + " 시작 완료");
    }
}
