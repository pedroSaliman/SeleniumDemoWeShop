package Factory;

import org.openqa.selenium.WebDriver;

public final class ThreadLocalDriver {

private ThreadLocalDriver(){};
private static ThreadLocal<WebDriver> THREAD_LOCAL=new ThreadLocal<>();

public static WebDriver getDriver(){
    return THREAD_LOCAL.get();
}
    public static void setDriver(WebDriver driver){
        THREAD_LOCAL.set(driver);
    }
public  static void unload(){
    THREAD_LOCAL.remove();
}
}
