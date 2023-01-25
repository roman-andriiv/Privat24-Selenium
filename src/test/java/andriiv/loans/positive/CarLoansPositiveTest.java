package andriiv.loans.positive;

import andriiv.base.BaseTest;
import org.junit.jupiter.api.Test;

import static andriiv.constants.Constant.Urls.CAR_LOAN_URL;

public class CarLoansPositiveTest extends BaseTest {
    @Test
    void selectAgreementsTabInPublicSession() {
        basePage.goToUrl(CAR_LOAN_URL);
        carLoansPage.selectAgreementsTab();
        basePage.isAuthWidgetPresent();
    }
}
