package ru.netology.service;

public class CashbackHackService {
    private final int boundary = 1000;

    public int remain(int amount) {
        return boundary - amount % boundary;
    }
}
//Именно так я и запустил action после того как перенастрои воркфлоу, а как иначе то, подскажите!!!