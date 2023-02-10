// pokemon game v0.5
        // getter setter -> property -> decorator
//class field

import java.util.Scanner;

class Pokemon{
    protected static int count = 0;
    protected String owner, name;
    protected String[] skills;

    public Pokemon(String owner, String skills) {

        this.owner = owner;  //like private self.skills =skills.split('/')
        this.skills = skills.split("/");
        System.out.print("포켓몬 생성 : ");
        Pokemon.count = Pokemon.count + 1;

    }

    public void info() {

        System.out.printf("%s의 포켓몬이 사용 가능한 스킬", this.owner);
        for (int i = 0; i < skills.length; i++) {
            System.out.printf(" %d : %s ", i + 1, this.skills[i]);
        }
    }

    public void attack(int idx) {
        System.out.printf("%s 공격 시전!", this.skills[idx]);
    }
}

class Pikachu extends Pokemon {
    public Pikachu(String owner, String skills){
        super(owner,skills);
        this.name ="피카츄";
        System.out.printf("%s\n",this.name);
    }

    public void attack(int idx){
        System.out.printf("[삐까삐까] %s의 %s가 %s 공격 시전!\n",this.owner,this.name,this.skills[idx]);
    }

}

class Ggoboogi extends Pokemon {
    public Ggoboogi(String owner,String skills){
        super(owner,skills);
        this.name ="꼬부기";
        System.out.printf("%s\n",this.name);
    }
    public void attack(int idx){
        System.out.printf("[꼬북꼬북] %s의 %s가 %s 공격 시전!\n",this.owner,this.name,this.skills[idx]);
    }

    public void swim(){
        System.out.printf("%s가 수영을 합니다",this.name);
    }

}
class Pairi extends Pokemon{
    public Pairi(String owner, String skills){
        super(owner,skills);
        this.name="파이리";
        System.out.printf("%s\n",this.name);
    }
    public void attack(int idx){
        System.out.printf("[파읠파읠] %s의 %s가 %s 공격 시전!\n",this.owner,this.name,this.skills[idx]);
    }

}

public class Main {
    static int menu;
    static String n,s;
    static int pokemon;
    public static void main(String[] args) {

        while (true){


            System.out.printf("총 %s 마리의 포켓몬이 생성되었습니다\n",Pokemon.count);
            Scanner sc = new Scanner(System.in);
            System.out.print("1) 포켓몬 생성  2) 프로그램 종료 : ");
            menu = sc.nextInt();

            if (menu == 2){
                System.out.print("프로그램을 종료합니다");
                break;
            }

            else if (menu == 1) {
                System.out.print("1) 피카츄  2) 꼬부기  3) 파이리 : ");
                pokemon = sc.nextInt();
                System.out.print("플레이어 이름 입력 : ");
                n = sc.next();
                System.out.print("사용 가능한 기술 입력(/로 구분하여 입력) : ");
                s = sc.next();
            }
            if (pokemon == 1){
                Pikachu p =new Pikachu(n, s);
                p.info();
                System.out.println();
                System.out.print("공격 번호 선택 : ");
                int a=sc.nextInt();

                p.attack(a-1);
            }
            else if (pokemon ==2){
                Ggoboogi p = new Ggoboogi(n,s);
                p.info();
                System.out.println();
                System.out.print("공격 번호 선택 : ");
                int a=sc.nextInt();
                p.attack(a-1);
            }
            else if (pokemon==3){
                Pairi p = new Pairi(n,s);
                p.info();
                System.out.println();
                System.out.print("공격 번호 선택 : ");
                int a=sc.nextInt();
                p.attack(a-1);
            }
            else{
                System.out.println("메뉴에서 골라주세요.");
            }


            }
        }
    }
