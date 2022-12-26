package com.codefarm.codefarmer.domain.mentor;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.ConstructorExpression;
import javax.annotation.processing.Generated;

/**
 * com.codefarm.codefarmer.domain.mentor.QMentorBoardDTO is a Querydsl Projection type for MentorBoardDTO
 */
@Generated("com.querydsl.codegen.DefaultProjectionSerializer")
public class QMentorBoardDTO extends ConstructorExpression<MentorBoardDTO> {

    private static final long serialVersionUID = -1503171747L;

    public QMentorBoardDTO(com.querydsl.core.types.Expression<Long> mentorBoardId, com.querydsl.core.types.Expression<String> mentorCareer, com.querydsl.core.types.Expression<String> mentorExCareer, com.querydsl.core.types.Expression<String> mentorStrongTitle1, com.querydsl.core.types.Expression<String> mentorStrongContent1, com.querydsl.core.types.Expression<String> mentorStrongTitle2, com.querydsl.core.types.Expression<String> mentorStrongContent2, com.querydsl.core.types.Expression<String> mentorStrongTitle3, com.querydsl.core.types.Expression<String> mentorStrongContent3, com.querydsl.core.types.Expression<String> mentorTitle, com.querydsl.core.types.Expression<String> mentorTitleSub, com.querydsl.core.types.Expression<String> mentorTextTitle, com.querydsl.core.types.Expression<String> mentorTextContent, com.querydsl.core.types.Expression<String> mentorCrop) {
        super(MentorBoardDTO.class, new Class<?>[]{long.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class}, mentorBoardId, mentorCareer, mentorExCareer, mentorStrongTitle1, mentorStrongContent1, mentorStrongTitle2, mentorStrongContent2, mentorStrongTitle3, mentorStrongContent3, mentorTitle, mentorTitleSub, mentorTextTitle, mentorTextContent, mentorCrop);
    }

    public QMentorBoardDTO(com.querydsl.core.types.Expression<String> mentorCrop, com.querydsl.core.types.Expression<String> mentorYear, com.querydsl.core.types.Expression<String> memberLocation, com.querydsl.core.types.Expression<String> memberNickName) {
        super(MentorBoardDTO.class, new Class<?>[]{String.class, String.class, String.class, String.class}, mentorCrop, mentorYear, memberLocation, memberNickName);
    }

    public QMentorBoardDTO(com.querydsl.core.types.Expression<Long> mentorBoardId, com.querydsl.core.types.Expression<String> mentorTitle, com.querydsl.core.types.Expression<String> memberNickName) {
        super(MentorBoardDTO.class, new Class<?>[]{long.class, String.class, String.class}, mentorBoardId, mentorTitle, memberNickName);
    }

    public QMentorBoardDTO(com.querydsl.core.types.Expression<Long> mentorBoardId, com.querydsl.core.types.Expression<String> mentorCareer, com.querydsl.core.types.Expression<String> mentorExCareer, com.querydsl.core.types.Expression<String> mentorStrongTitle1, com.querydsl.core.types.Expression<String> mentorStrongContent1, com.querydsl.core.types.Expression<String> mentorStrongTitle2, com.querydsl.core.types.Expression<String> mentorStrongContent2, com.querydsl.core.types.Expression<String> mentorStrongTitle3, com.querydsl.core.types.Expression<String> mentorStrongContent3, com.querydsl.core.types.Expression<String> mentorTitle, com.querydsl.core.types.Expression<String> mentorTitleSub, com.querydsl.core.types.Expression<String> mentorTextTitle, com.querydsl.core.types.Expression<String> mentorTextContent, com.querydsl.core.types.Expression<Long> memberId, com.querydsl.core.types.Expression<Long> mentorId) {
        super(MentorBoardDTO.class, new Class<?>[]{long.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, long.class, long.class}, mentorBoardId, mentorCareer, mentorExCareer, mentorStrongTitle1, mentorStrongContent1, mentorStrongTitle2, mentorStrongContent2, mentorStrongTitle3, mentorStrongContent3, mentorTitle, mentorTitleSub, mentorTextTitle, mentorTextContent, memberId, mentorId);
    }

}

