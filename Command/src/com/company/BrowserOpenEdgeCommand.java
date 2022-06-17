package com.company;

public class BrowserOpenEdgeCommand implements Command {
    Browser browser;
    public BrowserOpenEdgeCommand(Browser browser)
    {
        this.browser = browser;
    }
    public void execute()
    {
        browser.open();
        browser.setMozilla();
        browser.setChrome();
    }
}
