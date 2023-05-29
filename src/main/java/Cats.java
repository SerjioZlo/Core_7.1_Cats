import com.fasterxml.jackson.annotation.JsonProperty;

public class Cats {
    private String id = null;
    private String text = null;
    private String type = null;
    private String user = null;
    private String upvotes = null;

    public Cats(@JsonProperty ("id") String id,
                @JsonProperty ("text") String text,
                @JsonProperty ("type") String type,
                @JsonProperty ("user") String user,
                @JsonProperty ("upvotes") String upvotes
    ){
        this.id = id;
        this.text = text;
        this.type = type;
        this.user = user;
        this.upvotes = upvotes;
    }

    public String getUpvotes() {
        return upvotes;
    }

    public String toString(){
        return "ID: " + id + "\ntext: " + text + "\ntype: " + type + "\nuser: " + user + "\nupvotes: " + upvotes;
    }
}
