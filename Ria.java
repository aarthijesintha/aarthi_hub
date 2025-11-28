
    class User {
    String username;
    String email;
    int followers;

    void postPhoto(String photoDescription) {
        System.out.println(username + " posted a photo: " + photoDescription);
    }

    void likePost(String post) {
        System.out.println(username + " liked the post: " + post);
    }

    void follow(User otherUser) {
        System.out.println(username + " followed " + otherUser.username);
    }
}

public class Ria {
    public static void main(String[] args) {

        User ria = new User();   // Create object

        ria.username = "Ria";
        ria.email = "ria88@gmail.com";
        ria.followers = 300;

        // Methods
        ria.postPhoto("Ria at the coffeeshop!");
        ria.likePost("Akshay is on mountain trip!");
    }
}


