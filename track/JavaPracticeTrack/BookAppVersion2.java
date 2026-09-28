
class BookAppVersion2 {

    public static void main(String[] args) {
        Book b1 = new Book();
        b1.setData(100);
        System.out.println(b1.getData());
    }
}

class Book {

    private int pageNum;

    public void setData(int x) {
        if (x > 0) {
            pageNum = x;
        }
    }

    public int getData() {
        return pageNum;
    }
}
