package com.codefarm.codefarmer.entity.board;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QBoardFile is a Querydsl query type for BoardFile
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QBoardFile extends EntityPathBase<BoardFile> {

    private static final long serialVersionUID = -1831446673L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QBoardFile boardFile = new QBoardFile("boardFile");

    public final com.codefarm.codefarmer.entity.period.QPeriod _super = new com.codefarm.codefarmer.entity.period.QPeriod(this);

    public final QBoard board;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdDate = _super.createdDate;

    public final NumberPath<Long> fileId = createNumber("fileId", Long.class);

    public final BooleanPath fileImageCheck = createBoolean("fileImageCheck");

    public final StringPath fileName = createString("fileName");

    public final NumberPath<Long> fileSize = createNumber("fileSize", Long.class);

    public final StringPath fileUploadPath = createString("fileUploadPath");

    public final StringPath fileUuid = createString("fileUuid");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedDate = _super.updatedDate;

    public QBoardFile(String variable) {
        this(BoardFile.class, forVariable(variable), INITS);
    }

    public QBoardFile(Path<? extends BoardFile> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QBoardFile(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QBoardFile(PathMetadata metadata, PathInits inits) {
        this(BoardFile.class, metadata, inits);
    }

    public QBoardFile(Class<? extends BoardFile> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.board = inits.isInitialized("board") ? new QBoard(forProperty("board"), inits.get("board")) : null;
    }

}

