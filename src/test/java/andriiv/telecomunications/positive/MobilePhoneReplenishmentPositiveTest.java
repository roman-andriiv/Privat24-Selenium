package andriiv.telecomunications.positive;

import andriiv.base.BaseTest;
import org.junit.jupiter.api.Test;


import static andriiv.constants.Constant.MobileReplenishmentTestData.*;
import static andriiv.constants.Constant.Urls.MOBILE_PAYMENT_URL;

public class MobilePhoneReplenishmentPositiveTest extends BaseTest {
    @Test
    void checkIsRedirectToAuth() {
        basePage.goToUrl(MOBILE_PAYMENT_URL);
        mobilePhoneReplenishmentPage.selectCardFromWallet();
        basePage.isAuthWidgetPresent();

    }
    @Test
    void checkMinimumReplenishmentAmount(){
        basePage.goToUrl(MOBILE_PAYMENT_URL);
        mobilePhoneReplenishmentPage
                .enterPhoneNumber(MOBILE_PAYMENT_PHONE_NUMBER)
                .enterAmount("1")
                .enterCardNumber(MOBILE_PAYMENT_CARD)
                .enterExpireDate(MOBILE_PAYMENT_CARD_EXPIRE_DATE)
                .enterCvv(MOBILE_PAYMENT_CARD_CVV)
                .submitAddToCard()
                .checkPaymentDetailsIsPresent("FAIL Mobile payment. Phone number +380983783676");
    }
}
