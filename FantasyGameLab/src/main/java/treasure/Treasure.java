package treasure;

public enum Treasure {
    DIAMONDS(10),
    GOLDCOIN(1),
    RUBY(5);

    private final Integer value;

    Treasure(Integer value){
        this.value = value;
    }
    public Integer getValue() {
        return value;
    }
}
