class Ex_02_01_Player {

    //定数
    final String ROCK = "グー" ;     //ジャンケンの手（グー）
    final String SCISSORS = "チョキ" ;   //ジャンケンの手（チョキ）
    final String PAPER = "パー" ;     //ジャンケンの手（パー）

    //フィールド

    String name ; // プレイヤー名

    String handStatus ; // じゃんけんの手

    Ex_02_01_Player(String nm){
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


}