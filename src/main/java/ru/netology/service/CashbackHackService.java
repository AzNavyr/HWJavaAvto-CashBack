package ru.netology.service;

public class CashbackHackService {
    private final int boundary = 1000;

    public int remain(int amount) {
        return boundary - amount % boundary;
    }
}
// Не знаю как ещё запустить Action под новыми настройками кроме как сделать push,  подскажите если что )