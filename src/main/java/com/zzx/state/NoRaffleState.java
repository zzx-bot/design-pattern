package com.zzx.state;

public class NoRaffleState extends State {
    private final RaffleActivity activity;

    public NoRaffleState(RaffleActivity raffleActivity) {
        this.activity = raffleActivity;
    }

    @Override
    public void deduceMoney() {
        System.out.println("扣除 1 张小红鱼, 抽奖开始！");
        activity.setState(activity.getCanRaffleState());
    }

    @Override
    public boolean raffle() {
        System.out.println("还在扣钱呢，抽奖未开始！");
        return false;
    }

    @Override
    public void dispensePrize() {
        System.out.println("想p呢，没抽，颁奖？");
    }
}
