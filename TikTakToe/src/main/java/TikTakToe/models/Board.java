package TikTakToe.models;

public class Board {
    private Cell[][] cells;

    public Cell[][] getCells() {
        return cells;
    }

    public void setCells(Cell[][] cells) {
        this.cells = cells;
    }

    public Board(int dimensions){
        cells = new Cell[dimensions][dimensions];
        for(int i = 0; i < dimensions; i++){
            for(int j = 0; j < dimensions; j++){
                cells[i][j] = new Cell(i, j);
            }
        }
    }

    public void display(){
        for(int i = 0; i < cells.length; i++) {
            for (int j = 0; j < cells.length; j++) {
                Cell currCell = cells[i][j];
                if(currCell.getPlayer() == null){
                    System.out.print("|" + "\t" + "|");
                } else {
                    System.out.print("|" + currCell.getPlayer().getSymbol() + "\t" + "|");
                }
            }
            System.out.println();
        }
    }
}
