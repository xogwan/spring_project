package com.codefarm.codefarmer.domain.program;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.ConstructorExpression;
import javax.annotation.processing.Generated;

/**
 * com.codefarm.codefarmer.domain.program.QProgramFileDTO is a Querydsl Projection type for ProgramFileDTO
 */
@Generated("com.querydsl.codegen.DefaultProjectionSerializer")
public class QProgramFileDTO extends ConstructorExpression<ProgramFileDTO> {

    private static final long serialVersionUID = 1312269747L;

    public QProgramFileDTO(com.querydsl.core.types.Expression<Long> fileId, com.querydsl.core.types.Expression<String> fileName, com.querydsl.core.types.Expression<String> fileUploadPath, com.querydsl.core.types.Expression<String> fileUuid, com.querydsl.core.types.Expression<Long> fileSize, com.querydsl.core.types.Expression<Boolean> fileImageCheck) {
        super(ProgramFileDTO.class, new Class<?>[]{long.class, String.class, String.class, String.class, long.class, boolean.class}, fileId, fileName, fileUploadPath, fileUuid, fileSize, fileImageCheck);
    }

}

