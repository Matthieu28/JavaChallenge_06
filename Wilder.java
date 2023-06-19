class Wilder {
    private String firstname;
    private boolean aware;

    public Wilder(String firstname, boolean aware) {
        this.firstname = firstname;
        this.aware = aware;
    }

    public String getFirstname() {
        return this.firstname;
    }

    public boolean getAware() {
        return this.aware;
    }

    public String awareOrNot() {
        if (getAware()) {
            return "aware";
        } else {
            return "pas aware";
        }
    }

    public void setFirstname(String firtname) {
        this.firstname = firtname;
    }

    public void setAware(boolean aware) {
        this.aware = aware;
    }

    public String whoIAm() {
        return "Je m'appelle " + this.getFirstname() + " et je suis " + this.awareOrNot();
    }
}