package inputoutput.mailservice.mailclasses;

/*
Класс, который задает посылку. У посылки есть текстовое описание содержимого и целочисленная ценность.
*/

public class MailPackageContent {
    private final String content;
    private final int price;

    public MailPackageContent(String content, int price) {
        this.content = content;
        this.price = price;
    }

    public String getContent() {
        return content;
    }

    public int getPrice() {
        return price;
    }
}
