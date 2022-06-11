package com.company.creational.prototype;

public class Computer implements Cloneable {
    private String OS;
    private String office;
    private String antivirus;
    private String browser;
    private String others;

    public Computer(String OS, String office, String antivirus, String browser, String others) {
        this.OS = OS;
        this.office = office;
        this.antivirus = antivirus;
        this.browser = browser;
        this.others = others;
    }

    @Override
    protected Computer clone() {
        try {
            return (Computer) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public String toString() {
        return "Computer [os=" + OS
                + ", office=" + office
                + ", antivirus=" + antivirus
                + ", browser=" + browser
                + ", others=" + others;
    }

    public void setOthers(String others) {
        this.others = others;
    }
}
