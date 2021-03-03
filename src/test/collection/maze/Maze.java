package test.collection.maze;

import test.LogUtils;

import java.util.*;

/**
 * 迷宫问题
 * <p>
 * 使用栈进行深度优先，使用队列进行广度优先,寻找路径
 * <p>
 * 广度可以找到最小路径。
 */
public class Maze {
    /**
     * 1.坐标系
     * 10 * 10 的方格
     * <p>
     * [1,1]为起点
     * [8,8]为终点
     * <p>
     * 上移为 x-1，y
     * 下移为 x+1，y
     * 左移为 x，y-1
     * 右移为 x，y+1
     * <p>
     * 当前点map[x][y] == 1时为碰壁，则不能移动
     * <p>
     * 辅助集合记录当前走过的点，如果路线回溯，弹栈的点要从辅助集合中拿出，记录为未走过
     * <p>
     * 可以移动则进栈记录路线，如果遇到不能移动，则出栈，判断栈顶点周围是否还有路线可移动。
     */


    public static void main(String[] args) {
        int[][] map = {                           //迷宫地图,1代表墙壁，0代表通路
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                {1, 0, 0, 1, 0, 0, 0, 1, 0, 1},
                {1, 0, 0, 1, 0, 0, 0, 1, 0, 1},
                {1, 0, 1, 0, 0, 1, 1, 0, 0, 1},
                {1, 0, 1, 1, 1, 0, 0, 0, 0, 1},
                {1, 0, 0, 0, 1, 0, 0, 0, 0, 1},
                {1, 0, 1, 0, 0, 0, 1, 0, 0, 1},
                {1, 0, 1, 1, 1, 0, 1, 1, 0, 1},
                {1, 1, 0, 0, 0, 0, 0, 0, 0, 1},
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1}
        };
        MoveStrategy.init(map);
        MoveStrategy.singleTon().move(new Point(1, 1), new Point(4, 1));
    }

    static class Point {
        int x;
        int y;
        boolean isPassed;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Point point = (Point) o;
            return x == point.x &&
                    y == point.y;
        }

        @Override
        public int hashCode() {
            return Objects.hash(x, y);
        }

        public void setPassed(boolean passed) {
            isPassed = passed;
        }

        public boolean isPassed() {
            return isPassed;
        }

        @Override
        public String toString() {
            return "Point{" +
                    "x=" + x +
                    ", y=" + y +
                    ", isPassed=" + isPassed +
                    '}';
        }
    }

    static class MoveStrategy {

        public boolean allowMove(Point p, int[][] map) {
            return p.getX() < xLimit && p.getY() > 0 && p.getX() > 0
                    && p.getY() < yLimit && map[p.getX()][p.getY()] != 1 && !p.isPassed;
        }

        static Stack<Point> stack;
        private static int[][] map;
        static int xLimit;
        static int yLimit;
        private static List<Point> points;

        public static void init(int[][] map1) {
            map = map1;
            stack = new Stack<>();
            xLimit = map1.length - 1;
            yLimit = map1[0].length - 1;
            initPoints();
        }

        private static void initPoints() {
            points = new ArrayList<>();
            for (int i = 0; i < map.length; i++) {
                int[] map1 = map[i];
                for (int j = 0; j < map1.length; j++) {
                    points.add(new Point(i, j));
                }
            }
        }


        public static MoveStrategy singleTon() {
            return Single.ins;
        }

        private static class Single {
            static final MoveStrategy ins = new MoveStrategy();
        }

        public Point moveLeft(Point src) {
            final Point point = findPoint(new Point(src.getX(), src.getY() - 1));
            if (allowMove(point, map)) {
                return point;
            }
            return null;
        }


        public Point moveRight(Point src) {
            final Point point = findPoint(new Point(src.getX(), src.getY() + 1));
            if (allowMove(point, map)) {
                return point;
            }
            return null;
        }

        public Point moveTop(Point src) {
            final Point point = findPoint(new Point(src.getX() - 1, src.getY()));
            if (allowMove(point, map)) {
                return point;
            }
            return null;
        }


        public static Point findPoint(Point src) {
            for (Point p : points) {
                if (p.equals(src)) {
                    return p;
                }
            }
            throw new RuntimeException("字典不可能没有");
        }

        public Point moveBot(Point src) {
            final Point point = findPoint(new Point(src.getX() + 1, src.getY()));
            if (allowMove(point, map)) {
                return point;
            }
            return null;
        }


        public List<Point> findNextPoints(Point src) {
            List<Point> c = new ArrayList<>(4);
            c.add(moveTop(src));
            c.add(moveBot(src));
            c.add(moveLeft(src));
            c.add(moveRight(src));
            for (int i = 0; i < c.size(); i++) {
                if (null == (c.get(i))) {
                    c.remove(i);
                    --i;//删除了元素，迭代的下标也跟着改变
                }
            }
            return c;
        }

        public void move(Point src, Point target) {
            Point curNode = findPoint(src);
            stack.push(curNode);
            curNode.setPassed(true);
            while (true) {
                if (src.equals(target)) {
                    LogUtils.log("到达终点了");
                }
                final List<Point> nextPoints = findNextPoints(curNode);
                if (nextPoints.isEmpty()) {
                    if (stack.isEmpty()) { //栈也空了，说明没有路径
                        LogUtils.log("没有路径");
                        break;
                    } else {
                        stack.pop();
                        if(stack.isEmpty()){
                            LogUtils.log("111没有路径");
                            break;
                        }
                        curNode = stack.peek();
                    }
                } else {
                    final Point point = nextPoints.get(0);
                    stack.push(point);
                    curNode = point;
                    curNode.setPassed(true);
                    LogUtils.log(point);
                }
            }
        }
    }
}
