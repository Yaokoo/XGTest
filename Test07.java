package sf;

/**
 * @author yaokoo
 * @create 2022/7/5 11:36
 */
public class Test07 {
    public static void main(String[] args) {
        //老鼠迷宫
        int[][] arr = {
                {1,1,1,1,1,1,1,1},
                {1,0,0,0,0,0,0,1},
                {1,1,0,0,0,0,0,1},
                {1,0,1,0,0,0,0,1},
                {1,0,0,0,1,0,0,1},
                {1,0,1,1,0,0,1,1},
                {1,1,0,0,0,0,0,1},
                {1,1,1,1,1,1,1,1},
        };
        Test07 test07=new Test07();
        test07.mouseMaze(arr,1,1);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public boolean mouseMaze(int[][] map,int i,int j) {
        if(map[6][6] == 2) { //到出口
            return true;
        }else {
            if(map[i][j] == 0) {
                map[i][j] = 2;//假设是可以走的
                if(mouseMaze(map,i + 1, j)) {//向下走
                    return true;
                } else if(mouseMaze(map,i,j + 1)) {//向右走
                    return true;
                } else if(mouseMaze(map,i - 1,j)) {//向上走
                    return true;
                } else if(mouseMaze(map,i,j - 1)) {//向左走
                    return true;
                } else {
                    map[i][j] = 3;
                    return false;
                }
            }else{
                return false;
            }
        }
    }

}
