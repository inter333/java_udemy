public class EX_02_02_Janken {
    public static void main(String[] args) {

        //シナリオ①
        String player1 = args[0]; //ジャンケンを行うプレイヤー1の名前
        String player2 = args[1]; //ジャンケンを行うプレイヤー2の名前
        String refree = args[2]; //審判の名前

        //シナリオ②
        EX_02_02_Player p1 = new EX_02_02_Player(player1);   //プレイヤー1をインスタンス化
        EX_02_02_Player p2 = new EX_02_02_Player(player2);   //プレイヤー2をインスタンス化
        Ex_02_02_Referee rf = new Ex_02_02_Referee(refree);

        //シナリオ③
        rf.startJanken();

        p1.makeHandStatus();
        p2.makeHandStatus();

        rf.checkHand(p1.getName(),p1.getHandStatus());
        rf.checkHand(p2.getName(),p2.getHandStatus());


        //シナリオ④
        rf.judgeJanken(p1,p2);
    }
}
