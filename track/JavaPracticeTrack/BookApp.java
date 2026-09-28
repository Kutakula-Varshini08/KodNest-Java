
class BookApp {

    public static void main(String[] args) {
        Book b1 = new Book();
        b1.setData(100);
        b1.getData();
    }
}

class Book {

    private int pageNum;

    public void setData(int x) {
        pageNum = x;
    }

    public void getData() {
        System.out.println(pageNum);
    }
}
