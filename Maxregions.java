public class Maxregions{
    static int maxRegions(int lines){
        return (lines * (lines + 1)) / 2 + 1;

    }

    static int maxPieces(int cuts){
        return (cuts * (cuts + 1)) / 2 + 1;

    }

    public static void main(String[] args) {
        int lines = 5;
        int cuts = 4;

        System.out.println("Maximum regions formed by " + lines + " lines: " + maxRegions(lines));
        System.out.println("Maximum pieces formed by " + cuts + " cuts: " + maxPieces(cuts));
    }
}