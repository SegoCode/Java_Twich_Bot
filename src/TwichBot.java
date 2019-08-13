import java.io.IOException;
import org.jibble.pircbot.*;

public class TwichBot extends PircBot {

    String oauthCode;
    String channel;

    public TwichBot(String oauthCode, String channel) {
        this.channel=channel;
        connectTwich(oauthCode);
        this.setVerbose(true);
    }

    public void connectTwich(String oauthCode) {
        try {
            this.connect("irc.chat.twitch.tv", 6667, oauthCode);
        } catch (NickAlreadyInUseException e) {
            System.err.println("The bot is already in use");
        } catch (IrcException e) {
            System.err.println("Server Lost");
        } catch (IOException ex) {
            System.err.println("IO ERROR");
        }

    }

    @Override
    protected void onConnect() {
        System.out.println("Connected!");
        joinChannel("#" + channel);
        super.onConnect();
    }

    @Override
    public void onMessage(String channelTag, String Nick, String c, String d, String message) {
        if(message.equals("!ping")){
            sendMessage(channelTag, "pong");
        }
        
    }

}
