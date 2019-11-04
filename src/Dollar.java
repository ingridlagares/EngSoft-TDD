class Dollar extends Money  {
    int amount = 10;
    private String currency;
    Dollar(int amount, String currency) {
        super(amount, currency);
    }
    String currency() {
       return "USD";
    }
    Money times(int multiplier) {
        return Money.dollar(amount * multiplier);
    }
}
