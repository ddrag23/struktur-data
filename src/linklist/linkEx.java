

public class linkEx {
	Node head; // bagian head / bagian depan dari list
	static class Node{
		int data;
		Node next;
		Node(int d) {data = d; next=null;}
	}
	// fungsi ini untuk menampilkan isi dari linklist yang dimaulai dari head
	public void display()
	{
		Node n = head; // deklari variable n yang berisikan value dari variable head
		// melakukan pengulangan untuk mengecek nilai dari n
		// ketika nilai n tidak sama dengan kosong makan tampilkan data.
		while (n != null){
			System.out.println(n.data+"\n");
			n = n.next;
		}
	}
	// fungsi untuk menjalankan simple link list menggunaka 3 node
    public static void main(String[] args) {
    	linkEx list = new linkEx(); // membuat link list kosong dengan membuat objek menggunakan class
    	// list.head berfungsi untuk memanggi variable head yang ada di class Node
    	list.head = new Node(100);   // membuat value 100 dari variabel head
    	Node second = new Node(200);// membuat value 200 dari variabel kedua
    	Node third = new Node(300);// membuat value 100 dari variabel ketiga
		list.head.next = second; // Link dari node pertama lalu dilanjutkan dengan node kedua 
		second.next = third; // Link dari node kedua ke node ketiga  
		list.display(); //tampilkan nilai dari 3 node diatas
    }

}
