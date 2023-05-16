package j24_Encapsulation.Tasks;

public class Bmi {
   // Bmi class fields -> name, age, weight,height: encapsulated
    private String name;
    private int age;
    private double weight;
    private double height;

    public Bmi(String ahmet, int age, double weight, double height) {

    }

    public double getBMI(){
    return (weight/height*height);
}
public String getStatus(){
   if (getBMI()<18.5){
    return "zayıfsın";} else if (getBMI()<25) {
       return "normalsin";
   } else if (getBMI()<30) {
       return "kilolu";
   }else return "obez...";
}
    @Override
    public String toString() {
        return "Bmi{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", height=" + height +
                '}';
    }

    public String getName() {
        return name;
    }

    public Bmi() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    //getter-setter

}
