package cl.app.beneficio.model;

public class Category {
    private String id;
    private String category;
    private String[] benefits;

    public Category() {
    }

    public Category(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String[] getBenefits() {
        return benefits;
    }

    public void setBenefits(String[] benefits) {
        this.benefits = benefits;
    }
}
