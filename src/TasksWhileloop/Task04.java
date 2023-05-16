package TasksWhileloop;

public class Task04 {
    public static void main(String[] args) {
/*
		task->  3 basamakli 4 ve 6 ya tam bolunebilen
		 tam sayilari buyukten kucuge ve
		 kaç tane oldugunu print eden code create ediniz.
		 */
  int bolunens=1;
  int sayac=0;
  while (bolunens<1000){if (bolunens>=100&&bolunens%12==0)
  {sayac++;}
      bolunens++;}
  System.out.println("sayac = " + sayac);
//buyukten kucuge yazamadım

}}
