/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package socialmedia;

/**
 *
 * @author Julian
 */
public class YouTubeAdapter implements SocialMediaEntry{
    YouTubeVideo youTubeVideo;
    
    public YouTubeAdapter() {
        this.youTubeVideo = new YouTubeVideo();
    }
    
    public YouTubeAdapter(YouTubeVideo youTubeVideo){
        this.youTubeVideo = youTubeVideo;
    }
    
    public String getUser(){
        return youTubeVideo.getAuthor();
    }
    
    public String getPostText(){
        String postText = youTubeVideo.getTitle() 
                        + " " 
                        + youTubeVideo.getDescription();
        return postText;
    }
    
    public YouTubeAdapter(String author, String title, String description) {
        this.youTubeVideo = new YouTubeVideo(author, title, description);
    }
    
    public void setAuthor(String author) {
        youTubeVideo.setAuthor(author);
    }
    
    public void setTitle(String title) {
        youTubeVideo.setTitle(title);
    }
    
    public void setDescription(String description) {
        youTubeVideo.setDescription(description);
    }
}
