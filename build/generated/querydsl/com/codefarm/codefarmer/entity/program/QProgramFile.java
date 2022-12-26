package com.codefarm.codefarmer.entity.program;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QProgramFile is a Querydsl query type for ProgramFile
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QProgramFile extends EntityPathBase<ProgramFile> {

    private static final long serialVersionUID = -71413205L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QProgramFile programFile = new QProgramFile("programFile");

    public final com.codefarm.codefarmer.entity.period.QPeriod _super = new com.codefarm.codefarmer.entity.period.QPeriod(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdDate = _super.createdDate;

    public final NumberPath<Long> fileId = createNumber("fileId", Long.class);

    public final BooleanPath fileImageCheck = createBoolean("fileImageCheck");

    public final StringPath fileName = createString("fileName");

    public final NumberPath<Long> fileSize = createNumber("fileSize", Long.class);

    public final StringPath fileUploadPath = createString("fileUploadPath");

    public final StringPath fileUuid = createString("fileUuid");

    public final QProgram program;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedDate = _super.updatedDate;

    public QProgramFile(String variable) {
        this(ProgramFile.class, forVariable(variable), INITS);
    }

    public QProgramFile(Path<? extends ProgramFile> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QProgramFile(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QProgramFile(PathMetadata metadata, PathInits inits) {
        this(ProgramFile.class, metadata, inits);
    }

    public QProgramFile(Class<? extends ProgramFile> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.program = inits.isInitialized("program") ? new QProgram(forProperty("program"), inits.get("program")) : null;
    }

}

