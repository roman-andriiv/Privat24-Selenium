package andriiv.telecomunications.positive;

import andriiv.base.BaseTest;
import org.junit.jupiter.api.Test;


import static andriiv.constants.Constant.Urls.MOBILE_PAYMENT_URL;

public class MobilePhoneReplenishmentPositiveTest extends BaseTest {
    @Test
    void checkIsRedirectToAuth() {
        basePage.goToUrl(MOBILE_PAYMENT_URL);
        mobilePhoneReplenishmentPage.selectCardFromWallet();
        basePage.isAuthWidgetPresent();

    }
}
