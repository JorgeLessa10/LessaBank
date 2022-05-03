package model;

public class Client extends Person{

        private boolean vip;

    public Client() {
    }

    public Client(boolean vip) {
        this.vip = vip;
    }

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }
}
