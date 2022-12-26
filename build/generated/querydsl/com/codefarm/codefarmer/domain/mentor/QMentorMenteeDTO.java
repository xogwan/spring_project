package com.codefarm.codefarmer.domain.mentor;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.ConstructorExpression;
import javax.annotation.processing.Generated;

/**
 * com.codefarm.codefarmer.domain.mentor.QMentorMenteeDTO is a Querydsl Projection type for MentorMenteeDTO
 */
@Generated("com.querydsl.codegen.DefaultProjectionSerializer")
public class QMentorMenteeDTO extends ConstructorExpression<MentorMenteeDTO> {

    private static final long serialVersionUID = 702715069L;

    public QMentorMenteeDTO(com.querydsl.core.types.Expression<Long> mentorMenteeId, com.querydsl.core.types.Expression<Long> menteeId, com.querydsl.core.types.Expression<String> menteeName, com.querydsl.core.types.Expression<String> menteeNickName, com.querydsl.core.types.Expression<String> menteePhone) {
        super(MentorMenteeDTO.class, new Class<?>[]{long.class, long.class, String.class, String.class, String.class}, mentorMenteeId, menteeId, menteeName, menteeNickName, menteePhone);
    }

    public QMentorMenteeDTO(com.querydsl.core.types.Expression<Long> mentorMenteeId, com.querydsl.core.types.Expression<Long> mentorId, com.querydsl.core.types.Expression<Long> menteeId, com.querydsl.core.types.Expression<com.codefarm.codefarmer.type.Status> menteeStatus, com.querydsl.core.types.Expression<String> menteeComment, com.querydsl.core.types.Expression<java.time.LocalDateTime> createdDate, com.querydsl.core.types.Expression<java.time.LocalDateTime> updateDate) {
        super(MentorMenteeDTO.class, new Class<?>[]{long.class, long.class, long.class, com.codefarm.codefarmer.type.Status.class, String.class, java.time.LocalDateTime.class, java.time.LocalDateTime.class}, mentorMenteeId, mentorId, menteeId, menteeStatus, menteeComment, createdDate, updateDate);
    }

    public QMentorMenteeDTO(com.querydsl.core.types.Expression<Long> mentorMenteeId, com.querydsl.core.types.Expression<Long> mentorId, com.querydsl.core.types.Expression<Long> menteeId, com.querydsl.core.types.Expression<com.codefarm.codefarmer.type.Status> menteeStatus, com.querydsl.core.types.Expression<java.time.LocalDateTime> updateDate, com.querydsl.core.types.Expression<String> mentorNickName, com.querydsl.core.types.Expression<String> menteeNickName, com.querydsl.core.types.Expression<String> menteeComment) {
        super(MentorMenteeDTO.class, new Class<?>[]{long.class, long.class, long.class, com.codefarm.codefarmer.type.Status.class, java.time.LocalDateTime.class, String.class, String.class, String.class}, mentorMenteeId, mentorId, menteeId, menteeStatus, updateDate, mentorNickName, menteeNickName, menteeComment);
    }

}

