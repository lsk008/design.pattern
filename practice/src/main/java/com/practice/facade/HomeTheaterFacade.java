package com.practice.facade;

import lombok.AllArgsConstructor;


public class HomeTheaterFacade {
    private DVDPlayer dvdPlayer;
    private Popcorn popcorn;
    private Projector projector;

    public HomeTheaterFacade(){
        this.dvdPlayer=DVDPlayer.getInstance();
        this.popcorn=Popcorn.getInstance();
        this.projector=Projector.getInstance();
    }


    public static void main(String[] args) {

    }
}
