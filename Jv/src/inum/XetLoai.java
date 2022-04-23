package inum;

public enum XetLoai {
    Gioi ("Giỏi") ,
    Kha ("Khá") ,
    TrungBinh ("Trung Bình");
    String msg;

    private XetLoai(String msg){
        this.msg = msg;
    }

    public String getDescription() {
        return msg;
    }
}
