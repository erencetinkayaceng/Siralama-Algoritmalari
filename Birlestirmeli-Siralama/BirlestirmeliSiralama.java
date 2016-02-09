//Birleştirmeli Sıralama-Merge Sort örneği

/**
 *
 * @author Eren Çetinkaya Cruz
 */
public class BirlestirmeliSiralama {

 public static void main(String[] args) {
   //Sıralı olmayan dizimiz
  int sirasizDizi[] = {5, 1, 4, 2, 8,3};
  
  //Dizimizi sıralamak için birlestirmeliSiralama metoduna gönderiyoruz
  birlestirmeliSiralama(0, sirasizDizi.length-1,sirasizDizi);
  
 //Sıralı dizimizi yazdıralım
  for (int eleman : sirasizDizi) {
   System.out.print(eleman + " ");
  }
  System.out.println("");
 }

 public static void birlestirmeliSiralama(int alt, int üst,int[] sirasizDizi) {
  if (alt < üst) {
   int orta = (alt + üst) / 2;
   //sirasiz dizimi yerel değişken yaptığımdan diziyide metodlara yolladım
   birlestirmeliSiralama(alt, orta, sirasizDizi); 
   birlestirmeliSiralama(orta + 1, üst,sirasizDizi);
   birlestir(alt, orta, üst,sirasizDizi);
  }
 }

 public static void birlestir(int alt, int orta, int üst,int[] sirasizDizi) {
  int[] yedekDizi = new int[sirasizDizi.length];
  int i, j, k;
// a dizisinin her iki yarısını yedekDizi dizinine kopyala
  for (i = alt; i <= üst; i++) {
   yedekDizi[i] = sirasizDizi[i];
  }
  i = alt;
  j = orta + 1;
  k = alt;
  // her adımda bir sonraki en büyük terimi kopyala
  while (i <= orta && j <= üst) {
   if (yedekDizi[i] <= yedekDizi[j]) {
    sirasizDizi[k++] = yedekDizi[i++];
   } else {
    sirasizDizi[k++] = yedekDizi[j++];
   }
  }
// varsa, ilk yarıdan arta kalan terimlerin hepsini kopyala
  while (i <= orta) {
   sirasizDizi[k++] = yedekDizi[i++];
  }
 }

}
