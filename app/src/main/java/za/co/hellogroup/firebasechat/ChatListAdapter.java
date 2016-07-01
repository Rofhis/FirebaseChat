package za.co.hellogroup.firebasechat;

import android.app.Activity;
import android.graphics.Color;
import android.widget.TextView;

import com.firebase.client.Query;
import com.firebase.client.core.view.View;

/**
 * Created by rofhiwa.sikhauli on 5/4/2016.
 */
public class ChatListAdapter extends FirebaseListAdapter<ChatModel> {

    // The mUsername for this client. We use this to indicate which messages originated from this user
    private String mUsername;

    public ChatListAdapter(Query ref, Activity activity, int layout, String mUsername) {
        super(ref, ChatModel.class, layout, activity);
        this.mUsername = mUsername;
    }

    @Override
    protected void populateView(android.view.View view, ChatModel chat) {
        // Map a Chat object to an entry in our listview
        String author = chat.getAuthor();
        TextView authorText = (TextView) view.findViewById(R.id.author);
        authorText.setText(author + ": ");
        // If the message was sent by this user, color it differently
        if (author != null && author.equals(mUsername)) {
            authorText.setTextColor(Color.RED);
        } else {
            authorText.setTextColor(Color.BLUE);
        }
        ((TextView) view.findViewById(R.id.message)).setText(chat.getMessage());
    }

}