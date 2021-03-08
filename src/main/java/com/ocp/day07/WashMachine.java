package com.ocp.day07;

public class WashMachine {

    private boolean isOpen;//false
    private boolean havawater;//false
    private int mode;//預設0

    //建構子
    public WashMachine(int mode) {
        this.mode = mode;
    }

    //開門
    public void open() {
        System.out.println("開門");
        isOpen = true;
    }

    //放衣服
    public void putClothes() {
        if (isOpen) {
            System.out.println("放衣服");
        } else {
            System.out.println("請先開門");
        }

    }

    //關門
    public void close() {
        System.out.println("關門");
        isOpen = false;
    }

    //放水
    public void water() {
        if (!isOpen) {
            System.out.println("注水");
            havawater = true;
        } else {
            System.out.println("門沒關");
        }
    }

    //洗衣
    public void play() {
        //確認是否注水
        if (!havawater) {
            System.out.println("請先注水");
            return;
        }
        //確認洗衣模式
        switch (mode) {
            case 1:
                System.out.println("柔洗");
                break;
            case 2:
                System.out.println("強洗");
                break;
            case 3:
                System.out.println("靜置");
                break;
            default:
                System.out.println("請選擇模式/模式錯誤");
                return;
        }
        System.out.println("開始洗衣服");
        System.out.println("衣服洗完了");
    }
}
