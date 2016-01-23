//Seçmeli sıralama-Selection Sort örneği

/**
 *
 * @author Eren ÇETİNKAYA Cruz
 */
public class SecmeliSiralama {

 public static void main(String[] args) {

  //Sıralı olmayan dizimiz
  int[] sirasizDizi = {5, 1, 4, 2, 8};

  //Dizimizi sıralamak için seçmeliSiralama metoduna gönderiyoruz
  secmeliSiralama(sirasizDizi);

  //Sıralı dizimizi yazdıralım
  for (int eleman : sirasizDizi) {
   System.out.print(eleman + " ");
  }
  System.out.println("");

 }

 public static void secmeliSiralama(int[] dizi) {
  int yedek;
  int minIndis;
  
  for (int i = 0; i < dizi.length; i++) {
   minIndis = i;
   //Son indisten başlayarak karşılaştırmaya devam ediyoruz
   for (int j = i; j < dizi.length; j++) {
    //minIndis den daha küçük değer varsa indisi değiştiriyoruz
    if (dizi[j] < dizi[minIndis]) {
     minIndis = j;
    }
   }
   //burada değiştirme işlemini yapıyoruz
   yedek = dizi[i];
   dizi[i] = dizi[minIndis];
   dizi[minIndis] = yedek;
  }

 }

}
