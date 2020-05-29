
public class linkCircleEx {
    public class Node{
    	int data;
    	Node next;
    	public Node(int data){
    		this.data = data; // ambil paramater data dari fungsi node dan berisikan data yang dari properti
    	}
    }
    // pendeklarasian variabel
    	public Node head = null;
    	public Node tail = null;
    // fungsi ini untuk menambahkan node baru
    public void add(int data){
    	Node newNode = new Node(data); // membuat node baru dengan parameter data
    	// if ini berfungsi untuk mengecek nilai dari variable head.
    	// jika headnya bernilai null makan buat node baru dari head sampai tail
     	// tapi jika ada tidak bernilai null maka akan membuat node baru di tail / ekornya saja
    	if (head == null) {
    		head = newNode;
    		tail = newNode;
    		newNode.next = head;
    	} else{
    		tail.next = newNode; // variabel tail akan membuat node baru
    		tail = newNode; // node baru akan menjadi sebuah tail / ekor baru dalam list
    		tail.next = head; // setelah tail baru terbentuk maka akan lanjut ke kepala / head. 
    	}
    }
    // fungsi ini untuk menampilkan hasil dari node
    public void display(){
    	Node alur = head; // deklarisikan untuk menampung value dari variabel head
    	// kondisi ini untuk mengecek jika headnya null tampilkan list ini kosong
    	// tapi jika headnya tidak null maka akan membuat perulangan untuk
    	// mengurutkan data dari kepala sampai ekor  
        if(head == null) {  
            System.out.println("List is Empty");  
        }  
        else {  
            System.out.println("Nodes of the circular linked list: ");
            // jalankan increment dari alur yang berisikan nilai dari variabel data.
           	//ketika alurnya sudah tidak sama dengan nilai headnya maka berhenti melakukan increment tersebut.  
             do{    
                System.out.print(" "+ alur.data);  
                alur = alur.next;  
            }while(alur != head);  
            System.out.println();  
        }  
    }
    public static void main(String[] args) {
    	linkCircleEx list = new linkCircleEx();
    	// tambahkan data list
    	list.add(1);
    	list.add(2);
    	list.add(3);
    	list.add(4);
    	list.add(5);
    	// tampilkan data list
    	list.display();
    }
}
