package javatar.demo.uts;
public class Main{
public static void main(String[] args) {
	//panggil fungsi insertionsort 
	System.out.println("=============================================");
	System.out.println("insertion sort");
	System.out.println("=============================================");
	insertionSort();
	// panggil fungsi aritmatika
	System.out.println("=============================================");
	System.out.println("Aritmatika");
	System.out.println("=============================================");
	aritmatika();
}

public static void insertionSort(){
	int a[] = {11,3,7,5,9,4,2};
	for (int i=0; i<a.length; i++) {
	int key = a[i];
	int val = i;
	while ((val>0) && (key<a[val-1])){
		a[val] = a[val-1];
		val--;
	}
	a[val] = key;
	}
	for (int hasil=0; hasil<a.length; hasil++ ) {
	System.out.println(a[hasil]+",");
}
}
public static void aritmatika(){
	int val[] = {4,6,8,3,5,7,15};
	for (int i=0; i<val.length; i++) {
		for (int t=0; t<val.length; t++) {
			int tambah = val[t] + val[i];
			System.out.println("No "+t+". Hasil Tambah = "+tambah);
		}
		System.out.println("======================================================");
		for (int k=0; k<val.length; k++) {
			int kurang = val[k] - val[i];
			System.out.println("No "+k+". Hasil Kurang = "+kurang);
		}
		System.out.println("======================================================");
		for (int b=0; b<val.length; b++) {
			int bagi = val[b] / val[i];
			System.out.println("No "+b+". Hasil Bagi = "+bagi);
		}
		System.out.println("======================================================");
		for (int kl=0; kl<val.length; kl++) {
			int kali = val[kl] * val[i];
			System.out.println("No "+kl+". Hasil Kali = "+kali);		
		}
	}
}
}
