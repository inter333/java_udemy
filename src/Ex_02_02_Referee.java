public class Ex_02_02_Referee {
    //定数
    private final String ROCK = "グー" ;     //ジャンケンの手（グー）
    private final String SCISSORS = "チョキ" ;   //ジャンケンの手（チョキ）
    private final String PAPER = "パー" ;     //ジャンケンの手（パー）

    //フィールド
    private String name       ;   //名前


    //コンストラクタ
    public Ex_02_02_Referee(String nm){
        this.name = nm;   //名前
    }

    public void messageReferee(String msg){
        System.out.println(this.name + "「" + msg + "」");
    }

    public void startJanken(){
        messageReferee("じゃんけん・・・ぽん！！！！！");
    }

    public void checkHand(String nm, String hs){
        if ((hs).equals(ROCK)){
            messageReferee(nm + "さんの手はグーでした！");
        } else if ((hs).equals(SCISSORS)) {
            messageReferee(nm + "さんの手はチョキでした！");
        } else if ((hs).equals(PAPER)) {
            messageReferee(nm + "さんの手はパーでした！");
        }
        else {
            System.out.println("じゃんけんの判定が無効です");
        }
    }

    public void judgeJanken(EX_02_02_Player p1,EX_02_02_Player p2){
        messageReferee("結果は・・・");

        if( (p1.getHandStatus()).equals( p2.getHandStatus() ) ){

            //あいこの場合
            System.out.println("あいこ！勝負つかず！");

        }else if(     (p1.getHandStatus().equals( ROCK ) && p2.getHandStatus().equals( SCISSORS ))
                || (p1.getHandStatus().equals( SCISSORS ) && p2.getHandStatus().equals( PAPER ))
                || (p1.getHandStatus().equals( PAPER ) && p2.getHandStatus().equals( ROCK ))  ) {

            //プレイヤー1が勝利した場合
            System.out.println(p1.getName() + "さんの勝利！");

        }else if(     (p2.getHandStatus().equals( ROCK ) && p1.getHandStatus().equals( SCISSORS ))
                || (p2.getHandStatus().equals( SCISSORS ) && p1.getHandStatus().equals( PAPER ))
                || (p2.getHandStatus().equals( PAPER ) && p1.getHandStatus().equals( ROCK ))  ) {

            //プレイヤー2が勝利した場合
            System.out.println(p2.getName() + "さんの勝利！");

        }else{

            //不正な場合はエラーメッセージを出力
            System.out.println("[ERROR]ジャンケンの判定が不正です。");

        }


    }

    public String getName(){
        return this.name;
    }
}

