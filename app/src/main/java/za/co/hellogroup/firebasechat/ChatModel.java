package za.co.hellogroup.firebasechat;

/**
 * Created by rofhiwa.sikhauli on 5/4/2016.
 */
public class ChatModel {

    private String message;
    private String author;

    // Required default constructor for Firebase object mapping
    @SuppressWarnings("unused")
    private ChatModel() {
    }

     ChatModel(String message, String author) {
        this.message = message;
        this.author = author;
    }

    public String getMessage() {
        return message;
    }

    public String getAuthor() {
        return author;
    }


}
