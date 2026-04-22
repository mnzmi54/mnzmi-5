package com.music.model;

public class MusicItem implements java.io.Serializable{
    private String title;
    private String artistName;
    private String year;
    private String genre;
    
    public MusicItem(){
    }
    
    public MusicItem(String title, String artistName, String year, String genre){
        this.title=title;
        this.artistName=artistName;
        this.year=year;
        this.genre=genre;
    }
    
    public String getTitle(){
        return title;
    }
    public String getName(){
        return artistName;
    }
    public String getYear(){
        return year;
    }
    
    public String getGenre(){
        return genre;
    }
}
