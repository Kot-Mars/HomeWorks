public class Cat {
    private String name;
    private int height, weight;
    public enum PedigreeNumberType {
        Russia, England, Sholtandia
    }
    private PedigreeNumberType pedigreeNumber;
    public Cat() {

    }
    public Cat(String name, int height, int weight,  PedigreeNumberType pedigreeNumber) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.pedigreeNumber = pedigreeNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public PedigreeNumberType getPedigreeNumber() {
        return pedigreeNumber;
    }

    public void setPedigreeNumber(PedigreeNumberType pedigreeNumber) {
        this.pedigreeNumber = pedigreeNumber;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                ", pedigreeNumber=" + pedigreeNumber +
                '}';
    }
}
