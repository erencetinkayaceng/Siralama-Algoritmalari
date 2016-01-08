//Kabarcık Sıralama-Bubble Sort örneği

/**
 *
 * @author Eren ÇETİNKAYA Cruz
 */
public class KabarcikSiralama {

 public static void main(String[] args) {

  //Sıralı olmayan dizimiz
  int []sirasizDizi ={5,1,4,2,8};
  
  //Dizimizi sıralamak için gönderiyoruz KabarcikSiralama metoduna gönderiyoruz
  KabarcikSiralama(sirasizDizi);
  
  //Sıralı dizimizi yazdıralım
  for (int eleman : sirasizDizi){
     System.out.print(eleman+" ");             
    }
  System.out.println("");
  
 }

 public static void KabarcikSiralama(int[] dizi) {
  int temp;   // Yer değiştirmede kullanılacak geçici değişken
  for (int i = 1; i < dizi.length; i++) {
   for (int j = 0; j < dizi.length - i; j++) {
    //Önce gelen elaman bir sonrakinden büyükse ikisi yer değiştiriyor
    if (dizi[j] > dizi[j + 1]) {
     temp = dizi[j];
     dizi[j] = dizi[j + 1];
     dizi[j + 1] = temp;
    }
   }
  }
  
  
 }
}
