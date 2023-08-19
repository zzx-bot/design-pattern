package com.zzx.state;

public class DispenseState extends State {
    private final RaffleActivity activity;

    public DispenseState(RaffleActivity raffleActivity) {
        this.activity = raffleActivity;
    }

    @Override
    public void deduceMoney() {
        System.out.println("不扣钱了！ 颁奖呢");
    }

    @Override
    public boolean raffle() {
        System.out.println("今天抽奖，只颁奖！");
        return false;
    }

    @Override
    public void dispensePrize() {

        if (activity.getCount() > 0) {
            System.out.println("给您颁奖了！");
            activity.setCount(activity.getCount());
            activity.setState(activity.getNoRafflleState());
        } else {
            System.out.println("奖品没了 啊呜，明天来我给你！");
            activity.setState(activity.getDispensOutState());
        }
    }
}
