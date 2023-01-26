package andriiv.constants;

public class Constant {
    public static class TimeoutVariables {
        public static final int IMPLICIT_WAIT = 5;
        public static final int EXPLICIT_WAIT = 10;
    }

    public static class Urls {
        public static final String MOBILE_PAYMENT_URL = "https://next.privat24.ua/mobile?lang=en";
        public static final String CAR_LOAN_URL = "https://next.privat24.ua/auto-credit/order?lang=en";
    }

    public static class MobileReplenishmentTestData {
        /* All test information was taken and generated from the Internet from the random CreditCard Generator
        * https://www.vccgenerator.org
        * It is important to note that these credit card numbers are not real and cannot be used to make actual
        * purchases. They are, however, used for testing payment processing systems or for development purposes.
        * Keep in mind: VCCGenerator's Credit Card Generator does not generate credit card numbers that have real money
        * and doesn't belong to any cardholder. The cardholder's name, address, money, CVV/CVC, expiration date,
        * and PIN are randomly generated.
        */
        public static final String MOBILE_PAYMENT_PHONE_NUMBER = "730835063";
        public static final String MOBILE_PAYMENT_CARD = "5461028042316598";
        public static final String MOBILE_PAYMENT_CARD_EXPIRE_DATE = "0925";
        public static final String MOBILE_PAYMENT_CARD_CVV = "992";

    }
}
