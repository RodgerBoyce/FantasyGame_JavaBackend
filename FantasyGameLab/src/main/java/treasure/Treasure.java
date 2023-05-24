package treasure;

public enum Treasure {
    DIAMONDDS(10),
    GOLDCOIN(5),
    RUBY(1);

    private final Integer value;

    Treasure(Integer value){
        this.value = value;
    }
    public Integer getValue() {
        return value;
    }
}
