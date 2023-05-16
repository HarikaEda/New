package j25_Inheritance;

public class task02 {
    /*

 1) SuperClass  bir class create ediniz.  int sayi  = 33    variable create ediniz.
 ebikGabık method   "Agama bolcana super offer" return ediniz

2) SubClass SuperClass'tan inherit ediniz.    int sayi= 17 variable create ediniz.
  javaTAR methodu  "Agam SubClass'dan selam dewamkeee. "  return ediniz

ebikGabık  method create edip : SubClass'daki javaTAR methodunu ve SuperClasstaki ebikGabık
 methodunu call edip SubClass  ve SuperClass'taki int sayi print ediniz.

  sonra olarak main methodta  javaCAN u call ediniz..


 output:

 "Agama bolcana super offer"
 "Agam SubClass'dan selam dewamkeee. "
 SubClasstaki sayi :33
 süperClasstaki sayi  :17
  */
    public static void main(String[] args) {
        int sayi= 17;
            SubClass obj = new SubClass();
            obj.javaCAN();//obj ile non-satatic meth. call
            // javaCAN-> non-static meth.obj olmadan doğrudan call edilemz
        }//main sonu
        public  void  javaCAN(){
            System.out.println(this.ebikGabık());//subClass meth call-> child meth call
            //System.out.println(super.ebikGabık());//superClass meth call->parent meth call
           // System.out.println("sayi = " + this.sayi);//child variable call
           // System.out.println("super.sayi = " + super.sayi);//parent variable call
        }
        //@Override
        public String ebikGabık() {
            return   "Agam SubClass'dan selam dewamkeee. ";
        }
}//Class sonu














