public class Map {

    static int mapa1 [][] = new int[11][11];

    static int mapa2 [][] = new int [11][11];

    public static void initMap(){
        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 10; j++){
                mapa1[i][j] = 0;
                mapa2[i][j] = 0;
            }
        }
    }

    public static void printMap(int mapSizeX, int mapSizeY){
        int j;
        int k = 0;
        for(int i = 0; i < mapSizeY; i++){
            for(j = 0; j < mapSizeX; j++){
                System.out.print(Map.mapa1[i][j] + " ");
            }
            System.out.println(Map.mapa1[i][j]);
        }
        while(k <= mapSizeY){
            k++;
            System.out.print("-");
        }
        System.out.println("");
    }

}
