package com.company;

public class BrowserCloseCommand implements Command {
    Browser browser;
    public BrowserCloseCommand(Browser browser)
    {
        this.browser = browser;
    }
    public void execute()
    {
        browser.close();
    }
}
