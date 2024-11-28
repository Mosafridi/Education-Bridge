/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package christmasgifttracker;

/**
 *
 * @author azizi
 */
public class Gift {
    private String recipientName;
    private String giftIdea;
    private String url;

    public Gift(String recipientName, String giftIdea, String url) {
        this.recipientName = recipientName;
        this.giftIdea = giftIdea;
        this.url = url;
    }

    public String getRecipientName() {
        return recipientName;
    }

    public void setRecipientName(String recipientName) {
        this.recipientName = recipientName;
    }

    public String getGiftIdea() {
        return giftIdea;
    }

    public void setGiftIdea(String giftIdea) {
        this.giftIdea = giftIdea;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
    

    @Override
    public String toString() {
        return "Recipient: " + recipientName + ", Gift: " + giftIdea + ", URL: " + url;
    }
}

