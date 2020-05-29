import java.util.LinkedList;
import java.util.Queue;
import java.util.*;
public class QueueEx {
	
public static void main(String[] args) {
	// deklarasi variable
int pilih;
String jawab="y";
// object input from java
Scanner inputan= new Scanner (System.in);
// run app

while(jawab.equals("y")){

System.out.println("Pilih Aplikasi :");
System.out.println("1. Contoh diPPT\n2. Contoh Koding Di Zoom\n3. Tugas PPT\n4. Keluar");
System.out.println("masukkan angka untuk memilih fitur");
System.out.println("=====================================");
pilih = inputan.nextInt();
switch(pilih){
    case 1:
exQueuePpt(); //memanggil method
        break;
    case 2:
exInZoom(); // memanggil method
        break;
    case 3:
tugasPpt(); // memanggil method
    break;
    case 4:
System.exit(4);
    break;
    default:
    System.out.println("fitur yang anda pilih tidak ada");
break;
}
System.out.println("=====================================");
System.out.println("Apa anda ingin lanjut (y/n) ?");
jawab = inputan.next();

}    	
    }
static void exQueuePpt(){
	Queue<String> q = new LinkedList<>();
	q.add("A");
	q.add("B");
	q.add("C");
	q.add("D");
	q.add("ALO");
	q.offer("abc");
	q.offer("234");
	q.offer("5");
	String name = q.remove();
	System.out.println("Removed queue : "+name+"| New Queue : "+q);
	name = q.poll();
	System.out.println("Removed queue : "+name+"| New Queue : "+q);
	System.out.println("Element : "+q.element());
	System.out.println("Poll : "+q.poll());
	System.out.println("Peek : "+q.peek());
}   

static void exInZoom(){
	Queue<String> test = new LinkedList<>();
	System.out.println("Queue :"+test);
	test.add("APA");
	test.add("DE");
	test.add("aku");
	test.add("mau");
	test.add("jalan");
	test.add("ke mall");
	System.out.println("Queue :"+test);
	test.remove();
	test.remove();
	System.out.println("Remove : "+test.remove()); //mengeluarkan isi array
	System.out.println("Queue : "+test); // melihat isi array 
	System.out.println("Size : "+test.size()); // melihat ukuran dari array
	System.out.println("Peek : "+test.peek()); // melihat isi array paling atas/paling depan
	System.out.println("Element : "+test.element()); // melihat element yang paling depan
	System.out.println("Poll : "+test.poll());  // memilih element yang berada didepan
}
static void tugasPpt(){
	Queue<String> arr = new LinkedList<>();
	System.out.println("Queue :"+arr);
	arr.add("1");
	arr.add("6");
	arr.add("0");
	arr.add("6");
	System.out.println("Queue :"+arr);
	System.out.println("Enqueue : "+arr.add("9")+ " 9"); //menambah isi array
	System.out.println("Enqueue : "+arr.add("8")+ " 8"); //menambah isi array
	System.out.println("Enqueue : "+arr.add("7")+ " 7"); //menambah isi array
	System.out.println("Queue :"+arr); 
	System.out.println("Remove : "+arr.remove()); //mengeluarkan isi array
	System.out.println("Peek : "+arr.peek()); // melihat isi array paling atas/paling depan
	System.out.println("Remove : "+arr.remove()); //mengeluarkan isi array
	System.out.println("Enqueue : "+arr.add("7")+ " 7"); //menambah isi array
	System.out.println("Queue :"+arr); 

}
}
