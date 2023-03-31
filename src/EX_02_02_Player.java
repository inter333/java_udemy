public class EX_02_02_Player {
    //定数
    private final String ROCK = "グー" ;     //ジャンケンの手（グー）
    private final String SCISSORS = "チョキ" ;   //ジャンケンの手（チョキ）
    private final String PAPER = "パー" ;     //ジャンケンの手（パー）

    //フィールド

    private String name ; // プレイヤー名

    private String handStatus ; // じゃんけんの手

    public EX_02_02_Player(String nm){
        this.name       = nm ;                   //名前
    }

    void makeHandStatus(){

        int random1to3 = 1 + (int)( Math.random() * 3.0 );    //1～3のランダムな値を取得

        switch(random1to3){
            case 1:
                this.handStatus = ROCK ;
                break;

            case 2:
                this.handStatus = SCISSORS ;
                break;

            case 3:
                this.handStatus = PAPER ;
                break;
        }
    }

    public String getName(){
        return this.name;
    }

    public String getHandStatus(){
        return this.handStatus;
    }
}
