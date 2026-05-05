public class QueueLinkedList19 {
    Node19 front, rear;
    int size = 0;
    int max = 10; // batas antrian (opsional)

    public boolean isEmpty() {
        return front == null;
    }

    public boolean isFull() {
        return size == max;
    }

    public void enqueue(TugasMahasiswa19 mhs) {
        if (isFull()) {
            System.out.println("Antrian penuh!");
            return;
        }
        Node19 newNode = new Node19(mhs);

        if (isEmpty()) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
        System.out.println("Mahasiswa masuk antrian.");
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
        } else {
            System.out.print("Memanggil: ");
            front.data.tampil();
            front = front.next;
            size--;

            if (front == null) {
                rear = null;
            }
        }
    }

    public void peekFront() {
        if (!isEmpty()) {
            System.out.print("Antrian terdepan: ");
            front.data.tampil();
        }
    }

    public void peekRear() {
        if (!isEmpty()) {
            System.out.print("Antrian terakhir: ");
            rear.data.tampil();
        }
    }

    public void jumlah() {
        System.out.println("Jumlah antrian: " + size);
    }

    public void clear() {
        front = rear = null;
        size = 0;
        System.out.println("Antrian dikosongkan.");
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
        } else {
            Node19 temp = front;
            System.out.println("Isi Antrian:");
            while (temp != null) {
                temp.data.tampil();
                temp = temp.next;
            }
        }
    }
}
    
