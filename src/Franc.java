class Franc extends Money {   
    private int amount;					
    private String currency;
    Franc(int amount, String currency) {      
      super(amount, currency);
    }					

    Money times(int multiplier)  {      
       return new Franc(amount * multiplier);					
    }   
}
