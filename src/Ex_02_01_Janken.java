class Ex_02_01_Janken {
    public static void main(String[] args){
        //定数
        final String ROCK = "グー" ;     //ジャンケンの手（グー）
        final String SCISSORS = "チョキ" ;   //ジャンケンの手（チョキ）
        final String PAPER = "パー" ;     //ジャンケンの手（パー）

        //シナリオ①
        String player1 = args[0] ; //ジャンケンを行うプレイヤー1の名前
        String player2 = args[1] ; //ジャンケンを行うプレイヤー2の名前

        //シナリオ②
        Ex_02_01_Player p1 = new Ex_02_01_Player( player1 ) ;   //プレイヤー1をインスタンス化
        Ex_02_01_Player p2 = new Ex_02_01_Player( player2 ) ;   //プレイヤー2をインスタンス化

        //シナリオ③
        System.out.println("じゃんけん・・・ぽん!!!!!");

        p1.makeHandStatus();
        p2.makeHandStatus();

        System.out.println(p1.name +"さんの手:" + p1.handStatus);
        System.out.println(p2.name +"さんの手:" + p2.handStatus);

        //シナリオ④
        System.out.println("結果は・・・");

        if((p1.handStatus).equals( p2.handStatus )){
            //あいこの場合
            System.out.println("あいこ！勝負つかず！");

        }else if((p1.handStatus.equals( ROCK ) && p2.handStatus.equals( SCISSORS ))
                || (p1.handStatus.equals( SCISSORS ) && p2.handStatus.equals( PAPER ))
                || (p1.handStatus.equals( PAPER ) && p2.handStatus.equals( ROCK ))  ) {

            //プレイヤー1が勝利した場合
            System.out.println(p1.name + "さんの勝利！");

        } else if ((p2.handStatus.equals( ROCK ) && p1.handStatus.equals( SCISSORS ))
                || (p2.handStatus.equals( SCISSORS ) && p1.handStatus.equals( PAPER ))
                || (p2.handStatus.equals( PAPER ) && p1.handStatus.equals( ROCK ))  ) {
            //プレイヤー2が勝利した場合
            System.out.println(p2.name + "さんの勝利！");
        } else {
            //不正な場合はエラーメッセージを出力
            System.out.println("[ERROR]ジャンケンの判定が不正です。");
        }
    }
}
