package j22_Scope;

public class C03_Scope {//class level
    public static void main(String[] args) {//main level
C01_InstanceVariable obj=new C01_InstanceVariable();//istediğin Class'dan

C02_StaticVariable obj2=new C02_StaticVariable();
obj.non_static_method();//nnon_static_method();obj ile call edildi
        C01_InstanceVariable.static_method();//Class name ile ulaşabildim
      obj.developerMi=true;//ins. variable obj ile call edildi
        System.out.println("C01_InstanceVariable.kurs = " + C01_InstanceVariable.kurs);//static variable obj ile değil class ile
    }//main sonu
}//class sonu
