package com.zzx.state;

public class CanRaffleState extends State {
    private final RaffleActivity activity;

    public CanRaffleState(RaffleActivity raffleActivity) {
        this.activity = raffleActivity;
    }

    @Override
    public void deduceMoney() {
        System.out.println("抽奖中ing~ 不扣钱哦");
    }

    @Override
    public boolean raffle() {
        System.out.println("抽奖中ing~");
        double random = Math.random() * 10;
        if (random > 5) {
            System.out.println("抽中奖了！ 恭喜恭喜！");
            // 改变活动状态为发放奖品 context
            activity.setState(activity.getDispenseState());
            return true;
        } else {
            System.out.println("很遗憾没有中哦！ 再接再厉");
            activity.setState(activity.getNoRafflleState());
            return false;
        }
    }

    @Override
    public void dispensePrize() {
        System.out.println("抽奖中ing~ 不颁奖哦");
    }
}
