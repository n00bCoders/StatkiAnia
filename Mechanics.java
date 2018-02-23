import java.security.Signature;
import java.util.Scanner;

public class Mechanics {

    static Scanner scaner = new Scanner(System.in);



    public static void checkIfThereIsShip(){
        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 10; j++){
                Map.mapa1[i][j] = 0;
                Map.mapa2[i][j] = 0;
            }
        }
    }

    public static boolean checkIfEmpty(int x, int y){
        if (Map.mapa1[x][y] != 0){
            return false;
        }
        else{
            return true;
        }
    }

    public static void test(){
        int random = Random.RInt(8, 15);
        if (random > Map.mapa1.length){
            System.out.println("większe, random: " + random + " > " + Map.mapa1.length);
        }
        else{
            System.out.println("w zakresie");
        }
    }

    public static void checkIfThereIsPlaceForShip(int x, int y, int length) {
        boolean inBoundsX = (x >= 0) && (x < Map.mapa1.length);
        System.out.println("x: " + x);
        boolean inBoundsY = (y >= 0) && (y < Map.mapa1.length);
        System.out.println("y: " + y);  
        if (length == 5) {
            if ((Map.mapa1[x][y] == 0 && inBoundsX) && (Map.mapa1[x + 1][y] == 0 && inBoundsX) && (Map.mapa1[x + 2][y] == 0 && inBoundsX) && (Map.mapa1[x + 3][y] == 0 && inBoundsX) && (Map.mapa1[x + 4][y] == 0 && inBoundsX)) {
                Map.mapa1[x][y] = 5;
                Map.mapa1[x + 1][y] = 5;
                Map.mapa1[x + 2][y] = 5;
                Map.mapa1[x + 3][y] = 5;
                Map.mapa1[x + 4][y] = 5;
            } else if ((Map.mapa1[x][y] == 0 && inBoundsY) && (Map.mapa1[x][y + 1] == 0 && inBoundsY) && (Map.mapa1[x][y + 2] == 0 && inBoundsY) && (Map.mapa1[x][y + 3] == 0 && inBoundsY) && (Map.mapa1[x][y + 4] == 0 && inBoundsY)) {
                Map.mapa1[x][y] = 5;
                Map.mapa1[x][y + 1] = 5;
                Map.mapa1[x][y + 2] = 5;
                Map.mapa1[x][y + 3] = 5;
                Map.mapa1[x][y + 4] = 5;
            }
        }
        if (length == 4) {
            if (Map.mapa1[x][y] == 0 && Map.mapa1[x + 1][y] == 0 && Map.mapa1[x + 2][y] == 0 && Map.mapa1[x + 3][y] == 0) {
                Map.mapa1[x][y] = 4;
                Map.mapa1[x + 1][y] = 4;
                Map.mapa1[x + 2][y] = 4;
                Map.mapa1[x + 3][y] = 4;
            } else if (Map.mapa1[x][y] == 0 && Map.mapa1[x][y + 1] == 0 && Map.mapa1[x][y + 2] == 0 && Map.mapa1[x][y + 3] == 0) {
                Map.mapa1[x][y] = 4;
                Map.mapa1[x][y + 1] = 4;
                Map.mapa1[x][y + 2] = 4;
                Map.mapa1[x][y + 3] = 4;
            }
        }
        if (length == 3) {
            if (Map.mapa1[x][y] == 0 && Map.mapa1[x + 1][y] == 0 && Map.mapa1[x + 2][y] == 0) {
                Map.mapa1[x][y] = 3;
                Map.mapa1[x + 1][y] = 3;
                Map.mapa1[x + 2][y] = 3;
            } else if (Map.mapa1[x][y] == 0 && Map.mapa1[x][y + 1] == 0 && Map.mapa1[x][y + 2] == 0) {
                Map.mapa1[x][y] = 3;
                Map.mapa1[x][y + 1] = 3;
                Map.mapa1[x][y + 2] = 3;
            }
        }
        if (length == 2) {
            if (Map.mapa1[x][y] == 0 && Map.mapa1[x + 1][y] == 0) {
                Map.mapa1[x][y] = 2;
                Map.mapa1[x + 1][y] = 2;
            } else if (Map.mapa1[x][y] == 0 && Map.mapa1[x][y + 1] == 0) {
                Map.mapa1[x][y] = 2;
                Map.mapa1[x][y + 1] = 2;
            }
        }
        if (length == 1) {
            if (Map.mapa1[x][y] == 0) {
                Map.mapa1[x][y] = 1;
            } else if (Map.mapa1[x][y] == 0) {
                Map.mapa1[x][y] = 1;
            }
        }
    }

    public static void checkIfChecked(){

    }

    public static void placingShips(){
        while(Ships.quantityShip5 > 0){
            checkIfThereIsPlaceForShip(Random.RInt(1,9), Random.RInt(1,9), Ships.lengthShip5);
            Ships.quantityShip5 -= 1;
            System.out.println("Nie ma błędu - 5");
        }
        while(Ships.quantityShip4 > 0){
            checkIfThereIsPlaceForShip(Random.RInt(1,9), Random.RInt(1,9), Ships.lengthShip4);
            Ships.quantityShip4 -= 1;
            System.out.println("Nie ma błędu - 4");

        }
        while(Ships.quantityShip3 > 0){
            checkIfThereIsPlaceForShip(Random.RInt(1,9), Random.RInt(1,9), Ships.lengthShip3);
            Ships.quantityShip3 -= 1;
            System.out.println("Nie ma błędu - 3");

        }
        while(Ships.quantityShip2 > 0){
            checkIfThereIsPlaceForShip(Random.RInt(1,9), Random.RInt(1,9), Ships.lengthShip2);
            Ships.quantityShip2 -= 1;
            System.out.println("Nie ma błędu - 2");

        }
        while(Ships.quantityShip1 > 0){
            checkIfThereIsPlaceForShip(Random.RInt(1,9), Random.RInt(1,9), Ships.lengthShip1);
            Ships.quantityShip1 -= 1;
            System.out.println("Nie ma błędu - 1");

        }
    }

    public static int podajX(){

        int x = scaner.nextInt();

        return x;
    }

    public static int podajY(){
        int y = scaner.nextInt();

        return y;
    }

}
