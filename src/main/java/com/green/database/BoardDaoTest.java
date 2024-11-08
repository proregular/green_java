package com.green.database;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BoardDaoTest {
    public static void main(String[] args) {
        BoardDAO dao = new BoardDAO();

        selectOne(dao, 4);
        //selectAll(dao);
        /*
        Board board = null;

        if(args.length > 0) {
            board = new Board();
            board.setTitle(args[0]);
            board.setContents(args[1]);
            board.setWriter(args[2]);
        }

        if(args.length == 4) {
            board.setBoardId(Integer.parseInt(args[3]));
            updateDynamic(dao, board);
        } else {
            insert(dao, board);
        }*/
        //insert(dao, board);
        //delete(dao);
    }

    private static void insert(BoardDAO dao , Board board) {
        int result = dao.insBoard(board);

        System.out.println("result: " + result);
    }

    private static void selectAll(BoardDAO dao) {
        List<Board> result = dao.selBoardList();

        for(Board item : result) {
            System.out.println(item);
        }
    }

    private static void selectOne(BoardDAO dao, int boardId) {
        Board result = dao.selBoardOne(boardId);

        System.out.println(result);
    }

    private static void update(BoardDAO dao , Board board) {
        int result = dao.updBoard(board);

        System.out.println("result: " + result);
    }

    private static void updateDynamic(BoardDAO dao , Board board) {
        int result = dao.updBoardDynamic(board);

        System.out.println("result: " + result);
    }

    private static void delete(BoardDAO dao) {
        int result = dao.delBoard(2);

        System.out.println("result: " + result);
    }
}
