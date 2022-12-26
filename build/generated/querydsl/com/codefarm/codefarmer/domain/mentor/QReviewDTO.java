package com.codefarm.codefarmer.domain.mentor;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.ConstructorExpression;
import javax.annotation.processing.Generated;

/**
 * com.codefarm.codefarmer.domain.mentor.QReviewDTO is a Querydsl Projection type for ReviewDTO
 */
@Generated("com.querydsl.codegen.DefaultProjectionSerializer")
public class QReviewDTO extends ConstructorExpression<ReviewDTO> {

    private static final long serialVersionUID = 666154532L;

    public QReviewDTO(com.querydsl.core.types.Expression<Long> reviewId, com.querydsl.core.types.Expression<Long> memberId, com.querydsl.core.types.Expression<Long> mentorBoardId, com.querydsl.core.types.Expression<String> memberNickName, com.querydsl.core.types.Expression<String> reviewContent, com.querydsl.core.types.Expression<Integer> reviewStar, com.querydsl.core.types.Expression<java.time.LocalDateTime> createdDate, com.querydsl.core.types.Expression<java.time.LocalDateTime> updateDate) {
        super(ReviewDTO.class, new Class<?>[]{long.class, long.class, long.class, String.class, String.class, int.class, java.time.LocalDateTime.class, java.time.LocalDateTime.class}, reviewId, memberId, mentorBoardId, memberNickName, reviewContent, reviewStar, createdDate, updateDate);
    }

}

