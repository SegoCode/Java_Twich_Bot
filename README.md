<img src="https://i.imgur.com/EpgxEjJ.png" height="50px"> Java Twich Bot Template
====================
`Java Twich Bot Template`  is an example to create a Twitch Bot in Java

 Based on IRC (TwitchChat) using  [pircbot](http://www.jibble.org/pircbot.php)

## Quick Start

Download and import [pircbot.jar](http://www.jibble.org/pircbot.php) on your proyect

*Download not available? Try [this](https://github.com/SegoCode/Java_Twich_Bot/tree/master/pircbot)* 

Create an account api key [Here](https://twitchapps.com/tmi/)

## Usage
Create instance

```Java
public class Main {
    public static void main(String[] args) throws Exception {
         TwichBot bot = new TwichBot("oauth: Here your api key", "Channel name")
    }
    
}

```


Create responses with conditionals
```java
    @Override
    public void onMessage(String channelTag, String Nick, String c, String d, String message) {
        if(message.equals("!ping")){
            sendMessage(channelTag, "pong");
        }
        
    }
```
Viewer type `!Ping` on chat

Bot answers `Pong`

