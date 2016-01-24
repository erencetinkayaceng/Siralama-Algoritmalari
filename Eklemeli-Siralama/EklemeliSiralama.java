//Eklemeli sıralama - Insertion Sort örneği

/**
 *
 * @author Eren ÇETİNKAYA Cruz
 */
public class EklemeliSiralama {

 public static void main(String[] args) {

  //Sıralı olmayan dizimiz
  int[] sirasizDizi = {5, 1, 4, 2, 8};

  //Dizimizi sıralamak için eklemeliSiralama metoduna gönderiyoruz
  eklemeliSiralama(sirasizDizi);

  //Sıralı dizimizi yazdıralım
  for (int eleman : sirasizDizi) {
   System.out.print(eleman + " ");
  }
  System.out.println("");

 }

 public static void eklemeliSiralama(int[] dizi) {
  int gecici = 0, j = 0;
  
  for (int i = 1; i < dizi.length; i++) {
   gecici = dizi[i]; // i. eleman gecici yapıyoruz   
   j = i - 1; //i nin bir eksiğini j ye atıyoruz
   
   // j sıfırdan büyükse ve
   //  geçici dizinin j. elamanından küçük olana kadar kaydırma yap
   while (j >= 0 && gecici < dizi[j]) {
    dizi[j + 1] = dizi[j];
    j = j - 1;
    dizi[j + 1] = gecici;
   }

  }
 }

}
