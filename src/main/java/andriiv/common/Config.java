package andriiv.common;

public class Config {

    /**
     * Specify the browser for test:
     * CHROME_WIN,
     * MOZILLA_WIN
     */
    public static final String BROWSER = "CHROME_WIN";
    /**
     * Clean browser cookies after each iteration
     */
    public static final boolean CLEAR_COOKIES = true;
    /**
     * To keep the browser open after all scenarios/tests
     */
    public static final boolean HOLD_BROWSER_OPEN = true;
    /**
     * Clear the directory with the screenshots before starting the build
     */
    public static final boolean CLEAR_REPORTS_DIR = true;
}
