package com.zzx.state;

public class DispenseOutState extends State {

    RaffleActivity activity;

    public DispenseOutState(RaffleActivity raffleActivity) {
        this.activity = raffleActivity;
    }

    @Override
    public void deduceMoney() {
        System.out.println("不扣钱，奖颁完了，明天再来！");
    }

    @Override
    public boolean raffle() {
        System.out.println("不颁奖，奖颁完了，明天再来！");
        return false;
    }

    @Override
    public void dispensePrize() {
        System.out.println("奖颁完了，明天再来！");
    }
}
