package com.codefarm.codefarmer.domain.mentor;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.ConstructorExpression;
import javax.annotation.processing.Generated;

/**
 * com.codefarm.codefarmer.domain.mentor.QMentorFileDTO is a Querydsl Projection type for MentorFileDTO
 */
@Generated("com.querydsl.codegen.DefaultProjectionSerializer")
public class QMentorFileDTO extends ConstructorExpression<MentorFileDTO> {

    private static final long serialVersionUID = -1232570369L;

    public QMentorFileDTO(com.querydsl.core.types.Expression<Long> fileId, com.querydsl.core.types.Expression<String> fileName, com.querydsl.core.types.Expression<String> fileUploadPath, com.querydsl.core.types.Expression<String> fileUuid, com.querydsl.core.types.Expression<Long> fileSize, com.querydsl.core.types.Expression<Boolean> fileImageCheck) {
        super(MentorFileDTO.class, new Class<?>[]{long.class, String.class, String.class, String.class, long.class, boolean.class}, fileId, fileName, fileUploadPath, fileUuid, fileSize, fileImageCheck);
    }

}

