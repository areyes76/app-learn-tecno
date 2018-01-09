package cl.app.beneficio.model;

public class Commerce {
    private String id;
    private String commerce;
    private String[] benefits;

    public Commerce() {
    }

    public Commerce(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCommerce() {
        return commerce;
    }

    public void setCommerce(String commerce) {
        this.commerce = commerce;
    }

    public String[] getBenefits() {
        return benefits;
    }

    public void setBenefits(String[] benefits) {
        this.benefits = benefits;
    }
}
