package com.codefarm.codefarmer.domain.notice;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.ConstructorExpression;
import javax.annotation.processing.Generated;

/**
 * com.codefarm.codefarmer.domain.notice.QNoticeFileDTO is a Querydsl Projection type for NoticeFileDTO
 */
@Generated("com.querydsl.codegen.DefaultProjectionSerializer")
public class QNoticeFileDTO extends ConstructorExpression<NoticeFileDTO> {

    private static final long serialVersionUID = -1476826145L;

    public QNoticeFileDTO(com.querydsl.core.types.Expression<Long> fileId, com.querydsl.core.types.Expression<String> fileName, com.querydsl.core.types.Expression<String> fileUploadPath, com.querydsl.core.types.Expression<String> fileUuid, com.querydsl.core.types.Expression<Long> fileSize, com.querydsl.core.types.Expression<Boolean> fileImageCheck) {
        super(NoticeFileDTO.class, new Class<?>[]{long.class, String.class, String.class, String.class, long.class, boolean.class}, fileId, fileName, fileUploadPath, fileUuid, fileSize, fileImageCheck);
    }

}

