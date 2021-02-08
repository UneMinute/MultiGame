package com.example.multi_game.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;


import com.example.multi_game.model.Player;

import java.util.List;
@Dao
public interface PlayerDao {
    @Query("SELECT * FROM Player")
    List<Player> getAllPlayers();
    @Query("SELECT * FROM Player WHERE name = :name")
    Player getPlayer(String name);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(Player player);
    @Delete
    void delete(Player player);
}
