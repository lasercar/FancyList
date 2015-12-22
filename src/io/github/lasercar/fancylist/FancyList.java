package io.github.lasercar.fancylist;

import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class FancyList extends JavaPlugin implements Listener {

    public void onEnable() {
        saveDefaultConfig();
        getServer().getPluginManager().registerEvents(this, this);
    }


    //todo move list creation and dependant functions into own file?

    private String getGroupTitle(String group) {
        //todo fetch group title from PEX (prefix || group)
        String title = group;

        return title;
    }

    private String[] getGroupPlayers(String group) {
        //todo fetch players from PEX here
        String[] players = {"Notch", "jeb_"};

        //todo change players[] into players[ player{ username: "Notch", nickname: "fedora" }, ...]
        return players;
    }

    private String makeFancyList(String[] groups) {
        String message = "";

        for (String group : groups) {
            String groupTitle = getGroupTitle(group);
            String[] players = getGroupPlayers(group);

            //todo first newline might be a problem?
            message = message + "\n" + groupTitle + ":";
            //todo change String player into object instead?
            for (String player : players) {
                //todo use better string interpolation syntax?
                //message = message + "\n" + player.username + " - " + player.nickname;
                //todo fancy table spacing? nah
            }
        }

        //todo colorize message in loop; get color from config files
        return message;
    }


    //todo command handler for /fancylist
    private void handler(String[] args) { //todo change this to actual setup
        String[] groups = args[0].split(",");
        String message = makeFancyList(groups);
        //player.sendMessage(message);
    }

    //todo @EventListener
}
