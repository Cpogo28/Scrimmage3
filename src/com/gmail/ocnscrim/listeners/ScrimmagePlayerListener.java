package com.gmail.ocnscrim.listeners;

import com.gmail.ocnscrim.ScrimmagePlugin;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.event.player.PlayerQuitEvent;

class ScrimmagePlayerListener implements Listener {

  private ScrimmagePlugin plugin;
  
  public ScrimmagePlayerListener(ScrimmagePlugin plugin){
    this.plugin = plugin;
  }
  
  @EventHandler
  public void onPlayerMove(PlayerMoveEvent event){
		
  }
	
  @EventHandler
  public void onPlayerJoin(PlayerJoinEvent event){
				
  }
	
  @EventHandler
  public void onPlayerQuit(PlayerQuitEvent event){
		
  }
 
}