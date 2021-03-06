package projects.wlye.pages.subpages.submainpages;

import android.support.test.uiautomator.UiObjectNotFoundException;

import java.util.logging.Logger;

import helper.base.VP2;

/**
 * Author:jianbin.zhong
 * Date: 2018/6/29 10:09
 * Description:心理减压界面
 */

public class StressPage extends VP2 {

    private static Logger logger = Logger.getLogger(StressPage.class.getName());

    public static String ID_TITLE = "com.staff.wuliangye:id/title";//title

    public static String getTitle() throws UiObjectNotFoundException {
        return getTex(ID_TITLE);
    }
}