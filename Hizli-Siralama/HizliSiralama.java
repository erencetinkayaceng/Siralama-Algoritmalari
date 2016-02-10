// Hızlı sıralama örneği - Quick Sort örneği

/**
 *
 * @author Eren Çetinkaya Cruz
 */
public class HizliSiralama {

 public static void main(String[] args) {
  //Sıralı olmayan dizimiz
  int sirasizDizi[] = {5, 1, 4, 2, 8, 3};

  //Dizimizi sıralamak için hizliSiralama metoduna gönderiyoruz
  hizliSiralama(sirasizDizi,0, sirasizDizi.length - 1);

  //Sıralı dizimizi yazdıralım
  for (int eleman : sirasizDizi) {
   System.out.print(eleman + " ");
  }
  System.out.println("");
 }

 public static void hizliSiralama(int dizi[], int sol, int sag) {
  int indis = parca(dizi, sol, sag);
  if (sol < indis - 1) {
   hizliSiralama(dizi, sol, indis - 1);
  }
  if (indis < sag) {
   hizliSiralama(dizi, indis, sag);
  }
 }

 public static int parca(int dizi[], int sol, int sag) {
  int i = sol, j = sag;
  int gecici;
  int dayanakEleman = dizi[(sol + sag) / 2];

  while (i <= j) {
   
   //soldan başlayarak dayanak elemanı(pivot)tan küçük elemanı bul
   while (dizi[i] < dayanakEleman) {
    i++;
   }
   //sağdan başlayarak dayanak elemanı(pivot)tan büyük elemanı bul
   while (dizi[j] > dayanakEleman) {
    j--;
   }
   //bulunan elamanların yerlerini değiştir
   if (i <= j) {
    gecici = dizi[i];
    dizi[i] = dizi[j];
    dizi[j] = gecici;
    i++;
    j--;
   }
  };

  return i;
 }

}
