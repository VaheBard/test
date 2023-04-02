public class Book {
    protected String title;
    protected Author author;
    protected int yearOfWrite;
    protected int rating;
    protected String text;

    public Book(String title, Author author, int yearOfWrite){
        this.title = title;
        this.author = author;
        this.yearOfWrite = yearOfWrite;
        this.rating = 3;
        this.text = "";
    }
    public void up(){
        if(rating < 5){
            rating++;
        } else {
            System.out.println("The rating cannot added - it is already on maximum!");
        }
    }
    public void append(String textAdd){
        text += textAdd;
    }
    public int getRating(){
        return rating;
    }

    public String getText(){
        return text;
    }
}
