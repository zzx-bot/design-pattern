package com.zzx.state;

public class Client {
    public static void main(String[] args) {
        RaffleActivity activity = new RaffleActivity(3);
        // 我们连续抽 300 次奖
        for (int i = 0; i < 30; i++) {
            System.out.println("--------第" + (i + 1) + "次抽奖----------");
            // 参加抽奖，第一步点击扣除积分
            activity.deduceMoney();
            // 第二步抽奖
            activity.raffle();
        }
    }
}
