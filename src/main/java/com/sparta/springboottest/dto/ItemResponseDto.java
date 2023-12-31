package com.sparta.springboottest.dto;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class ItemResponseDto {
    private final List<BoardResponseDto> Boards = new ArrayList<>();

    public void setBoard(BoardResponseDto board) {
        Boards.add(board);
    }
}