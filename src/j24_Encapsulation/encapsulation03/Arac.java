package j24_Encapsulation.encapsulation03;

public class Arac {//pojo
/*
 1- fieldları(encapsulated) model(String), renk(String), motor(int), yil (int)
olan Araba  isimli bir class cretae ediniz.
2- bütün fieldları parametre alan bir constructor tanımlayınız.
3- Runner isminde main için bir class oluşturunuz.
4- İki adet parametreli const 1 adet parametresiz cons ile 3 adet araba creat ediniz
5- aracların motor hacmi 1000 cc ve altı olması ve yılını hatalı veri girisine karsi kontrol ediniz.
  */
//fields:
 private String model;
  private String renk;
  private int motor;
 private int yıl;

  public Arac(String model, String renk, int motor, int yıl) {
    this.model = model;
    this.renk = renk;
    this.motor =motor;
    setMotor(motor);
    this.yıl =yıl;
    setYıl(yıl);
  }

  public Arac() {//p.siz constructor

  }

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public String getRenk() {
    return renk;
  }

  public void setRenk(String renk) {
    this.renk = renk;
  }

  public int getMotor() {
    return motor;
  }

  public void setMotor(int motor) {
    this.motor =Math.abs(motor);
    if(motor<=1000){
        System.out.println("bisikletle daha çabuk varırsın");
    }else this.motor=motor;
  }

  public int getYıl() {
    return yıl;
  }

  public void setYıl(int yıl) {
      //if (yıl<=1886){
          //System.out.println("Araba vardı da biz mi binmedik");
          //System.out.println("arac yılını hatalı girdiniz");
     // }else
    this.yıl =Math.abs(yıl);
  }

  @Override
  public String toString() {
    return "Arac{" +
            "model='" + model + '\'' +
            ", renk='" + renk + '\'' +
            ", motor=" + motor +
            ", yıl=" + yıl +
            '}';
  }
}
