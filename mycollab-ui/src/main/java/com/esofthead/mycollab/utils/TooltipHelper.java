/**
 * This file is part of mycollab-ui.
 *
 * mycollab-ui is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * mycollab-ui is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with mycollab-ui.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.esofthead.mycollab.utils;

import com.esofthead.mycollab.vaadin.AppContext;
import com.hp.gagawa.java.elements.Div;

/**
 * @author MyCollab Ltd.
 * @since 4.6.0
 */
public class TooltipHelper {

    public static Div buildDivTooltipEnable(String uid) {
        Div div1 = new Div().setId("div1" + uid);
        div1.setAttribute("class", "stickytooltip");

        Div div12 = new Div();
        div12.setAttribute("style", "padding:5px");
        div1.appendChild(div12);

        Div div13 = new Div().setId("div13" + uid);
        div13.setAttribute("class", "atip");
        div13.setAttribute("style", "width:550px");
        div12.appendChild(div13);

        Div div14 = new Div().setId("div14" + uid);
        div13.appendChild(div14);
        return div1;
    }

    public static String userHoverJsDunction(String uid, String user) {
        String arg3 = "'" + uid + "'";
        String arg4 = "'" + user + "'";
        String arg5 = "'" + AppContext.getSiteUrl() + "tooltip/'";
        String arg6 = "'" + AppContext.getSiteUrl() + "'";
        String arg7 = AppContext.getUser().getTimezone();
        String arg8 = "'" + AppContext.getAccountId() + "'";
        String arg9 = "'" + AppContext.getUserLocale().toString() + "'";

        return String.format(
                "return showUserTooltip(%s,%s,%s,%s,%s,%s,%s);", arg3, arg4, arg5,
                arg6, arg7, arg8, arg9);
    }

    public static String projectHoverJsFunction(String uid, String type, String typeId) {
        String uidVal = "'" + uid + "'";
        String typeVal = "'" + type + "'";
        String typeIdVal = "'" + typeId + "'";
        String urlVal = "'" + AppContext.getSiteUrl() + "tooltip/'";
        String accountIdVal = "'" + AppContext.getAccountId() + "'";
        String siteUrlVal = "'" + AppContext.getSiteUrl() + "'";
        String timezoneVal = AppContext.getUser().getTimezone();
        String localeVal = "'" + AppContext.getUserLocale().toString() + "'";

        return String.format(
                "return overIt(%s,%s,%s,%s,%s,%s,%s,%s);", uidVal, typeVal, typeIdVal,
                urlVal, accountIdVal, siteUrlVal, timezoneVal, localeVal);
    }

    public static String crmHoverJsFunction(String uid, String type, String typeId) {
        String uidVal = "'" + uid + "'";
        String typeVal = "'" + type + "'";
        String typeIdVal = "'" + typeId + "'";
        String urlVal = "'" + AppContext.getSiteUrl() + "tooltip/'";
        String accountIdVal = "'" + AppContext.getAccountId() + "'";
        String siteUrlVal = "'" + AppContext.getSiteUrl() + "'";
        String timezoneVal = AppContext.getUser().getTimezone();
        String localeVal = "'" + AppContext.getUserLocale().toString() + "'";
        return String.format(
                "return crmActivityOverIt(%s,%s,%s,%s,%s,%s,%s,%s);",
                uidVal, typeVal, typeIdVal, urlVal, accountIdVal, siteUrlVal, timezoneVal, localeVal);
    }

    public static String itemMouseLeaveJsFunction(String uid) {
        return String.format("hideTooltip('%s')", uid);
    }
}
