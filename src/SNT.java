public class SNT {
    int soKT;
    boolean KetQua;
    void kiemTra(){
        KetQua = true;
        for (int  i = 0;i< soKT/2;i++){
            if(soKT%2== 0){
                KetQua =false;
            }
        }
    }

    public static void main(String[] args) {
        SNT soNT= new SNT();
        soNT.soKT = 5;
        soNT.kiemTra();
        System.out.println(soNT.KetQua);
    }
}
