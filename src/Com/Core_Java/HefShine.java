package Com.Core_Java;

public class HefShine {
    private String name;
    private String address;
    private String course;

    public HefShine(String name, String address, String course) {
        this.name = name;
        this.address = address;
        this.course = course;
    }

    public String getName() {
        return this.name;
    }

    public String getAddress() {
        return this.address;
    }

    public String getCourse() {
        return this.course;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void displayCompanyInfo() {
        System.out.println("Company Name: " + this.name);
        System.out.println("Address: " + this.address);
        System.out.println("Course Offered: " + this.course);
    }

    // Main method to test the HefShine class
    public static void main(String[] args) {
        HefShine hefShine = new HefShine("HefShine", "Satara Road, Pune, Maharashtra, India", "Full Stack Java Development");
        hefShine.displayCompanyInfo();
    }

}